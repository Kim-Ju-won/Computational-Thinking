import java.util.*;//Scanner활용을 위해 import시켜줌

public class MaxMinArray_Scanner {
    public static void main(String[] args) {
	int Max=-999;
	int Min=999;
	int i=0;
	int[] NumberArray=new int[5];

	Scanner input= new Scanner(System.in);
	
	System.out.print("배열 원소의 값: ");
	
	for(i=0;i<NumberArray.length;i++){
		NumberArray[i]=input.nextInt();
	}


	for(i=0;i<NumberArray.length;i++){
		if(Max<NumberArray[i]){
			Max=NumberArray[i];
		}
		if(Min>NumberArray[i]){
			Min=NumberArray[i];
		}
	}
	System.out.println("배열의 최댓값: "+Max);
	System.out.println("배열의 최솟값: "+Min);
    }
}
