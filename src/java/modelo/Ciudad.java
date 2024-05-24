package modelo;

public class Ciudad 
{
    private String nombre;
    private String capital;
    private String foto;
    private String continente;
    private int habitantes;
    
    public Ciudad(String n, String c, String f, String cnt, int h)
    {
        this.nombre = n;
        this.capital = c;
        this.foto = f;
        this.continente = cnt;
        this.habitantes = h;
    }
    
    public void setNombre(String n){this.nombre = n;}
    public void setCapital(String c){this.capital = c;}
    public void setFoto(String f){this.foto = f;}
    public void setContinente(String cnt){this.continente = cnt;}
    public void setHabitantes(int h){this.habitantes = h;}
    
    public String getNombre(){return nombre;}
    public String getCapital(){return capital;}
    public String getFoto(){return foto;}
    public String getContinente(){return continente;}
    public int getHabitantes(){return habitantes;}
    
}
