import java.util.*;

public class Solution_2 {
    public static void main(String[] args){
        Map<String,List<String>> map=new HashMap<>();
        ArrayList<String> list1=new ArrayList<>();
        list1.add("Z"); list1.add("Y"); list1.add("A");
        map.put("1",list1);
        ArrayList<String> list2=new ArrayList<>();
        list2.add("B"); list2.add("O");
        map.put("2",list2);
        ArrayList<String> list3=new ArrayList<>();
        list3.add("L");
        map.put("12",list3);
        ArrayList<String> list4=new ArrayList<>();
        list4.add("U");
        list4.add("P");
        map.put("3",list4);
        String s="123";
       // boolean flag=false;
        List<String>[] array=new ArrayList[s.length()];
        
        for(int i=0;i<array.length;i++){
            if(i==0){
           array[0]=map.get(s.charAt(i)+"");
        }
        else
        {
            List<String>temp1=array[i-1];
            List<String> temp2=map.get(s.charAt(i)+"");
            List<String> finalArray;
            finalArray=new ArrayList<String>();
            for(int iteration=0; iteration<temp1.size();iteration++){
                for(int j=0;j<temp2.size();j++){
                    String tempString=temp1.get(iteration)+temp2.get(j);
                    finalArray.add(tempString);
                }
            }
            
            if((i-2)>=0&&s.charAt(i)=='2'&&s.charAt(i-1)=='1'){
                List<String>temp3=array[i-2];
                for(int iteration=0;iteration<temp3.size();iteration++)
                    finalArray.add(temp3.get(iteration)+"L");
       }
            else if(s.charAt(i)=='2'&&s.charAt(i-1)=='1')
                finalArray.add("L");

       array[i]=finalArray;
        }
        

    }
            System.out.println(array[array.length-1]);
    }    
}
