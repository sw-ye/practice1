class Square 
{
	double a;
	Square(){a=0;}
	Square(double a1){this.a=a1;}
	double Area(){return a*a;}
	double Perimeter(){return 4*a;}
	
	public static void main(String[] args) 
	{
		Square c1=new Square();c1.a=5;
		System.out.println("周长="+c1.Perimeter()+",面积="+c1.Area());
		System.out.println("叶世雯，201905006425");
	}
}
