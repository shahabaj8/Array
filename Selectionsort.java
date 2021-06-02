import java.util.Scanner;
class Selectionsort{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter size");
		int size =s.nextInt();
		int a[]= new int[size];
		System.out.println(a.length);
	
		for(int i=0;i<a.length;i++) {
		System.out.println("enter values");
		a[i]=s.nextInt();
		}
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" , ");
		}
		System.out.println();
		for(int i=0;i<a.length-1;i++) {
			int min=a[i];
			int min_ind=i;
	
		for( int j = i+1;j<a.length;j++) {
			if ( min>a[j]) {
				min=a[j];
				min_ind=j;
			}	
			}
	
		if(i!=min_ind) {
		int temp = a[i];
			a[i] = a[min_ind];
			a[min_ind] = temp;
		
		}
		}
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" , ");
		}
	}
	
	}
		
	

