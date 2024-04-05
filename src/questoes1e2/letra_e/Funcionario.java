package questoes1e2.letra_e;

public class Funcionario {
    private String nome=null, dataNascimento=null, rg=null, cpf=null, endereco=null, naturalidade=null, proficao=null, grauIsntrucao=null;
    private int matricula=0;
    private double salario=0;

    public void cadastrar(String nome, String dataNascimento, String rg, String cpf, String endereco, String naturalidade, String proficao, String grauIsntrucao, int matricula, double salario){
        this.nome=nome;
        this.dataNascimento=dataNascimento;
        this.rg=rg;
        this.cpf=cpf;
        this.endereco=endereco;
        this.naturalidade=naturalidade;
        this.proficao=proficao;
        this.grauIsntrucao=grauIsntrucao;
        this.matricula=matricula;
        this.salario=salario;
    }

    public void editar(String nome, String dataNascimento, String rg, String cpf, String endereco, String naturalidade, String proficao, String grauIsntrucao, int matricula, double salario){
        this.nome=nome;
        this.dataNascimento=dataNascimento;
        this.rg=rg;
        this.cpf=cpf;
        this.endereco=endereco;
        this.naturalidade=naturalidade;
        this.proficao=proficao;
        this.grauIsntrucao=grauIsntrucao;
        this.matricula=matricula;
        this.salario=salario;
    }

    public String listarDados(){
        String dados="| Nome: %s; Nascimento: %s; RG: %s, CPF: %s; Esderço: %s |" +
                "\n| Naturalidade: %s; Profição: %s; Instrução: %s; Matricula: %d; Salario: %.2f |";

        dados=String.format(dados,this.nome,this.dataNascimento,this.rg,this.cpf,this.endereco,this.naturalidade,this.proficao,this.grauIsntrucao,this.matricula,this.salario);

        return dados;
    }
}
