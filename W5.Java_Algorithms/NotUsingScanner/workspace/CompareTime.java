public class CompareTime {
    public static void main(String[] args) {
	int[] Hour={18, 18};
	int[] Minute={27, 27};
	int[] Second={11, 12};
	int[] Time=new int[2]; 
	int i=0;
	
	System.out.println("���� �ð�: ");
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
