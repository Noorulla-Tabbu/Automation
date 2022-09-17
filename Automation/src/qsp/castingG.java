package qsp;
class A
{
	int i;
}
class B extends A
{
	int j;
}
class C extends B
{
	int k;
}
public class castingG {
	public static void main(String[] arg)
	{
		A obj1=new C();
		B obj2=(B)obj1;
		C obj3=(C)obj1;

		System.out.println(obj1.i);//0

		System.out.println(obj2.i);//0
		System.out.println(obj2.j);//0

		System.out.println(obj3.i);//0
		System.out.println(obj3.j);//0
		System.out.println(obj3.k);//0
	}
}