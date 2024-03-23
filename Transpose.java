public class Transpose{
	
	public int[][] transposeMatrix(int[][] mat){
		int n = mat.length;
		int m = mat[0].length;
		int ans[][] = new int[m][n];
		
		for(int i = 0; i < n; i++){
			for(int j = 0; j < m; j++){
				ans[j][i] = mat[i][j];
			}
		}
		
		return ans;
		
	}
	
	
	public static void main(String[] args){
		Transpose t = new Transpose();
		int mat[][] = {{1, 2, 3},{4, 5, 6}};
		int newMatrix[][] = t.transposeMatrix(mat);
		for(int i = 0; i < newMatrix.length; i++){
			for(int j = 0; j < newMatrix[0].length; j++){
				System.out.print(newMatrix[i][j]+ " ");
			}
			System.out.println();
		}
	}
}
