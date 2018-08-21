import java.util.*;
public class wifi{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int arr[]=new int[10];
		for(int i=0;i<10;i++){
			arr[i]=in.nextInt();
		}
		Arrays.sort(arr);
		System.out.println(arr[arr.length-1]);
}}
