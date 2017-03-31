public class Calculator{
	int z;
	public void pertambahan(int x, int y){
		z=x+y;
		System.out.println("Hasil:"+z);
	}
	public void pengurangan(int x, int y){
	z=x+y;
	System.out.println("Hasil:"+z);
	}
}
class CalculatorMain extends Calculator{
	public void perkalian(int x, int y) {
		z=x+y;
		System.out.println("Hasil:" +z);

	}
	public static void main(String args[]){
	int a=20, b=10;
	CalculatorMain cal=new CalculatorMain();
	cal.pertambahan(a,b);
	cal.pengurangan(a,b);
	cal.perkalian(a,b);
	}
}