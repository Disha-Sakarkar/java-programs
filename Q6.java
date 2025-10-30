package loophomework;

//write a program to print square of a number divisible by 4 and 7 from 555 to 999

public class Q6 {
	public static void main(String[] args) {
	 for (int i = 555; i <= 999; i++) {
         if (i % 4 == 0 && i % 7 == 0) {
             System.out.println(i*i );
         }
	 }
}
}
