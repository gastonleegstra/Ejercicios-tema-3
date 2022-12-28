public class Main {
    public static void main(String[] args) {

        int resultado = suma(10,20,30);
        System.out.println(resultado);

        Coche miCoche = new Coche();
        miCoche.IncrementaPuertas();
        System.out.println(miCoche.puertas);
    }

    public static int suma(int a, int b, int c){

        return a+b+c;
    }
}
class Coche{
    public int puertas = 0;
    public  void IncrementaPuertas(){
        this.puertas++;
    }
}