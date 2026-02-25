package JavaPrograms;

public class MaxAndMinNumberArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  int[] Num ={10,23,56,100,10,-3};
	      
	      int max=Num[0];
	      int min=Num[0];
	      
	      for(int i =1; i <Num.length ;i++){
	          if(Num[i]>max)
	          {
	              max=Num[i];
	              
	          }
	          if(Num[i]<min){
	              min=Num[i];
	            
	          }
	      }
	      System.out.println("Maximum Number is :"+ max);
	      System.out.println("Minimum Number is :"+ min);
	      
		

	
	}
}
