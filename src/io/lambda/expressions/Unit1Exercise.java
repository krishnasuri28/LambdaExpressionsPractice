package io.lambda.expressions;

import java.util.Arrays;
import java.util.Collections;
import java.util.*;

public class Unit1Exercise{
	
	public static void main (String args[]) {
		List<Person> persons = Arrays.asList(new Person("Anurag","Suri",26),
				new Person("Valinda", "Vanam", 25),
				new Person ("Meghana" , "Thasf", 24),
				new Person ("Lochan" , "Akkaraju", 24),
				new Person("Bindu", "Charles", 23));
		
		/*Collections.sort(persons, new Comparator<Person>() {
			@Override
		    public int compare(Person one, Person other) {
		        return one.getLastName().compareTo(other.getLastName());
		    }
		}); 
		for (Person person : persons) {
			System.out.println(person);
			}*/
		
		persons.stream().sorted((Person p1 , Person p2) -> p1.getLastName().compareTo(p2.getLastName()));
		persons.forEach(person -> System.out.println(person));
	}
}
