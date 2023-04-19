// Instantiable class for rainfall app
// Adam Plesca
// 18/4/23

 public class Rainfall{
	 //declare data members
	 private int avg[];
	 private int rain[][];

	 public Rainfall(){
		 avg = new int[4];
		 rain = new int[4][7];
	 }

	 //setters
	 public void setRain(int rain[][]){
		 this.rain = rain;
	 }

	 //compute
	 public void compute(){

		 for(int i = 0; i <rain.length;i++){//loop through each row(week) in the array
		 	int sum = 0;
		 	for(int j = 0;j<rain[i].length;j++){//loop through each space(day) in the row
		 		sum = sum +rain[i][j];//get total of each row (week)
			}
			avg[i] =sum/7;//get avg of each row(week)
		 }
	 }

	 public int[] getAvg(){
		 return avg;
	 }
 }