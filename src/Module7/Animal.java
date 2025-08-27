package Module7;

public class Animal {
    private String type;
    private String size;
    private double weight;

    public Animal(String type, String size) {
        this.type = type;
        this.size = size;
        this.weight = weight;
    }

    public Animal(){
        super();
    }

    public void move(String speed){
        System.out.println(type + "moves" + speed);
    }


    public void makeNoise(){
        System.out.println(type + "makeNoise");
    }


    @Override
    public String toString() {
        return "Animal{" +
                "type='" + type + '\'' +
                ", size='" + size + '\'' +
                ", weight=" + weight +
                '}';
    }
}
