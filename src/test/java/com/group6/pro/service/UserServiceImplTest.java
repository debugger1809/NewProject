package com.group6.pro.service;

//import static org.assertj.core.api.Assertions.assertThat;
//import static org.junit.Assert.assertEquals;
//import static org.junit.jupiter.api.Assertions.*;
//import static org.mockito.Mockito.mock;
//import static org.mockito.Mockito.when;
//
//import java.util.List;
//import java.util.Set;
//import java.util.stream.Collectors;
//import java.util.stream.Stream;
//
//import javax.validation.ValidationException;
//
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//
//import com.group6.pro.model.Role;
//import com.group6.pro.model.User;
//import com.group6.pro.repository.RoleRepository;
//import com.group6.pro.repository.UserRepository;
//
//class UserServiceImplTest {
//    @MockBean
//    private UserRepository userRepo;
//    @Autowired
//   private RoleRepository roleRepo;
//    @Autowired
//    private BCryptPasswordEncoder bCryptPasswordEncoder;
//    @Autowired
//    private UserService userService;
//    
//	@Test
//	void test() {
//		fail("Not yet implemented");
//	}
//	
//	 @Test public void findByUserNameTest() {
//		 User u=new User();
//	    	//Set <Role> r=new <Role>();
//	    	u.setPassword("12345678");
//	    	u.setEmail("abudabi@gmail.com");
//	    	u.setPasswordConfirm("12345678");
//	    	//u.setRoles(r);
//	    	u.setUsername("labalabm");
//	    	userRepo.save(u);
//	    	User findUser=userRepo.findByUsername(u.getUsername());
//	    	assertThat(findUser).isNull();
//	    	assertThat(userService.findByUsername("labalabm")).isEqualTo(u.getUsername());
//	    	
//	 }
//	   
//	   @Test public void saveUserTest() {
//		   User u=new User();
//		   //Role r=new Role();
//		   //r.setName("Provider");
//			u.setPassword("12345678");
//			u.setEmail("abudabi@gmail.com");
//			u.setPasswordConfirm("12345678");
//			u.setRoles(u.getRoles());
//			u.setUsername("labalabm");
//			when(userRepo.save(u)).thenReturn(u);
//			//assertEquals(u,userService.save(u));
//			
//		   
//	   }
//
//}
