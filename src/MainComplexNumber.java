public class MainComplexNumber {
    public static void main(String[] args) {
        ComplexNumber complexNumberFirst = new ComplexNumber(5.5,6.8);
        ComplexNumber complexNumberSecond = new ComplexNumber(2,7.7);

        System.out.print("the sum of " + complexNumberFirst.getReal() + " + " + complexNumberFirst.getImaginary() + "i" + " and " + complexNumberSecond.getReal() + " + " + complexNumberSecond.getImaginary() + "i is ");


         complexNumberFirst.add(complexNumberSecond );

        System.out.println(complexNumberFirst.getReal() + " + " + complexNumberFirst.getImaginary() + "i");
    }
}
