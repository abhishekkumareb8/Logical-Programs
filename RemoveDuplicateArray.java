package Logical;
//Remove the duplicate from the array if the element is sorted
public class RemoveDuplicateArray {

	public static void main(String[] args) {
		int arr[] = { 1, 1, 2, 3, 4, 4, 7};
		int arr1[] = new int[arr.length];
		int j=0;
		//if the element is sorted
		for (int i = 0; i < arr.length - 1; i++) {
				if(arr[i]!=arr[i+1]) {
					arr1[j++]=arr[i];
				}
		}
		// to get the last element
		arr1[j++]=arr[(arr.length-1)];
		
		
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
	}

}
