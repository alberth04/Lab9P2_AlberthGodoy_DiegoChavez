
package lab9p2_alberthgodoy_diegochavez;

public class usuario {
    //ID, usuario, nombre, contraseña, edad y correo.
    private String ID;
    private String username;
    private String nombre;
    private String contra;
    private int edad;
    private String correo;

    public usuario(String ID, String username, String nombre, String contra, int edad, String correo) {
        this.ID = ID;
        this.username = username;
        this.nombre = nombre;
        this.contra = contra;
        this.edad = edad;
        this.correo = correo;
    }

    public usuario() {
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setCorreo(String correo) {
        if (correo.matches("")) {
            
        }
        this.correo = correo;
    }

    public String getID() {
        return ID;
    }

    public String getUsername() {
        return username;
    }

    public String getNombre() {
        return nombre;
    }

    public String getContra() {
        return contra;
    }

    public int getEdad() {
        return edad;
    }

    public String getCorreo() {
        return correo;
    }

    @Override
    public String toString() {
        return "usuario{" + "ID=" + ID + ", username=" + username + ", nombre=" + nombre + ", contra=" + contra + ", edad=" + edad + ", correo=" + correo + '}';
    }
    
    
    
}
