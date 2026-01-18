package arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

//elements which are greater than all the elements on its right side
public class LeaderInAnArray {
	public static void main(String[] args) {
		int a[]= {2,7,6,1,4,3};
		int n=a.length;

		//brute force
		Set<Integer> s=new HashSet<Integer>();
		for(int i=0;i<n;i++) {
			boolean isLeader=true;
			int curr=a[i];
			for(int j=i+1;j<n;j++) {
				if(a[j]>curr) {
					isLeader=false;
				}
			}
			if(isLeader) {
				s.add(curr);
			}
		}
		//System.out.println(s);
		
		//optimise
		int largest=Integer.MIN_VALUE;
		ArrayList<Integer> ans=new ArrayList<>();
		for(int i=a.length-1;i>=0;i--) {
			if(a[i]>largest) {
				ans.add(a[i]);
				largest=a[i];
			}
		}
		for(Integer x:ans) {
			System.out.print(x+" ");
		}
	
	}

}
