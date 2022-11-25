public class Identity {

	public static void main(String[] args) {
		
		int i, j, Flag = 1;
		
		
		int[][] arr = {{1, 0, 0}, {0, 1, 0}, {0, 0, 1}};
		
		
		for(i = 0; i < 3 ; i++)
		{
			for(j = 0; j < 3; j++)
			{
				if(arr[i][j] != 1 && arr[j][i] != 0) {
					Flag = 0;
					break;
				}
			}
		}
		if(Flag == 1) {
			System.out.println("\nMatrix is an Identity Matrix");
		}
		else {
			System.out.println("\nMatrix is Not an Identity Matrix");
		}
	}
}
