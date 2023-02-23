public class Transport {
    protected static String name;
    protected String whereMoving;
    protected String typeEngine;
    protected boolean privateTransport;
    protected int numberPassengers;
    protected double loadCapacity;
    protected double weightTransport;
    protected double lengthTransport;
    protected String colorTransport;

    public Transport(String name, String whereMoving, String typeEngine, boolean privateTransport, int numberPassengers,
                     double loadCapacity, double weightTransport, double lengthTransport, String colorTransport) {
        this.name = name;
        this.whereMoving = whereMoving;
        this.typeEngine = typeEngine;
        this.privateTransport = privateTransport;
        this.numberPassengers = numberPassengers;
        this.loadCapacity = loadCapacity;
        this.weightTransport = weightTransport;
        this.lengthTransport = lengthTransport;
        this.colorTransport = colorTransport;
    }

    public static String getName() {
        return name;
    }

    public String getWhereMoving() {
        return whereMoving;
    }

    public String getTypeEngine() {

        return typeEngine;
    }

//    public boolean isPrivateTransport() {
//        return privateTransport;
//    }

    public int getNumberPassengers() {
        return numberPassengers;
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }

    public double getWeightTransport() {
        return weightTransport;
    }

    public double getLengthTransport() {
        return lengthTransport;
    }

    public String getColorTransport() {
        return colorTransport;
    }

    public String getInfo(){
        return "Имеет" + typeEngine + "двигатель. Вместимость пассажиров: " + numberPassengers + ". Грузоподъёмность: "
                + loadCapacity + ". Вес транспорта: " + weightTransport + " и т.д.";
    }

//    public void setWhereMoving(String whereMoving) { //Этого сеттера не должно быть. Он в каждом наследнике свой
//        this.whereMoving = whereMoving;
//    }

    public void setTypeEngine(String typeEngine) {
        this.typeEngine = typeEngine;
    }

    public void setPrivateTransport(boolean privateTransport) {
        this.privateTransport = privateTransport;
    }

    public void setNumberPassengers(int numberPassengers) {
        this.numberPassengers = numberPassengers;
    }

    public void setLoadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public void setWeightTransport(double weightTransport) {
        this.weightTransport = weightTransport;
    }

    public void setLengthTransport(double lengthTransport) {
        this.lengthTransport = lengthTransport;
    }

    public void setColorTransport(String colorTransport) {
        this.colorTransport = colorTransport;
    }
}
