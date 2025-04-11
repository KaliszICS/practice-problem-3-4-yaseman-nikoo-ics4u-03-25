import java.util.ArrayList;
public class PracticeProblem {

	public static void main(String args[]) {


	}
	public static int[] recaman(int n){
		ArrayList<Integer> sequence = new ArrayList<Integer>();
		
		if(n<1){
			return new int[]{};
		}
		
		recamanHelper(sequence, n);
		int[] arr= new int[n];
		for(int i=0; i<sequence.size();i++){
			arr[i]= sequence.get(i);
		}
		return arr;

		
	}
	public static void recamanHelper(ArrayList<Integer> sequence, int n){
		if (n==1){
			sequence.add(1);
			return;
		}
		recamanHelper(sequence, n-1);
		int x= sequence.get(n-2)-n;
		int y= sequence.get(n-2)+n;
		if (x>0 && !sequence.contains(x)){
		 sequence.add(x);
		}
		else{
			sequence.add(y);
		}
		
	}
}


