public class Worker {

    private String name;
    private String birthDate;


    public Worker(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public int getAge(int currentYear){
        if (currentYear < 2024){
            return -1;
        }
        // Integer.parseInt trasforma una stringa in un intero, mentre substring() ritorna la stinga a partire dalla posizione dell'argomento passsato come numero tra parentesi
        int birthYear = Integer.parseInt(birthDate.substring(6));

        return ( currentYear - birthYear);
    }

    public double collectPay(){
            return 0.0;
    }


    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                '}';
    }
}
