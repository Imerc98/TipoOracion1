import java.util.Scanner;
 
public class TipoOracion {
 
public static void main(String args[]) {
Scanner sc = new Scanner(System.in);
 
System.out.println("Introduce una cadena ->");
String cadena = sc.nextLine();
String[] split = cadena.split("");
for (int i = 0; i < split.length; i++) {
if(i == 0 || split[i-1].equals(" ")) {
split[i] = split[i].toUpperCase();
}
}
System.out.println(String.join("", split));
}
}