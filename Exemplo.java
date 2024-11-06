//retorna os valores

public class Exemplo {
     public static void main(String args[]){
          Cachorro c = new Cachorro();
          c.alimento(); //CHAMA METODO DE MAMIFERO
          c.som(); //CHAMA METODO DE CACHORRO
          c.composicao(); //CHAMA METODO ANIMAL Q E SUPERCLASSE INDIRETA DE CACHORRO
          c.reproduzSom(); //CHAMA O METODO REPRODUZSOM Q RETORNA SOM = URRA
     }
}
