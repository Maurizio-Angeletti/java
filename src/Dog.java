
// extends è una keyword che specifica la classe madre della classe che stiamo dichiarando.
public class Dog extends Animal{

    private String earShape;
    private String tailShape;

    //nella dichiarazione dobbiamo creare anche un costruttore al quale passiamo come parametri gli attributi di animal che vanno a rienmpire super()
    //super è un modo per chiamare il costruttore della classe genitore
    public Dog(String type, String size, double weight) {
        super(type, size, weight);
    }

    // questo costruttore va a riempire sia gli attributi ereditati che quelli specifici della classe Dog
    public Dog(String type, double weight, String earShape, String tailShape) {

        super(type,  weight < 15 ? "small" : (weight < 35 ? "medium" : "large"), weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    //abbiamo riscritto i metodi della classe genitore, se non lo avessimo fatto, avremmo avuto comunque a disposizione i metodi della classe genitore.
    //per poter riscrivere un metodo in una classe figlia dobbiamo creare un metodo che ha la stessa firma di una classe genitore.
    @Override
    public String toString() {
        return "Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();//per richiamare un metodo della classe genitore possiamo usare super.e il nome del metodo genitore.
    }

    @Override
    public void move(String speed) {
        super.move(speed);
        if (speed == "slow"){
            walk();
        }else{
            run();
        }

    }

    @Override
    public void makeNoise() {
        super.makeNoise();
        if (type == "wolfhound"){
            System.out.println("Ow Wooooo!");
        }else {
            bark();
        }

    }

    public void bark(){
        System.out.println("woof!");
    }
    public void walk(){
        System.out.println("Dog walk");
     }
    public void run(){
        System.out.println("Dog run");
    }
}
