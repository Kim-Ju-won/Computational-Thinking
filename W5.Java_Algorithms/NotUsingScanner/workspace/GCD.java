public class GCD {
    public static void main(String[] args) {
	int R=0;
	int X=126;
	int Y=90;
	int print_X=X;
	int print_Y=Y;

	while(true){
		R=X%Y;
		if(R==0){break;}
		X=Y;
		Y=R;
	}
	
	System.out.println(print_X+"�� "+print_Y+"�� �ִ� ������� "+Y);

    }
}
