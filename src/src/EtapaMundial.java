import java.util.ArrayList;

public class EtapaMundial {

    private String descripcionEtapa;
    private ArrayList<Partido> partidos;
    public ArrayList<Equipo> equiposQueAvanzan;



    public String getDescripcionEtapa() {
        return descripcionEtapa;
    }


    public void setDescripcionEtapa(String descripcionEtapa) {
        this.descripcionEtapa = descripcionEtapa;


    }
    EtapaMundial(){
        this.partidos = new ArrayList<Partido>();
        this.setPartidos(new ArrayList<Partido>());
        this.setEquiposQueAvanzan(new ArrayList<Equipo>());

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
        return equiposQueAvanzan;
    }

    public void setEquiposQueAvanzan(ArrayList<Equipo> equiposQueAvanzan) {
        this.equiposQueAvanzan = equiposQueAvanzan;
    }
    public void agregarEquipoAva(Equipo equipo){
        this.equiposQueAvanzan.add(equipo);
    }
    //se que existe una manera de realizar esto con un array y ver el primer puesto de punto y segundo de puntos pero no se manipular el array de manmera correcta y no se usarlo de manera correcta o como incializarlo con un lim,ite de 4 indices
    public String comprobarEquipos(Grupo grupos){
        grupos.mensajeGrupo(grupos);
        if (grupos.puntosSenegal>=grupos.puntosEcuador&&grupos.puntosSenegal>grupos.puntosCatar&&grupos.puntosSenegal>grupos.puntosInglaterra||grupos.puntosEcuador>grupos.puntosSenegal&&grupos.puntosEcuador>grupos.puntosCatar&&grupos.puntosEcuador>grupos.puntosInglaterra){
            this.agregarEquipoAva(new Equipo(grupos.getGrupo1().get(0).getEquipo1()));
            this.agregarEquipoAva(new Equipo(grupos.getGrupo1().get(0).getEquipo2()));

        }else if(grupos.puntosSenegal>=grupos.puntosCatar&&grupos.puntosSenegal>grupos.puntosEcuador&&grupos.puntosSenegal>grupos.puntosInglaterra||grupos.puntosCatar> grupos.puntosSenegal&&grupos.puntosCatar>grupos.puntosEcuador&&grupos.puntosCatar >grupos.puntosInglaterra){
            this.agregarEquipoAva(new Equipo(grupos.getGrupo1().get(0).getEquipo1()));
            this.agregarEquipoAva(new Equipo(grupos.getGrupo1().get(0).getEquipo3()));

        } else if (grupos.puntosSenegal>=grupos.puntosInglaterra&&grupos.puntosSenegal>grupos.puntosEcuador&&grupos.puntosSenegal>grupos.puntosCatar||grupos.puntosInglaterra> grupos.puntosSenegal&&grupos.puntosInglaterra>grupos.puntosEcuador&&grupos.puntosInglaterra>grupos.puntosCatar) {
            this.agregarEquipoAva(new Equipo(grupos.getGrupo1().get(0).getEquipo1()));
            this.agregarEquipoAva(new Equipo(grupos.getGrupo1().get(0).getEquipo4()));
        } else if (grupos.puntosEcuador>=grupos.puntosCatar&&grupos.puntosEcuador>grupos.puntosSenegal&&grupos.puntosEcuador>grupos.puntosInglaterra||grupos.puntosCatar> grupos.puntosEcuador&&grupos.puntosCatar>grupos.puntosSenegal&&grupos.puntosCatar >grupos.puntosInglaterra) {
            this.agregarEquipoAva(new Equipo(grupos.getGrupo1().get(0).getEquipo2()));
            this.agregarEquipoAva(new Equipo(grupos.getGrupo1().get(0).getEquipo3()));
        } else if (grupos.puntosEcuador>=grupos.puntosInglaterra&&grupos.puntosEcuador>grupos.puntosSenegal&&grupos.puntosEcuador>grupos.puntosCatar||grupos.puntosInglaterra> grupos.puntosEcuador&&grupos.puntosInglaterra>grupos.puntosSenegal&&grupos.puntosInglaterra >grupos.puntosCatar) {
            this.agregarEquipoAva(new Equipo(grupos.getGrupo1().get(0).getEquipo2()));
            this.agregarEquipoAva(new Equipo(grupos.getGrupo1().get(0).getEquipo4()));
        } else if (grupos.puntosCatar>=grupos.puntosInglaterra&&grupos.puntosCatar>grupos.puntosSenegal&&grupos.puntosCatar>grupos.puntosEcuador||grupos.puntosInglaterra> grupos.puntosCatar&&grupos.puntosInglaterra>grupos.puntosSenegal&&grupos.puntosInglaterra >grupos.puntosEcuador) {
            this.agregarEquipoAva(new Equipo(grupos.getGrupo1().get(0).getEquipo3()));
            this.agregarEquipoAva(new Equipo(grupos.getGrupo1().get(0).getEquipo4()));

        }
        if(grupos.puntosIran>=grupos.puntosGales&&grupos.puntosIran>grupos.puntosPolonia&&grupos.puntosIran>grupos.puntosMexico||grupos.puntosGales> grupos.puntosIran&&grupos.puntosGales>grupos.puntosPolonia&&grupos.puntosGales >grupos.puntosMexico){
            this.agregarEquipoAva(new Equipo(grupos.getGrupo2().get(0).getEquipo1()));
            this.agregarEquipoAva(new Equipo(grupos.getGrupo2().get(0).getEquipo2()));
        } else if (grupos.puntosIran>=grupos.puntosPolonia&&grupos.puntosIran>grupos.puntosGales&&grupos.puntosIran>grupos.puntosMexico||grupos.puntosPolonia> grupos.puntosIran&&grupos.puntosPolonia>grupos.puntosGales&&grupos.puntosPolonia >grupos.puntosMexico) {
            this.agregarEquipoAva(new Equipo(grupos.getGrupo2().get(0).getEquipo1()));
            this.agregarEquipoAva(new Equipo(grupos.getGrupo2().get(0).getEquipo3()));
        } else if (grupos.puntosIran>=grupos.puntosMexico&&grupos.puntosIran>grupos.puntosGales&&grupos.puntosIran>grupos.puntosPolonia||grupos.puntosMexico> grupos.puntosIran&&grupos.puntosMexico>grupos.puntosGales&&grupos.puntosMexico >grupos.puntosPolonia) {
            this.agregarEquipoAva(new Equipo(grupos.getGrupo2().get(0).getEquipo1()));
            this.agregarEquipoAva(new Equipo(grupos.getGrupo2().get(0).getEquipo4()));
        } else if (grupos.puntosGales>=grupos.puntosPolonia&&grupos.puntosGales>grupos.puntosIran&&grupos.puntosGales>grupos.puntosMexico||grupos.puntosPolonia> grupos.puntosGales&&grupos.puntosPolonia>grupos.puntosIran&&grupos.puntosPolonia >grupos.puntosMexico) {
            this.agregarEquipoAva(new Equipo(grupos.getGrupo2().get(0).getEquipo2()));
            this.agregarEquipoAva(new Equipo(grupos.getGrupo2().get(0).getEquipo3()));
        } else if (grupos.puntosGales>=grupos.puntosMexico&&grupos.puntosGales>grupos.puntosIran&&grupos.puntosGales>grupos.puntosPolonia||grupos.puntosMexico> grupos.puntosGales&&grupos.puntosMexico>grupos.puntosIran&&grupos.puntosMexico >grupos.puntosPolonia) {
            this.agregarEquipoAva(new Equipo(grupos.getGrupo2().get(0).getEquipo2()));
            this.agregarEquipoAva(new Equipo(grupos.getGrupo2().get(0).getEquipo4()));
        } else if (grupos.puntosPolonia>=grupos.puntosMexico&&grupos.puntosPolonia>grupos.puntosIran&&grupos.puntosPolonia>grupos.puntosGales||grupos.puntosMexico> grupos.puntosPolonia&&grupos.puntosMexico>grupos.puntosIran&&grupos.puntosMexico >grupos.puntosGales) {
            this.agregarEquipoAva(new Equipo(grupos.getGrupo2().get(0).getEquipo3()));
            this.agregarEquipoAva(new Equipo(grupos.getGrupo2().get(0).getEquipo4()));
        }
        if (grupos.puntosFrancia>=grupos.puntosAustralia&&grupos.puntosFrancia>grupos.puntosAlemania&&grupos.puntosFrancia>grupos.puntosCroacial||grupos.puntosAustralia> grupos.puntosFrancia&&grupos.puntosAustralia>grupos.puntosAlemania&&grupos.puntosAustralia >grupos.puntosCroacial) {
            this.agregarEquipoAva(new Equipo(grupos.getGrupo3().get(0).getEquipo1()));
            this.agregarEquipoAva(new Equipo(grupos.getGrupo3().get(0).getEquipo2()));
        } else if (grupos.puntosFrancia>=grupos.puntosAlemania&&grupos.puntosFrancia>grupos.puntosAustralia&&grupos.puntosFrancia>grupos.puntosCroacial||grupos.puntosAlemania> grupos.puntosFrancia&&grupos.puntosAlemania>grupos.puntosAustralia&&grupos.puntosAlemania >grupos.puntosCroacial) {
            this.agregarEquipoAva(new Equipo(grupos.getGrupo3().get(0).getEquipo1()));
            this.agregarEquipoAva(new Equipo(grupos.getGrupo3().get(0).getEquipo3()));
        } else if (grupos.puntosFrancia>=grupos.puntosCroacial&&grupos.puntosFrancia>grupos.puntosAustralia&&grupos.puntosFrancia>grupos.puntosAlemania||grupos.puntosCroacial> grupos.puntosFrancia&&grupos.puntosCroacial>grupos.puntosAustralia&&grupos.puntosCroacial >grupos.puntosAlemania) {
            this.agregarEquipoAva(new Equipo(grupos.getGrupo3().get(0).getEquipo1()));
            this.agregarEquipoAva(new Equipo(grupos.getGrupo3().get(0).getEquipo4()));
        } else if (grupos.puntosAustralia>=grupos.puntosAlemania&&grupos.puntosAustralia>grupos.puntosFrancia&&grupos.puntosAustralia>grupos.puntosCroacial||grupos.puntosAlemania> grupos.puntosAustralia&&grupos.puntosAlemania>grupos.puntosFrancia&&grupos.puntosAlemania >grupos.puntosCroacial) {
            this.agregarEquipoAva(new Equipo(grupos.getGrupo3().get(0).getEquipo2()));
            this.agregarEquipoAva(new Equipo(grupos.getGrupo3().get(0).getEquipo3()));
        } else if (grupos.puntosAustralia>=grupos.puntosCroacial&&grupos.puntosAustralia>grupos.puntosFrancia&&grupos.puntosAustralia>grupos.puntosAlemania||grupos.puntosCroacial> grupos.puntosAustralia&&grupos.puntosCroacial>grupos.puntosFrancia&&grupos.puntosCroacial >grupos.puntosAlemania) {
            this.agregarEquipoAva(new Equipo(grupos.getGrupo3().get(0).getEquipo2()));
            this.agregarEquipoAva(new Equipo(grupos.getGrupo3().get(0).getEquipo4()));
        } else if (grupos.puntosAlemania>=grupos.puntosCroacial&&grupos.puntosAlemania>grupos.puntosFrancia&&grupos.puntosAlemania>grupos.puntosAustralia||grupos.puntosCroacial> grupos.puntosAlemania&&grupos.puntosCroacial>grupos.puntosFrancia&&grupos.puntosCroacial >grupos.puntosAustralia) {
            this.agregarEquipoAva(new Equipo(grupos.getGrupo3().get(0).getEquipo3()));
            this.agregarEquipoAva(new Equipo(grupos.getGrupo3().get(0).getEquipo4()));
        } 
        if (grupos.puntosArgentina>=grupos.puntosCanadá&&grupos.puntosArgentina>grupos.puntosMarruecos&&grupos.puntosArgentina>grupos.puntosBélgica||grupos.puntosCanadá> grupos.puntosArgentina&&grupos.puntosCanadá>grupos.puntosMarruecos&&grupos.puntosCanadá >grupos.puntosBélgica){
            this.agregarEquipoAva(new Equipo(grupos.getGrupo4().get(0).getEquipo1()));
            this.agregarEquipoAva(new Equipo(grupos.getGrupo4().get(0).getEquipo2()));
        } else if (grupos.puntosArgentina>=grupos.puntosMarruecos&&grupos.puntosArgentina>grupos.puntosCanadá&&grupos.puntosArgentina>grupos.puntosBélgica||grupos.puntosMarruecos>grupos.puntosArgentina&&grupos.puntosMarruecos>grupos.puntosCanadá&&grupos.puntosMarruecos >grupos.puntosBélgica) {
            this.agregarEquipoAva(new Equipo(grupos.getGrupo4().get(0).getEquipo1()));
            this.agregarEquipoAva(new Equipo(grupos.getGrupo4().get(0).getEquipo3()));
        } else if (grupos.puntosArgentina>=grupos.puntosBélgica&&grupos.puntosArgentina>grupos.puntosCanadá&&grupos.puntosArgentina>grupos.puntosMarruecos||grupos.puntosBélgica>grupos.puntosArgentina&&grupos.puntosBélgica>grupos.puntosCanadá&&grupos.puntosBélgica >grupos.puntosMarruecos) {
            this.agregarEquipoAva(new Equipo(grupos.getGrupo4().get(0).getEquipo1()));
            this.agregarEquipoAva(new Equipo(grupos.getGrupo4().get(0).getEquipo4()));
        } else if (grupos.puntosCanadá>=grupos.puntosMarruecos&&grupos.puntosCanadá>grupos.puntosMarruecos&&grupos.puntosCanadá>grupos.puntosBélgica||grupos.puntosMarruecos>grupos.puntosCanadá&&grupos.puntosMarruecos>grupos.puntosArgentina&&grupos.puntosMarruecos >grupos.puntosBélgica) {
            this.agregarEquipoAva(new Equipo(grupos.getGrupo4().get(0).getEquipo2()));
            this.agregarEquipoAva(new Equipo(grupos.getGrupo4().get(0).getEquipo3()));
        } else if (grupos.puntosCanadá>=grupos.puntosBélgica&&grupos.puntosCanadá>grupos.puntosArgentina&&grupos.puntosCanadá>grupos.puntosMarruecos||grupos.puntosBélgica> grupos.puntosCanadá&&grupos.puntosBélgica>grupos.puntosArgentina&&grupos.puntosBélgica >grupos.puntosMarruecos) {
            this.agregarEquipoAva(new Equipo(grupos.getGrupo4().get(0).getEquipo2()));
            this.agregarEquipoAva(new Equipo(grupos.getGrupo4().get(0).getEquipo4()));
        } else if (grupos.puntosMarruecos>=grupos.puntosBélgica&&grupos.puntosMarruecos>grupos.puntosArgentina&&grupos.puntosMarruecos>grupos.puntosCanadá||grupos.puntosBélgica> grupos.puntosMarruecos&&grupos.puntosBélgica>grupos.puntosArgentina&&grupos.puntosBélgica >grupos.puntosCanadá) {
            this.agregarEquipoAva(new Equipo(grupos.getGrupo4().get(0).getEquipo3()));
            this.agregarEquipoAva(new Equipo(grupos.getGrupo4().get(0).getEquipo4()));
        }
        for (int i = 0; i < 8; i++) {
            System.out.println(String.format("%s %s ", "equipos que avanzan :" ,getEquiposQueAvanzan().get(i).getEquipof()));
        }



        return "";
    }


}