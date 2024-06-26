public class Fish extends Animal{

    private int fins;
    private int gills;

    public Fish(String type, double weight, int gills, int fins) {
        super(type, weight < 15 ? "small" : (weight < 35 ? "medium" : "large"), weight);
        this.gills = gills;
        this.fins = fins;
    }

    private void moveMuscles(){
        System.out.print("muscles moving ");
    }

    private void moveBackFin(){
        System.out.print("backfin moving ");
    }

    @Override
    public void move(String speed) {
        super.move(speed);
        moveMuscles();
        if (speed == "fast"){
            moveBackFin();
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return "Fish{" +
                "fins=" + fins +
                ", gills=" + gills +
                "} " + super.toString();
    }
}
