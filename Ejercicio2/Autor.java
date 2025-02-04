public class Autor extends Persona {
    public String profesion;
    public String editorial;
    

    public Autor(String profesion, String editorial, String nombre, int documento, String email) {
        this.profesion = profesion;
        this.editorial =editorial;
        super(nombre, documento, email);
    }
}
