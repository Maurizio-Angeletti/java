public class Main {

    public static void main(String[] args) {
        //per creare un oggetto dobbiamo usare new con il nome della classe ce vogliamo usare come "stampino"
        Car car = new Car();

        //usiamo i metodi della classe Car per assegnare dei valori agli attributi della classe stessa.
        car.setMake("Volkswagen");
        car.setModel("polo");
        car.setColor("blue");
        car.setConvertible(false);
        car.setDoors(4);
        System.out.println("\ncar:");
        System.out.println(car.getMake());
        car.describeCar();

        Car carTwo = new Car();

        carTwo.setMake("mercedes");
        carTwo.setModel("class A");
        carTwo.setColor("grey");
        carTwo.setConvertible(false);
        carTwo.setDoors(4);

        System.out.println("\ncarTwo:");
        carTwo.describeCar();


        System.out.println("\nbank account 1");
        BankAccount bankAccountOne = new BankAccount("12856",15000,"Pinco Pallino", "pincopallino@mail.com", "0123456987");

        bankAccountOne.setAccountBalance(10000);//sto facendo un overloading del costruttore
        bankAccountOne.withdrawFunds(2000);
        System.out.println(bankAccountOne.getAccountBalance());

        bankAccountOne.withdrawFunds(15000);


        System.out.println("\nbank account 2:");
        BankAccount bankAccountTwo = new BankAccount();//non passando alcun argomento java usa il costruttore concatenato che abbiamo creato nella classe BankAccount, se non avessimo creato noi un costruttore senza parametri, java avrebbe utilizzato il costruttore di default.
        //non viene chiamato solo il costruttore vuoto ma anche il costruttore con i parametri, infatti in console avremo stampato prima la chiamata del costruttore vuoto ,poi quella del costruttore con parametri.
        System.out.println(bankAccountTwo.getAccountBalance() +  " account balance \n" + bankAccountOne.getAccountNumber() + " account number");

        System.out.println("\nbank account 3:");
        BankAccount bankAccountThree = new BankAccount("Caio Sempronio",30000);//in questo caso passiamo solo due argomenti che corrispondono a quelli che abbiamo passato nel costruttore a due parametri, in questo modo possiamo settare solo gli argomenti passati mentre gli altri attributi avranno valore default che abbiamo scelto nel costruttore a due parametri.

        System.out.println(bankAccountThree.getCustomerName() + "\n" + bankAccountThree.getAccountBalance() + "\n" + bankAccountThree.getAccountNumber() + "\n" + bankAccountThree.getPhoneNumber());
    }
}
