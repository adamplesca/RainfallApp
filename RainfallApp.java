// RainfallApp
// Adam Plesca
// 18/4/23

 import javax.swing.JOptionPane;
 public class RainfallApp{
	 public static void main(String args[]){
		 //declare variables
		 int rain[][] = new int[4][7];
		 int avg[] = new int[4];

		 //declare and create objects
		 Rainfall myRainfall = new Rainfall();

		 //input
		 for(int i = 0; i < rain.length;i++){
			 for(int j = 0; j<rain[i].length;j++){
				 rain[i][j] = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the value for rainfall"));
			 }
		 }
		 myRainfall.setRain(rain);

		 //process
		 myRainfall.compute();

		 //output
		 avg = myRainfall.getAvg();
		 for(int i = 0; i < 4;i++){
			 JOptionPane.showMessageDialog(null,"The average rainfall for week "+(i+1)+" is "+avg[i]);
		 }
	 }
}


