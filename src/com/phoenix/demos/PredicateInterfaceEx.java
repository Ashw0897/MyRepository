package com.phoenix.demos;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateInterfaceEx {

	public static void main(String[] args) {
		Predicate<Person> predicate = (person) -> person.getAge()>20;
		
		Person p1= new Person("Arjun", 27);
		System.out.println(predicate.test(p1));
		
		
		Person p2= new Person("Ankita", 29);
		BiPredicate<Person, Person> biPredicate = (person1, person2) -> person1.getAge() > person2.getAge();
		System.out.println(biPredicate.test(p1,p2));
	}

}
