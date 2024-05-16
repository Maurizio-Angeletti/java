public class MainCalculatorFloorCarpet {
    public static void main(String[] args) {
        Floor floor = new Floor(10,30);
        Carpet carpet = new Carpet(6);
        Calculator calculator = new Calculator(floor,carpet);

        System.out.println("the total cost is " + calculator.getTotalCost());

    }
}
