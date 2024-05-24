public class Refrigerator {
    private boolean hasWorkToDo;


    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public boolean isHasWorkToDo() {
        return hasWorkToDo;
    }

    public void orderFood(){
        if(hasWorkToDo == true){
            System.out.println(" ordering food ");
            hasWorkToDo = false;
        }
    }
}
