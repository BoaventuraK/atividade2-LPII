package questoes1e2.letra_a;

public class Carro {
    private String marca=null,cor=null,modelo=null,tipoCombustivel=null;
    private int id=0,anoFabricacao=0,qtdPortas=0,qtdDisponivel=0;
    private boolean completo=false;
    private double preco=0;

    public void cadastrar(String marca, String cor, String modelo, String tipoCombustivel, int id, int anoFabricacao, int qtdPortas, int qtdDisponivel, boolean completo, double preco){
        this.marca=marca;
        this.cor=cor;
        this.modelo=modelo;
        this.tipoCombustivel=tipoCombustivel;
        this.id=id;
        this.anoFabricacao=anoFabricacao;
        this.qtdPortas=qtdPortas;
        this.qtdDisponivel=qtdDisponivel;
        this.completo=completo;
        this.preco=preco;
        System.out.println("Veiculo cadastrado com sucesso!! \n");
    }

    public void editar(String marca, String cor, String modelo, String tipoCombustivel, int id, int anoFabricacao, int qtdPortas, int qtdDisponivel, boolean completo, double preco){
        this.marca=marca;
        this.cor=cor;
        this.modelo=modelo;
        this.tipoCombustivel=tipoCombustivel;
        this.id=id;
        this.anoFabricacao=anoFabricacao;
        this.qtdPortas=qtdPortas;
        this.qtdDisponivel=qtdDisponivel;
        this.completo=completo;
        this.preco=preco;
        System.out.println("Os dados do veidulo foram alterados!! \n");
    }

    public String listarDados(){
        String dadosCarro="|Id: %d; Marca: %s; Modelo: %s; Cor: %s; Combustivel: %s |" +
                "\n| Ano: %d; Portas: %d; Estoque: %d; Completo: %b; preço: %.2f |";

        dadosCarro=String.format(dadosCarro,this.id, this.marca, this.modelo, this.cor, this.tipoCombustivel, this.anoFabricacao, this.qtdPortas, this.qtdDisponivel, this.completo, this.preco);

        return dadosCarro;
    }

}
