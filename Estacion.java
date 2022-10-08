public class Estacion {
    public static void main(String[] args) {
        var estacion= "verano";
        switch (estacion){
            case "verano":
                System.out.println("Es verano");
                break;
            case "primavera":
                System.out.println("Es primavera");
                break;
            case "invierno":
                System.out.println("Es invierno");
                break;
            case "otoño":
                System.out.println("Es otoño");
                break;
            default:
                System.out.println("Estacion ingresada no existe");

        }
    }
}
