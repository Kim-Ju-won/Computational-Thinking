import java.util.*;//Scanner을 쓰기위해 라이브러리를 열어둠

public class GCD_Scanner {
    public static void main(String[] args) {
	int R=0;
	int X, Y;
	int print_X=0;
	int print_Y=0;

	Scanner input = new Scanner(System.in);
	X=input.nextInt();
	Y=input.nextInt();
	print_X=X;
	print_Y=Y;

	while(true){
		R=X%Y;
		if(R==0){break;}
		X=Y;
		Y=R;
	}
	
	System.out.println(print_X+"과 "+print_Y+"의 최대 공약수는 "+Y);
    }
}
