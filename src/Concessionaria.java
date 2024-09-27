import java.util.ArrayList;
import java.util.List;
public class Concessionaria {
    //Atributos
    private String nome;
    private String endereço;
    private String telefone;
    private String email;
    private String cnpj;
    private List<Veiculo> estoqueVeiculos = new ArrayList<Veiculo>();

    //Construtor
    public Concessionaria(String nome, String endereço, String telefone, String email, String cnpj) {
        this.nome = nome;
        this.endereço = endereço;
        this.telefone = telefone;
        this.email = email;
        this.cnpj = cnpj;
    }

    //Metodo adicionar veiculo ao estoque
    public void adicionarVeiculo(Veiculo veiculo) {
        this.estoqueVeiculos.add(veiculo);
    }

    //Metodo remover veiculo do estoque
    public void removerVeiculo(Veiculo veiculo){
        this.estoqueVeiculos.remove(veiculo);
    }

    //Listar veiculos
    public List<Veiculo> listarVeiculos() {
        return new ArrayList<>(estoqueVeiculos);
    }

    //Getter and Setter
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
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

    public List<Veiculo> getEstoqueVeiculos() {
        return new ArrayList<>(estoqueVeiculos);
    }

    @Override
    public String toString() {
        return "Concessionaria\n" +
                "Nome: "+ this.getNome()+ "\nEndereço: "+ this.getEndereço() +
                "\nTelefone: "+ this.getTelefone()+ "\nEmail: "+ this.getEmail() +
                "\nCNPJ: "+ this.getCnpj()+ "\nVeiculos Disponiveis: "+ estoqueVeiculos.size();
    }
}
