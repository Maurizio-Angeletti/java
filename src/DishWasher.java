public class DishWasher {
    private boolean hasWorkToDo;



    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public boolean isHasWorkToDo() {
        return hasWorkToDo;
    }

    public void doDishes(){
        if(hasWorkToDo == true){
            System.out.println(" doing the dishes ");
            hasWorkToDo = false;
        }
    }
}
