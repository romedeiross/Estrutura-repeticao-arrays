package POO;
public class testeCarro {
    public static void main(String[] args) {
        carro c1 = new carro();

        c1.setCor("verde");
        c1.setAno(2020);
        c1.setMarca("HB20");
        c1.setCapacidadedoTanque(80);

        System.out.println(c1.getCor());
        System.out.println(c1.getAno());
        System.out.println(c1.getMarca());
        System.out.println(c1.getCapacidadedoTanque());
        System.out.println(c1.totalCapacidadedoTanque( 6.50));

        System.out.println("***********************************************************");

        carro c2 = new carro();

        c2.setCor("Preta");
        c2.setAno( 2020);
        c2.setMarca("HB20");
        c2.setCapacidadedoTanque(100);

        System.out.println("Cor: " + c2.getCor());
        System.out.println("Ano: " + c2.getAno());
        System.out.println("Marca: " + c2.getMarca());
        System.out.println("Capacidade do Tanque: " + c2.getCapacidadedoTanque() + " Litros ");
        System.out.println("Valor total do tanque cheio R$ " + c2.totalCapacidadedoTanque( 6.50));

    }
}
