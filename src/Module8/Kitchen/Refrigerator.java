package Module8.Kitchen;

public class Refrigerator {
    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }


    public void orderFood(){
        if (hasWorkToDo) {
            System.out.println("DisWasher has work to do");
            hasWorkToDo = false;
        }
        else {
            System.out.println("DisWasher has not work to do");
        }
    }
}
