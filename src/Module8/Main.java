package Module8;

public class Main {
    public static void main(String[] args) {
        ComputerCase theCase = new ComputerCase("2208", "Dell", "240");
        Monitor theMonitor = new Monitor("27 inch", "Acer", 27 , "2540 x 1440");
        Motherboard theMontherboard = new Motherboard("BJ-200", "ASUS", 4,6,"V2.44");

        PersonalComputer thePc = new PersonalComputer("2208", "DELL", theCase ,theMontherboard, theMonitor);

      //thePc.getMonitor().drawPixelArt(10,10,"red");
      //thePc.getMotherboard().loadPogram("Windows OS");
      //thePc.getComputerCase().pressPowerButton();t
        thePc.PowerUp();

    }
}
