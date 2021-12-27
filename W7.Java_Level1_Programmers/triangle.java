public class PrintTriangle{
    public String PrintTriangle(int num){
        String answer = "";
        for(int i=num-1;i>=0;i--){
            for(int j=i;j<=num;j++){
                answer+="*";
            }
            answer+="\n";
        }
        return answer;
    }

    public static void main(String[] args){
        PrintTriangle pt = new PrintTriangle();
        System.out.println(pt.PrintTriangle(3));
    }
}