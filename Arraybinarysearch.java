class Arraybinarysearch{
	public static void main(String[] args) {
		int a []= {10,25,35,40,50};
		int value =25;
		int L=0,R=a.length;
		while(L<=R) {
			int mid = (L+R/2);
			if (value==a[mid]) {
				System.out.println(mid);
				break;
				
			}
			else if (value<a[mid]) {
				R=mid-1;
				
			}
			else {
				L=mid+1;
			}
		}
		if(L>R) {
			System.out.println("value not present");
		}
		
	}
}