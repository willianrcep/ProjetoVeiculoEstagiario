package uniderp.loo.dominio;

public class Carro extends BaseVeiculo{
    
    protected String direcao;

    public String getDirecao() {
        return direcao;
    }

    public void setDirecao(String direcao) {
        this.direcao = direcao;
    }

    public Carro(int codigo, String nome, String modelo, String cor, int anoFabricacao, int eixos, double pesoLiquido,
            double pesoTotal, String fabricante, double potencia, String tipoCombustivel, String nomeProprietario,
            String estadoUF, String cidadeUF, String tipoVeiculo, String codigoRenavam, String chassi, String placa,
            int portas, int rodas, int anoModelo, String direcao) {
        super(codigo, nome, modelo, cor, anoFabricacao, eixos, pesoLiquido, pesoTotal, fabricante, potencia,
                tipoCombustivel, nomeProprietario, estadoUF, cidadeUF, tipoVeiculo, codigoRenavam, chassi, placa,
                portas, rodas, anoModelo);
        this.direcao = direcao;
    }

    
}
