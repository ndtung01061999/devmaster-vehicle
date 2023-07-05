package chuabai.vehicle;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Scanner;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Vehicle implements IVehicle {

    String maker;
    String model;
    double price;
    static Scanner sc = new Scanner(System.in);

    @Override
    public void input() {
        System.out.println("Nhap maker:");
        maker = sc.nextLine();
        System.out.println("Nhap model:");
        model = sc.nextLine();
        System.out.println("Nhap price:");
        price = Double.parseDouble(sc.nextLine());
    }

    @Override
    public void display() {
        System.out.print(maker + " " + model + " " + price);
    }

}
