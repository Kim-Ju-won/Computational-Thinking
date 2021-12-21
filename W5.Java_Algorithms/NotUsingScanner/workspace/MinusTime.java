public class MinusTime {
    public static void main(String[] args) {
	int[] Hour={7, 14};
	int[] Minute={10, 20};
	int[] Second={52, 50};
	int[] Time=new int[2]; 
	int i=0;
	int ResultTime,ResultHour,ResultMinute, ResultSecond;
	
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
