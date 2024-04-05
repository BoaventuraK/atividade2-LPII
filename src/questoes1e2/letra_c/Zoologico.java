package questoes1e2.letra_c;

import questoes1e2.letra_c.Animal;

public class Zoologico {
    public static void main(String[] args){
        String dadosAnimal1=null, dadosAnimal2=null;

        Animal animal1=new Animal();
        Animal animal2=new Animal();

        animal1.cadastrarAnimal("Leão marinho", "Leoncio", "02/03/2021", "Cativeiro nos EUA", 302);
        animal2.cadastrarAnimal("Raposa do deserto", "Lucy", "19/06/2022", "Cativeiro na espanha", 552);

        dadosAnimal1=animal1.listarDados();
        System.out.println("Listando dados do Animal 1: ");
        System.out.println(dadosAnimal1+"\n___________________________");

        dadosAnimal2=animal2.listarDados();
        System.out.println("Listando dados do Animal 2: ");
        System.out.println(dadosAnimal2+"\n___________________________");

        animal1.editarAnimal("Leão marinho", "Leoncio", "02/03/2021", "Artico", 302);
        animal2.editarAnimal("Raposa do deserto", "Lucy", "19/06/2023", "Cativeiro na argentina", 552);

        dadosAnimal1=animal1.listarDados();
        System.out.println("\n \nListando dados do Animal 1 editados: ");
        System.out.println(dadosAnimal1+"\n___________________________");

        dadosAnimal2=animal2.listarDados();
        System.out.println("Listando dados do Animal 2 editados: ");
        System.out.println(dadosAnimal2+"\n___________________________");
    }
}
