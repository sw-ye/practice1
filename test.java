class test 
{
	public static void main(String[] args) 
	{
		System.out.println("叶世雯，201905006425");
		Square c1=new Square(3);
		System.out.println("正方形周长="+c1.Perimeter()+",正方形面积="+c1.Area());
		Circle r1=new Circle(6);
		System.out.println("圆形周长="+r1.Perimeter()+",圆形面积="+r1.Area());
		Rectangle x1=new Rectangle(3,4);
		System.out.println("矩形周长="+x1.Perimeter()+",矩形面积="+x1.Area());

	}
}
abstract class Shape
{
	public abstract double Perimeter();
	public abstract double Area();

}
class Square extends Shape
{
	double side;
	public Square(){side=0;}
	public Square(double side){this.side=side;}
	public double Area(){return side*side;}
	public double Perimeter(){return 4*side;}
}
class Circle extends Shape
{
	double radius;
	double pi=3.14159;
	public Circle(){radius=0;}
	public Circle(double radius){this.radius=radius;}
	public double Area(){return pi*radius*radius;}
	public double Perimeter(){return 2*pi*radius;}
}
class Rectangle extends Shape
{
	double a;
	double b;
	public Rectangle(){a=0;b=0;}
	public Rectangle(double a,double b){this.a=a;this.b=b;}
	public double Area(){return a*b;}
	public double Perimeter(){return 2*(a+b);}
}
