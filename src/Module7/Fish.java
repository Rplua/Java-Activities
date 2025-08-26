package Module7;

public class Fish  extends Animal {
    private int gills;
    private int fins;

    public Fish(String type, String size, double weight, int gills, int fins) {
        super(type, size , weight);
        this.gills = gills;
        this.fins = fins;
    }
    private void moveMuscles(){
        System.out.println("moveMuscles");
    }
    private void moveBackFin(){
        System.out.println("moveBackFin");
    }
    @Override
    public void move(String speed){
        super.move(speed);
        moveMuscles();
        if(speed.equals("fast")){
            moveBackFin();
        }
    }
}
