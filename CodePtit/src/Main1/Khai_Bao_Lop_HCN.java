package Main1;

import java.util.Scanner;

public class Khai_Bao_Lop_HCN {
    private double width, height;
    private String color;

    public Khai_Bao_Lop_HCN() {
        this.width = 1;
        this.height = 1;
        this.color = "White";
    }

    public Khai_Bao_Lop_HCN(double width, double height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double findArea() {
        return this.width * this.height;
    }

    public double findPerimeter() {
        return 2 * (this.width + this.height);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double width = sc.nextDouble();
        double height = sc.nextDouble();
        String color = sc.next();
        if (width <= 0 || height <= 0) {
            System.out.println("INVALID");
            return;
        }
        Khai_Bao_Lop_HCN rect = new Khai_Bao_Lop_HCN(width, height, color);
        double area = rect.findArea();
        double perimeter = rect.findPerimeter();
        String formattedColor = color.substring(0, 1).toUpperCase() + color.substring(1).toLowerCase();
        System.out.printf("%.0f %.0f %s\n", perimeter, area, formattedColor);
    }
}
