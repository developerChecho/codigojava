public class Main {
    public static void main(String[] args) {
        System.out.println("bienvenido a uber");
         Car car = new Car();
         car.driver = " sergio andres perez ";
         car.licence = " Fbq369 ";
         car.passenger= " 4 ";
         car.printDataCar();


        System.out.print("uberX") ;
         uberX uberx = new uberX() ;
         uberx.model=  " renault" ;
         uberx.brand=  " symbol" ;
         uberx.driver= " mario luna" ;
         uberx.licence= " 13434" ;
         uberx.passenger= " 4" ;
         uberx.printDataCar();



    }
}