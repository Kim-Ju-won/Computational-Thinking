public class MaxMinArray {
    public static void main(String[] args) {
	int Max=-999;
	int Min=999;
	int i=0;
	int[] NumberArray={40, 13, 89, 52, 7};
	
	System.out.print("�迭 ������ ��: ");
	
	for(i=0;i<NumberArray.length;i++){
		System.out.print(NumberArray[i]+" ");
		if(Max<NumberArray[i]){
			Max=NumberArray[i];
		}
		if(Min>NumberArray[i]){
			Min=NumberArray[i];
		}
	}

	System.out.println();
	System.out.println("�迭�� �ִ�: "+Max);
	System.out.println("�迭�� �ּڰ�: "+Min);

    }
}
