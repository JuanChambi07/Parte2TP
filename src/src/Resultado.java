import java.util.ArrayList;

public class Resultado {

    private int golesLocal;
    private int golesVisitante;
    public int goLocal;
    public int golVisit;
    public boolean decision;
    //private ArrayList<Integer> puntos;
    public int getGolesLocal() {
        return golesLocal;
    }

    public void setGolesLocal(int golesLocal) {
        this.golesLocal = golesLocal;
    }

    public int getGolesVisitante() {
        return golesVisitante;
    }

    public void setGolesVisitante(int golesVisitante) {
        this.golesVisitante = golesVisitante;
    }
  //  public void addPuntos(Integer num){
        //this.puntos.add(num);
   //}
    public boolean ganoLocal(){

        this.setGolesLocal((int) (Math.random()*20));
        this.setGolesVisitante((int)(Math.random() *20));

      goLocal = getGolesLocal();
       golVisit = getGolesVisitante();
        System.out.println(String.format(" %s%d %s %d"," local ", this.goLocal," - visitante",this.golVisit));

      if (goLocal>golVisit){

     /*     if (true){
            this.addPuntos(goLocal);
          }else {
              this.addPuntos(golVisit);
          }*/
          decision = true;

      }
      else{decision= false;
      }/*
      {if (false){
          this.addPuntos(goLocal);
      }else {
          this.addPuntos(golVisit);
      }

      }*/
        return decision;


    }
    public boolean empate(){
        this.setGolesLocal((int)(Math.random() *10));
        this.setGolesVisitante((int)(Math.random() *10));

        int goLocal = getGolesLocal();
        int golVisit = getGolesVisitante();
        System.out.println(String.format("%s %d %s %d","local:",goLocal,"- visitante:",golVisit));
        if (goLocal==golVisit) {
            decision = true;
        }
        else {decision= false;
        }
        return decision;


    }


    /*public ArrayList<Integer> getPuntos() {
        return puntos;
    }

    public void setPuntos(ArrayList<Integer> puntos) {
        this.puntos = puntos;
    }
*/
}
