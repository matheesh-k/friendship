import java.util.HashSet;
import java.util.Scanner;


public class codeketa {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("enter the length");
		int mathi=in.nextInt();
		System.out.println("enter the array elements");
		int arr[]=new int[mathi];
		for(int i=0;i<mathi;i++){
			arr[i]=in.nextInt();
			
		}
for(int j=0;j<mathi;j++){
	for(int k=j+1;k<mathi;k++){
		if(arr[j]==arr[k]){
			arr[j]=0;
			arr[k]=0;
			break;
		}
		else{
			continue;
		}
	}
		}
int ja=0;
for(int d=0;d<mathi;d++){
	ja+=arr[d];
	
}
System.out.println(ja);

	}
}
