import java.util.ArrayList;
import java.util.Map;
// en la siguiente linea de codigo se basa en Herencia//
class uberBlack extends Car{
   Map<String, Map<String,Integer>> typeCarAccepted;
   ArrayList<String> seatmaterial;

   public uberBlack(String licence, String driver, Map<String, Map<String,Integer>> typeCarAccepted,
                    ArrayList<String> seatmaterial){
      super(licence, driver);
      this.typeCarAccepted = typeCarAccepted;
      this.seatmaterial=seatmaterial;
   }
   }