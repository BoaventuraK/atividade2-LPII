package questoes1e2.letra_b;

public class ContaBancaria {
    private String nomeCorrentista=null, agenciaBancaria=null;
    private int cpfCorrentista=0, rgCorrentista=0, numroConta=0;
    private double saldoBancario=0;

    public void cadastrar(String nomeCorrentista, String agenciaBancaria, int cpfCorrentista, int rgCorrentista, int numroConta, double saldoBancario){
        this.nomeCorrentista=nomeCorrentista;
        this.agenciaBancaria=agenciaBancaria;
        this.cpfCorrentista=cpfCorrentista;
        this.rgCorrentista=rgCorrentista;
        this.numroConta=numroConta;
        this.saldoBancario=saldoBancario;
        System.out.println("Cadastrado com sucesso! \n");
    }

    public void editar(String nomeCorrentista, String agenciaBancaria, int cpfCorrentista, int rgCorrentista, int numroConta, double saldoBancario){
        this.nomeCorrentista=nomeCorrentista;
        this.agenciaBancaria=agenciaBancaria;
        this.cpfCorrentista=cpfCorrentista;
        this.rgCorrentista=rgCorrentista;
        this.numroConta=numroConta;
        this.saldoBancario=saldoBancario;
        System.out.println("Editado com sucesso! \n");
    }

    public String imprimirDados(){
        String dados="| Nome do Correntista: %s|" +
                "\n| Saldo: %.2f |";

        dados=String.format(dados,this.nomeCorrentista,this.saldoBancario);

        return dados;
    }
}
