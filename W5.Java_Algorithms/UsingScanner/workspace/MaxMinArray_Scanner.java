import java.util.*;//ScannerȰ���� ���� import������

public class MaxMinArray_Scanner {
    public static void main(String[] args) {
	int Max=-999;
	int Min=999;
	int i=0;
	int[] NumberArray=new int[5];

	Scanner input= new Scanner(System.in);
	
	System.out.print("�迭 ������ ��: ");
	
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
	System.out.println("�迭�� �ִ�: "+Max);
	System.out.println("�迭�� �ּڰ�: "+Min);
    }
}
