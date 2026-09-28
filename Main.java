//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
void main() {

            Scanner roy = new Scanner(System.in);

            System.out.print("Ingrese un número: ");
            int numero = roy.nextInt();

            while (numero < 2) {
                System.out.print("Ingrese un número mayor o igual a 2: ");
                numero = roy.nextInt();
            }

            System.out.println("Números primos hasta " + numero + ":");

            for (int n = 2; n <= numero; n++) {

                int divisor = 1;
                int cantidadDivisores = 0;

                // DO-WHILE: contar los divisores
                do {
                    if (n % divisor == 0) {
                        cantidadDivisores++;
                    }

                    divisor++;

                } while (divisor <= n);

                if (cantidadDivisores == 2) {
                    System.out.println(n);
                }
            }

            roy.close();
        }
