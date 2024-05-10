import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerClass {
    //é posibile "catturare" l'eccezioni, cioè gli errori tramite l'istruzione try catch dopo la parola try inseriamo un blocco di codice che potrebbe generare un'eccezione,in seguito si dichiara catch, tra parentesi tonde va inserito prima il tipo dell'eccezione e ilnome della variabele in questo caso err, la varivìbile err contiene un oggetto di tipo Error (Error Object) con i dettagli riguardo a cosa sia successo.
    //Per prima cosa viene eseguito il codice all'interno di try, se non ci sono errori catch viene ignorato altrimenti si blocca il resto del codice di try e viene eseguito il coidce nel catch

    public static void main(String[] args) {
//        int currentYear = 2024;
//        try {
//            System.out.println(getInputFromConsole(currentYear));
//        } catch (NullPointerException err) {
//            System.out.println(getInputFromScanner(currentYear));
//        }

        // es 1
        //printSumFiveInt();


        // es 2
        //inputThenPrintSumAndAverage();

    }



    // proviamo a prendere un input dal terminale
    public static String getInputFromConsole(int currentYear) {

        String name = System.console().readLine("Hi, What's your Name? ");
        System.out.println("Hi " + name);

        String dateOfBirth = System.console().readLine("What year were you born? ");
        int age = currentYear - Integer.parseInt(dateOfBirth);

        return "So you are " + age + " years old";
    }
    // proviamo a prendere un input con la classe Scanner
    public static String getInputFromScanner(int currentYear){

        int minimumYear = currentYear -125;
        boolean validDob = false;
        int dob = 0;

        Scanner scanner =new Scanner(System.in);
        System.out.println("Hi, What's your name? ");
        String name = scanner.nextLine();
        System.out.println("hi " + name);
        System.out.println("What year were you born? ");

        while(!validDob){
            System.out.println("enter a year of birth >= " + minimumYear + " and <= " + currentYear);

            try {//se non escono errori il codice prosegue altrimenti si blocca e passa al catch
                String dateOfBirth = scanner.nextLine();
                dob = Integer.parseInt(dateOfBirth);// per evitare di usare perseInt si potrebbe usare scanner.nextInt()
                if (dob >= minimumYear && dob <= currentYear){
                    validDob = true;
                }
            }catch (NumberFormatException badUserData){// se un utente digita un carattere non ammesso quindi genera l'errore NumberFormatException verrà eseguito il codice dentro catch per poi ricominciare da riga 40.
                    System.out.println(("Characters not allowed!!! try again."));
            }

        }

        int age = currentYear - dob;

        return "So you are " + age + " years old";

    }

    //es 1
    public static void printSumFiveInt(){
        int sum = 0;
        int currentNumber;
        int validNumberCount = 0;
        Scanner scanner =new Scanner(System.in);

        System.out.println("enter a integer number");

        while (validNumberCount < 5) {

            try {
                while (validNumberCount < 5) {
                    System.out.println("Enter number # " + (validNumberCount + 1));
                    currentNumber = Integer.parseInt(scanner.nextLine());
                    validNumberCount ++;
                    sum += currentNumber;
                }
            }catch (NumberFormatException badUserData){
                System.out.println(("Characters not allowed!!! try again."));
            }
        }

        System.out.println("The sum of the 5 number = " + sum);

    }

    //es 2
    public static void inputThenPrintSumAndAverage(){
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        long avg = 0;

        System.out.println(("Enter an integer number, if you want to quit enter a character"));
        while (scanner.hasNextInt()) {// scanner.hasNextInt ritorna true se il prossimo input nello scanner è un int altrimenti torna false

            sum += scanner.nextInt();
            count++;
            scanner.nextLine();
        }

        if (count > 0) {
            avg = Math.round((double) sum / count);
        }

        System.out.println("SUM = " + sum + " AVG = " + avg);
        scanner.close();
    }

}
