import java.util.*;//Scanner�� �������� ���̺귯���� �����

public class MinusTime_Scanner {
    public static void main(String[] args) {
	int[] Hour=new int[2];
	int[] Minute=new int[2];
	int[] Second=new int[2];
	int[] Time=new int[2]; 
	int i=0;
	int ResultTime,ResultHour,ResultMinute, ResultSecond;
	
	Scanner input=new Scanner(System.in);
	System.out.println("�ð��� �Է��Ͻÿ�(��,��,�� ��): ");
	for(i=0;i<Time.length;i++){
		Hour[i]=input.nextInt();
		Minute[i]=input.nextInt();
		Second[i]=input.nextInt();
	}
	
	System.out.println("���� �ð�: ");
	for(i=0;i<Time.length;i++){
		System.out.println(Hour[i]+"�� "+Minute[i]+"�� "+Second[i]+"�� ");
		Time[i]=Hour[i]*3600+Minute[i]*60+Second[i];
	}
	
	if(Time[0]<Time[1]){
		ResultTime=Time[1]-Time[0];
		ResultHour=ResultTime/3600;
		ResultTime=ResultTime%3600;
		ResultMinute=ResultTime/60;
		ResultSecond=ResultTime%60;
		System.out.println(Hour[0]+"�� "+Minute[0]+"�� "+Second[0]+"�ʿ� "+Hour[1]+"�� "+Minute[1]+"�� "+Second[1]+"���� ���̰��� "+ResultHour+"�� "+ResultMinute+"�� "+ResultSecond+"�� ");
	}
	else{
		ResultTime=Time[0]-Time[1];
		ResultHour=ResultTime/3600;
		ResultTime=ResultTime%3600;
		ResultMinute=ResultTime/60;
		ResultSecond=ResultTime%60;
		System.out.println(Hour[0]+"�� "+Minute[0]+"�� "+Second[0]+"�ʿ� "+Hour[1]+"�� "+Minute[1]+"�� "+Second[1]+"���� ���̰��� "+ResultHour+"��"+ResultMinute+"��"+ResultSecond+"�� ");
	}
    }
}
