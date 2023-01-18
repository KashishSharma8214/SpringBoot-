package Scope;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;



@SpringBootApplication
public class JourneyToFaanGApplication1 {

	public static void main(String[] args) {
		
		Logger LOGGER = LoggerFactory.getLogger(JourneyToFaanGApplication1.class);
		
		
		ConfigurableApplicationContext ApplicationContext = 
				SpringApplication.run(JourneyToFaanGApplication1.class, args);
		
		
		PersonDAO persondao = ApplicationContext.getBean(PersonDAO.class);
		LOGGER.info("{}",persondao);
		JDBCConnection jdbcConnection = ApplicationContext.getBean(JDBCConnection.class);
		LOGGER.info("{}",jdbcConnection);
				
		PersonDAO persondao1 = ApplicationContext.getBean(PersonDAO.class);
		LOGGER.info("{}",persondao1);
		JDBCConnection jdbcConnection1 = ApplicationContext.getBean(JDBCConnection.class);
		LOGGER.info("{}",jdbcConnection1);
	
		
		// Here the hash code is same for the PersonDAO and JDBC connection  
//		Scope.PersonDAO@6eb17ec8
//		: Scope.JDBCConnection@6a094db2
//		        : Scope.PersonDAO@6eb17ec8
//		       : Scope.JDBCConnection@6a094db2
		
		
	}

}
