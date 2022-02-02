
class City{
    private String name;
    private List<Wall> walls=new ArrayList<>();
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public List<Wall> getWalls() {
        return walls;
    }
    
    public void setWalls(List<Wall> walls) {
        this.walls = walls;
    }
    }