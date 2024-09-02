import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner entry = new Scanner(System.in);
        int a=0,b=0,c=0,paro=1;

        do {
            //Solicitud de  valores
            System.out.println("Ingrese 3 valores entre 1 y 200");
            System.out.println("Ingrese el primer valor");
            a = entry.nextInt();
            System.out.println("Ingrese el segundo valor");
            b = entry.nextInt();
            System.out.println("Ingrese el tercer valor");
            c = entry.nextInt();


            //Verificacion de rango de numeros
            if(a<1||a>200) {
                System.out.println("El valor " + a + "no está dentro del rango permitido");
                paro=0;
            } else if (b<1||b>200){
                System.out.println("El valor " +b+ "no está dentro del rango permitido");
                paro=0;
            } else if (c<1||c>200) {
                System.out.println("El valor " + c + "no está dentro del rango permitido");
                paro = 0;
            }
        }while (paro==0);
        System.out.println("---------------------");

        //Es un triangulo?
        if (a>(b+c)||b>(c+a)||c>(a+b)) {
            System.out.println("No es un Triángulo");
        }
        //Si es un triangulo
        else if(a==b&&a==c){
            System.out.println("Es un triángulo:\nEquilatero");
        }else if(a==b||b==c){
            System.out.println("Es un triángulo:\nIsósceles");
        } else {
            System.out.println("Es un triángulo:\nEscaleno");
        }
    }
}