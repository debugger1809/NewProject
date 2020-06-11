



import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.group6.pro.model.Kitchens;
import com.group6.pro.model.Product;
import com.group6.pro.model.Role;
import com.group6.pro.model.User;
import com.group6.pro.repository.KitchensRepository;
import com.group6.pro.repository.ProductRepository;
import com.group6.pro.repository.RoleRepository;
import com.group6.pro.repository.ServiceProvierRepo;
import com.group6.pro.repository.UserRepository;
import com.group6.pro.service.UserService;

@SpringBootTest
public class WebApplicationTest {
	
	
	@Autowired KitchensRepository kitchenRepo;

	 @Autowired ProductRepository productRepo;
	 
	@Autowired RoleRepository roleRepo;
	 
	 @Autowired ServiceProvierRepo serviceRepo;
	 
	 @Autowired UserRepository userRepo;
	 
	 
	 
	 @Test
		public void contextLoads() {
		}
	 
	   // void save(User user);

	    
	 @Test public void findByUserNameTest() {
	    	User u=new User();
	    	//Set <Role> r=new <Role>();
	    	u.setPassword("12345678");
	    	u.setEmail("abudabi@gmail.com");
	    	u.setPasswordConfirm("12345678");
	    	//u.setRoles(r);
	    	u.setUsername("labalabm");
	    	//userRepo.save(u);
	    	User findUser=userRepo.findByUsername(u.getUsername());
	    	assertThat(findUser).isNull();
	    	assertThat(findUser.getUsername()).isEqualTo(u.getUsername());
	    }
	    
	 @Test public void testCreateKitchen() {
		 
		Kitchens kitchen = new Kitchens();

		try {
		  	kitchen.setKitchenName("Sahane");
		  	kitchen.setKitchen_working_Days("Friday-Sunday");
		  	kitchen.setKitchen_start_time("3pm");
		  	kitchen.setKitchen_stop_time("11pm"); 
		}catch(NullPointerException ne) {
			System.out.print("NullPointerException Caught"); 
		}
	  	}
	 
	 @Test 
	 public Set<Product> findByKitchenTest(){
		 Kitchens kitchen=new Kitchens();
		 Set <Product> findkitchens=productRepo.findByKitchen(kitchen);
		 try {
			  	kitchen.setKitchenName("Sahane");
			  	kitchen.setKitchen_working_Days("Friday-Sunday");
			  	kitchen.setKitchen_start_time("3pm");
			  	kitchen.setKitchen_stop_time("11pm");
			  	findkitchens=productRepo.findByKitchen(kitchen);
			  	assertThat(findkitchens).isNull();
			  //	assertThat(findkitchens.findByKitchen()).isEqualTo(kitchen.getKitchenName());
			  	
			  	
			}catch(NullPointerException ne) {
				System.out.print("NullPointerException Caught"); 
			}
		 
		 return findkitchens;
		 
	 }
	 	
	 
	 }









