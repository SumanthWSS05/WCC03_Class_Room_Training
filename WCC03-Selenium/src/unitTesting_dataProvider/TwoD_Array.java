package unitTesting_dataProvider;

public class TwoD_Array {

	public static void main(String[] args) {
		
		String[] arr1 = {"name","lastname","email","password","confirmPassword"};
		String[] arr2 = {"phone","designation","sal"};
		
		String[][] sarr = {arr1,arr2};
													//symmetric array
		String[][] drr = {							//jagged array
							{"sql","java","selenium"},
							{"api","restassured"},
							{"manualtesting"}
						};
		
		System.out.println(drr[0][2]);
	}
}
