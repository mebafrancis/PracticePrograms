package arrayPrograms;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {9,2,6,4,1,3};
		int temp=0;
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j]= temp;					
				}
			}
		}
		
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
		System.out.println("\n");
		//Melba code
		
		int a1[]= {5,1,9,2,3,7,4};
		int temp1;
		for(int k=0;k<a1.length;k++)
		{
			for(int l=k+1;l<a1.length;l++)
			{
				if(a1[k]>a1[l])
				{
					temp1=a1[k];
					a1[k]=a1[l];
					a1[l]=temp1;
				}
			}
		}
		
		for(int i=0;i<a1.length;i++) {
			System.out.println(a1[i]);
		}
		
	}

}
