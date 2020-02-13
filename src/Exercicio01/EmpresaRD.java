package Exercicio01;

public class EmpresaRD {
    private String areaDeTI;
    private String areaDeADM;
    private String lojas;

    public EmpresaRD(String areaDeTI, String areaDeADM, String lojas) {
        this.areaDeTI = areaDeTI;
        this.areaDeADM = areaDeADM;
        this.lojas = lojas;
    }

    public void comem(){
        System.out.println("Estamos comendo");
    }

    public void trabalham(){
        System.out.println("Estamos trabalhando");
    }

    public String getAreaDeTI() {
        return areaDeTI;
    }

    public void setAreaDeTI(String areaDeTI) {
        this.areaDeTI = areaDeTI;
    }

    public String getAreaDeADM() {
        return areaDeADM;
    }

    public void setAreaDeADM(String areaDeADM) {
        this.areaDeADM = areaDeADM;
    }

    public String getLojas() {
        return lojas;
    }

    public void setLojas(String lojas) {
        this.lojas = lojas;
    }
}
