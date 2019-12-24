package SearchingAndSorting;

public class LinearSearch {

	public static int Lsearch(int arr[],int ele) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==ele) {
				return i;
			}
		}
		return -1;
	}
	public static int BinarySearch(int arr[],int ele) {
		int lo = 0;
		int high = arr.length;
		while(lo<high-1) {
			int mid = (lo+high)/2;
			if(arr[mid]==ele) {
				return mid;
			}
			if(ele>arr[mid]) {
				lo=mid;
			}
			if(ele<arr[mid]) {
				high = mid;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,3,5,7,20,25};
		int ele =25;
		System.out.println(BinarySearch(arr,ele));
	}

}
