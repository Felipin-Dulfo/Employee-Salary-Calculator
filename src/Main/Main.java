package Main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String FullName = input.nextLine();
        double salary = input.nextDouble();
        double numberOfHours = input.nextDouble();

        Employee emp = new Employee(salary, numberOfHours, FullName);
        System.out.println(emp.toString());

    }
}
