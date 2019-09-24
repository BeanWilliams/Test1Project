package chc.jsj;

/**
 * Find a given value in a given array
 * For example:
 * a[] = {1,5,3,6,7,8,9,4}
 * findA(a,5)
 * returns 1
 * With val is the first element of the array
 * findA(a,1)
 * With val is the last element of the array
 * findA(a,4)
 * With val is in the middle of the array 
 * findA(a,7)
 * 
 * 
 * @author 123
 * @param a array to search; requires that val occurs exactly once in a.
 * @param val value to search for
 * @return index i such that a[i] = val
 */

public class FindGivenValue {
	
	static int a[] = {1,2,5,3,6,4,7,8,6};
	static int findA(int[] a,int val) {
		for(int i = a.length - 1;i>=0;--i) {
			if(a[i] == val) {
				return i;
			}
		}
		return -1;
	}
	static int testFindA(int[] a,int val)
	{
		int i = 0;
		if(0 == findA(a,a[0]))
		{i++;}
		if((a.length - 1) == findA(a,a[(a.length - 1)]))
		{i++;}
		if(2 == i)
		{
		return 1;
		}
		else 
			return 0;
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("Output number is:"+ testFindA(a,10));
	}

}
