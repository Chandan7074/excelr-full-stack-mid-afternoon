class   A

{
	int i;
}
 class B extends A
 {
	 int j;

	public static void main(String[] args) 
	{
		B b1 = new B();
		System.out.println(b1.i);
		System.out.println(b1.j);
	}
}
/* 
what are the basic pillars of oops?
what are the principles of oops?
1.abstraction
2.inheritance
3.encapsulation
4.polymorphism

Inheritance - aquring the properties and behaviours of another class(parent class).
2.Parent class ==> Base Class
3.Child class > derived class(sub class)

types of inheritance
1.single 
2.multiple
3.multi-level
4.hybrid
5.hierachical

Note: By using  'extends keyword we can achieve inheritance throug classes[represent solid line]
Note: By using  'implements keyword we can achieve inheritance throug interfaces[dotted line]