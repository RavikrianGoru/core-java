package it.rk.jsonapiapp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import it.rk.jsonapiapp.pojo.Address;
import it.rk.jsonapiapp.pojo.Employee;

public class JacksonJsonToJavaTransfermationMain {
	public static void main(String[] args) throws JsonProcessingException
	{
		System.out.println("============JacksonJson AP===============");

		Address addr1 = new Address("1-1-1", "3rd lane, home",
				Stream.of("123456", "654321").collect(Collectors.toSet()));
		Address addr2 = new Address("2-2-2", "5th lane, office",
				Stream.of("67890", "567890").collect(Collectors.toSet()));

		HashMap<String, Address> hm = new HashMap();
		hm.put("HOME", addr1);
		hm.put("OFFICE", addr2);
		Employee emp1 = new Employee(100, "ravi", 50000.00, Arrays.asList("Btech", "MBA"), hm);
		Employee emp2 = new Employee(102, "kiran", 75000.00, Arrays.asList("Bcom", "MBA"), hm);

		List<Employee> empList = new ArrayList<>();
		empList.add(emp1);
		empList.add(emp2);

		System.out.println("\n=====>List<Employees> object through jackson API<=====");
		System.out.println(empList);
		javaToJson(empList);
		
	}

	private static void javaToJson(List<Employee> empList) throws JsonProcessingException {
		System.out.println();
		ObjectMapper mapper = new ObjectMapper();
		System.out.println("<=======java to json =======>");
		String resp = mapper.writeValueAsString(empList);
		System.out.println(resp);
		System.out.println("<=======Json to java =======>");
		List<Employee> respObj=mapper.readValue(resp, List.class);
		System.out.println(respObj);
		
		System.out.println();
		String respFormatted = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(empList);
		System.out.println(respFormatted);
	}
	
}