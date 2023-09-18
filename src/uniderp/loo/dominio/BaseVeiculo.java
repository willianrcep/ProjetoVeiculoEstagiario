package uniderp.loo.dominio;

public abstract class BaseVeiculo extends BaseDadosComuns {
    
    protected String codigoRenavam;
    protected String chassi;
    protected String placa;
    protected int portas;
    protected int rodas;
    protected int anoModelo;
    
    public String getCodigoRenavam() {
        return codigoRenavam;
    }
    public void setCodigoRenavam(String codigoRenavam) {
        this.codigoRenavam = codigoRenavam;
    }
    public String getChassi() {
        return chassi;
    }
    public void setChassi(String chassi) {
        this.chassi = chassi;
    }
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public int getPortas() {
        return portas;
    }
    public void setPortas(int portas) {
        this.portas = portas;
    }
    public int getRodas() {
        return rodas;
    }
    public void setRodas(int rodas) {
        this.rodas = rodas;
    }
    public int getAnoModelo() {
        return anoModelo;
    }
    public void setAnoModelo(int anoModelo) {
        this.anoModelo = anoModelo;
    }
    public BaseVeiculo(int codigo, String nome, String modelo, String cor, int anoFabricacao, int eixos,
            double pesoLiquido, double pesoTotal, String fabricante, double potencia, String tipoCombustivel,
            String nomeProprietario, String estadoUF, String cidadeUF, String tipoVeiculo, String codigoRenavam,
            String chassi, String placa, int portas, int rodas, int anoModelo) {
        super(codigo, nome, modelo, cor, anoFabricacao, eixos, pesoLiquido, pesoTotal, fabricante, potencia,
                tipoCombustivel, nomeProprietario, estadoUF, cidadeUF, tipoVeiculo);
        this.codigoRenavam = codigoRenavam;
        this.chassi = chassi;
        this.placa = placa;
        this.portas = portas;
        this.rodas = rodas;
        this.anoModelo = anoModelo;
    }
    
    
}
