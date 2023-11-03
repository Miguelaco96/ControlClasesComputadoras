
package mundopc;


public class Raton extends dispositivosDeEntrada {
    
   private int idRaton;
   private static int contadorRatones;
   
   public Raton( String tipoEntrada, String marca){
       super(tipoEntrada,marca);
       this.idRaton = ++Raton.contadorRatones;
   }

    public int getIdRaton() {
        return idRaton;
    }

    public static int getContadorRatones() {
        return contadorRatones;
    }


    @Override
    public String toString() {
        return "Raton{" + "idRaton=" + idRaton + '}'+ super.toString();
    }
    
}
