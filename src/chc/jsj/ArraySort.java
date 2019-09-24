package chc.jsj;
/**
 * Sort the given array
 * @author 123
 * @param input an simple array
 * @return the increasing array 
 *
 */

public class ArraySort {
	static int a0[] = {2,6,9,8,7,4,5,6,3,2,6,5};
	
	static int[] SortA(int[] a) {
		int[] a1 = new int[a.length];
		int mid = 0;
		for(int i = a.length-1;i>=0;i--)
		{
			a1[i] = a[i];
		}
		
		for(int j = a.length-1;j>=0;j--)
		{
			for(int k = j;k>=0;k--)
			{
				if(a1[j] < a1[k])
				{
					mid = a1[j];
					a1[j] = a1[k];
					a1[k] = mid;
				}
			}
		}
		
		return a1;
	}
	
	public static void main(String[] args) {
		for(int a:a0)
			System.out.print(a+"\t");
		System.out.println();
		for(int b:SortA(a0))
			System.out.print(b+"\t");
	}
}
