import java.util.*;//��ĳ�� Ȱ���� ���� �����

public class CompareTime_Scanner {
    public static void main(String[] args) {
	int[] Hour=new int[2];
	int[] Minute=new int[2]; 
	int[] Second=new int[2]; 
	int[] Time=new int[2]; 
	int i=0;

	Scanner input=new Scanner(System.in);
	System.out.println("�ð��� �Է��Ͻÿ�(��,��,�� ��): ");
	for(i=0;i<Time.length;i++){
		Hour[i]=input.nextInt();
		Minute[i]=input.nextInt();
		Second[i]=input.nextInt();
	}
	
	System.out.println("���� �ð�(�Է¹��� �ð�): ");
	for(i=0;i<Time.length;i++){
		System.out.println(Hour[i]+"��"+Minute[i]+"��"+Second[i]+"��");
		Time[i]=Hour[i]*3600+Minute[i]*60+Second[i];
	}
	
	if(Time[0]<Time[1]){
		System.out.println("'"+Hour[1]+"��"+Minute[1]+"��"+Second[1]+"��'�� �� ũ�� ");
	}
	else if(Time[0]>Time[1]){
		System.out.println("'"+Hour[1]+"��"+Minute[1]+"��"+Second[1]+"��'�� �� ũ�� ");
	}
	else{
		System.out.println("2���� �ð��� ����");
	}

    }
}
