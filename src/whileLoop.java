public class whileLoop {
    //While Loop continua ad eseguire il codice finchè l'espressione nel loop diventa falsa.
    //Nella dichiarazione di while loop c'è solo l'espressione quindi non si possono dichiarare variabili, si devono dichiarare le variabili di iterazione al di fuori del ciclo.
    public static void main(String[] args) {
        int number = 0;
        while (number < 50){
            number += 5;
            System.out.print(number+ "_");
        }
    //si può usare il break per bloccare il codice.
        System.out.print("\n");
        number = 0;
        while (number < 50){
            number += 5;
            if (number == 25){
                break;
            }
            System.out.print(number+ "_");
        }
    //possiamo usare continue per ignorare il codice seguente e ricomincire il ciclo.
        System.out.print("\n");
        number = 0;

        while (number < 50){
            number += 5;
            if (number % 25 == 0){
                continue;
            }
            System.out.print(number+ "_");
        }

    //es 1
        System.out.println("\n\nEs 1");

        number = 5;
        while (number < 20){
            number+=1;
            if (!isEvenNumber(number)){
                continue;
            }
            System.out.print(number+"_");

        }

     //es 2
        System.out.println("\n\nEs 2");
        number = 0;
        int counter = 0;
        while (number < 20){
            number+=1;
            if (counter == 5){
                break;
            }
            if (!isEvenNumber(number)){
                continue;
            }
            System.out.print(number+"_");
            counter++;
        }

        //es 3
        System.out.println("\n\nEs 3");
        number = 68741;

        System.out.println(sumDigits(number));


    }

    //es 1
    public static boolean isEvenNumber(int number){
        return number%2 ==0? true : false;
    }

    //es 3
    public static int sumDigits(int number){
        if (number < 0){
            return -1;
        }
        int sum =0;
        while (number != 0){
            int digit = number % 10;
            sum += digit;
            number /= 10;
        }
        return sum;
    }




}
