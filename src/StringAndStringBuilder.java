public class StringAndStringBuilder {
    public static void main(String[] args) {


        String helloWorld = "Hello" + " World";
        helloWorld.concat(" and Goodbye");//se non assegnamo a una variabile il valore helloWord.concat(" and goodbye"), non possiamo vedere il risultato perchè non viene modificata la Stringa helloWorld ma in reltà viene creata un'istanza per " and goodbye" e un'istanza con le due stringhe concatenate le due Sringhe.


        //dobbiamo usare il costruttore di String Builder per poeter dichiarare una nuova StringBuilder
        StringBuilder helloWorldBuilder = new StringBuilder("Hello" + " World");
        helloWorldBuilder.append(" and Goodbye");//invece con le StringBuilder il valore della Stringbuilder viene modificato.

        printInformation(helloWorld);
        printInformation(helloWorldBuilder);

        StringBuilder empty = new StringBuilder();//non avendo impostato una capacity di default viene impostata sul minino cioè 16

        StringBuilder emptyStart = new StringBuilder(16);
        emptyStart.append("a".repeat(57));// la capacity sarà auguale al count dato che sarà richiesta altra memoria per memorizzare la variabile

        StringBuilder emptyStart17 = new StringBuilder();
        emptyStart17.append("a".repeat(17));//anche se abbiamo impostato la capacità a 16 che è il minimo la capacity sarà di 34che è il secondo blocco predefinito di richiesta di memoria

        printInformation(empty);
        printInformation(emptyStart);
        printInformation(emptyStart17);

        StringBuilder builderPlus = new StringBuilder("Hello" + " World");
        builderPlus.append(" and Goodbye");

        builderPlus.deleteCharAt(16).insert(16, 'g');
        System.out.println(builderPlus);

        builderPlus.replace(16, 17, "G");
        System.out.println(builderPlus);

        builderPlus.reverse().setLength(7);
        System.out.println(builderPlus);
    }

    public static void printInformation(String string) {

        System.out.println("String = " + string);
        System.out.println("length = " + string.length());
    }

    public static void printInformation(StringBuilder builder) {

        System.out.println("StringBuilder = " + builder);
        System.out.println("length = " + builder.length());
        System.out.println("capacity = " + builder.capacity());
    }
}
