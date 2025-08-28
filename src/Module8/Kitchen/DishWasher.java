package Module8.Kitchen;

public class DishWasher {
    private boolean hasWorkToDo;


    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void doDishes(){
        if (hasWorkToDo) {
            System.out.println("DisWasher has work to do");
            hasWorkToDo = false;
        }
        else {
            System.out.println("DisWasher has not work to do");
        }
    }

}
