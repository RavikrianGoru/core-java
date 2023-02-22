package in.nareshit.pojo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;

import lombok.Cleanup;
import lombok.NonNull;
import lombok.val;
import lombok.var;

public class StudentUtility {

	// var count=10; Error: not local variables.
	// val n=10; Error: not local variables.

	public static void demoVar() {
		System.out.println("---------lombok: var demo-------");
		var count = 0;
		var name = "StringList";
		var strList = new ArrayList<String>();

		strList.add("Hi");
		strList.add("Bye");
		count = strList.size();

		System.out.println("name:" + name);
		System.out.println("strList:" + strList);
		System.out.println("count:" + count);
		for (var str : strList) {
			System.out.println(str);
		}

	}

	public static void demoVal() {
		System.out.println("---------lombok: val demo-------");
		val age = 10;
		val name = "StringList";
		val strList = new ArrayList<String>();

		strList.add("Hi");
		strList.add("Bye");
		// count=strList.size(); ERROR: Can not reassign to final variable
		val count = strList.size();

		System.out.println("name:" + name);
		System.out.println("strList:" + strList);
		System.out.println("age:" + age);
		System.out.println("count:" + count);
		for (val str : strList) {
			System.out.println(str);
		}

	}

	public static void demoNonNull(@NonNull Integer sid, @NonNull String sname, Double savg, @NonNull Student std) {
		System.out.println("Student:" + std);
		System.out.println("sid:" + sid);
		System.out.println("sname:" + sname);
		System.out.println("savg:" + savg);
	}

	public static void demoCleanup() {
		try {
			@Cleanup
			InputStream is = new FileInputStream("D:\\temp.txt");
			while (true) {
				int r = is.read();
				if (r == -1)
					break;
				System.out.println((char)r);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void demoBuilder()
	{
		Pizza pz=new Pizza("ABC", 8);
		System.out.println("Pizza obj by allarg contructor:"+pz);
		
		Pizza pz1=Pizza.builder().name("XYZ").size(10).build();
		System.out.println("Pizza obj by bulder()....build():"+pz1);
	}
	
}
