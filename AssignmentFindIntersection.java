package Week1.Day2;

import java.util.Arrays;
import java.util.Iterator;

public class AssignmentFindIntersection {
	public static void main(String[] args) {
		int arr[]= {3,2,11,4,6,7};
		int ars[]= {1,2,8,4,9,7};
		Arrays.sort(arr);
		Arrays.sort(ars);
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<ars.length;j++)
			{
			if(arr[i]==ars[j])
			
			{
				System.out.println(arr[i]);
			}
		}
	}

}
}