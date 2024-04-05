package questoes1e2.letra_b;

import questoes1e2.letra_b.ContaBancaria;

public class ProgramaBanco {
    public static void main(String[] args){
        String dadosCorrentista1=null, dadosCorrentista2=null;

        ContaBancaria conta1=new ContaBancaria();
        ContaBancaria conta2 =new ContaBancaria();

        conta1.cadastrar("João Neto", "BANCO BANCO", 111111, 12121, 1, 5043.40);
        conta2.cadastrar("José Maria", "BANCO MESA", 222222, 232323, 1, 8075.21);

        dadosCorrentista1=conta1.imprimirDados();
        System.out.println("Listando dados do Correntista 1: ");
        System.out.println(dadosCorrentista1+"\n___________________________");

        dadosCorrentista2=conta2.imprimirDados();
        System.out.println("Listando dados do Correntista 2: ");
        System.out.println(dadosCorrentista2+"\n___________________________");

        conta1.editar("João da silva Neto", "BANCO BANCOS", 111111, 12121, 1, 5043.40);
        conta2.editar("José Marivaldo", "BANCO MESA", 222222, 232323, 1, 8075.21);

        dadosCorrentista1=conta1.imprimirDados();
        System.out.println("Listando dados do Correntista 1 depois de editar: ");
        System.out.println(dadosCorrentista1+"\n___________________________");

        dadosCorrentista2=conta2.imprimirDados();
        System.out.println("Listando dados do Correntista 2 depois de editar: ");
        System.out.println(dadosCorrentista2+"\n___________________________");

    }
}
