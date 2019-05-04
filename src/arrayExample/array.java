package arrayExample;
public class array {
	public static void main(String[] args) {
//		int [] array = {1, 2, 5, 4, 5};
//			for (int i = 0; i < array.length; i++ ) {
//				System.out.println(array[i]); 
//		}
		int size = 10;
		int size1 = 10;
		int sum=0;
		int max = 0;
		int[][] array = new int[size][size1];
		for(int i = 0; i < array.length; i++) { // Заполнение массива
			for(int j = 0; j < array.length; j++ ) {
			array[i][j] = (int) Math.round(Math.random()*100); //Заполнение массива рандомными числами  
			}
		}
		int min = array[0][0];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
//				array[i][j] = ( i > j ) ? i : j;
				sum += array[i][j];
				System.out.print( "  " + array[i][j]);
				if(array[i][j] > max ) {
					max = array[i][j];		
				}
				if(array[i][j] < min) {
					min = array[i][j];
				}
			} 		
			System.out.print(" Сумма каждого ряда = " + sum +" ");
			System.out.print("\n");
		} 
		System.out.println("\n" + "    Общая сумма = " + sum);
		System.out.println("    Наибольшее число:= " + max);
		System.out.println("    Наименьшее число:= " + min);		
		System.out.println("     Главная диагональ");
		for(int i = 0; i < array.length; i++) { 
		System.out.print(" " + array[i][i] + " "); //Вывод на экран главную диагональ 
			}
		System.out.print("\n");
		System.out.println("     Побочная диагональ");
		for(int i = 0; i < array.length; i++) { 
			System.out.print(" " + array[i][size - 1 - i ] + " "); //Вывод на экран побочную диагональ 
		}	
	}
}
