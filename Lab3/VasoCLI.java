import java.util.Scanner;
public class VasoCLI {
private static void llenarOVaciar(Vaso v, int cantidad) {
if (cantidad < 0)
v.vaciar(-cantidad);
else
v.llenar(cantidad);
}
public static void main(String[] args) {
Vaso v = new Vaso(333);
Scanner s = new Scanner(System.in);
int delta;
do {
System.out.println(v);
System.out.print("Indica la cantidad a llenar (positivo)");
System.out.print(", vaciar (negativo)");
System.out.print(", o salir del programa (0): ");
delta = Integer.parseInt(s.nextLine());
llenarOVaciar(v, delta);
}
while (delta != 0);
System.out.println("Fin de ejecución del programa");
}
}