package ejPractica.ej1;

public class Telescopio {
   public long distancia(Planeta planeta){
         return planeta.getKmDistanciaSol();
   }

   public void tipo(Planeta planeta){
       if (planeta.getTipoPlaneta().equals(TipoPlaneta.GASEOSO)){
           System.out.println("Es un planeta gaseoso");
       }
       else{
           System.out.println("Es un planeta rocoso");
       }
   }
}

