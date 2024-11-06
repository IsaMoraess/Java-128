//subclasse

public class Cachorro extends Mamifero{ //CLASSE DA HERANÇA PQ USA O EXTENDS
     @Override //SOM ESTÁ SE REPETINDO DA CLASSE PAI(MAMIFERO)
     public void som(){  //SOM=METODO SOM DECLARADO SEM PASSAGEM DE PARAMETRO
          System.out.println("Late");
     }
     public void reproduzSom(){  
          super.som();
     }
}
//CLASSE ESPECIFICA
//MAMIFERO Ñ RECEBE CACHORRO MAS CACHORRO RECEBE MAMIFERO POR CAUSA DO EXTENDS