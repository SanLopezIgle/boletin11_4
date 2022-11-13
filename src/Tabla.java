import java.util.Scanner;

public class Tabla {

    Scanner sc = new Scanner(System.in);
    public void multiplicacion(){
        System.out.println("numero: ");
        int numero = sc.nextInt();

        System.out.println("La tabla del " + numero + " es:");
        for(int i=1;i<=10;i++){
            System.out.println(numero + "*" + i + "=" + numero*i);
        }
    }
}
