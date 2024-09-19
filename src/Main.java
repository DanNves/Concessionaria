import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Criação da concessionária
        Concessionaria concessionaria = new Concessionaria("CarrosDan", "Rua ABC, 777",
                "123456789", "carrosdan@gmai.com", "00.000.000/0001-00");
        System.out.println(concessionaria);

        // Criação da fábrica de veículos
        Veiculo carro1 = new Veiculo("Corolla", "Toyota", 2023, 120000, "Preto", 0, 177, TipoCombustivel.GASOLINA);
        Veiculo carro2 = new Veiculo("Civic", "Honda", 2022, 130000, "Branco", 5000, 155, TipoCombustivel.GASOLINA);
        Veiculo carro3 = new Veiculo("Model 3", "Tesla", 2023, 350000, "Vermelho", 0, 450, TipoCombustivel.ELETRICO);
        Veiculo carro4 = new Veiculo("Hilux", "Toyota", 2021, 200000, "Cinza", 20000, 204, TipoCombustivel.DIESEL);

        System.out.println(carro1);
        System.out.println(carro2);
        System.out.println(carro3);
        System.out.println(carro4);

        // Adicionando veículos ao estoque da concessionária
        concessionaria.adicionarVeiculo(carro1);
        concessionaria.adicionarVeiculo(carro2);
        concessionaria.adicionarVeiculo(carro3);
        concessionaria.adicionarVeiculo(carro4);

        //Atualização da concessionaria com os novos carros
        System.out.println(concessionaria);

        // Criação de um cliente
        Cliente cliente = new Cliente("João", "123.456.789-00");

        // Simulação de venda de um veículo
        concessionaria.venderVeiculo(cliente, carro1); // Cliente João compra o Corolla
        cliente.comprarVeiculo(carro1);

        // Exibe o carro comprado pelo cliente
        System.out.println("Carro comprado por " + cliente.getNome() + "\n\n" + cliente.getVeiculoComprado());

        //Atualização da concessionaria depois de vender um veiculo
        System.out.println(concessionaria);
    }
}


