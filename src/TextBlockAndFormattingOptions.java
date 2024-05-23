public class TextBlockAndFormattingOptions {
    public static void main(String[] args) {
        String bulletIt = "Print a bulleted list:\n"+
                "\u2022 First point\n"+
                "\u2022 Second Point";

        System.out.println(bulletIt);
        //il formato del text-block ci permette di scrivere una stringa su più linee senza l'aiuto dell concatenazione edi \n.
        String textBlock = """
                Print a bulleted list with text-block:
                \u2022 First text-block's Point
                \u2022 Second text-block's Point """;

        System.out.println(textBlock);


        //possiamo usare printf() che accetta un argomento stringa e diveri argomenti variabile nella stringa possiamo inserire dei segnaposto che indicherano la posizione delle variabili
        int age = 33;
        System.out.printf("Your age with printf: %d%n",age);//%d è il segnaposto per i numeri interi %nmanda a capo il testo

        //possiamo anche dichiarare una stringa usando il metodo .format di String che richiede gli stessi argomenti di printf
        String formattedString = String.format("Your age with .format: %d", age);
        System.out.println(formattedString);

        //quando si usa .formatted() si passono gli argomenti che corrispondono agli specificatori della stringa
        String secondFormattedString = "Your age with .formatted: %d".formatted(age);
        System.out.println(secondFormattedString);



        int yearOfBirth = 2024 - age;

        System.out.printf("Age = %d, Birth year = %d%n",age, yearOfBirth);

        double doubleValue = 5.123456;
        System.out.printf("Print a double value: %.2f%n",doubleValue);//%f è il segnaposto per i numeri decimali mettendo davanti .2f diciamo che vogliamo stampare solo le prime due cifre decimali

        for (int i =1; i <= 100000; i *= 10){
            System.out.printf("printing %6d%n", i );
            //in questo caso i numeri saranno allineati a destra in quanto abbiamo detto che vogliamo sei caratteri nella stringa
        }



    }
}
