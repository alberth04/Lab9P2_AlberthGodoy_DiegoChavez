
package lab9p2_alberthgodoy_diegochavez;


public class idiomas {
    private int ID;
    private String idioma;

    public idiomas(int ID, String idioma) {
        this.ID = ID;
        this.idioma = idioma;
    }

    public idiomas() {
    }

    public int getID() {
        return ID;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    @Override
    public String toString() {
        return "idiomas{" + "ID=" + ID + ", idioma=" + idioma + '}';
    }
    
          
}
