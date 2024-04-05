package questoes1e2.letra_d;
import  questoes1e2.letra_d.Professor;

public class AppFaculdade {
    public static void main(String[] args){
        String dadosProfessor1=null, dadosProfessor2=null;

        Professor professor1=new Professor();
        Professor professor2=new Professor();

        professor1.cadastrar("Gumball", "Doutor", "Segurança da informação", "Segurança, Logica de programação...", 120, 19200);
        professor2.cadastrar("Kara sorel", "Mestre", "Engenharia da comp", "OAC, LPI, LPII, Logica de programação...", 90, 15600);

        dadosProfessor1=professor1.listarDados();
        System.out.println("Listando dados do Professor 1: ");
        System.out.println(dadosProfessor1+"\n___________________________");

        dadosProfessor2=professor2.listarDados();
        System.out.println("Listando dados do Professor 2: ");
        System.out.println(dadosProfessor2+"\n___________________________");

        professor1.editar("Gumball Waterson", "Doutor", "Segurança da informação", "Segurança, Rede de comp, Logica de programação...", 120, 19200);
        professor2.editar("Kara sorel", "Doutora", "Engenharia da comp", "OAC, LPI, LPII, Logica de programação...", 110, 20800);

        dadosProfessor1=professor1.listarDados();
        System.out.println("\n \nListando dados do Professor 1 editados: ");
        System.out.println(dadosProfessor1+"\n___________________________");

        dadosProfessor2=professor2.listarDados();
        System.out.println("Listando dados do Professor 2 edtados: ");
        System.out.println(dadosProfessor2+"\n___________________________");

        professor1.setDescricaoDisciplinas("Segurança da info, LP1...");
        professor2.setDescricaoDisciplinas("OAC, LP1, LP2...");

        System.out.println("Descrição das disiplinas prof 1: ");
        System.out.println("|"+professor1.getDescricaoDisciplinas()+"|\n");

        System.out.println("Descrição das disiplinas prof 2: ");
        System.out.println("|"+professor2.getDescricaoDisciplinas()+"|\n");
    }
}
