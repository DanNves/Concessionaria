import java.util.ArrayList;
import java.util.List;

public class Concessionaria {
    private String nome;
    private String endereco;
    private String telefone;
    private String email;
    private String cnpj;
    private List<Veiculo> estoqueVeiculos = new ArrayList<>();

    public Concessionaria(String nome, String endereco, String telefone, String email, String cnpj) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.cnpj = cnpj;
    }

    // Método para adicionar veículo ao estoque
    public void adicionarVeiculo(Veiculo veiculo) {
        estoqueVeiculos.add(veiculo);
    }

    // Método para remover veículo do estoque
    public void removerVeiculo(Veiculo veiculo) {
        estoqueVeiculos.remove(veiculo);
    }

    // Método para vender veículo ao cliente
    public void venderVeiculo(Cliente cliente, Veiculo veiculo) {
        if (estoqueVeiculos.contains(veiculo)) {
            cliente.comprarVeiculo(veiculo); // Registra a compra do veículo no cliente
            removerVeiculo(veiculo); // Remove o veículo do estoque
            System.out.println("Veículo vendido a " + cliente.getNome());
        } else {
            System.out.println("Veículo não disponível no estoque.");
        }
    }

    // Listar veículos disponíveis no estoque
    public List<Veiculo> listarVeiculos() {
        return new ArrayList<>(estoqueVeiculos);
    }

    // Getters e Setters...

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public String toString() {
        return "Concessionaria\n"+
                "Nome: " + nome +
                "\nEndereço: " + endereco +
                "\nTelefone: " + telefone +
                "\nEmail: " + email +
                "\nCNPJ: " + cnpj +
                "\nVeículos no estoque: " + estoqueVeiculos.size() + "\n";
    }


}
