/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question5;

/**
 *
 * @author Venkata Gopi Siva Sai Nallapati
 */
public class Circle {

    private double radius;
    private double area;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return area;
    }

    public double calculateArea() {

        area = Math.round(Math.PI * Math.pow(this.radius, 2) * 100) / 100.0;
        return area;
    }
}
