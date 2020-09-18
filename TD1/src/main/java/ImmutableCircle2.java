/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author g55047
 */
public class ImmutableCircle2 {
    private ImmutablePoint center;
    private double radius;
    
    public ImmutableCircle2(ImmutablePoint center, double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("radius must be positive" +
                     ", received: " + radius);
        }
        this.center = new ImmutablePoint(center);
    }

    public ImmutablePoint move(double dx, double dy) {
        return new ImmutablePoint(this.center);
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public ImmutablePoint getCenter() {
        return new ImmutablePoint(center);
    }

    public void scale(double factor) {
        if (factor <= 0) {
            throw new IllegalArgumentException("Scale factor must be positive" +
                     ", received: " + factor);
        }
        radius *= factor;
    }

    @Override
    public String toString() {
        return "Circle : [" + center + ", " + radius + "]";
    }
    
}
