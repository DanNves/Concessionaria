import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Criando concessionaria
        Concessionaria concessionaria = new Concessionaria("CarrosDan","Avenida do Chamego",
                "(71) 9 3251 - 6950","carrosdan@gmail.com","69.726.801/0001-35");
        System.out.println(concessionaria.toString());
        System.out.println();

        //Criando alguns carros
        Veiculo carro1 = new Veiculo("Volkswagen", "Gol", 2023,
                "Prata", 50000.0, true, TipoCombustivel.GASOLINA, "ABC1234", 0, true);
        Veiculo carro2 = new Veiculo("Toyota", "Corolla", 2022,
                "Preto", 80000.0, true, TipoCombustivel.FLEX, "DEF5678", 10000, false);
        Veiculo moto1 = new Veiculo("Honda", "CG 160", 2021,
                "Vermelho", 12000.0, true, TipoCombustivel.GASOLINA, "GHI7890", 5000, false);


        concessionaria.adicionarVeiculo(carro1);
        concessionaria.adicionarVeiculo(carro2);
        concessionaria.adicionarVeiculo(moto1);
        //concessionaria.removerVeiculo(moto1);

        Cliente c1 = new Cliente("João","joaozinho@gmail.com","001.585.988-30",
                "Rua dos Passáros","(71) 9 99999-8888","Nenhuma");
        c1.adicionarVeiculo(moto1);
        c1.adicionarVeiculo(carro1);
        c1.getVeiculosComprados();

        //Listando os veiculos da concessionaria
        List<Veiculo> estoque = concessionaria.listarVeiculos();
        for(Veiculo veiculo : estoque){
            System.out.println(veiculo);
        }
        System.out.println();
        System.out.println(concessionaria.toString());

        System.out.println(c1.toString() +" \n "+ c1.getVeiculosComprados());

        System.out.println();
        concessionaria.removerVeiculo(carro1);
        concessionaria.removerVeiculo(moto1);
        System.out.println(concessionaria.toString());
    }

}