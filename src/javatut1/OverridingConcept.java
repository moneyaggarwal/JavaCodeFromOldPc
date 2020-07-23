package javatut1;

//the concept is also called dynamic method dispatch
//also runtime polymorphism

public class OverridingConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a= new A();
		a.m1();
		System.out.println(a.x);
		A a1=new B();
		a1.m1();
		System.out.println(a1.x);   //variables are not overriden so it will give x=10
		B b=new B();
		b.m1();
		System.out.println(b.x);
		C c= new C();
		c.m1();
		System.out.println(c.x);
		

	}

}

class A
{
	int x=10;
	void m1()
	{
		System.out.println("inside A");
	}
}
class B extends A
{
	int x=20;
	void m1()
	{
		System.out.println("inside B");
	}
}
class C extends A
{
	int x=30;
	void m1() {
		System.out.println("inside C");
	}
	}
