package StarPattern;

public class program4 {

	public static void main(String[] args) {
		
		//    *
		//   **
		//  ***
		// ****
		//*****
		int space1 = 4;
		int star1 = 1;
		for (int i = 1; i <= 5; i++)
		{
			for (int j = 1; j <= space1; j++) {
				System.out.print(" ");
			}

			for (int k = 1; k <= star1; k++) {
				System.out.print("*");
			}
			System.out.println();
			space1--;
			star1++;

		}

	}

}
