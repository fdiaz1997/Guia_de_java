package ejercicio1;
import java.util.Scanner;

public class Ejercicio1 {

    public static boolean validarMail(String mail){
        return mail.matches("[a-z]{1,1}\\.{1,1}[a-z]+[0-9]{2,2}@ufromail{1,1}\\.{1,1}cl{1,1}");
    }
    public static void main(String[] args) {
        String ufromail;
        Scanner leer=new Scanner(System.in);
        while(true){
            System.out.println("Ingrese un correo electronico, ingrese salir");
            ufromail=leer.nextLine();
            if (validarMail(ufromail)){
                System.out.println("Es un correo ufromail");
            }else{
                System.out.println("No es un correo ufromail");
            }
            if (ufromail.equalsIgnoreCase("Salir")){
                System.out.println("Adiós");
                break;
            }
        }
        
}
    
}
