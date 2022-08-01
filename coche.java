
public class Main {
    public static void main(String[] args) {
        coche miCoche = new coche();
        miCoche.sumarpuerta();

        System.out.println(miCoche.puertas);
    }
    class coche {
        public int puertas = 0;

        public void sumarpuerta() {
            this.puertas++;
        }
    }
}
