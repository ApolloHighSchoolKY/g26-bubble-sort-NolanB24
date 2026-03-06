import java.util.Arrays;
public class BubbleSort
{

	public static void main(String[] args)
  	{
		int[] sorted = {67,23,3,15,23,18,16};

		System.out.println(Arrays.toString(sorted));
		sorted = bubbleSort(sorted);
		System.out.println(Arrays.toString(sorted));
		
	}
		//Loop once for each pass, where passes is one less than the number of items.
		public static int[] bubbleSort (int[] unsorted)
		{
			int[] sorted = unsorted;
			int passes;
			int comparisons;
			//Holds the second number when you are value swapping
			int tempNum;
			for(passes = 1; passes < sorted.length; passes++)
			{	
				//Loop once for each comparison, where comparisons are one less than the number of unsorted.
				for(comparisons = 0; comparisons < sorted.length - passes; comparisons++)
				{	
					if(sorted[comparisons] >= sorted[comparisons + 1])
					{
						tempNum = sorted[comparisons + 1];
						sorted[comparisons + 1] = sorted[comparisons];
						sorted[comparisons] = tempNum;
					}
				}
				System.out.println(Arrays.toString(sorted));
			}
			return sorted; 
		}
		
		
		

		//If they are out of order, swap the values
		//End Loop for comparisons
    
		//The next pass will use one less comparison
    
		//End Loop for passes



  	
}
