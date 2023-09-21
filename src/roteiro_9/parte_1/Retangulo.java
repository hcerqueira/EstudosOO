package roteiro_9.parte_1;

public class Retangulo implements FiguraGeometrica {
   private double altura;
   private double largura;

   // Construtor
   public Retangulo(double altura, double largura) {
      this.altura = altura;
      this.largura = largura;
   }

   // Gets e sets
   public double getAltura() {
      return altura;
   }
   public void setAltura(double altura) {
      this.altura = altura;
   }
   public double getLargura() {
      return largura;
   }
   public void setLargura(double largura) {
      this.largura = largura;
   }
   @Override
   public String getNomeFigura() {
      return "Retângulo";
   }
   @Override
   public double getArea() {
      return this.altura * this.largura;
   }
   @Override
   public double getPerimetro() {
      return 2 * (this.altura + this.largura);
   }
}