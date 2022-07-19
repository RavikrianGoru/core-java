package j8features;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Empy
{
	int id;
	String name;
	List<String> citiesWorkedIn;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getCitiesWorkedIn() {
		return citiesWorkedIn;
	}
	public void setCitiesWorkedIn(List<String> citiesWorkedIn) {
		this.citiesWorkedIn = citiesWorkedIn;
	}
	@Override
	public String toString() {
		return "Empoyee [id=" + id + ", name=" + name + ", citiesWorkedIn=" + citiesWorkedIn + "]";
	}
	public Empy(int id, String name, List<String> citiesWorkedIn) {
		super();
		this.id = id;
		this.name = name;
		this.citiesWorkedIn = citiesWorkedIn;
	}
	
}
public class Stream1MapFlatMap {

	public static void main(String[] args) {

		System.out.println("-----.map(-) takes Function as arg and return single value-----");
		Stream.of(new Empy(1,"ravi", Arrays.asList("gnt","vij")),
				new Empy(2,"devi", Arrays.asList("NHK","vij")),
				new Empy(3,"kavi", Arrays.asList("Bzk","vij")),
				new Empy(4,"chinni", Arrays.asList("Hyd","vij")),
				new Empy(5,"chinna", Arrays.asList("gnt","vij"))
				).map(e->e.getId()).forEach(System.out::println);
		System.out.println("-----.flatMap(-) takes Function as arg and return stream-----");
		Set<String> uniqueWorklocations=Stream.of(new Empy(1,"ravi", Arrays.asList("gnt","vij")),
				new Empy(2,"devi", Arrays.asList("NHK","vij")),
				new Empy(3,"kavi", Arrays.asList("Bzk","vij")),
				new Empy(4,"chinni", Arrays.asList("Hyd","vij")),
				new Empy(5,"chinna", Arrays.asList("gnt","vij"))
				).flatMap(e->e.getCitiesWorkedIn().stream()).collect(Collectors.toSet());
		System.out.println(uniqueWorklocations);
		
		
	}

}
