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
		System.out.println("�ܳ�="+c1.Perimeter()+",���="+c1.Area());
		System.out.println("Ҷ������201905006425");
	}
}
