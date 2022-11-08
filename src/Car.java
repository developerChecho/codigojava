import javax.security.auth.login.AccountException;

public class Car {
    //atributos//
    Integer id;
    String passenger;
    String driver;
    String licence;

    public Car(String licence, String driver) {
    }

    public Car() {

    }


    //métodos constructor//

    void printDataCar(){
        System.out.println("licence" + licence + "driver" + driver);
    }

   }
