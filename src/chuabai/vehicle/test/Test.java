package chuabai.vehicle.test;

import chuabai.vehicle.IVehicle;
import chuabai.vehicle.Vehicle;
import chuabai.vehicle.car.Car;
import chuabai.vehicle.truck.Truck;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {

    static void menu(List<Vehicle> vehicles, int n) {
        do {
            System.out.println("1.Input");
            System.out.println("2.Display");
            System.out.println("3.Sort by price");
            System.out.println("4.Search by model");
            System.out.println("5.Exit");
            System.out.println("Chon menu:");
            n = Integer.parseInt(new Scanner(System.in).nextLine());
            if (n == 5) {
                System.out.println("Kết thúc!");
            }
            handleMenu(vehicles, n);
        } while (n != 5);
    }

    static void handleMenu(List<Vehicle> vehicles, int n) {
        switch (n) {
            case 1:
                input(vehicles);
                break;
            case 2:
                display(vehicles);
                break;
            case 3:
                sort(vehicles);
                break;
            case 4:
                searchModel(vehicles);
                break;
            default:
                break;
        }
    }

    static void input(List<Vehicle> vehicles) {
        System.out.println("Nhap 2 car:");
        for (int i = 0; i < 2; i++) {
            Car car = new Car();
            car.input();
            vehicles.add(car);
        }
        System.out.println("Nhap 3 truck:");
        for (int i = 0; i < 2; i++) {
            Truck truck = new Truck();
            truck.input();
            vehicles.add(truck);
        }
    }

    static void display(List<Vehicle> vehicles) {
        for (int i = 0; i < vehicles.size(); i++) {
            vehicles.get(i).display();
        }
    }

    static void sort(List<Vehicle> vehicles) {
        System.out.println("Truoc sap xep:");
        vehicles.forEach(Vehicle::display);
        System.out.println("Sau sap xep:");
        vehicles.sort((o1, o2) -> (int) (o1.getPrice() - o2.getPrice()));
        vehicles.forEach(Vehicle::display);
    }

    static void searchModel(List<Vehicle> vehicles) {
        System.out.println("Nhap model can tim:");
        String model = new Scanner(System.in).nextLine();
        boolean flag = false;
//        vehicles
//                .stream()
//                .filter(vehicle -> vehicle.getModel().equals(model))
//                .forEach(Vehicle::display);
        for (int i = 0; i < vehicles.size(); i++) {
            if (vehicles.get(i).getModel().equals(model)) {
                vehicles.get(i).display();
                flag = true;
            }
        }
        if (flag == false) System.out.println("Không tìm thấy");
    }

    public static void main(String[] args) {
        int n = 0;
        List<Vehicle> vehicles = new ArrayList<>();
        menu(vehicles, n);
    }
}
