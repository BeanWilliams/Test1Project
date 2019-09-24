package chc.jsj;
import java.util.Scanner;
/**
  *  寻找H(a)函数序列中的最大值
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
					//System.out.println("q1能被2整除：" +q1);
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
				//System.out.println("q1的数值为：" +Judge(q1));
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
			
		System.out.println("请输入一个整数：");
		int length=input.nextInt();//输入一个整数
		if(length <=0 )
		{
			System.out.println("输入错误！");
		}
		else 
			{System.out.println("最大的整数是："+Produce(length));}
		if(length == 3)
		{break;}
		}
		
	}
}

