package in.codetech;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import in.codetech.model.Role;
import in.codetech.model.User;
import in.codetech.model.UserRole;
import in.codetech.service.UserService;

@SpringBootApplication
public class AngularEduCloudApplication {
//public class AngularEduCloudApplication implements CommandLineRunner {
	

	@Autowired
	private UserService userService;

	public static void main(String[] args) {
		SpringApplication.run(AngularEduCloudApplication.class, args);
	}

//	@Override
//		public void run(String... args) throws Exception {
//			// TODO Auto-generated method stub
//			
//	
//
//		User user = new User();
//
//		user.setFirstName("Ram");
//		user.setLastName("patil");
//		user.setUsername("Ram15");
//		user.setPassword("Ram12");
//		user.setPhone("88746434365");
//		user.setEmail("Ram@gmail.com");
//		user.setProfile("png");
//
//		Role role1 = new Role();
//		role1.setRoleId(1L);
//		role1.setRoleName("Adim");
//
//		Set<UserRole> userRoleSet = new HashSet<>();
//
//		UserRole userRole = new UserRole();
//		userRole.setRole(role1);
//		userRole.setUser(user);
//
//		userRoleSet.add(userRole);
//
////	
//		User user1 = this.userService.createUser(user, userRoleSet);
//		System.out.println(user1.getUsername());
//	}

}
