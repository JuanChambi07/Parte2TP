import javax.swing.*;
import java.util.ArrayList;

public class Partido {
    //private Date fecha; no sabia como poner el valor date en los parametros por que me lo tomaba como int
    private int fecha;
    private String local;
    private String visitante;
    private Resultado resultado;

    //private ArrayList<Equipo> partidos;



    Partido(){

    }
    Partido(int fecha, String equipo1,String equipo2){
        this.setFecha(fecha);
        this.setLocal(equipo1);
        this.setVisitante(equipo2);
    }

    public Resultado getResultado() {
        return resultado;
    }

    public void setResultado(Resultado resultado) {
        this.resultado = resultado;
    }


    public int getFecha() {
        return fecha;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }


    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getVisitante() {
        return visitante;
    }

    public void setVisitante(String visitante) {
        this.visitante = visitante;
    }

       /* public Partido ts(Partido aaa ) {
        Equipo a = new Equipo();
            aaa.getLocal();
            aaa.getFecha();
        aaa.getVisitante();
            a.addPartidoHecho(aaa);
    return aaa;
*/



}
