public class Veiculo {
    //Atributos
    private String marca;
    private String modelo;
    private int ano;
    private String cor;
    private double preco;
    private boolean disponivel;
    private String placa;
    private TipoCombustivel tipoCombustivel;
    private int quilometragem;
    private boolean novo;

    //Construtor
    public Veiculo(String marca, String modelo, int ano, String cor,
                   double preco, boolean disponivel, TipoCombustivel tipoCombustivel,
                   String placa, int quilometragem, boolean novo) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.preco = preco;
        this.disponivel = disponivel;
        this.tipoCombustivel = tipoCombustivel;
        this.placa = placa;
        this.quilometragem = quilometragem;
        this.novo = novo;
    }

    //Getter and Setter
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public TipoCombustivel getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(TipoCombustivel tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(int quilometragem) {
        this.quilometragem = quilometragem;
    }

    public boolean isNovo() {
        return novo;
    }

    public void setNovo(boolean novo) {
        this.novo = novo;
    }

    //Retorno de apresentação em String do Objeto
    @Override
    public String toString(){
        return "Veiculo\n" +
                "Marca: "+ this.getMarca()+ "\nModelo: "+ this.getModelo()+
                "\nAno: "+ this.getAno()+ "\nCor: "+ this.getCor()+
                "\nPreço: "+ this.getPreco()+ "\nDisponivel: "+ this.isDisponivel()+
                "\nPlaca: "+ this.getPlaca()+ "\nTipo Combustível: "+ this.getTipoCombustivel()+
                "\nKM: "+ this.getQuilometragem()+ "\nNovo: "+ (this.isNovo()? "Sim":"Não") + "\n ";

    }
}
