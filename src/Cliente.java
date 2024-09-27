import java.util.ArrayList;
import java.util.List;
public class Cliente {
    //Atributos
    private String nome;
    private String cpf;
    private String endereco;
    private String telefone;
    private String email;
    private String observacao;
    private List<Veiculo> veiculosComprados = new ArrayList<Veiculo>();

    //Construtor
    public Cliente(String nome, String email,
                   String cpf, String endereco, String telefone, String observacao) {
        this.email = email;
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
        this.observacao = observacao;
    }

    //Metodo para adicionar um veiculo a lista de veiculos comprados
    public void adicionarVeiculo(Veiculo veiculo) {
        this.veiculosComprados.add(veiculo);
    }

    //Metodo para remover um veiculo
    public void removerVeiculo(String placa) {
        for (int i = 0; i < veiculosComprados.size(); i++) {
            if (veiculosComprados.get(i).getPlaca().equals(placa)) {
                veiculosComprados.remove(i);
                return;
            }
        }
        System.out.println("Veículo não encontrado.");
    }

    //Metodo para obter uma cópia da lista de veiculos comprados
    public List<Veiculo> getVeiculosComprados() {
        return (veiculosComprados);
    }

    //Metodo para buscar veiculo por placa
    public Veiculo buscarVeiculoPlaca(String placa) {
        for (Veiculo veiculo : veiculosComprados) {
            if (veiculo.getPlaca().equals(placa)) {
                return veiculo;
            }
        }
        return null;
    }

    //Getter and Setter
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
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

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    @Override
    public String toString() {
        return "\n"+"Cliente\nNome: " + this.getNome() +
                "\nCPF: " + this.getCpf() + "\nEndereço: " + this.getEndereco()+
                "\nTelefone: "+ this.getTelefone()+ "\nEmail: "+ this.getEmail()+
                "\nObservação: "+ this.getObservacao()+
                "\nVeículos Comprados: "+ veiculosComprados.size() + " registrados" + "\n";
    }
}
