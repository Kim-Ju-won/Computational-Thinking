import java.util.Arrays;

public class GetMinMaxString{
    public String getMinMaxString(String str){
        String answer = new String("");//정답을 반환할 string 객체
        String[] toGetMaxMin = str.split(" ");//공백 기준으로 분할
        int Max = -99999;//최댓값을 저장할 변수
        int Min = 9999;//최솟값을 저장할 변수 

        int[] numberArray = new int[toGetMaxMin.length];//대소관계 비교를 위한 배열
        for(int i =0; i<toGetMaxMin.length;i++){
            numberArray[i] = Integer.parseInt(toGetMaxMin[i]);//int형으로 변환하여 값 저장
        }
        for(int i =0; i<numberArray.length;i++){//최댓값 최솟값을 구하는 for문
            if( Max <numberArray[i]){
                Max=numberArray[i];
            }
            if( Min > numberArray[i]){
                Max=numberArray[i];
            }
        }
        answer = Integer.toString(Min)+" "+Integer.toString(Max);
    }

    public static void main(String[] args){
        String str = "1 2 3 4";
        GetMinMaxString minMax = new GetMinMaxString();
        System.out.println("최대값과 최소값은?" + minMax.getMinMaxString(str));
    }
}