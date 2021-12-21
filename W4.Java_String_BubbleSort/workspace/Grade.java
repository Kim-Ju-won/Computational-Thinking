import java.io.*;
import java.util.*;

public class Grade {
    public static void main(String[] args) throws IOException {
        int i=0, j=0, n=0, temp=0, rank=1;
        String [] Name = new String [10];
        int[] Kor = new int [10];
        int[] Eng = new int [10];
        int[] Math= new int [10];
        int[] Tot = new int [10];
        int[] Avg = new int [10];
	int[] Rank= new int [10];
	int[] Compare= new int[10];

        Scanner scanner = new Scanner(new File("grade.csv"));

        while (scanner.hasNextLine()) {
            String csvString = scanner.nextLine();
            if(csvString.length() == 0) {
                continue;
            }
            String [] csvdata = csvString.split(",");

            Name[n] = csvdata[0];
            Kor[n] = Integer.parseInt(csvdata[1]);
            Eng[n] = Integer.parseInt(csvdata[2]);
            Math[n] = Integer.parseInt(csvdata[3]);
            Tot[n] = Kor[n]+Eng[n]+Math[n];
	    Compare[n]=Tot[n];
            Avg[n] = Tot[n]/3;
            n++;
        }

	for (i = 0; i < n; i++) {
		 for (j = 0; j < n-1-i; j++) {
		  if(Compare[j] > Compare[j+1]){
		 	temp=Compare[j];
			Compare[j]=Compare[j+1];
			Compare[j+1]=temp;
		  }
  		 }
		 for (j = 0; j < n; j++) {
		  if(Compare[n-1-i] == Tot[j]){
			if(Rank[j]!=0){
			 Rank[j]=Rank[j];
			}
 			else{
		 	 Rank[j]=rank;
			}
		  }
  		 }
		rank++;
		  
	}

        System.out.println("성  명, 국어, 영어, 수학, 총합, 평균, 석차");
        for (i=0;i<n;i++) {
             System.out.printf("%4s  %4d  %4d  %4d  %4d  %4d  %4d\n", Name[i],Kor[i],Eng[i],Math[i],Tot[i],Avg[i],Rank[i]);
        }
    }
}
