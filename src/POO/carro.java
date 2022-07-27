package POO;

public class carro {

        String marca;
        String modelo;
        String cor;
        Integer capacidadedoTanque;
        Integer ano;

    public carro(String marca, String modelo, String cor, Integer capacidadedoTanque, Integer ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.capacidadedoTanque = capacidadedoTanque;
        this.ano = ano;
    }

    public carro(String preto, int i, String urv, int i1) {
        
    }

    public carro() {

    }

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

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Integer getCapacidadedoTanque() {
        return capacidadedoTanque;
    }

    public void setCapacidadedoTanque(Integer capacidadedoTanque) {
        this.capacidadedoTanque = capacidadedoTanque;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    double totalCapacidadedoTanque(Double valorCombustivel) {
        return capacidadedoTanque * valorCombustivel;
    }
}




