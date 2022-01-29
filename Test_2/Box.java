import java.util.*;
import java.io.*;

class Box{
    
    double length, height, width, area, gsm;
    boolean pasting, pins, singlePart, doublePart;
    String fluteType;
    int extraGsm;
    
    double findArea(){
        return length*height*width;
    }
    
    double getGSM(){
        return gsm;
    }
    
    void getExtraGSM(){
        if(fluteType=="A"){
            extraGsm = 10;
        }else if(fluteType=="B"){
            extraGsm = 30;
        }else if(fluteType=="C"){
            extraGsm = 20;
        }else if(fluteType=="E"){
            extraGsm = 40;
        }else if(fluteType=="F"){
            extraGsm = 50;
        }else if(fluteType=="G"){
            extraGsm=20;
        }
    }
    
    double getTotalGSM(){
        return extraGsm+gsm*100;
    }
    
}

class Universal extends Box {
    int stitchingCost;
    Universal(){
        if(this.pasting==true && this.pins==true){
            stitchingCost = 30;
        }else if(this.pasting==true){
            stitchingCost = 20;
        }else if(this.pins == true){
            stitchingCost = 10;
        }
    }
    
    void getCost(){
        if(doublePart==true){
            System.out.println("Cost : "+3*(findArea()*getTotalGSM()*extraGsm*stitchingCost));
        }else{
            System.out.println("Cost : "+(findArea()*getTotalGSM()*extraGsm()*stitchingCost));
        }
    }
}

class AllFlapMeeting extends Box {
    AllFlapMeeting(){
        if(this.pasting==true && this.pins==true){
            stitchingCost = 40;
        }else if(this.pasting==true){
            stitchingCost = 30;
        }else if(this.pins == true){
            stitchingCost = 10;
        }
    }
    
    void getCost(){
        if(doublePart==true){
            System.out.println("Cost : "+3*(findArea()*getTotalGSM()*extraGsm*stitchingCost));
        }else{
            System.out.println("Cost : "+(findArea()*getTotalGSM()*extraGsm()*stitchingCost));
        }
    }
}

class HoneyComb extends Box {
    HoneyComb(){
        if(this.pasting==true && this.pins==true){
            stitchingCost = 50;
        }else if(this.pasting==true){
            stitchingCost = 40;
        }else if(this.pins == true){
            stitchingCost = 10;
        }
    }
    
    void getCost(){
        if(doublePart==true){
            System.out.println("Cost : "+3*(findArea()*getTotalGSM()*extraGsm*stitchingCost));
        }else{
            System.out.println("Cost : "+(findArea()*getTotalGSM()*extraGsm()*stitchingCost));
        }
    }
}

class ReverseTuckIn extends Box {
    ReverseTuckIn(){
        if(this.pasting==true && this.pins==true){
            stitchingCost = 50;
        }else if(this.pasting==true){
            stitchingCost = 40;
        }else if(this.pins == true){
            stitchingCost = 10;
        }
    }
    
    void getCost(){
        if(doublePart==true){
            System.out.println("Cost : "+3*(findArea()*getTotalGSM()*extraGsm*stitchingCost));
        }else{
            System.out.println("Cost : "+(findArea()*getTotalGSM()*extraGsm()*stitchingCost));
        }
    }
}

class TopOpeningSnaphock extends Box {
    TopOpeningSnaphock(){
        if(this.pasting==true && this.pin==true){
            stitchingCost = 60;
        }else if(this.pasting==true){
            stitchingCost = 50;
        }else if(this.pins==true){
            stitchingCost = 10;
        }
    }
    
    void getCost(){
        if(doublePart==true){
            System.out.println("Cost : "+3*(findArea()*getTotalGSM()*extraGsm*stitchingCost));
        }else{
            System.out.println("Cost : "+(findArea()*getTotalGSM()*extraGsm()*stitchingCost));
        }
    }
}

public class Box
{
	public static void main(String[] args) {
		Universal universal = new Universal();
		universal.getCost();
	}
}
