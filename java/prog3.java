class Vehicle {
    String brand;
    Vehicle(String brand) { this.brand = brand; }
    void display() { System.out.println("Brand: " + brand); }
}

class Car extends Vehicle {
    String model;
    Car(String brand, String model) {
        super(brand);
        this.model = model;
    }
    void display() {
        super.display();
        System.out.println("Model: " + model);
    }
}

class ElectricCar extends Car {
    int battery;
    ElectricCar(String brand, String model, int battery) {
        super(brand, model);
        this.battery = battery;
    }
    void display() {
        super.display();
        System.out.println("Battery: " + battery + " kWh");
    }
}

public class prog3 {
    public static void main(String[] args) {
        ElectricCar ev = new ElectricCar("Tesla", "Model 3", 75);
        ev.display();
    }
}
