package ejercicionumero3ob;

public class Coche {
   private int numeroDePuertas;
   
   public Coche (int cantidadDePuertas ) {
   this.numeroDePuertas = cantidadDePuertas;
}
   public void sumarPuerta(){
       this.numeroDePuertas++;
   }
   public int getNumeroDePuertas(){
       return this.numeroDePuertas;
   }
}
