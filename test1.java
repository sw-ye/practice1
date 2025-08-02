class test1 
{
	public static void main(String[] args) 
	{
		System.out.println("“∂ ¿ˆ©£¨201905006425");
		Person obj=new Person("lili",20);
		System.out.println(obj.toString());
		System.out.println(obj.getClass().getName());
		Person p=new Person("lili",20);System.out.println(obj.equals(p));
		Person q=new Student("jack",19;System.out.println(p.equals(q));
		Student s1=new Person("john",18);System.out.println(q.equals(s1));
		Object obj2=new Object();System.out.println(obj.equals(obj2));
		System.out.println(s1 instanceof Person);System.out.println(s1 instanceof Student);
	}
}
 
 
	 class Person extends Object{
		 private String name;
		 private int age;
		 public Person (String name,int age){this.name=name;this.age=age;}public Person(){}
		 public String toString(){return"–’√˚£∫"+name+",ƒÍ¡‰£∫"+age;}
	 }
	 public boolean equals(Object obj){
		 if(obj==null)return false;
		 if(obj.getClass()!=this.getClass())return false;
		 if(this==obj)return true;
		 if((obj.name==this.name)&&(obj.age==this.age))return true;
		 else return false;
	 }
	 