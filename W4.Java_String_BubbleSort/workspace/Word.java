import java.io.*;
import java.util.*;

public class Word {
	public static void main(String[] args) throws IOException {
		
		int n=0;
		int i=0;
                
		
		Scanner scanner = new Scanner(new File("word.csv"));

		while (scanner.hasNextLine()) {
			String csvString = scanner.nextLine();
			if (csvString.length() == 0)
			{
				continue;
			}
			String [] csvdata = csvString.split(",");
			
			for(i=0;i<6;i++){
				System.out.print(csvdata[i].toLowerCase()+"\t");
			}
			System.out.println();
			
		}
        }
}