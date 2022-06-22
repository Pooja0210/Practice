package com.zensar;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.zensar.dao.UserRepository;
import com.zensar.model.User;

@SpringBootApplication
public class BootjpaexampleApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(BootjpaexampleApplication.class, args);
		UserRepository userRepository = context.getBean(UserRepository.class);
		/*
		 * //Saving single user User user = new User(); user.setName("Annie");
		 * user.setCity("Delhi"); user.setStatus("I am a Java Programmer"); User user1 =
		 * userRepository.save(user); System.out.println(user1);
		 */
		/*
		 * //Saving multiple user User user1 = new User(); user1.setName("Priya");
		 * user1.setCity("Patna"); user1.setStatus("I am a Python Programmer");
		 * 
		 * User user2 = new User(); user2.setName("Satya"); user2.setCity("Kolkata");
		 * user2.setStatus("I am a C# Programmer");
		 * 
		 * //List<User> users = List.of(user1,user2); List<User> users = new
		 * ArrayList<>(); users.add(user1); users.add(user2);
		 * 
		 * 
		 * Iterable<User> result = userRepository.saveAll(users); result.forEach(user->{
		 * System.out.println(user); }); System.out.println("Done");
		 */
		/*
		// Update the user of id 1
		Optional<User> optional = userRepository.findById(1);
		User user = optional.get();
		user.setName("Annie Frank");
		User result = userRepository.save(user);
		System.out.println(result);
		*/
		/*
		how to get the data
		findById(id) - return Optional Containing your data
		*/
		Iterable<User> itr = userRepository.findAll();
		/*
		Iterator<User> iterator = itr.iterator();
		
		while(iterator.hasNext()) {
			User user=iterator.next();
			System.out.println(user);
		}
		*/
		itr.forEach(user->{System.out.println(user);});
		
		/*
		 * Deleting the user element
		 userRepository.deleteById(1);
		 *deleteAll
		 Iterable<User> allusers = userRepository.findAll();
		 allusers.forEach(user->System.out.println(user));
		 userRepository.deleteAll(allusers);
		 */
		
		List<User> users = userRepository.findByName("Annie Frank");
		users.forEach(e->System.out.println(e));
		
	}

}
