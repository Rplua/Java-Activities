package Module8.Kitchen;

public class CoffeMaker {
    private boolean hasWorkToDo;


    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void brewCoffe(){
       if (hasWorkToDo) {
           System.out.println("CoffeMaker has work to do");
           hasWorkToDo = false;
       }
       else {
           System.out.println("CoffeMaker has not work to do");
       }
    }

}
