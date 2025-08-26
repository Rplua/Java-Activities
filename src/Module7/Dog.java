package Module7;

public class Dog extends Animal {
    private String earShape;
    private String tailShape;

    public Dog(){
        super();
    }

    public Dog(String type, double weight, String earShape, String tailShape) {
        super(type,weight < 15 ? "small" : (weight < 35 ? "medium": "large"));
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    public void makeNoise() {

    }

    @Override
    public void move(String speed){
        super.move(speed);
        //System.out.println("Dogs walks, run and wag their tail");
        if(speed.equals("small")){
            walk();
            waigTail();
        }else{
            run();
            bark();
        }
        System.out.println();
    }

    private void bark(){
        System.out.println("Woof");
    }

    private void run(){
        System.out.println("Dog runnning");
    }
    private void walk(){
        System.out.println("Dog walking");
    }

    private void waigTail(){
        System.out.println("Tail Waggin");
    }




}
