package com.FirstSpringProject.JourneyToFaanG;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


@Component
//@Qualifier("quick")
public class QuickSort implements SortAlgorithm {
	public int[] Sort(int[] numbers) {
		//quick sort 
		return numbers;
		
	}

}
