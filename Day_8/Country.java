class Country{
    private List<City> cities=new ArrayList<>();
    public void count(){
        int countWalls=0;
        int countBricks=0;
        for(City city:cities){
            countWalls=countWalls+city.getWalls().size();
            for(Wall wall:city.getWalls())
                countBricks=countBricks+wall.getBricks().size();
        }
        System.out.println("Total Walls initiated is: "+countWalls);
        System.out.println("Total bricks initiated is: "+countBricks);
    
    }
    
    }