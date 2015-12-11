public class Cylinder extends Circle implements Volume{

    private double height;

    public Cylinder(double radius, double height,String name){
	super(radius,name);
	this.height = height;
    }

    public double getHeight(){
	return height;
    }

    public String toString(){
	return "Cylinder "+getName()+" with radius of "+getRadius()+" and height of "+height;
    }

    public double getVolume(){
	return getArea()*height;
    }
}
