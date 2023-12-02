public abstract class TransportVehicle {
    private String modelName;
    private int wheelsCount;

    public TransportVehicle(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public String getModelName() {
        return modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }
    public void updateTyre(TransportVehicle transportVehicle) {
        for (int i = 0; i < transportVehicle.getWheelsCount(); i++) {
            System.out.println("Меняем покрышку");
        }
    }
}