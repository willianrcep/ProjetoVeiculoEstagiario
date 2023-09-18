package uniderp.loo.dominio;

public class Motocicleta extends BaseVeiculo{
    
    protected int cilindrada;

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public Motocicleta(int codigo, String nome, String modelo, String cor, int anoFabricacao, int eixos,
            double pesoLiquido, double pesoTotal, String fabricante, double potencia, String tipoCombustivel,
            String nomeProprietario, String estadoUF, String cidadeUF, String tipoVeiculo, String codigoRenavam,
            String chassi, String placa, int portas, int rodas, int anoModelo, int cilindrada) {
        super(codigo, nome, modelo, cor, anoFabricacao, eixos, pesoLiquido, pesoTotal, fabricante, potencia,
                tipoCombustivel, nomeProprietario, estadoUF, cidadeUF, tipoVeiculo, codigoRenavam, chassi, placa,
                portas, rodas, anoModelo);
        this.cilindrada = cilindrada;
    }

    
}
