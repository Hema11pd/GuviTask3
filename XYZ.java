package GuviTask3;

import java.util.Scanner;

public class XYZ   {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Employee Id: ");
        int empId = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Employee Name: ");
        String empName = scanner.nextLine();
        System.out.print("Employee Salary: ");
        double empSalary = scanner.nextDouble();
        Taxable employee = new Employee(empId,empName,empSalary);
        employee.calcTax();
        System.out.print("Product ID: ");
        int productId = scanner.nextInt();
        System.out.print("Product Price: ");
        double productPrice = scanner.nextDouble();
        System.out.print("Product Quantity: ");
        int productQuantity = scanner.nextInt();
        Taxable product = new Product(productId,productPrice,productQuantity);
        product.calcTax();
    }
}
