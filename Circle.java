public class Circle extends Shape implements Area{

    private double radius;

    public Circle(){
    }

    public Circle(double radius, String name){
	super(name);
	this.radius=radius;
    }

    public double getRadius(){
	return radius;
    }

    public String toString(){
	return "Circle "+getName()+" with radius of "+getRadius();
    }

    public double getArea(){
	return radius*radius*3.14159265358979;
    }

}