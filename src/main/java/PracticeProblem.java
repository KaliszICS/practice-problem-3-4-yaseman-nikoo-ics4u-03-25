import java.util.ArrayList;
public class PracticeProblem {

	public static void main(String args[]) {


	}
	public static ArrayList<Integer> recaman(int n){
		ArrayList<Integer> sequence = new ArrayList<Integer>();
		if (n<2){
			return sequence;
		}
		int x= recaman(n-1).get(n-1)-n;
		int y= recaman(n-1).get(n-1)+n;
		if (x>0 && !sequence.contains(x)){
		 sequence.add(x);
		}
		else{
			sequence.add(y);
		}
		return sequence;
	}

}
