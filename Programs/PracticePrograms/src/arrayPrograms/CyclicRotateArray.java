package arrayPrograms;

public class CyclicRotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {1,2,3,4,5};
		//expected output: 5,1,2,3,4
		int len = a.length;
		int last = a[len-1], i = len-1;
		
		while(i>0) {
			a[i]=a[i-1];
			i--;
		}
		
		a[0]=last;
		
		for(int x:a) {
			System.out.print(x);
		}

	}

}
