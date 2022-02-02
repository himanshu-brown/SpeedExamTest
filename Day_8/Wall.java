
class Wall{
    List <Brick> bricks=new ArrayList<>();
    
    public List<Brick> getBricks() {
        return bricks;
    }
    
    public void setBricks(List<Brick> bricks) {
        if(bricks.size()>90)
            System.out.println("Bricks number should be less than 90.");
        else
            this.bricks = bricks;
    }
    }