
public class Main {

	public static void main(String[] args) {
		
		int[] values = {1,2,3,4,5,6,7,8,9,324,-234};
		MinMax.PairMinMax pairMinMax = MinMax.minmax(values);
		System.out.println(MinMax.minmax(values).min + " " + MinMax.minmax(values).max);
	}

}
