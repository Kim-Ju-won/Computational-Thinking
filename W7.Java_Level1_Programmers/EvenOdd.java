public class EvenOdd{
    public String evenOdd(int num){
        String result = "";
        if(num%2==0){result+="Even";}
        else{result+="Odd";}
        return result;
    }

    public static main(String[] args){
        String str= "1 2 3 4";
        EvenOdd evenOrOdd = new EvenOdd();
        System.out.println("결과: "+evenOrOdd.evenOdd(3));
        System.out.println("결과: "+evenOrOdd.evenOdd(2));
    }
}