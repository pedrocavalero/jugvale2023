package com.pedrocavalero.jugvale2023.mvctest;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseSeeder implements CommandLineRunner {

    private final UserRepository userRepository;

    
    public DatabaseSeeder(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    
    @Override
    public void run(String... args) throws Exception {
    	System.out.println("Populando o banco");
    	for (int j = 0; j < 1000; j++) {
    		// Create users
    		User user = new User(""+j, "Bob"+j);
    		// Save to database
    		userRepository.save(user);
		}
    }
}
