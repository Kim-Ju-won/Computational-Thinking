import java.util.*;//Scanner을 쓰기위해 라이브러리를 열어둠

public class MinusTime_Scanner {
    public static void main(String[] args) {
	int[] Hour=new int[2];
	int[] Minute=new int[2];
	int[] Second=new int[2];
	int[] Time=new int[2]; 
	int i=0;
	int ResultTime,ResultHour,ResultMinute, ResultSecond;
	
	Scanner input=new Scanner(System.in);
	System.out.println("시간을 입력하시우(시,분,초 순): ");
	for(i=0;i<Time.length;i++){
		Hour[i]=input.nextInt();
		Minute[i]=input.nextInt();
		Second[i]=input.nextInt();
	}
	
	System.out.println("비교할 시간: ");
	for(i=0;i<Time.length;i++){
		System.out.println(Hour[i]+"시 "+Minute[i]+"분 "+Second[i]+"초 ");
		Time[i]=Hour[i]*3600+Minute[i]*60+Second[i];
	}
	
	if(Time[0]<Time[1]){
		ResultTime=Time[1]-Time[0];
		ResultHour=ResultTime/3600;
		ResultTime=ResultTime%3600;
		ResultMinute=ResultTime/60;
		ResultSecond=ResultTime%60;
		System.out.println(Hour[0]+"시 "+Minute[0]+"분 "+Second[0]+"초와 "+Hour[1]+"시 "+Minute[1]+"분 "+Second[1]+"초의 차이값은 "+ResultHour+"시 "+ResultMinute+"분 "+ResultSecond+"초 ");
	}
	else{
		ResultTime=Time[0]-Time[1];
		ResultHour=ResultTime/3600;
		ResultTime=ResultTime%3600;
		ResultMinute=ResultTime/60;
		ResultSecond=ResultTime%60;
		System.out.println(Hour[0]+"시 "+Minute[0]+"분 "+Second[0]+"초와 "+Hour[1]+"시 "+Minute[1]+"분 "+Second[1]+"초의 차이값은 "+ResultHour+"시"+ResultMinute+"분"+ResultSecond+"초 ");
	}
    }
}
