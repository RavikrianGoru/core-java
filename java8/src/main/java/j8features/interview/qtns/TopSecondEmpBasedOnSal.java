package j8features.interview.qtns;

import java.util.Arrays;
import java.util.List;

class Emp
{
	int no;
	String name;
	float sal;
	Emp(int no,String name, float sal)
	{
		this.no=no;
		this.name=name;
		this.sal=sal;
	}
	@Override
	public String toString() {
		return no+"-"+name+"-"+sal;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + no;
		result = prime * result + Float.floatToIntBits(sal);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Emp other = (Emp) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (no != other.no)
			return false;
		if (Float.floatToIntBits(sal) != Float.floatToIntBits(other.sal))
			return false;
		return true;
	}
	
}
public class TopSecondEmpBasedOnSal {

	public static void main(String[] args) 
	{
		List<Emp> lt=Arrays.asList(new Emp(1,"ravi", 2000.00f),new Emp(4,"hari", 3000.00f),new Emp(3,"devi", 2900.00f),new Emp(5,"kavi", 2070.00f));
			
		lt.stream().sorted((e1,e2)->(e1.sal>e2.sal)?-1:(e1.sal<e2.sal)?1:0)
			//.peek(System.out::println)
			.limit(2)
			.skip(1)
			.forEach(System.out::println);
		
	}

}
