import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {


       Equipo equipos = new Equipo();


       Grupo grupos = new Grupo();
        //Equipo equipo1 = new Equipo("Senegal","Ecuador","Catar ","Inglaterra")):
       grupos.agregarGrupo(new Equipo("Senegal","Ecuador","Catar ","Inglaterra"));
        grupos.agregarGrupo2(new Equipo("Irán","Gales","Polonia ","México"));
        grupos.agregarGrupo3(new Equipo("Francia","Australia","Alemania","Croacia"));
     grupos.agregarGrupo4(new Equipo("Argentina","Canadá","Marruecos","Bélgica"));


        Llave etapa1 = new Llave();

        Partido partido1 = new Partido(3/2/2,grupos.getGrupo1().get(0).getEquipo1(),grupos.getGrupo1().get(0).getEquipo2());
        Partido partido2 = new Partido(4/2/2,grupos.getGrupo1().get(0).getEquipo1(),grupos.getGrupo1().get(0).getEquipo3());
        Partido partido3 = new Partido(5/2/2,grupos.getGrupo1().get(0).getEquipo1(),grupos.getGrupo1().get(0).getEquipo4());
        Partido partido4 = new Partido(6/2/2,grupos.getGrupo1().get(0).getEquipo2(),grupos.getGrupo1().get(0).getEquipo3());
        Partido partido5 = new Partido(7/2/2,grupos.getGrupo1().get(0).getEquipo2(),grupos.getGrupo1().get(0).getEquipo4());
        Partido partido6 = new Partido(8/2/2,grupos.getGrupo1().get(0).getEquipo3(),grupos.getGrupo1().get(0).getEquipo4());
        Partido partido7 = new Partido(9/2/2,grupos.getGrupo2().get(0).getEquipo1(),grupos.getGrupo2().get(0).getEquipo2());
        Partido partido8 = new Partido(10/2/2,grupos.getGrupo2().get(0).getEquipo1(),grupos.getGrupo2().get(0).getEquipo3());
        Partido partido9 = new Partido(11/2/2,grupos.getGrupo2().get(0).getEquipo1(),grupos.getGrupo2().get(0).getEquipo4());
        Partido partido10 = new Partido(12/2/2,grupos.getGrupo2().get(0).getEquipo2(),grupos.getGrupo2().get(0).getEquipo3());
        Partido partido11 = new Partido(13/2/2,grupos.getGrupo2().get(0).getEquipo2(),grupos.getGrupo2().get(0).getEquipo4());
        Partido partido12 = new Partido(14/2/2,grupos.getGrupo2().get(0).getEquipo3(),grupos.getGrupo2().get(0).getEquipo4());
        Partido partido13 = new Partido(15/2/2,grupos.getGrupo3().get(0).getEquipo1(),grupos.getGrupo3().get(0).getEquipo2());
        Partido partido14 = new Partido(16/2/2,grupos.getGrupo3().get(0).getEquipo1(),grupos.getGrupo3().get(0).getEquipo3());
        Partido partido15 = new Partido(17/2/2,grupos.getGrupo3().get(0).getEquipo1(),grupos.getGrupo3().get(0).getEquipo4());
        Partido partido16 = new Partido(18/2/2,grupos.getGrupo3().get(0).getEquipo2(),grupos.getGrupo3().get(0).getEquipo3());
        Partido partido17 = new Partido(19/2/2,grupos.getGrupo3().get(0).getEquipo2(),grupos.getGrupo3().get(0).getEquipo4());
        Partido partido18 = new Partido(20/2/2,grupos.getGrupo3().get(0).getEquipo3(),grupos.getGrupo3().get(0).getEquipo4());
     Partido partido19 = new Partido(21/2/2,grupos.getGrupo4().get(0).getEquipo1(),grupos.getGrupo4().get(0).getEquipo2());
     Partido partido20 = new Partido(22/2/2,grupos.getGrupo4().get(0).getEquipo1(),grupos.getGrupo4().get(0).getEquipo3());
     Partido partido21 = new Partido(30/2/2,grupos.getGrupo4().get(0).getEquipo1(),grupos.getGrupo4().get(0).getEquipo4());
     Partido partido22 = new Partido(30/2/2,grupos.getGrupo4().get(0).getEquipo2(),grupos.getGrupo4().get(0).getEquipo3());
     Partido partido23 = new Partido(30/2/2,grupos.getGrupo4().get(0).getEquipo2(),grupos.getGrupo4().get(0).getEquipo4());
     Partido partido24 = new Partido(30/2/2,grupos.getGrupo4().get(0).getEquipo3(),grupos.getGrupo4().get(0).getEquipo4());




    System.out.println(etapa1.todo(grupos));

//al momento de ejecutar esto me surge un error que dice que el valor es nulo pero no entiendo porque si estoy pasando el objeto partido
        equipos.addPartidoHecho(partido1);
        equipos.addPartidoHecho(partido2);
        equipos.addPartidoHecho(partido3);
        equipos.addPartidoHecho(partido4);
        equipos.addPartidoHecho(partido5);
        equipos.addPartidoHecho(partido6);
        equipos.addPartidoHecho(partido7);
        equipos.addPartidoHecho(partido8);
        equipos.addPartidoHecho(partido9);
        equipos.addPartidoHecho(partido10);
        equipos.addPartidoHecho(partido11);
        equipos.addPartidoHecho(partido12);
        equipos.addPartidoHecho(partido13);
        equipos.addPartidoHecho(partido14);
        equipos.addPartidoHecho(partido15);
        equipos.addPartidoHecho(partido16);
        equipos.addPartidoHecho(partido17);
        equipos.addPartidoHecho(partido18);
        equipos.addPartidoHecho(partido19);
        equipos.addPartidoHecho(partido20);
        equipos.addPartidoHecho(partido21);
        equipos.addPartidoHecho(partido22);
        equipos.addPartidoHecho(partido23);
        equipos.addPartidoHecho(partido24);

    }
}