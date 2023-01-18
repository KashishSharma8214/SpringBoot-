package com.FirstSpringProject.JourneyToFaanG;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class JourneyToFaanGApplication {

	
	
	public static void main(String[] args) {
		
		
		//Lossly coupling by using interface and used that method in both the classes 
//		BInarySearchImpl search= new BInarySearchImpl(new QuickSort());
		
		ConfigurableApplicationContext ApplicationContext = 
				SpringApplication.run(JourneyToFaanGApplication.class, args);
		
		
		BInarySearchImpl binarysearch = ApplicationContext.getBean(BInarySearchImpl.class);
		BInarySearchImpl binarysearch1 = ApplicationContext.getBean(BInarySearchImpl.class);
		
//		com.FirstSpringProject.JourneyToFaanG.BInarySearchImpl@730f9695
//		com.FirstSpringProject.JourneyToFaanG.BInarySearchImpl@277bf091
//		System.out.println(binarysearch);
//		System.out.println(binarysearch1);
		
		
		
		int result = binarysearch.binarySearch(new int[] {1,32,445,21},5);
		System.out.println(result);
		
		
		
		
	}

}
