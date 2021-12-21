import java.util.*;//스캐너 활용을 위해 열어둠

public class CompareTime_Scanner {
    public static void main(String[] args) {
	int[] Hour=new int[2];
	int[] Minute=new int[2]; 
	int[] Second=new int[2]; 
	int[] Time=new int[2]; 
	int i=0;

	Scanner input=new Scanner(System.in);
	System.out.println("시간을 입력하시우(시,분,초 순): ");
	for(i=0;i<Time.length;i++){
		Hour[i]=input.nextInt();
		Minute[i]=input.nextInt();
		Second[i]=input.nextInt();
	}
	
	System.out.println("비교할 시간(입력받은 시간): ");
	for(i=0;i<Time.length;i++){
		System.out.println(Hour[i]+"시"+Minute[i]+"분"+Second[i]+"초");
		Time[i]=Hour[i]*3600+Minute[i]*60+Second[i];
	}
	
	if(Time[0]<Time[1]){
		System.out.println("'"+Hour[1]+"시"+Minute[1]+"분"+Second[1]+"초'가 더 크다 ");
	}
	else if(Time[0]>Time[1]){
		System.out.println("'"+Hour[1]+"시"+Minute[1]+"분"+Second[1]+"초'가 더 크다 ");
	}
	else{
		System.out.println("2개의 시간은 같다");
	}

    }
}
