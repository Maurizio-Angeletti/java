public class ForLoop {
    public static void main(String[] args) {

        // for(init; expression;increment{ codice}; in init viene dichiarata e inizializata la variabile di ciclo, in expression viene inserita 'espressione che quando diventerà falsa bloccherà il ciclo, in increment viene deciso di quanto deve aumentare la varibile di ciclo, l'incremento viene eseguito dopo che l'espressione è testata.

        for (double rate = 7.5 ; rate <= 10 ; rate += 0.25){
                double interestAmount = calculateInterest(10000.0,rate);
                System.out.println("10.000 at " + rate + "% interest = " + interestAmount);
        }

        // possiamo inserire il break nel ciclo for come nello switch per bloccare il codice per non superare un determinato valore.

        System.out.println("\nciclo for con break:");
        for (double rate = 1 ; rate <= 10 ; rate ++){

            double interestAmount = calculateInterest(50000.0,rate);
            if (interestAmount > 3000){
                break;
            }
            System.out.println("50000.0 at " + rate + "% interest = " + interestAmount);
        }
        // es 1
        System.out.println("\n es 1:");
        System.out.println(isPrime(3));
        arePrime(1,1000);

        //es 2
        System.out.println("\n es 2:");

        int counter =0 ;
        int sum = 0;
        for (int i = 1; counter < 5 && i <= 1000; i++){

            if (i % 3 == 0 && i % 5 == 0){
                sum += i;
                System.out.println(i);
                counter++;
            }

        }
        System.out.println("sum = " + sum);

        //es 3
        System.out.println("\n es 3:");

        System.out.println(sumOdd(1,11));
    }

    public static double calculateInterest(double amount, double interestRate){
        return(amount * (interestRate / 100));
    }

    public static boolean isPrime(int wholeNumber) {
        if (wholeNumber <= 2) {
            return (wholeNumber == 2);
        }

        for ( int divisor = 2; divisor <= wholeNumber / 2 ; divisor ++){
            if (wholeNumber % divisor == 0){
                return false;
            }

        }
        return true;
    }

    public static void arePrime(int start, int end){
        int counter = 0;

        for (int i = start; i <= end; i++){

            if (isPrime(i)){
                counter++;
                System.out.println(i + " is prime counter = " + counter);
            }
            if (counter == 100){
                break;
            }
        }
    }

    public static boolean isOdd(int number){

        if (number > 0){
            if ( number % 2 == 0 ){
                return false;
            }
            return true;
        }
        return false;
    }

    public static int sumOdd(int start, int end){

        if(end >= start && start > 0 && end > 0){
            int sum = 0;
            for(int i = start; i <= end; i++){
                if (isOdd(i)) {
                    sum+=i;

                }
            }
            return sum;

        }
        int sum = -1;
        return sum;
    }
}
