package questoes1e2.letra_e;

import questoes1e2.letra_e.Funcionario;
public class AppEmpresa {
    public static void main(String[] args){
        String dadosFuncionario1=null, dadosFuncionario2=null;

        Funcionario funcionario1=new Funcionario();
        Funcionario funcionario2=new Funcionario();

        funcionario1.cadastrar("Jonisvaldo", "03/03/2300", "11111", "11111", "Rua 1", "Be", "Caixa", "EmMedio", 1221, 1200);
        funcionario2.cadastrar("Jureminda", "04/02/2002", "2222", "222222", "Rua 4", "Br", "Gerte", "Superior em AD", 321, 7000);

        dadosFuncionario1=funcionario1.listarDados();
        System.out.println("Listando dados do Funcionario 1: ");
        System.out.println(dadosFuncionario1+"\n___________________________");

        dadosFuncionario2=funcionario2.listarDados();
        System.out.println("Listando dados do Funcionario 2: ");
        System.out.println(dadosFuncionario2+"\n___________________________");

        funcionario1.editar("Jonisvaldo", "03/03/2003", "11111", "11111", "Rua 1", "Br", "Caixa", "EmMedio", 1221, 2100);
        funcionario2.editar("Jureminda", "04/02/2002", "2222", "222222", "Rua 2", "Br", "Gerente", "Superior em ADM", 321, 7000);

        dadosFuncionario1=funcionario1.listarDados();
        System.out.println("\n \nListando dados do Funcionario 1 editado: ");
        System.out.println(dadosFuncionario1+"\n___________________________");

        dadosFuncionario2=funcionario2.listarDados();
        System.out.println("Listando dados do Funcionario 2 editado: ");
        System.out.println(dadosFuncionario2+"\n___________________________");

    }
}
