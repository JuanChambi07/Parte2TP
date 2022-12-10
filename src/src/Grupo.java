import java.util.ArrayList;

public class Grupo extends EtapaMundial {
    private ArrayList<Equipo> equiposQueAvanzan;
    private ArrayList<Equipo> grupo1;
    private ArrayList<Equipo> grupo2;
    private ArrayList<Equipo> grupo3;
    private ArrayList<Equipo> grupo4;
    public Resultado calcular;
//yo sabia que tenia que crear un array para los puntos de cada grupo pero no sabia como implementarlo
    public int puntosSenegal;
    public int puntosEcuador;
    public int puntosCatar;
    public int puntosInglaterra;
    //crear un array para cada puntos de cada equipo
    public int puntosIran;
    public int puntosGales;
    public int puntosPolonia;
    public int puntosMexico;
    public int puntosFrancia;
    public int puntosAustralia;
    public int puntosAlemania;
    public int puntosCroacial;
    public int puntosArgentina;
    public int puntosCanadá;
    public int puntosMarruecos;
    public int puntosBélgica;

    private ArrayList<Integer> puntos;
    private Resultado traer;
    public String e;

    @Override
    public void setEquiposQueAvanzan(ArrayList<Equipo> equiposQueAvanzan) {
        this.equiposQueAvanzan = equiposQueAvanzan;
    }
    public ArrayList<Equipo> getEquiposQueAvanzan() {
        return equiposQueAvanzan;
    }


    public ArrayList<Equipo> getGrupo2() {
        return grupo2;
    }

    public ArrayList<Equipo> getGrupo1() {
        return grupo1;
    }

    public ArrayList<Equipo> getGrupo3() {
        return grupo3;
    }

    public ArrayList<Equipo> getGrupo4() {
        return grupo4;
    }
    public ArrayList<Integer> getPuntos() {
        return puntos;
    }

    public void setGrupo1(ArrayList<Equipo> grupo1) {
        this.grupo1 = grupo1;
    }

    public void setGrupo2(ArrayList<Equipo> grupo2) {
        this.grupo2 = grupo2;
    }

    public void setGrupo3(ArrayList<Equipo> grupo3) {
        this.grupo3 = grupo3;
    }

    public void setGrupo4(ArrayList<Equipo> grupo4) {
        this.grupo4 = grupo4;
    }


    Grupo(){
    this.setGrupo1(new ArrayList<Equipo>());
        this.setGrupo2(new ArrayList<Equipo>());
        this.setGrupo3(new ArrayList<Equipo>());
        this.setGrupo4(new ArrayList<Equipo>());


        //this.setPuntos(new ArrayList<Integer>()); al momento de realizar el array de puntos y añadirle cosas me tiraba error de que el indice 0 era incorrecto para la longitud 0
    }
    public void agregarGrupo(Equipo equipos){
        this.grupo1.add(equipos);
        return;
    }
    public void agregarGrupo2(Equipo equipos){
        this.grupo2.add(equipos);
        return;}
    public void agregarGrupo3(Equipo equipos){
        this.grupo3.add(equipos);
        return;}
    public void agregarGrupo4(Equipo equipos){
        this.grupo4.add(equipos);
        return;}
    public void agregarEquipoAva(Equipo equipo){
        this.equiposQueAvanzan.add(equipo);
    }

    /*public void addPuntos(Integer num){
        this.puntos.add(num);
    }*/
    public String  mensajeGrupo(Grupo g){
    calcular = new Resultado();
        System.out.println(String.format("%s", "ELIMINATORIAS:"));
    //se que debe haber una manera mucho mas facil de hacer esto y talvez sea haciendo una matriz para que se vaya recorriendo de manera automatica con un for pero no se como implementrarlo de manera correcta
        for (int i = 1; i <= 24; i++) {
            switch (i){
                case 1:
                    System.out.println(String.format("%s  %s %s", g.getGrupo1().get(0).getEquipo1(),"-",g.getGrupo1().get(0).getEquipo2()));
                     calcular.ganoLocal();
                    if (calcular.goLocal>calcular.golVisit){
                        this.puntosSenegal+= 1;
                    } else {
                        this.puntosEcuador+= 1;
                    }
                    break;
                case 2:
                    System.out.println(String.format("%s  %s %s", g.getGrupo1().get(0).getEquipo1(),"-",g.getGrupo1().get(0).getEquipo3()));
                    calcular.ganoLocal();
                    if (calcular.goLocal>calcular.golVisit){
                        this.puntosSenegal+= 1;
                    } else {
                        this.puntosCatar+= 1;
                    }
                    break;
                case 3:
                    System.out.println(String.format("%s  %s %s", g.getGrupo1().get(0).getEquipo1(),"-",g.getGrupo1().get(0).getEquipo4()));
                    calcular.ganoLocal();
                    if (calcular.goLocal>calcular.golVisit){
                        this.puntosSenegal+=1;
                    } else {
                        this.puntosInglaterra+= 1;
                    }
                    break;
                case 4:
                    System.out.println(String.format("%s %s %s ", g.getGrupo1().get(0).getEquipo2(),"-",g.getGrupo1().get(0).getEquipo3()));
                    calcular.ganoLocal();
                    if (calcular.goLocal>calcular.golVisit){
                        this.puntosEcuador+= 1;
                    } else {
                        this.puntosCatar+= 1;
                    }
                    break;
                case 5:
                    System.out.println(String.format("%s  %s %s ", g.getGrupo1().get(0).getEquipo2(),"-",g.getGrupo1().get(0).getEquipo4()));
                    calcular.ganoLocal();
                    if (calcular.goLocal>calcular.golVisit){
                        this.puntosEcuador+= 1;
                    } else {
                        this.puntosInglaterra+= 1;
                    }
                    break;
                case 6:
                    System.out.println(String.format("%s  %s %s ", g.getGrupo1().get(0).getEquipo3(),"-",g.getGrupo1().get(0).getEquipo4()));
                    calcular.ganoLocal();
                    if (calcular.goLocal>calcular.golVisit){
                        this.puntosCatar+= 1;
                    } else {
                        this.puntosInglaterra+= 1;
                    }
                    break;
                case 7:
                    System.out.println(String.format("%s %s %s ", g.getGrupo2().get(0).getEquipo1(),"-",g.getGrupo2().get(0).getEquipo2()));
                    calcular.ganoLocal();
                    if (calcular.goLocal>calcular.golVisit){
                        this.puntosIran+= 1;
                    } else {
                        this.puntosGales+= 1;
                    }
                    break;
                case 8:
                    System.out.println(String.format("%s  %s %s ", g.getGrupo2().get(0).getEquipo1(),"-",g.getGrupo2().get(0).getEquipo3()));
                    calcular.ganoLocal();
                    if (calcular.goLocal>calcular.golVisit){
                        this.puntosIran+= 1;
                    } else {
                        this.puntosPolonia+= 1;
                    }
                    break;
                case 9:
                    System.out.println(String.format("%s %s %s ", g.getGrupo2().get(0).getEquipo1(),"-",g.getGrupo2().get(0).getEquipo4()));
                    calcular.ganoLocal();
                    if (calcular.goLocal>calcular.golVisit){
                        this.puntosIran+= 1;
                    } else {
                        this.puntosMexico+= 1;
                    }
                    break;

                case 10:
                    System.out.println(String.format("%s %s %s ", g.getGrupo2().get(0).getEquipo2(),"-",g.getGrupo2().get(0).getEquipo3()));
                    calcular.ganoLocal();
                    if (calcular.goLocal>calcular.golVisit){
                        this.puntosGales+= 1;
                    } else {
                        this.puntosPolonia+= 1;
                    }
                    break;
                case 11:
                    System.out.println(String.format("%s %s %s ", g.getGrupo2().get(0).getEquipo2(),"-",g.getGrupo2().get(0).getEquipo4()));
                    calcular.ganoLocal();
                    if (calcular.goLocal>calcular.golVisit){
                        this.puntosGales+= 1;
                    } else {
                        this.puntosMexico+= 1;
                    }
                    break;
                case 12:
                    System.out.println(String.format("%s  %s %s ", g.getGrupo2().get(0).getEquipo3(),"-",g.getGrupo2().get(0).getEquipo4()));
                    calcular.ganoLocal();
                    if (calcular.goLocal>calcular.golVisit){
                        this.puntosPolonia+= 1;
                    } else {
                        this.puntosMexico+= 1;
                    }
                    break;

                case 13:
                    System.out.println(String.format("%s  %s %s ", g.getGrupo3().get(0).getEquipo1(),"-",g.getGrupo3().get(0).getEquipo2()));
                    calcular.ganoLocal();
                    if (calcular.goLocal>calcular.golVisit){
                        this.puntosFrancia+= 1;
                    } else {
                        this.puntosAustralia+= 1;
                    }
                    break;
                case 14:
                    System.out.println(String.format("%s  %s %s ", g.getGrupo3().get(0).getEquipo1(),"-",g.getGrupo3().get(0).getEquipo3()));
                    calcular.ganoLocal();
                    if (calcular.goLocal>calcular.golVisit){
                        this.puntosFrancia+= 1;
                    } else {
                        this.puntosAlemania+= 1;
                    }
                    break;
                case 15:
                    System.out.println(String.format("%s %s %s ", g.getGrupo3().get(0).getEquipo1(),"-",g.getGrupo3().get(0).getEquipo4()));
                    calcular.ganoLocal();
                    if (calcular.goLocal>calcular.golVisit){
                        this.puntosFrancia+= 1;
                    } else {
                        this.puntosCroacial+= 1;
                    }
                    break;
                case 16:
                    System.out.println(String.format("%s %s %s ", g.getGrupo3().get(0).getEquipo2(),"-",g.getGrupo3().get(0).getEquipo3()));
                    calcular.ganoLocal();
                    if (calcular.goLocal>calcular.golVisit){
                        this.puntosAustralia+=1;
                    } else {
                        this.puntosAlemania+= 1;
                    }
                    break;
                case 17:
                    System.out.println(String.format("%s  %s %s ", g.getGrupo3().get(0).getEquipo2(),"-",g.getGrupo3().get(0).getEquipo4()));
                    calcular.ganoLocal();
                    if (calcular.goLocal>calcular.golVisit){
                        this.puntosAustralia+= 1;
                    } else {
                        this.puntosCroacial+= 1;
                    }
                    break;
                case 18:
                    System.out.println(String.format("%s %s %s ", g.getGrupo3().get(0).getEquipo3(),"-",g.getGrupo3().get(0).getEquipo4()));
                    calcular.ganoLocal();
                    if (calcular.goLocal>calcular.golVisit){
                        this.puntosAlemania+= 1;
                    } else {
                        this.puntosCroacial+= 1;
                    }
                    break;
                case 19:
                    System.out.println(String.format("%s  %s %s ", g.getGrupo4().get(0).getEquipo1(),"-",g.getGrupo4().get(0).getEquipo2()));
                    calcular.ganoLocal();
                    if (calcular.goLocal>calcular.golVisit){
                        this.puntosArgentina+=1;
                    } else {
                        this.puntosCanadá+= 1;
                    }
                    break;
                case 20:
                    System.out.println(String.format("%s  %s %s ", g.getGrupo4().get(0).getEquipo1(),"-",g.getGrupo4().get(0).getEquipo3()));
                    calcular.ganoLocal();
                    if (calcular.goLocal>calcular.golVisit){
                        this.puntosArgentina+= 1;
                    } else {
                        this.puntosMarruecos+= 1;
                    }
                    break;
                case 21:
                    System.out.println(String.format("%s %s %s ", g.getGrupo4().get(0).getEquipo1(),"-",g.getGrupo4().get(0).getEquipo4()));
                    calcular.ganoLocal();
                    if (calcular.goLocal>calcular.golVisit){
                        this.puntosArgentina+= 1;
                    } else {
                        this.puntosBélgica+= 1;
                    }
                    break;
                case 22:
                    System.out.println(String.format("%s %s %s ", g.getGrupo4().get(0).getEquipo2(),"-",g.getGrupo4().get(0).getEquipo3()));
                    calcular.ganoLocal();
                    if (calcular.goLocal>calcular.golVisit){
                        this.puntosCanadá+= 1;
                    } else {
                        this.puntosMarruecos+= 1;
                    }
                    break;
                case 23:
                    System.out.println(String.format("%s  %s %s ", g.getGrupo4().get(0).getEquipo2(),"-",g.getGrupo4().get(0).getEquipo4()));
                    calcular.ganoLocal();
                    if (calcular.goLocal>calcular.golVisit){
                        this.puntosCanadá+= 1;
                    } else {
                        this.puntosBélgica+= 1;
                    }
                    break;
                case 24:
                    System.out.println(String.format("%s %s %s ", g.getGrupo4().get(0).getEquipo3(),"-",g.getGrupo4().get(0).getEquipo4()));
                    calcular.ganoLocal();
                    if (calcular.goLocal>calcular.golVisit){
                        this.puntosMarruecos+= 1;
                    } else {
                        this.puntosBélgica+= 1;
                    }
                    break;
            }
        }
        return "Partidos:" ;
        }






    /*public String equipo1(Grupo g,int eleccion){

            if (eleccion ==1){
            e= g.getGrupo1().get(0).getEquipo1();
            } else if (eleccion==2) {
                e= g.getGrupo1().get(1).getEquipo2();
            } else if (eleccion==3) {
                e= g.getGrupo1().get(2).getEquipo3();
            } else if (eleccion==4) {
                e= g.getGrupo1().get(3).getEquipo4();
            }
    return e;
    }



    public void setPuntos(ArrayList<Integer> puntos) {
        this.puntos = puntos;
    }*/
    public void comprobarEquipos(Llave siguente){
        if (puntosSenegal>=puntosEcuador&&puntosSenegal>puntosCatar&&puntosSenegal>puntosInglaterra&&puntosEcuador>puntosCatar&&puntosEcuador>puntosInglaterra){

        }
    }
}
