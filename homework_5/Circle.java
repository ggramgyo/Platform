package edu.pnu.shape;

public class Circle extends Shape {
    private Point center;
    private int radius;

    public Circle(Point p1, int r){
        this.center = p1;
        this.radius = r;
    }
    public Point getCenter(){
        return center;
    }
    @Override
    public float getArea() {
        return (float)(radius*radius*Math.PI);
    }

    @Override
    public String toString() {
        return String.format("[Circle [%d, %d], radius: %d area: %.2f]",center.getX(),center.getY(),radius,getArea());
    }
}
