package Module7;

public class Costumer {
    private String name;
    private double creditLimit;
    private String address;


    public Costumer(){
        this("Randy", 21231231, "Cornella");
    }

    public Costumer(String name, double creditLimit, String address) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.address = address;
    }
    public Costumer(String name, String email){
        this("Juan", 0,"email");
    }



    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getAddress() {
        return address;
    }
}
