public class Driver extends account {
    String email;
    String password;
    String document;
    String name;
    Integer id;

    public Driver(String email, String password, String name, String document, Integer id) {
        super(email, password, name, document);
    }
        void printDataDriver () {
            System.out.printf("Driver email" + email + "Driver password" + password + "Driver document" + document +
                    "Driver name" + name);
        }


}
