import java.util.ArrayList;

public class Equipo {
    private String nombre;
   // private ArrayList<String> equipos;
    private ArrayList<Partido> partidosJugados;

    private String equipo1;
    private String equipo2;
    private String equipo3;
    private String equipo4;
    private String equipof;
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    Equipo(){
        this.setPartidosJugados(new ArrayList<Partido>());
    }
    Equipo(String equipof){
    this.setEquipof(equipof);
        this.setPartidosJugados(new ArrayList<Partido>());
    }


 /*Equipo(ArrayList<String> equipos){
     this.setEquipos(new ArrayList<String>());
        setEquipos(equipos);
     
 }*/
    Equipo(String equipo1,String equipo2,String equipo3,String equipo4){
        this.setEquipo1(equipo1);
        this.setEquipo2(equipo2);
        this.setEquipo3(equipo3);
        this.setEquipo4(equipo4);

        this.setPartidosJugados(new ArrayList<Partido>());

    }


    public ArrayList<Partido> getPartidosJugados() {
        return partidosJugados;
    }

    public void setPartidosJugados(ArrayList<Partido> partidosJugados) {
        this.partidosJugados = partidosJugados;
    }
    public void addPartidoHecho(Partido partido){
        this.partidosJugados.add(partido);
        return;
    }
    public String getEquipo1() {
        return equipo1;
    }

    public void setEquipo1(String equipo1) {
        this.equipo1 = equipo1;
    }

    public String getEquipo2() {
        return equipo2;
    }

    public void setEquipo2(String equipo2) {
        this.equipo2 = equipo2;
    }

    public String getEquipo3() {
        return equipo3;
    }

    public void setEquipo3(String equipo3) {
        this.equipo3 = equipo3;
    }

    public String getEquipo4() {
        return equipo4;
    }

    public void setEquipo4(String equipo4) {
        this.equipo4 = equipo4;
    }

    public String getEquipof() {
        return equipof;
    }

    public void setEquipof(String equipof) {
        this.equipof = equipof;
    }
}
