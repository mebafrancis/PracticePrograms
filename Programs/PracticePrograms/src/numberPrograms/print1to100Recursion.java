package numberPrograms;

import java.util.stream.IntStream;

public class print1to100Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1.using streams
		//IntStream.range(1, 101).forEach(e->System.out.println(e));
		//printNum(1);
		printNumber(1,100);
	}
		//2.recursion
		
		public static void printNum(int num) {
			if(num<=100) {
				System.out.println(num);
				num++;
				printNum(num);
			}
	     }
		
		public static void printNumber(int stNum, int endNum) {
			if(stNum<=endNum) {
				System.out.println(stNum);
				stNum++;
				printNumber(stNum,endNum);
			}
		}

}
