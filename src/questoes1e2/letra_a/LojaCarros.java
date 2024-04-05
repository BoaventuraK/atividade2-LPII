package questoes1e2.letra_a;

import questoes1e2.letra_a.Carro;

public class LojaCarros {
    public static void main(String[] args){
        String dadosCarro1=null, dadosCarro2=null;

        Carro carro1=new Carro();
        Carro carro2=new Carro();

        carro1.cadastrar("CARRO BOM", "Preto", "VKEE", "Gasolina comun", 1, 2016, 4, 8, false, 34800);
        carro2.cadastrar("CARRO CARROS", "Branco", "PPRT", "Disel", 2, 2020, 4, 10, true, 80530.02);

        dadosCarro1=carro1.listarDados();
        System.out.println("Listando dados do carro 1: ");
        System.out.println(dadosCarro1+"\n___________________________");

        dadosCarro2=carro2.listarDados();
        System.out.println("Listando dados do carro 2: ");
        System.out.println(dadosCarro2+"\n___________________________");

        carro1.editar("CARRO BOM", "Cinza", "VKEE V2", "Gasolina comun", 1, 2018, 4, 8, false, 74800);
        carro2.editar("CARRO CARROS", "Branco", "PPTR", "Gasolina", 2, 2020, 4, 10, true, 110530.02);

        dadosCarro1=carro1.listarDados();
        System.out.println("Listando dados do carro 1 depois de editados: ");
        System.out.println(dadosCarro1+"\n___________________________");

        dadosCarro2=carro2.listarDados();
        System.out.println("Listando dados do carro 2 depois de editados: ");
        System.out.println(dadosCarro2+"\n___________________________");
    }
}