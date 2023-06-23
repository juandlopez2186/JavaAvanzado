package model;

public class BolsilloVO {
    private String idBolsillo="";
    private String nombreBolsillo="";
    private String saldoBolsillo="";
    private String estadoBolsillo="";
    public BolsilloVO() {
    }
    public BolsilloVO(String idBolsillo, String nombreBolsillo, String saldoBolsillo, String estadoBolsillo) {
        this.idBolsillo = idBolsillo;
        this.nombreBolsillo = nombreBolsillo;
        this.saldoBolsillo = saldoBolsillo;
        this.estadoBolsillo = estadoBolsillo;
    }
    public String getIdBolsillo() {
        return idBolsillo;
    }
    public void setIdBolsillo(String idBolsillo) {
        this.idBolsillo = idBolsillo;
    }
    public String getNombreBolsillo() {
        return nombreBolsillo;
    }
    public void setNombreBolsillo(String nombreBolsillo) {
        this.nombreBolsillo = nombreBolsillo;
    }
    public String getSaldoBolsillo() {
        return saldoBolsillo;
    }
    public void setSaldoBolsillo(String saldoBolsillo) {
        this.saldoBolsillo = saldoBolsillo;
    }
    public String getEstadoBolsillo() {
        return estadoBolsillo;
    }
    public void setEstadoBolsillo(String estadoBolsillo) {
        this.estadoBolsillo = estadoBolsillo;
    }

}
