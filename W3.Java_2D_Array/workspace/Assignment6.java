public class Assignment6{
    public static void main(String args[]) {
        int i,j,n=0,sum=0;
		int [][] a = new int [5][5];
		for (i=0;i<5;i++){
			for (j=0;j<5;j++ )	{
				n=n+1;
				a[i][j]=n;
                          	System.out.printf("%5d",a[i][j]);
			}
			System.out.println();
		}

		i=0;
		j=0;

		for (i=2;i<5;i++){
			for (j=4-i;j<=i;j++){
					sum=sum+a[i][j];
			}
		}
        
		System.out.println("�� �հ��"+sum);
    }
}