package roteiro_9.parte_2;

public class Circulo implements FiguraGeometrica {
   private double raio;

   public Circulo(double raio) {
      this.raio = raio;
   }

   public double getRaio() {
      return raio;
   }
   public void setRaio(double raio) {
      this.raio = raio;
   }
   @Override
   public String getNomeFigura() {
      return "Circulo";
   }
   @Override
   public double getArea() {
      return 3.1416*(this.raio * this.raio);
   }
   @Override
   public double getPerimetro() {
      return 2*3.1416*this.raio;
   }
}
