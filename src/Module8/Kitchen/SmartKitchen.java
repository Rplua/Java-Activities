package Module8.Kitchen;

public class SmartKitchen {
    private CoffeMaker brewMaster;
    private DishWasher  dishWasher;
    private Refrigerator iceBox;

    public SmartKitchen(CoffeMaker brewMaster, DishWasher dishWasher, Refrigerator iceBox) {
        this.brewMaster = brewMaster;
        this.dishWasher = dishWasher;
        this.iceBox = iceBox;
    }

    public CoffeMaker getBrewMaster() {
        return brewMaster;
    }

    public DishWasher getDishWasher() {
        return dishWasher;
    }

    public Refrigerator getIceBox() {
        return iceBox;
    }

    public void addWater(){
        brewMaster.setHasWorkToDo(true);
    }
    public void pourMilk(){
        iceBox.setHasWorkToDo(true);
    }
    public void loadDishWasher(){
        dishWasher.setHasWorkToDo(true);
    }
    public void setKitchenState(boolean coffeFlag, boolean fridgeFlag, boolean dishWasherFlag){
        brewMaster.setHasWorkToDo(coffeFlag);
        dishWasher.setHasWorkToDo(dishWasherFlag);
        iceBox.setHasWorkToDo(fridgeFlag);
    }
    public void doKitchenWork(){
        brewMaster.brewCoffe();
        dishWasher.doDishes();
        iceBox.orderFood();
    }

}
