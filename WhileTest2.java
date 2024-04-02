package charpter5;
/*
 * 1*(1~9) 逐数递增
 */
import java.util.Scanner;

/*
 * 202195057 손패택
 */
public class WhileTest2 {
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
	Scanner stdIn = new Scanner(System.in);
	System.out.println("입력");
	int dan = stdIn.nextInt();
	int su = 1;
	while(su<=9){
	System.out.println(dan +"x"+su+"="+dan*su);
	su++; //2) 将乘数增加 1
	}
	}
}


