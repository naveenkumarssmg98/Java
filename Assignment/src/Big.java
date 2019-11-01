import java.util.Scanner;
class Big {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size");
		int size=sc.nextInt();
		int[] a=new int[size];
	
		for(int i=0;i<a.length;i++) {
			System.out.println("Enter the values of array "+ i);
		a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
		int b[]=new int[size];
		for(int i=a.length-1 ,j=0;i>=0;i--,j++)
		{
			b[j]=a[i];
		}
		System.out.println("b[i] values in reverse");
		for(int j=0;j<b.length;j++)
		{
			
		System.out.println(b[j]);	
		}
	}

}
