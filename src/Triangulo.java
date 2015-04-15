public class Triangulo {
      int lados=3,valor = 10;

      public double sacarArea(){
          double area;
          area = (Math.sqrt(lados)/4) * Math.pow(valor,2);
          return area;
         
      }
      public double sacarPerimetro(){
          double perimetro;
          perimetro=valor*lados;
          return perimetro;
      }
   }