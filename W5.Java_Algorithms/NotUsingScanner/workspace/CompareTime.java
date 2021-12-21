public class CompareTime {
    public static void main(String[] args) {
	int[] Hour={18, 18};
	int[] Minute={27, 27};
	int[] Second={11, 12};
	int[] Time=new int[2]; 
	int i=0;
	
	System.out.println("비교할 시간: ");
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
