public class Main {
    public static void main(String[] args) {
        int numeroIf=0;
        String signo=signoNumero(numeroIf);
        System.out.println("El número "+signo);
        bucleWhile();
        bucleDoWhile();
        bucleFor();
        String estacion="Juan";
        diEstacion(estacion);
    }
    public static String signoNumero(int numero){
        if (numero>0) return "es positivo";
        else if (numero<0) return "es negativo";
        else return "no tiene signo";
    }
    public static void bucleWhile(){
        int numeroWhile=0;
        while (numeroWhile<3){
            System.out.println(numeroWhile);
            numeroWhile++;
        }
    }
    public static void bucleDoWhile(){
        int numeroDoWhile=2;
        do {
            System.out.println(numeroDoWhile);
            numeroDoWhile++;
        }
        while (numeroDoWhile<3);
    }
    public static void bucleFor(){
        for (int numeroFor=0; numeroFor<=3;numeroFor++ ){
            System.out.println(numeroFor);
        }
    }
    public static void diEstacion(String estacion){
        switch (estacion) {
            case "Verano":
                System.out.println("Es " + estacion);
                break;
            case "Otoño":
                System.out.println("Es " + estacion);
                break;
            case "Invierno":
                System.out.println("Es " + estacion);
                break;
            case "Primavera":
                System.out.println("Es " + estacion);
                break;
            default:
                System.out.println("No es ninguna estación");
        }
    }
}