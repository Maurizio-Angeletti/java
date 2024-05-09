import javax.swing.*;

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

        //es 4
        System.out.println("\n\nEs 4");
        System.out.println(isPalindrome(-1221));

        //es 5
        System.out.println("\n\nEs 5");
        System.out.println(sumFirstAndLastDigit(72554));

        //es 6
        System.out.println("\n\nEs 6");
        System.out.println((getEvenDigitSum(1587223)));

        //es 7
        System.out.println("\n\nEs 7");
        System.out.println((hasSharedDigit(24,22)));

        //es 8
        System.out.println("\n\nEs 8");
        System.out.println((getLargestPrime(12)));

        //es 9
        System.out.println("\n\nEs 8");
        printSquareStar(2);



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

    //es 4
    public static boolean isPalindrome(int number){


        int reverseNumber = 0;
        int numberCopy = number;

        while(numberCopy!=0){
            int reversDigit = numberCopy % 10;
            reverseNumber += reversDigit;
            numberCopy /=10;
            reverseNumber *= 10;
        }
         reverseNumber /= 10;
       if (reverseNumber == number){
           return true;
       }
       return false;
    }

    //es 5
    public static int sumFirstAndLastDigit(int number){
        if (number < 0){
            return -1;
        }

        int lastNumberCopy = number %10;
        while (number >= 10){

            number /= 10;
        }

        return number + lastNumberCopy ;

    }


    // es 6
    public static int getEvenDigitSum(int number){
        if (number < 0){
            return -1;
        }
        int evenDigitSum = 0;
        while (number !=0 ){
            int  evenDigit = number %10;
            number /= 10;
            if (evenDigit % 2 == 0){
                evenDigitSum += evenDigit;
            }
        }

        return evenDigitSum;
    }

    //es 7
    public static boolean hasSharedDigit(int first, int second){
        if (first >= 10 && first <= 99 && second >= 10 && second <= 99){
            int firstDigit = first%10;
            first /=10;
            int seconDigit = second%10;
            second /=10;

            if(firstDigit == seconDigit || firstDigit == second || first == second || first == seconDigit){
                return true;
            }
            return false;
        }

        return false;
    }

    //es 8
    public static int getLargestPrime(int number) {

        if (number < 2) {
            return -1;
        }

        int factor = -1;
        for (int i = 2; i * i <= number; i++) {// il quadrato di i non può essere più grande del numero da controllare
            if (number % i != 0) {
                continue;
            }
            factor = i;
            while (number % i == 0) {// continua dividere il numero per il fattore primo trovato,finchè il resto della divisione è zero, quando il resto non è più zero number è diventato il numero intero più grande da
                number /= i;
            }
        }
        return number == 1 ? factor : number;
    }

    //es 9
    public static void printSquareStar(int number){
        if (number < 5){
            System.out.println("Invalid Value");
        }else {
            for (int row = 0; row < number ;row++){
                System.out.println();
                for(int column = 0; column < number ; column++){

                    if (row == 0 || row == number -1 || column == 0 || column == number -1 || row == column || column == number - (row+1)) {
                        System.out.print("*");
                    }else {
                        System.out.print(" ");
                    }

                }

            }
        }

    }

}
