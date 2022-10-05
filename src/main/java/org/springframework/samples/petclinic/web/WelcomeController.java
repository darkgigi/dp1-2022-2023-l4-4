package org.springframework.samples.petclinic.web;

import java.util.Map;
import java.util.List;
import java.util.ArrayList;

import org.springframework.samples.petclinic.model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {
	
	
	  @GetMapping({"/","/welcome"})
	  public String welcome(Map<String, Object> model) {	    
		List<Person> persons=new ArrayList<Person>();
		Person person=new Person();
		person.setFirstName("Ismael");
		person.setLastName("Barrera García");
		persons.add(person);
		Person person1=new Person();
		person1.setFirstName("Rafael");
		person1.setLastName("González Castillero");
		persons.add(person1);
		Person person2=new Person();
		person2.setFirstName("Daniel");
		person2.setLastName("Arriaza Arriaza");
		persons.add(person2);
		Person person3=new Person();
		person3.setFirstName("Virgilio");
		person3.setLastName("Oliva Alonso");
		persons.add(person3);
		Person person4=new Person();
		person4.setFirstName("José Javier");
		person4.setLastName("Alcobendas Santos");
		persons.add(person4);
		model.put("persons", persons);
		model.put("title","DP1. Práctica 1" );
		model.put("group","L4-4");
		return "welcome";
	  }
}
