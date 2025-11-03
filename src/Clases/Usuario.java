package Clases;

public class Usuario {
    private String correo;
    private Pais pais;
    private Plataforma plataforma;

    public Usuario(){
        setCorreo("juan.perez@example.com");
        setPais("España");
        setPlataforma("Windows");
    }


    public Usuario(String correo, String pais, String plataforma) {
        setCorreo(correo);
        setPais(pais);
        setPlataforma(plataforma);
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(String pais) {
        switch (pais) {
            case "España" -> this.pais=Pais.España;
            case "Francia"  -> this.pais=Pais.Francia;
            case "Italia"  -> this.pais=Pais.Italia;
            case "Alemania"  -> this.pais=Pais.Alemania;
            default ->  this.pais=Pais.España;
        }
    }

    public Plataforma getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        switch (plataforma) {
            case "Windows" -> this.plataforma=Plataforma.Windows;
            case "MacOS"  -> this.plataforma=Plataforma.MacOS;
            case "Linux"  -> this.plataforma=Plataforma.Linux;
            default ->  this.plataforma=Plataforma.Windows;
        }
    }
}
