class �ĵ� 
{
	public static void main(String[] args) 
	{
		Shape sp=new Circle(10);
		Circle c1=new Circle(5);
		System.out.println(Shape.color+","+sp.color+","+c1.color);
		Shape.color="blue";Shape.SayColor();
		System.out.println("------------");
		System.out.println("S="+sp.Area());
		System.out.println("S="+c1.Area());
		System.out.println("Ҷ������201905006425");


	}
}
class Shape
{
static String color="red";
static void SayColor(){System.out.println("ͼ����ɫ:"+color);}
double Area(){return 0;}
}

class Circle extends Shape
	{
	private double radius;
	double pi=3.14159;
	Circle(){}
	Circle(double r){if(r>0)this.radius=r;}
	double Area(){SayColor();return pi*radius*radius;}
	double Perimeter(){return 2*pi*radius;}

}


