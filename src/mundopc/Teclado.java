
package mundopc;

public class Teclado extends dispositivosDeEntrada {
    
   private int idTeclado;
   private static int contadorTeclado;
   
   public Teclado( String tipoEntrada, String marca){
       super(tipoEntrada,marca);
       this.idTeclado = ++Teclado.contadorTeclado;
   }

    public static int getContadorTeclado() {
        return contadorTeclado;
    }

    public static void setContadorTeclado(int contadorTeclado) {
        Teclado.contadorTeclado = contadorTeclado;
    }
   
   
   }
