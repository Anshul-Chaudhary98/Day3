package linecomparison;

public class LineComparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int x1 = 1, y1 = 25, x2 = 18, y2 = 10;
	     int p1 = 10, q1 = 15, p2 = 14, q2 = 32;
	     Integer line1Length = (int) Math.sqrt(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)));
	     Integer line2Length = (int) Math.sqrt(((p2-p1)*(p2-p1))+((q2-q1)*(q2-q1)));
	     System.out.println("Line 1 Length: " + line1Length);
	     System.out.println("Line 2 Length: " + line2Length);
			
		 if(line1Length == line2Length) { System.out.println("Length is equal"); }
		 else { System.out.println("Length is not equal"); }
			 
	     int compare = line1Length.compareTo(line2Length);
	     
	     if(compare > 0) {
	    	 System.out.println("Line 1 is greater");
	     }
	     else if(compare < 0) {
	    	 System.out.println("Line 1 is smaller");
	     }
	     else {
	    	 System.out.println("Both lines are equals");
	     }

	}
}
