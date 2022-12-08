import java.util.ArrayList;

public class EtapaMundial {

    private String descripcionEtapa;
    private ArrayList<Partido> partidos;
    public ArrayList<Equipo> EquiposQueAvanzan;

    public String getDescripcionEtapa() {
        return descripcionEtapa;
    }

    public void setDescripcionEtapa(String descripcionEtapa) {
        this.descripcionEtapa = descripcionEtapa;


    }
    EtapaMundial(){
        this.setPartidos(new ArrayList<Partido>());
    }

    public void addPartido(Partido partido){
        this.partidos.add(partido);
        return;
    }
    public ArrayList<Partido> getPartidos() {
        return partidos;
    }

    public void setPartidos(ArrayList<Partido> partidos) {
        this.partidos = partidos;
    }


    public ArrayList<Equipo> getEquiposQueAvanzan() {
        return EquiposQueAvanzan;
    }

    public void setEquiposQueAvanzan(ArrayList<Equipo> equiposQueAvanzan) {
        EquiposQueAvanzan = equiposQueAvanzan;
    }
}