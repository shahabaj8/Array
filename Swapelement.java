class Swapelement{
	public static void main(String[] args) {
		int a []= {2,3,5,7,9};
		int first=1;
		int last=3;
		int temp=a[first];
		a[first]=a[last];
		a[last]=  temp;
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		
		}
		
	}		
}