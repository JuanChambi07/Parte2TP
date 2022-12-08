public class Resultado {

    private int golesLocal;
    private int golesVisitante;


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

    public boolean ganoLocal(){
        this.setGolesLocal((int)Math.random()*10);
        this.setGolesVisitante((int)Math.random()*10);
      int goLocal = getGolesLocal();
      int golVisit = getGolesVisitante();
      if (goLocal>golVisit) return true;
      else return false;


    }
    public boolean empate(){
        this.setGolesLocal((int)Math.random()*1+1);
        this.setGolesVisitante((int)Math.random()*1+1);
        int goLocal = getGolesLocal();
        int golVisit = getGolesVisitante();
        if (goLocal==golVisit) return true;
        else return false;
    }

}
