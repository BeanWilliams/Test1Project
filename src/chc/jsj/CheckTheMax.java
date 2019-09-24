package chc.jsj;
import java.util.Scanner;
/**
  *  Ѱ��H(a)���������е����ֵ
 * @author 123
 *
 */

public class CheckTheMax {
	/**
	 * Determine if the function is a power of 2
	 * @param a
	 * @return
	 */
	public static int Judge(int a) {
		if((a&(a-1)) == 0)
		{
			return 0;
		}
		return 1;
	}
	/**
	 * Query for maximum number
	 * @param b
	 * @return
	 */
	public static int Produce(int b)
	{
		int max = b;
		int q1 = 0;
		q1 = max;
		while(true)
		{
			if(max == 1)
			{break;}
		
			else
			{
				
				if(q1%2 == 0)
				{
					q1 = q1/2;
					//System.out.println("q1�ܱ�2������" +q1);
				}
				else
				{
					q1 = 3*q1 + 1;
				}
				if(q1 > max)
				{
					max = q1;
				}
				
				if(Judge(q1) == 0)
				{break;}
				//System.out.println("q1����ֵΪ��" +Judge(q1));
			}
			
		}
		return max;
	}
	/**
	 * precondition:Input a positive integer
	 * Postcondition:Return a max number of the H(a)
	 * @param args
	 */
	
	public static void main(String[ ] args)
	{
		Scanner input=new Scanner(System.in);
		while(true) {
			
		System.out.println("������һ��������");
		int length=input.nextInt();//����һ������
		if(length <=0 )
		{
			System.out.println("�������");
		}
		else 
			{System.out.println("���������ǣ�"+Produce(length));}
		if(length == 3)
		{break;}
		}
		
	}
}

