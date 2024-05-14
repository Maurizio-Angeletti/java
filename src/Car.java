public class Car {
    // gli attributi vanno dichiarati con il modificatore di accesso, se non viene dichiarato saranno private.


    // attributi
    private String make;
    private String model;
    private  String color;
    private int doors;
    private boolean convertible;


    //metodi
    public String getMake(){
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public boolean isConvertible() {
        return convertible;
    }

    public int getDoors() {
        return doors;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    public void setMake(String make){
       this.make = make;
    }
    public void describeCar(){
        System.out.println(doors + "-Door "+
                color + " " +
                make + " " +
                model + " " +
                (convertible ? " convertible" : "")
        );
    }
}
