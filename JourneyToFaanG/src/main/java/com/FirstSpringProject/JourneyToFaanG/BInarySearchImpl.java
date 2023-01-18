package com.FirstSpringProject.JourneyToFaanG;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BInarySearchImpl {
	
	@Autowired
//	@Qualifier("quick")
	private SortAlgorithm quickSort;
	
	
//	public BInarySearchImpl(SortAlgorithm quickSort) {
//		super();
//		this.sortAlgorithm = quickSort;
//	}



	



	public int binarySearch(int[] numbers , int numbersToSearch) {
		
		
		int[] sort = quickSort.Sort(numbers);
		
		System.out.println(quickSort);
		return 3 ;
	}

	
	// Sort the array 
	// Search the array 
	// return position
	
}
