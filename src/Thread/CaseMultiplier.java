package Thread;

public class CaseMultiplier extends Thread{

	private int[] array1;
	private int[] array2;
	private int result;
	
	public CaseMultiplier(int[] array1,int[] array2){
		this.array1 = array1;
		this.array2 = array2;
	}
	
	public void run(){
		int stack = 0;
		for(int i = 0;i<array1.length;i++){
			stack += array1[i]*array2[i];
		}
	}
	
	public int getResult(){
		return result;
	}
}
