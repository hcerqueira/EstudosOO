package roteiro_9.parte_2;

public class Quadrado implements FiguraGeometrica {
   private double lado;

   //Construtor
   public Quadrado(double lado) {
      this.lado = lado;
   }

   //Gets e sets
   public double getLado() {
      return lado;
   }
   public void setLado(double lado) {
      this.lado = lado;
   }
   @Override
   public String getNomeFigura() {
      return "Quadrado";
   }
   @Override
   public double getArea() {
      return this.lado * this.lado;
   }
   @Override
   public double getPerimetro() {
      return this.lado * 4;
   }
}