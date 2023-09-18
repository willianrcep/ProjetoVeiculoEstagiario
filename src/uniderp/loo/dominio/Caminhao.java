package uniderp.loo.dominio;

public class Caminhao extends BaseVeiculo{
    
    protected String tipoImplemento;

    public String getTipoImplemento() {
        return tipoImplemento;
    }

    public void setTipoImplemento(String tipoImplemento) {
        this.tipoImplemento = tipoImplemento;
    }

    public Caminhao(int codigo, String nome, String modelo, String cor, int anoFabricacao, int eixos,
            double pesoLiquido, double pesoTotal, String fabricante, double potencia, String tipoCombustivel,
            String nomeProprietario, String estadoUF, String cidadeUF, String tipoVeiculo, String codigoRenavam,
            String chassi, String placa, int portas, int rodas, int anoModelo, String tipoImplemento) {
        super(codigo, nome, modelo, cor, anoFabricacao, eixos, pesoLiquido, pesoTotal, fabricante, potencia,
                tipoCombustivel, nomeProprietario, estadoUF, cidadeUF, tipoVeiculo, codigoRenavam, chassi, placa,
                portas, rodas, anoModelo);
        this.tipoImplemento = tipoImplemento;
    }

    

}
