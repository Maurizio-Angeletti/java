public class MainWorker {

    public static void main(String[] args) {
        Worker workerOne = new Worker("Davide","18/08/1987" );

        System.out.println(workerOne);

        SalariedEmployee markSalariedEmployee = new SalariedEmployee("Mark","17/09/79","20/11/1990",1658.78);

        System.out.println(markSalariedEmployee);

        SalariedEmployee JohnSalariedEmployee = new SalariedEmployee("John","05/12/90","13/02/2015",1253.52);

        System.out.println(JohnSalariedEmployee);
    }




}
