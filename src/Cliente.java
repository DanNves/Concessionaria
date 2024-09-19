public class Cliente {
    // Atributos
    private String nome;
    private String cpf;
    private Veiculo veiculoComprado;

    // Construtor
    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    // Método para registrar a compra de um veículo
    public void comprarVeiculo(Veiculo veiculo) {
        this.veiculoComprado = veiculo;
    }

    // Getter para o veículo comprado
    public Veiculo getVeiculoComprado() {
        return veiculoComprado;
    }

    // Getters e Setters de outros atributos...
    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    @Override
    public String toString() {
        String veiculoCompradoStr = (veiculoComprado != null) ? veiculoComprado.toString() : "Nenhum veículo comprado";
        return "Cliente\n" +
                "Nome: " + nome +
                "\nCPF: " + cpf +
                "\nVeículo Comprado: " + veiculoCompradoStr;

    }

}
