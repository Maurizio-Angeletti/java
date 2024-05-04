public class Switch {

    public static void main(String[] args) {


        int switchValue = 1;

        //  il valore di switchValue determina in quale caso ci troviamo in base al caso verrà eseguito solo il rispettivo codice. non è possibile utilizzare dati di tipo long,float, double o boolean

        switch (switchValue){

            case 1:
                System.out.println("In case 1");
                break;

            case 2:
                System.out.println("In case 2");
                break;

            case 3:
                System.out.println("In case 3");
                break;

            default:
                System.out.println("in default");
        }

        //  possiamo anche raggruppare i casi.

        switchValue = 3;

        switch (switchValue){

            case 1:
                System.out.println("In case 1");
                break;

            case 2:
                System.out.println("In case 2");
                break;

            case 3: case 4: case 5:
                System.out.println("the same code for case 3 case 4 and case 5");
                System.out.println("case " + switchValue);
                break;

            default:
                System.out.println("in default");
        }


        // switch dalla versione 9:

        switchValue = 2;

        switch (switchValue){
            case 1 -> System.out.println("In case 1");
            case 2-> System.out.println("In case 2");
            case 3, 4, 5 ->{
                System.out.println("the same code for case 3 case 4 and case 5");
                System.out.println("In case " + switchValue);
            }
            default -> System.out.println("in default");
        }

        String month = "JUNE";

        System.out.println(month + " is in the " + getQuarter(month) + " quarter");


        // es 1:
        System.out.println("\nesercizio 1:");
        char firstLetter = 'C';
        char secondLetter = 'A';
        char thirdLetter = 'R';

        convertToNatoPhoneticAlphabet(firstLetter);
        convertToNatoPhoneticAlphabet(secondLetter);
        convertToNatoPhoneticAlphabet(thirdLetter);

        // es 2:
        System.out.println("\nesercizio 2:");
        printDayOfWeek(2);

    }

    public static String getQuarter(String month){
        // possiamo mettere il return davanti allo switch in modo che quando ci troviamo nel caso uguale sarà ritornato quello che c'è dopo la freccia.
         return switch (month) {
             case "JANUARY", "FEBRUARY", "MARCH" -> {
                 yield "1st";
                 //yield fa la stessa cosa di return ma dato che abbiamo messo il return davanti allo switch dobbiamo usare la parola chiave yield dentro un blocco di codice {}
             }
             case "APRIL", "MAY", "JUNE" -> "2nd";
             case "JULY", "AUGUST", "SEPTEMBER" -> "3rd";
             case "OCTOBER", "NOVEMBER", "DECEMBER" -> "4th";
             default -> {
                 String invalidValue = month + " is invalid value";
                 yield invalidValue;

             }
         };
    }
    // es 1:
    public static void convertToNatoPhoneticAlphabet(char letter){
        switch (letter){
            case 'A':
                System.out.println(letter + " Able");
                break;
            case 'B':
                System.out.println(letter + " Baker");
                break;
            case 'C':
                System.out.println(letter + " Charlie");
                break;
            case 'D':
                System.out.println(letter + " Dog");
                break;
            case 'E':
                System.out.println(letter + " Easy");
                break;
            default:
                System.out.println(letter + " not found");
        }
    }
    // es 2:
    public static void printDayOfWeek(int day){
        String dayOfWeek = switch(day){
            case 1 -> "Monday";
            case 2 -> "tuesday";
            case 3 -> "wednesday";
            case 4 -> "thursday";
            case 5 -> "friday";
            case 6 -> "saturday";
            case 7 -> "sunday";
            default -> "is an invalid number";
        };

        System.out.println("the day is " + dayOfWeek);
    }
}


