
public class Data {
	private  double maxi;
    private  double avg = 0;
    private int c = 0;


    Data(){}
    
    public void setData(double m) {
    	maxi = m;
    }
    
    public void maxData	(double m) {
    	if(m >= maxi) {
    		maxi = m;
    	}
    }
    
    public double setData() {
    	return maxi;
    }
    
    public void cnt(double m) {
    	c++;
    	avg += m;
    }
    public double avgData() {
    	
    	avg /= c;
    	
    	return avg;
    }
}
