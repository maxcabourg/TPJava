package Thread;

public class Matrix {
	
	private int width;
	private int height;
	private int[][] values;
	private Matrix matrix2;
	
	public Matrix(int width, int height, int[][] values) {
		super();
		this.width = width;
		this.height = height;
		this.values = values;
	}
	
	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public int[][] getValues() {
		return values;
	}


	public Matrix multiply(Matrix m2) throws Exception{
		if(this.width != m2.height)
			throw new Exception();
		Matrix result = new Matrix(this.width,m2.height,new int[this.width][m2.height]);
		CaseMultiplier m ;
		for(int i=0;i<this.height;i++){
			for(int j=0;j<m2.width;j++){
			m = new CaseMultiplier(this.getLine(i), this.getColumn(j));
			m.start();
			m.join();
			result.getValues()[i][j] = m.getResult();
			}
		}
		return result;
	}
	
	public int[] getLine(int line){
		int[] lineValues = new int[width];
		for(int i = 0; i<width; i++)
			lineValues[i] = values[line][i];
		return lineValues;
		
	}
	
	public int[] getColumn(int column){
		int[] columnValues = new int[width];
		for(int i = 0; i<height; i++)
			columnValues[i] = values[column][i];
		return columnValues;
		
	}
	public void run(){
		
	}
	
	public String toString(){
		String string = new String();
		for(int i = 0; i<height; i++){
			for(int j = 0; j < width; j++){
				string+= values[i][j];
			}
		}
		return string;
	}
	
	public static void main(String[] args){
		int[][] values1 = { {1, 2, 3}, {4, 5, 6}, {7,8,9} };
		int[][] values2 = { {2, 2, 2}, {3, 3, 3}, {4, 4,4} };
		Matrix m1 = new Matrix(3, 3, values1);
		System.out.println(m1);
		Matrix m2 = new Matrix(3, 3, values2);
		try {
			m1 = m1.multiply(m2);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(m1);
		
	}
}
