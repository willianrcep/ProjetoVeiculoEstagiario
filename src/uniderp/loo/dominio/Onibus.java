package uniderp.loo.dominio;

public class Onibus extends BaseVeiculo {
    
    protected int numeroFrota;

    public int getNumeroFrota() {
        return numeroFrota;
    }

    public void setNumeroFrota(int numeroFrota) {
        this.numeroFrota = numeroFrota;
    }

    public Onibus(int codigo, String nome, String modelo, String cor, int anoFabricacao, int eixos, double pesoLiquido,
            double pesoTotal, String fabricante, double potencia, String tipoCombustivel, String nomeProprietario,
            String estadoUF, String cidadeUF, String tipoVeiculo, String codigoRenavam, String chassi, String placa,
            int portas, int rodas, int anoModelo, int numeroFrota) {
        super(codigo, nome, modelo, cor, anoFabricacao, eixos, pesoLiquido, pesoTotal, fabricante, potencia,
                tipoCombustivel, nomeProprietario, estadoUF, cidadeUF, tipoVeiculo, codigoRenavam, chassi, placa,
                portas, rodas, anoModelo);
        this.numeroFrota = numeroFrota;
    }

    
       
}
