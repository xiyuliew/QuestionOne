import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Scanner;

class QuestionOne {
	private static int rowsCount = 0;
	private static int columnsCount = 0;
	public static void main(String args[]){

		Scanner userInputOption =  new Scanner(System.in);
		System.out.println("Choose Option 1 or 2");
		if(userInputOption.nextInt() == 1) {
			SampleQuestions();
		}else if(userInputOption.nextInt() == 2) {
			List<String[]> rows = new ArrayList<String[]>();
			Scanner userInputRow = new Scanner(System.in);
			System.out.println("Enter total number of rows :");
			rowsCount = userInputRow.nextInt();
			
			Scanner userInputColumn = new Scanner(System.in);
			System.out.println("Enter total number of columns :");
			columnsCount = userInputColumn.nextInt();
			
			for(int i=0; i<rowsCount;i++) {
				String columns[] = new String[columnsCount];
				for(int j=0;j<columnsCount;j++) {
					Scanner element = new Scanner(System.in);
					System.out.println("Enter element of row " + (i+1) + " column " + (j+1) + " :");
					columns[j] = element.nextLine();
				}
				rows.add(columns);
			}
			System.out.println("Return Array : " + Arrays.toString(maxColLengths(rows)));
			System.exit(0);
		}else {
			System.exit(0);
		}
		
	}
	
	private static int[] maxColLengths(List<String[]> rows){
		int rowLength = rows.size();
		int[] maxColLengths = new int[rowLength];
		for(int i=0; i<rowLength;i++) {
			List <String> strings = Arrays.asList(rows.get(i));
			int max = strings.stream().map(String::length).max(Integer::compareTo).get();
			maxColLengths[i] = max;
		}
		return maxColLengths;
	}
	
	private static void SampleQuestions() {
		List<String[]> rows = new ArrayList<String[]>();
		String columns[] = new String[3];
		columns[0] = "abcdqw";
		columns[1] = "ab";
		columns[2] = "fdswddddd";
		rows.add(columns);
		String columns2[] = new String[3];
		columns2[0] = "aafdcw4ffs";
		columns2[1] = "acbdw";
		columns2[2] = "ab";
		rows.add(columns2);
		String columns3[] = new String[3];
		columns3[0] = "ddheehed";
		columns3[1] = "dddddddddd";
		columns3[2] = "dddd";
		rows.add(columns3);
		String columns4[] = new String[3];
		columns4[0] = "ddwq43334";
		columns4[1] = "fdfdfdfdffe333d";
		columns4[2] = "ddd3dffff3";
		rows.add(columns4);
		System.out.println("Return Array : " + Arrays.toString(maxColLengths(rows)));
		System.exit(0);
	}
	

	public int getRowsCount() {
		return rowsCount;
	}

	public void setRowsCount(int rowsCount) {
		QuestionOne.rowsCount = rowsCount;
	}

	public int getColumnsCount() {
		return columnsCount;
	}

	public void setColumnsCount(int columnsCount) {
		QuestionOne.columnsCount = columnsCount;
	}

}
