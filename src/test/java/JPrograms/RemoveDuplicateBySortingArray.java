package JPrograms;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RemoveDuplicateBySortingArray {
	
	
	public static int removeduplicates(int[] a) {
		
		int j = 0;
		
		for (int i = 1; i < a.length; i++) {
			
			if(a[i]!=a[j]) {
				
				j++;
				a[j]=a[i];
				
			}
		}
		return j+1;
		
	}

	
	public static void main(String[] args) {
	
		int[]  a = {1,1,8,3,3,5,6,6,7,7,9} ;
		
		int unique = removeduplicates(a);
		System.out.println(unique);
		for (int i = 0; i <unique; i++) {
			System.out.print(a[i]+" ");
		}
		
	}
	}


