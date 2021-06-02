import java.util.Scanner;

class Bubblesort{
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("enter size");
		int size =scr.nextInt();
		int a[]= new int[size];
		System.out.println(a.length);
		int temp;
		for(int i=0;i<a.length;i++) {
		System.out.println("enter values");
		a[i]=scr.nextInt();
		}
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" , ");
		}
		System.out.println();
		for(int i=0;i<a.length-1;i++) {
			for(int j=i+1;j<a.length;j++) {
				if (a[i]>a[j]) {
					 temp =a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
			}
		}
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" , ");
		}
	}
	
	
	
}
