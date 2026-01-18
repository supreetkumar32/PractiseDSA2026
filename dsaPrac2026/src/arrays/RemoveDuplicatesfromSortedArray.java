package arrays;

import java.util.HashSet;

public class RemoveDuplicatesfromSortedArray {

	public static void main(String[] args) {
		int a[]= {2,2,2,3,4,4,7,7,7,8,8,8};
		int n=a.length;
		
		//using  another array
//		int ans[]=new int[n];
//		ans[0]=a[0];
//		int i=1,j=0;
//		for( i=1;i<n;i++) {
//			if(a[i]!=ans[j]) {
//				j++;
//				ans[j]=a[i];
//
//			}
//		}
//		for(int x:ans) {
//			System.out.print(x+" ");
//		}
		
		//using hashset
//		HashSet<Integer> hs=new HashSet<Integer>();
//		for(int x:a) {
//			hs.add(x);
//		}
//		for(Integer z:hs) {
//			System.out.println(z);
//		}
		
		
		//optimal solution
		for(int i=1,j=0;i<a.length;i++) {
			if(a[i]!=a[j]) {
				a[j+1]=a[i];
				j++;
			}
		}
		for(int x:a) {
			System.out.print(x+" ");
		}

	}

}
