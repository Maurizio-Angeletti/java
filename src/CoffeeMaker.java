public class CoffeeMaker {

    private boolean hasWorkToDo;



    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public boolean isHasWorkToDo() {
        return hasWorkToDo;
    }

    public void brewCoffee(){
        if(hasWorkToDo == true){
            System.out.println(" brewing coffee ");
            hasWorkToDo = false;
        }
    }
}
