package j8features;

import java.util.concurrent.Callable;

interface FIInf {
	void add(int a, int b);
}

class Sample
{
	Sample()
	{
		System.out.println("Sample-constructor");
	}
}
interface FIInter {
	public Sample get();
}

class Emp
{
	Emp()
	{
		System.out.println("Ename:");
	}
	Emp(String ename, Integer eno, String addr)
	{
		System.out.println("Ename:"+ename);
		System.out.println("eno:"+eno);
		System.out.println("addr:"+addr);
	}
}
interface FIInter1 {
	public Emp get(String ename, Integer eno, String addr);
}

public class MethodAndConstructorReference {

	public static void sum(int a, int b) {
		System.out.println(a + b);
	}

	public static void m1Run() {
		System.out.println("m1Run()");
	}

	public int m1Call() {
		System.out.println("m1Call()");
		return 0;
	}

	public static void main(String[] args) throws Exception {
		
		Runnable r = MethodAndConstructorReference::m1Run;
		Thread t1 = new Thread(r);
		t1.start();

		MethodAndConstructorReference obj = new MethodAndConstructorReference();
		Callable<Integer> c = obj::m1Call;
		c.call();
		System.out.println("Main Method");
		
		//FIInf i =(a,b)->a+b;
		FIInf i = MethodAndConstructorReference::sum;
		i.add(10, 20);
		
		//FIInter1 i1=(ename,eno,addr)->new Emp(ename,eno,addr); 
		FIInter1 i1=Emp::new;
		i1.get("ravi",101,"Gnt");
		
		
	}

}
