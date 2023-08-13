public class Provincia {

    private String nomeProvincia;
    private localizacao localizacao ;
    private  float tempmin;
    private float tempmax;
    private  int quantHabitantes ;

    private  Provincia proxima ;

    public Provincia() {

    }


    public String getNomeProvincia() {
        return nomeProvincia;
    }

    public void setNomeProvincia(String nomeProvincia) {
        this.nomeProvincia = nomeProvincia;
    }

    public localizacao getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(localizacao localizacao) {
        this.localizacao = localizacao;
    }

    public float getTempmin() {
        return tempmin;
    }

    public void setTempmin(float tempmin) {
        this.tempmin = tempmin;
    }

    public float getTempmax() {
        return tempmax;
    }

    public void setTempmax(float tempmax) {
        this.tempmax = tempmax;
    }

    public int getQuantHabitantes() {
        return quantHabitantes;
    }

    public void setQuantHabitantes(int quantHabitantes) {
        this.quantHabitantes = quantHabitantes;
    }

    public Provincia getProxima() {
        return proxima;
    }

    public void setProxima(Provincia proxima) {
        this.proxima = proxima;
    }

    public Provincia(String nomeProvincia, localizacao localizacao, float tempmin, float tempmax, int quantHabitantes, Provincia proxima) {
        this.nomeProvincia = nomeProvincia;
        this.localizacao = localizacao;
        this.tempmin = tempmin;
        this.tempmax = tempmax;
        this.quantHabitantes = quantHabitantes;
        this.proxima = proxima;
    }
}
