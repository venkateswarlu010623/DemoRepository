package java8_features;

import java.util.Arrays;
import java.util.List;

 class books {
	
	Integer id;
	String name;
	String author;
	
	public books(Integer id, String name, String author) {
		this.id = id;
		this.name = name;
		this.author = author;
	}
	


}


public class arraylistex {

	public static void main(String[] args) {

		List<books> bs = Arrays.asList(new books(11,"DSA","ram"),
										new books(65,"JAVA","ANU"),
										new books(26,"ORACLE","SEKHAR"),
										new books(28,"PYTHON","GOURY"));
		
		
		System.out.println("list based on id");
		bs.sort((e1,e2)->e1.id.compareTo(e2.id));
		bs.forEach((bs2)->System.out.println(bs2.id+" "+bs2.name+" "+bs2.author));
		
		System.out.println();
		
		System.out.println("list based on name");
		bs.sort((e1,e2)->e1.name.compareTo(e2.name));
		bs.forEach((bs2)->System.out.println(bs2.id+" "+bs2.name+" "+bs2.author));
	
		System.out.println();
		
		System.out.println("list based on Author");
		bs.sort((e1,e2)->e1.author.compareTo(e2.author));
		bs.forEach((bs2)->System.out.println(bs2.id+" "+bs2.name+" "+bs2.author));
	
		System.out.println();

		/*
		 * System.out.println("print list of books which contains java");
		 * bs.stream().filter(name->name.contains("java")).forEach(name->System.out.
		 * println(name));
		 */
		
	}

}
