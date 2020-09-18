/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author g55047
 */
public final class ImmutableCircle1 {
    private final Point center;
    private double radius;
    
    public ImmutableCircle1(Point center, double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("radius must be positive" +
                     ", received: " + radius);
        }
        this.center = new Point(center);
    }

    public Point move(double dx, double dy) {
        return new Point(center.getX()+dx, center.getY()+dy);
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public Point getCenter() {
        return new Point(center);
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
