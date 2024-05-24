public class MainSmartKitchen {
    public static void main(String[] args) {

        //composizione: la composizione è un modo per far si che la combinazione di classi si comporti come un singolo oggetto coerente.
        //abbiamo usato 3 classi passate come attributi alla classe SmartKitchen in modo da poter combinare i metodi delle varie classi.
        CoffeeMaker coffeeMaker01 = new CoffeeMaker();
        DishWasher dishWasher01 =new DishWasher();
        Refrigerator refrigerator01 = new Refrigerator();

        SmartKitchen smartKitchen01 = new SmartKitchen(coffeeMaker01, dishWasher01, refrigerator01);

        smartKitchen01.addWater();
        smartKitchen01.loadDishwasher();

        smartKitchen01.doKitchenWork();

        smartKitchen01.setKitchenState(false,false,true);

        smartKitchen01.doKitchenWork();
    }
}
