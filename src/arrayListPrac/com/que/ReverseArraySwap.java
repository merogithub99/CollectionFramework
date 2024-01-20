package arrayListPrac.com.que;

public class ReverseArraySwap {
public static void main(String[] args) {
	int arr[]= {1,2,3,4,5,6};
	
	for(int i=0;i<arr.length/2;i++) {
		int temp=arr[i];               //1 in temp
		arr[i]=arr[arr.length-1-i];    //arr[first pos]     =6
		arr[arr.length-1-i]=temp;      //arr[last position] =1
		
	}
	System.out.println("After swapping");
	for(int array:arr) {
		System.out.println(array);
	}
	
}
}
