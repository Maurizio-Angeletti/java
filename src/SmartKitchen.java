public class SmartKitchen {
    private CoffeeMaker brewMaster;
    private DishWasher dishWasher;
    private Refrigerator refrigerator;

    public SmartKitchen(CoffeeMaker brewMaster, DishWasher dishWasher, Refrigerator refrigerator) {
        this.brewMaster = brewMaster;
        this.dishWasher = dishWasher;
        this.refrigerator = refrigerator;
    }

    public void addWater(){
        brewMaster.setHasWorkToDo(true);

    }
    public void pourMilk(){
        refrigerator.setHasWorkToDo(true);
    }
    public void loadDishwasher(){
        dishWasher.setHasWorkToDo(true);
    }

    public void setKitchenState(boolean brewMasterHasWork,boolean dishWasherHasWork, boolean refrigeratorHasWork){

        brewMaster.setHasWorkToDo(brewMasterHasWork);
        dishWasher.setHasWorkToDo(dishWasherHasWork);
        refrigerator.setHasWorkToDo(refrigeratorHasWork);
    }
    public void doKitchenWork(){
        brewMaster.brewCoffee();
        dishWasher.doDishes();
        refrigerator.orderFood();

    }

}
