package j8features;

import java.util.ArrayList;
import java.util.Date;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntPredicate;
import java.util.function.IntToDoubleFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.IntStream;

class Employee
{
	String name;
	Double sal;
	Employee(String name, Double sal)
	{
		this.name=name;
		this.sal=sal;
	}
	@Override
	public String toString() {
		return this.name +":"+this.sal;
	}
}
public class PredefinedFunctionInterfaces {

	public static void main(String[] args) {

//Predicate<T>
		
		System.out.println("---------Predicate<T>---------");
		//is even number or not
		Predicate<Integer> p =x->x%2==0;
		System.out.println("is 4 even number:"+p.test(4));
		
		ArrayList<Employee> empList=new ArrayList<>();
		empList.add(new Employee("ravi",1000d));
		empList.add(new Employee("havi",5000d));
		empList.add(new Employee("devi",2500d));
		empList.add(new Employee("kavi",4000d));
		empList.add(new Employee("raj",6000d));
		System.out.println(empList);
		//list all employee's sal >3000
		empList.stream().filter(e->e.sal>3000d).forEach(System.out::println);
		
		int[] nums= {1,2,5,6,8,9,12,16,18,20};
		Predicate<Integer> p1=i->i%2==0;
		Predicate<Integer> p2=i->i%4==0;

		//Print all number which are divisible by 2 & 4
		System.out.println("Print all number which are divisible by 2 & 4");
		System.out.println("====p1.and(p2).test(a)====");
		IntStream.of(nums).filter(a->p1.and(p2).test(a)).forEach(System.out::println);

		//Print all number which are divisible by 2 or 4
		System.out.println("Print all number which are divisible by 2 or 4");
		System.out.println("===a->p1.or(p2).test(a)===");
		IntStream.of(nums).filter(a->p1.or(p2).test(a)).forEach(System.out::println);

		//Print all number which are divisible by 2
		System.out.println("Print all number which are divisible by 2");
		System.out.println("====p1.negate().test(a)===");
		IntStream.of(nums).filter(a->p1.negate().test(a)).forEach(System.out::println);

//Function<T,R>		

		System.out.println("---------Function<T,R>---------");
		//square of  number
		Function<Integer,Integer> f=(x)->x*x;
		System.out.println("4^2="+f.apply(4));
		
		//Upper Case
		Function<String,String> f1=x->x.toUpperCase();
		System.out.println("Upper case of \'ravi\' --> "+f1.apply("ravi"));
		
int[] nos= {1,2,3};
		Function<Integer,Integer> fun1=x->x*2;
		Function<Integer,Integer> fun2=x->x*x*x;

		System.out.println("====fun1.andThen(fun2).apply(x)====");
		IntStream.of(nos).mapToObj(x->fun1.andThen(fun2).apply(x)).forEach(System.out::println);
		System.out.println("====fun1.compose(fun2).apply(x)====");
		IntStream.of(nos).mapToObj(x->fun1.compose(fun2).apply(x)).forEach(System.out::println);

//Consumer<T> ----- return void
		System.out.println("====Consumer<T>====");
		Consumer<String> con1=x->{System.out.println(x);};
		con1.accept("Ravi");		

//Supplier<R> ----- return R
		System.out.println("====/Supplier<R>====");
		Supplier<Date> sup1=()->{return new Date();};
		System.out.println(sup1.get());
	
		Supplier<String> sup2=()->{
			String otp="";
			for(int i=0;i<=6;i++)
			{
				otp+=(int)(Math.random()*10);
			}
			return otp;
		};
		System.out.println("OTP is "+sup2.get());

//BiPredicate
		BiPredicate<Integer, Integer> bip1 = (x,y) -> (x+y)%2==0;
		System.out.println("Sume of (5,4) is even or not:"+ bip1.test(5, 4));
//BiFunction
		BiFunction<Integer, Integer, Integer> bifun1 = (x,y)-> x*y;
		System.out.println("Mul of (5,4) =:"+ bifun1.apply(5, 4));
//BiConsumer
		BiConsumer<Integer, Integer> bicon1=(x,y)->{System.out.println(x+"--->"+y);};
		bicon1.accept(5, 4);

//IntPredicate
		// to improve performance: no need of casting int to Integer, Integer to n
		IntPredicate ip=x->x%2==0;
		System.out.println(ip.test(8));
		
//IntToDoubleFunction
		IntToDoubleFunction idF=x->x*5.8;
		System.out.println(idF.applyAsDouble(5));
	}


}
