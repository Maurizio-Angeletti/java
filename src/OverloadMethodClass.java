public class OverloadMethodClass {
    public static void main(String[] args) {
//        es 1:
        System.out.println("es 1: " + convertToCentimeters(25));

        System.out.println("es 1: " + convertToCentimeters(15, 35));
//        es 2:
        System.out.println("es 2: " + getDurationString(985553));
        System.out.println("es 2: " + getDurationString(-15,45));

//        es 3:
        System.out.println("es 3: " + area(54));
        System.out.println("es 3: " + area(35,21));
    }




//    Overloading dei metodi: si possono definire due metodi con lo stesso nome perchè la chiave univoca dei due metodi è diversa in quanto il primo richiede un parametro int mentre il secondo richiede due int(quindi anche se hanno lo stesso nome non hanno la stessa chiave univoca)

//    es 1:
    public static double convertToCentimeters(int inchHeight){

            double centimeterHeight = inchHeight * 2.54d;
            return centimeterHeight;
    }

    public static double convertToCentimeters(int feetHeight, int remainIncHeight){


        int inchHeight = feetHeight * 12 + remainIncHeight;

        return convertToCentimeters(inchHeight);
    }

//    es 2:
    public static String getDurationString(int second){

        if(second >= 0){
            int minute = second/60;
            second %= 60;
            return getDurationString(minute,second);
        }

        return "Invalid Value";

    }

    public static String getDurationString(int minute, int second){

        if(minute >= 0 && second >= 0 && second <= 59){
            int hour = minute / 60;
            minute %= 60;
            String durationString = hour + " h " + minute + " m " + second + "s";

            return durationString;
        }

        return "Invalid Value";
        }

//     es 3:
    public static  double area(double radius){
        if (radius < 0){
            return -1.0;
        }

        double area = radius * radius * Math.PI;// Math.PI restituisce il valore di Pi greco.
        return area;
    }

    public static double area(double x, double y){
        if (x < 0 || y < 0){
            return -1.0;
        }
        double area = x * y;
        return area;

    }
}
