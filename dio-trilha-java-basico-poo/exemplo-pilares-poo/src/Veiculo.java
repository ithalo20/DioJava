public abstract class Veiculo { //(Abstract)
    private String chassi; //(Herança)

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public abstract void ligar(); //(Abstract, usamos para comportamentos)
}