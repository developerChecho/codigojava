 class uberX extends Car{    // declaracion de herencia usando extends//
    String brand;
    String model;
    // metodo constructor//

     public uberX(String licence, String driver, String brand, String model){
         super(licence,driver);
         this.brand=brand;
         this.model= model;

     }

     public uberX() {

     }


     public void printDatauberx() {
     }
 }