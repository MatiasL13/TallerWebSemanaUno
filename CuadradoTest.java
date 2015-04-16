public class CuadradoTest {
    public static void main(String[] args) 
	{
		cuadradoTest();
	}
    public static void cuadradoTest(){
        int areaCuadrado,perimetroCuadrado;
        Cuadrado cuadradoUno = new Cuadrado();
        
        areaCuadrado = cuadradoUno.areaCuadrado();
        perimetroCuadrado = cuadradoUno.perimetroCuadrado();
        
        System.out.println("El Area del Cuadrado es: " + areaCuadrado + "\n" + "El Perimetro del Cuadrado es: " + perimetroCuadrado);

    }
}
