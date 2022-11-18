package web.models;

public class Car {

    private String model;
    private String serial;
    private int price;

    public Car() {

    }

    public Car(String model, String serial, int price) {
        this.model = model;
        this.serial = serial;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", serial='" + serial + '\'' +
                ", price=" + price +
                '}';
    }
}
