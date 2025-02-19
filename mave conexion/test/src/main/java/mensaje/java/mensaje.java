package mensaje.java;


public class mensaje {
    int id_mensaje;
    String mensajes;
    String autor;
    int fecha;

 public mensaje(String mensajes, String autor, int fecha){

    this.mensajes = mensajes;
    this.autor = autor;
    this.fecha = fecha;

 
 }



    public mensaje() {
    //TODO Auto-generated constructor stub
}



    public String getMensajes() {
        return mensajes;
    }
    public void setMensajes(String mensajes) {
        this.mensajes = mensajes;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public int getFecha() {
        return fecha;
    }
    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

 

}
