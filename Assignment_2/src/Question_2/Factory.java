package Question_2;

public abstract class Factory {
    public static CarFactory createCarFactory(String type) {
        switch (type) {
            case "Honda":
                return HondaCarFactory.getInstance();
            case "Porsche":
                return PorscheCarFactory.getInstance();
            case "Tesla":
                return TeslaCarFactory.getInstance();
            default:
                throw new IllegalArgumentException("Invalid car type: " + type);
        }
    }


   public static AirplaneFactory createAirplaneFactory(String type){
       switch (type) {
           case "Boeing":
               return BoeingFactory.getInstance();
           case "Airbus":
               return AirbusFactory.getInstance();
           case "Embraer":
               return EmbraerFactory.getInstance();
           default:
               throw new IllegalArgumentException("Invalid airplane type: " + type);
       }
   }

   public static BoatFactory createBoatFactory(String type){
       switch (type) {
           case "Sea Ray":
               return SeaRayFactory.getInstance();
           case "Mastercraft":
               return MastercraftFactory.getInstance();
           case "Bertram":
               return BertramFactory.getInstance();
           default:
               throw new IllegalArgumentException("Invalid boat type: " + type);
       }
   }
}

