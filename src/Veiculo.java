public class Veiculo {
    private String modelo;
    private String marca;
    private int ano;
    private double preco;
    private String cor;
    private double quilometragem;
    private double potencia;
    private TipoCombustivel tipoCombustivel;

    // Construtor
    public Veiculo(String modelo, String marca, int ano, double preco,
                   String cor, double quilometragem, double potencia, TipoCombustivel tipoCombustivel) {
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.preco = preco;
        this.cor = cor;
        this.quilometragem = quilometragem;
        this.potencia = potencia;
        this.tipoCombustivel = tipoCombustivel;
    }

    // Getters e Setters
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(double quilometragem) {
        this.quilometragem = quilometragem;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    public TipoCombustivel getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(TipoCombustivel tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    // Método toString para exibir os detalhes do veículo
    @Override
    public String toString() {
        return "Modelo: " + modelo +
                "\nMarca: " + marca + "\nAno: " + ano +
                "\nPreço: " + preco + "\nCor: " + cor + "\nQuilometragem: " + quilometragem +
                "\nPotência: " + potencia + " CV" +  "\nCombustível: " + tipoCombustivel + "\n ";
    }
}
