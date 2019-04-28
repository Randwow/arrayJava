package arrayExample;
public class array {
	public static void main(String[] args) {
//		int [] array = {1, 2, 5, 4, 5};
//			for (int i = 0; i < array.length; i++ ) {
//				System.out.println(array[i]); 
//		}
		int i = 10;
		int j = 10;
		int[][] array = new int[i][j];
		for (i = 0; i < array.length; i++) {
			for (j = 0; j < array.length; j++) {
				array[i][j] = ( i > j ) ? i : j;
				System.out.print( " " + array[i][j]);
			} 
			System.out.print("\n");
		}
	}
}
