public class MinusTime {
    public static void main(String[] args) {
	int[] Hour={7, 14};
	int[] Minute={10, 20};
	int[] Second={52, 50};
	int[] Time=new int[2]; 
	int i=0;
	int ResultTime,ResultHour,ResultMinute, ResultSecond;
	
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
