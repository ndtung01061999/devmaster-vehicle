package chuabai.vehicle.car;

import chuabai.vehicle.Vehicle;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Scanner;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Car extends Vehicle {
    private String color;
    static Scanner sc = new Scanner(System.in);

    @Override
    public void input() {
        super.input();
        System.out.println("Nhap color:");
        color = sc.nextLine();
    }

    @Override
    public void display() {
        System.out.print("Car: ");
        super.display();
        System.out.print(" " + color + "\n");
    }
}
