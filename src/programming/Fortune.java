package programming;

public class Fortune {
	public static void main(String[] args) {
		int sum=0;
		int totalsum=0;
//		1st method
		for(int i=1;i<=10;i++) {
			if(i%2==0) {
			sum=5+sum;
			}
			else {
				sum=5+i;
			}
			totalsum=totalsum+sum;	
		}
		System.out.println("Totalsum is "+totalsum);
		
//		2nd method
		for(int i=1;i<=10;i++) {
			if(sum==0) {
				sum=5+i;
			}
			else if(sum%2==0) {
				sum=5+sum;
			}
			else {
				sum=5+i;
			}
			totalsum=totalsum+sum;
		}
		System.out.println("Totalsum is "+totalsum);
	}
}