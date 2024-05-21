public class MainAnimal {
    public static void main(String[] args) {

        Animal animal = new Animal("Generic Animal", "Huge", 120);
        doAnimalStuff(animal, "slow");

        Dog dog = new Dog("German shepherd","medium", 25);
        doAnimalStuff(dog, "fast");

        Dog dogTwo = new Dog("pitbull",45.5, "pointy", "short");
        doAnimalStuff(dogTwo, "slow");

        Dog dogThree = new Dog("wolfhound",35, "pointy", "bushy");
        doAnimalStuff(dogThree, "slow");

        Fish fishOne = new Fish("tuna",195,6,5);
        doAnimalStuff(fishOne, "fast");

    }
    //anche se la funzione doAnimalStuff richiede come primo argomento un'istanza della classe Animal non ci sono errori in quanto Dog è una classe figlia di Animal.
    //se non si fa la chimata a super(), java utilizza quello di default ,questo è possibile solo se nella classe genitore è presente un costruttore predefinito,altrimenti si deve usare obbligatoriamente super().
    public static void doAnimalStuff(Animal animal, String speed) {

        animal.makeNoise();
        animal.move(speed);
        //anche se non si richiama toString() quando si mette l'istanza dentro le parentisi di print() implicitamente il metodo toString() viene richiamato
        System.out.println(animal);
        System.out.println("_ _ _ _");
    }

}


