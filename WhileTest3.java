package charpter5;

import java.util.Scanner;

/*
 * 202195057 손패택
 *5! = 5 * 4 * 3 * 2 * 1 => 120 
 * 알고이즘(算法):1.
 */
public class WhileTest3 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner stdIn = new Scanner(System.in);
		System.out.println("입력");
		int num = stdIn.nextInt();
		int fac=1;
		while(num>=1) {
				while(num>=1) {
					fac = fac * num;
					num--;
			}
			System.out.println(num +"!="+fac);
		}
	}

}
