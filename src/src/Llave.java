import java.util.ArrayList;

public class Llave extends EtapaMundial {

    public Resultado calcular;

    private ArrayList<Equipo> semis;

    private ArrayList<Equipo> finales;
    private ArrayList<Equipo> finalistas;

    public ArrayList<Equipo> getEquiposQueAvanzan() {
        return equiposQueAvanzan;
    }
    public void addSemis(Equipo equipos){
        this.semis.add(equipos);
        return;
    }
    public void addFinal(Equipo equipos){
        this.finales.add(equipos);
    }
    public void addFinalistas(Equipo equipos){
        this.finalistas.add(equipos);
    }
    Llave(){
        this.setSemis(new ArrayList<Equipo>());
        this.setFinales(new ArrayList<Equipo>());
        this.setFinalistas(new ArrayList<Equipo>());
    }

    public String cuartos() {
        calcular = new Resultado();
        System.out.println(String.format("%s", "CUARTOS DE FINAL:"));
        for (int i = 1; i <= 4; i++) {
            switch (i) {

                case 1:
                    System.out.println(String.format("%s %s %s", this.equiposQueAvanzan.get(0).getEquipof(), "-", this.equiposQueAvanzan.get(1).getEquipof()));
                    calcular.ganoLocal();
                    if (calcular.decision) {
                        System.out.println(String.format("%s %s " ,"gano este equipo", this.equiposQueAvanzan.get(0).getEquipof() ));
                        this.addSemis(new Equipo(equiposQueAvanzan.get(0).getEquipof()));
                    } else {
                        System.out.println(String.format("%s %s " ,"gano este equipo", this.equiposQueAvanzan.get(1).getEquipof() ));
                        this.addSemis(new Equipo(equiposQueAvanzan.get(1).getEquipof()));
                        }
                    break;
                case 2:
                    System.out.println(String.format("%s  %s %s", this.equiposQueAvanzan.get(2).getEquipof(), "-", this.equiposQueAvanzan.get(3).getEquipof()));
                    calcular.ganoLocal();
                    if (calcular.goLocal > calcular.golVisit) {
                        System.out.println(String.format("%s %s" ,"gano este equipo", this.equiposQueAvanzan.get(2).getEquipof() ));
                        this.addSemis(new Equipo(equiposQueAvanzan.get(2).getEquipof()));
                    } else {
                        System.out.println(String.format("%s %s" ,"gano este equipo", this.equiposQueAvanzan.get(3).getEquipof() ));
                        this.addSemis(new Equipo(equiposQueAvanzan.get(3).getEquipof()));
                    }
                    break;
                case 3:
                    System.out.println(String.format("%s  %s %s", this.equiposQueAvanzan.get(4).getEquipof(), "-", this.equiposQueAvanzan.get(5).getEquipof()));
                    calcular.ganoLocal();
                    if (calcular.goLocal > calcular.golVisit) {
                        System.out.println(String.format("%s %s" ,"gano este equipo", this.equiposQueAvanzan.get(4).getEquipof() ));
                        this.addSemis(new Equipo(equiposQueAvanzan.get(4).getEquipof()));
                    } else {
                        System.out.println(String.format("%s %s" ,"gano este equipo", this.equiposQueAvanzan.get(5).getEquipof() ));
                        this.addSemis(new Equipo(equiposQueAvanzan.get(5).getEquipof()));
                    }
                    break;
                case 4:
                    System.out.println(String.format("%s %s %s", this.equiposQueAvanzan.get(6).getEquipof(), "-", this.equiposQueAvanzan.get(7).getEquipof()));
                    calcular.ganoLocal();
                    if (calcular.goLocal > calcular.golVisit) {
                        System.out.println(String.format("%s %s" ,"gano este equipo", this.equiposQueAvanzan.get(6).getEquipof() ));
                        this.addSemis(new Equipo(equiposQueAvanzan.get(6).getEquipof()));
                    } else {
                        System.out.println(String.format("%s %s" ,"gano este equipo", this.equiposQueAvanzan.get(7).getEquipof() ));
                        this.addSemis(new Equipo(equiposQueAvanzan.get(7).getEquipof()));
                    }
            }
        }
        return "";
    }


    public String semifinales() {
        calcular = new Resultado();
        System.out.println(String.format("%s", "SEMIFINALES:"));
        for (int i = 1; i <= 2; i++) {
            switch (i) {
                case 1:
                    System.out.println(String.format("%s %s %s", this.semis.get(0).getEquipof(), "-", this.semis.get(1).getEquipof()));
                    calcular.ganoLocal();
                    if (calcular.decision) {
                        System.out.println(String.format("%s %s " ,"gano este equipo", this.semis.get(0).getEquipof() ));
                        this.addFinal(new Equipo(semis.get(0).getEquipof()));
                    } else {
                        System.out.println(String.format("%s %s " ,"gano este equipo", this.semis.get(1).getEquipof() ));
                        this.addFinal(new Equipo(semis.get(1).getEquipof()));
                    }
                    break;
                case 2:
                    System.out.println(String.format("%s  %s %s", this.semis.get(2).getEquipof(), "-", this.semis.get(3).getEquipof()));
                    calcular.ganoLocal();
                    if (calcular.goLocal > calcular.golVisit) {
                        System.out.println(String.format("%s %s" ,"gano este equipo", this.semis.get(2).getEquipof() ));
                        this.addFinal(new Equipo(semis.get(2).getEquipof()));
                    } else {
                        System.out.println(String.format("%s %s" ,"gano este equipo", this.semis.get(3).getEquipof() ));
                        this.addFinal(new Equipo(semis.get(3).getEquipof()));
                    }


            }
        }
        return "";
    }
    public String Final() {
        calcular = new Resultado();
        System.out.println(String.format("%s", "FINALLL:"));
        for (int i = 1; i <= 2; i++) {
            switch (i) {
                case 1:
                    System.out.println(String.format("%s %s %s", this.semis.get(0).getEquipof(), "-", this.semis.get(1).getEquipof()));
                    calcular.ganoLocal();
                    if (calcular.decision) {
                        System.out.println(String.format("%s %s " ,"gano este equipo", this.semis.get(0).getEquipof() ));
                        this.addFinal(new Equipo(semis.get(0).getEquipof()));
                    } else {
                        System.out.println(String.format("%s %s " ,"gano este equipo", this.semis.get(1).getEquipof() ));
                        this.addFinal(new Equipo(semis.get(1).getEquipof()));
                    }
                    break;
                

            }
        }
        return "";
    }
    public String todo(Grupo g){
        this.comprobarEquipos(g);
        this.cuartos();
        this.semifinales();
        return "";
    }
    public ArrayList<Equipo> getSemis() {
        return semis;
    }

    public void setSemis(ArrayList<Equipo> semis) {
        this.semis = semis;
    }

    public ArrayList<Equipo> getFinales() {
        return finales;
    }

    public void setFinales(ArrayList<Equipo> finales) {
        this.finales = finales;
    }

    public ArrayList<Equipo> getFinalistas() {
        return finalistas;
    }

    public void setFinalistas(ArrayList<Equipo> finalistas) {
        this.finalistas = finalistas;
    }
}