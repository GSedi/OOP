
public class MinMax {
	
	static class PairMinMax{
		int min, max;
		public PairMinMax(int min, int max) {
			this.min = min;
			this.max = max;
		}
		
	}
	
	static PairMinMax minmax(int values[]) {
		int min = values[0];
		int max = values[0];
		for(int i = 0; i< values.length; i++) {
			if(max <= values[i]) max = values[i];
			if(min >= values[i]) min = values[i];
		}
		
		PairMinMax pair = new PairMinMax(min, max);
		return pair;
	}
}
