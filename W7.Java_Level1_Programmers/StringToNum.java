public class StrToInt{
    public int getStrToint(String str){
        int answer = Integer.parseInt(str);//string int형으로 변환하는 method호출
        return answer;
    }
    public static void main(String args[]){
        StrToInt strToInt = new StrToInt();
        System.out.println(strToInt.getStrToint("-1234"));
    }
}