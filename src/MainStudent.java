public class MainStudent {
    public static void main(String[] args) {

        String name;
        String dateOfBirth;
        int i;
        System.out.println("\nClass POJO:");
        for (i = 1; i <= 3; i++){
            name = switch (i){
                case 1 -> "Mary";
                case 2 -> "Jack";
                case 3 -> "David";
                default -> "invalid Value";
            };

            dateOfBirth = switch (i){
                case 1 -> "11/06/1993";
                case 2 -> "01/03/1990";
                case 3 -> "20/08/1989";
                default -> "invalid Value";
            };
            // creiamo tre istanze diverse grazie all'iteratore i.
            Student si = new Student("S92300" + i, name, dateOfBirth, "java class");

            System.out.println(si);// se è stato creato il metodo sovracritto toString() non c'è bisogno di richiamarlo quando si usa print,
        }

        System.out.println("\nClass record:");
        for (i = 1; i <= 3; i++){
            name = switch (i){
                case 1 -> "Mary";
                case 2 -> "Jack";
                case 3 -> "David";
                default -> "invalid Value";
            };

            dateOfBirth = switch (i){
                case 1 -> "11/06/1993";
                case 2 -> "01/03/1990";
                case 3 -> "20/08/1989";
                default -> "invalid Value";
            };
            // creiamo tre istanze diverse grazie all'iteratore i.
            RecordStudent si = new RecordStudent("S92300" + i, name, dateOfBirth, "java class");

            System.out.println(si);// se è stato creato il metodo sovracritto toString() non c'è bisogno di richiamarlo quando si usa print,
        }

        System.out.println("\nPOJO student");
        Student PojoStudent = new Student("PS00001","Mark","11/06/1991","java class");
        System.out.println(PojoStudent);
        PojoStudent.setId("PS00002");
        System.out.println(PojoStudent);

        System.out.println("\nrecord student");
        RecordStudent RecordStudent = new RecordStudent("RS00001","John","13/05/1992","java class");
        System.out.println(RecordStudent);
        //RecordStudent.setId("RS00002"); non esiste un setId per il record infatti il record è costruito per essere immutabile.
        System.out.println(RecordStudent);

    }
}
