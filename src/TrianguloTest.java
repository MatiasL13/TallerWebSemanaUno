
public class TrianguloTest {
	
	public static void main(String[] args) 
	{
		testTrianguloAreaPerimetro();
	}
	public static void testTrianguloAreaPerimetro()
	{
		double areaTriangulo;
		double perimetroTriangulo;
		Triangulo trianguloUno = new Triangulo();		
		areaTriangulo =  trianguloUno.sacarArea();
		perimetroTriangulo = trianguloUno.sacarPerimetro();
		
		System.out.println("Area Triangulo\t\t" + areaTriangulo + "\n" +"Perimetro Triangulo\t\t"+ perimetroTriangulo);
	}

}
