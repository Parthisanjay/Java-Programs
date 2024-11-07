package programming;

public class BinarySearch {
	public static void main(String[] args) {
		int a[]= {1, 2, 3, 5, 7, 8};
//		Arrays.sort(a);
//		System.out.println(Arrays.toString(a));
		int first=0,last=a.length-1;
		int key=6;
		while(first<=last) {
			int mid=(first+last)/2;
			if(a[mid]==key) {
				System.out.println("Key is present");
				break;
			}
			else if(a[mid]>key) {
				last=mid-1;
			}
			else {
				first=mid+1;
			}
		}
		if(first>=last) {
			System.out.println("Key is not found");
		}
	}
}
