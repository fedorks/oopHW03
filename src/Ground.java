import java.lang.reflect.Array;


public class Ground extends Transport {
    private boolean wheeled;
    private boolean allRoad;



    public Ground(String name, String whereMoving, String typeEngine, boolean privateTransport, int numberPassengers,
                  double loadCapacity, double weightTransport, double lengthTransport, String colorTransport,
                  boolean wheeled, boolean allRoad) {
        super(name, whereMoving, typeEngine, privateTransport, numberPassengers, loadCapacity, weightTransport,
                lengthTransport, colorTransport);

        this.whereMoving = "Наземный";
    }



//        this.wheeled = wheeled;
//        this.allRoad = allRoad;
//    }
//
//    public boolean isWheeled() {
//        return wheeled;
//    }
//
//    public void setWheeled(boolean wheeled) {
//        this.wheeled = wheeled;
//    }
//
//    public boolean isAllRoad() {
//        return allRoad;
//    }
//
//    public void setAllRoad(boolean allRoad) {
//        this.allRoad = allRoad;
//    }

    @Override
    public String toString() {
        return "Наземный транспорт" + "name";
    }

    public String getInfo(){
        return "Название наземного транспорта" + name + super.getInfo() + "\n";
    }

}