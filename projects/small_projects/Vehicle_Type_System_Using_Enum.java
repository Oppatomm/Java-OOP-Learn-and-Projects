enum VehicleType {
    CAR , 
    MOTORCYCLE ,
    TRUCK
}

class Vehicle {
    private String name;
    private VehicleType vehicleType;


    Vehicle (String name , VehicleType vehicleType) {
        this.name = name;
        this.vehicleType = vehicleType;
    }

    public void showInfo() {
        System.out.println(name + " : " + vehicleType);
    }
}

public class Vehicle_Type_System_Using_Enum {
    public static void main(String[] args) {
        Vehicle car = new Vehicle("Car", VehicleType.CAR);
        car.showInfo();

        Vehicle motorcycle = new Vehicle("Motorcycle", VehicleType.MOTORCYCLE);
        motorcycle.showInfo();

        Vehicle truck = new Vehicle("Truck" , VehicleType.TRUCK);
        truck.showInfo();
    }
}
