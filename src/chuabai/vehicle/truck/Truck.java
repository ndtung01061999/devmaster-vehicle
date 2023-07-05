package chuabai.vehicle.truck;

import chuabai.vehicle.Vehicle;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Scanner;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Truck extends Vehicle {
    int truckload;

    @Override
    public void input() {
        super.input();
        System.out.println("Nhap truckload:");
        truckload = Integer.parseInt(new Scanner(System.in).nextLine());
    }

    @Override
    public void display() {
        System.out.print("Truck: ");
        super.display();
        System.out.print(" " + truckload + "\n");
    }
}
