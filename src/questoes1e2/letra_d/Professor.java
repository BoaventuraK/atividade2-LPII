package questoes1e2.letra_d;

public class Professor {
    private String nome=null,titulo=null,formacao=null,descricaoDisciplinas=null;
    private int cargaHoraria=0;
    private double salario=0;

    public void cadastrar(String nome, String titulo, String formacao, String descricaoDisciplinas, int cargaHoraria, double salario){
        this.nome=nome;
        this.titulo=titulo;
        this.formacao=formacao;
        this.descricaoDisciplinas=descricaoDisciplinas;
        this.cargaHoraria=cargaHoraria;
        this.salario=salario;
    }

    public void editar(String nome, String titulo, String formacao, String descricaoDisciplinas, int cargaHoraria, double salario){
        this.nome=nome;
        this.titulo=titulo;
        this.formacao=formacao;
        this.descricaoDisciplinas=descricaoDisciplinas;
        this.cargaHoraria=cargaHoraria;
        this.salario=salario;
    }

    public void setDescricaoDisciplinas(String descricaoDisciplinas){
        this.descricaoDisciplinas=descricaoDisciplinas;
    }

    public String getDescricaoDisciplinas(){
        return this.descricaoDisciplinas;
    }

   public String listarDados(){
        String dados="| Nome: %s; Titulo: %s; Formação: %s |" +
                "\n| Descrição das didiplinas: %s; Carga horaria: %d; Salario: %.2f |";

        dados=String.format(dados,this.nome,this.titulo,this.formacao,this.descricaoDisciplinas,this.cargaHoraria,this.salario);

        return dados;
    }
}
