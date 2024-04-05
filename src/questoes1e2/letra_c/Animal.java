package questoes1e2.letra_c;

public class Animal {

    private String especie=null,nome=null,dataNascimento=null,localNascimento=null;
    private int numeroRegistro=0;

    public void cadastrarAnimal(String especie, String nome, String dataNascimento, String localNascimento, int numeroRegistro){
        this.especie=especie;
        this.nome=nome;
        this.dataNascimento=dataNascimento;
        this.localNascimento=localNascimento;
        this.numeroRegistro=numeroRegistro;
    }

    public void editarAnimal(String especie, String nome, String dataNascimento, String localNascimento, int numeroRegistro){
        this.especie=especie;
        this.nome=nome;
        this.dataNascimento=dataNascimento;
        this.localNascimento=localNascimento;
        this.numeroRegistro=numeroRegistro;
    }

    public String listarDados(){
        String dados="| Especie: %s; Nome: %s; Nascimento: %s; Local de nascimento: %s; Registro: %d";

        dados=String.format(dados,this.especie,this.nome,this.dataNascimento,this.localNascimento,this.numeroRegistro);

        return dados;
    }

}
