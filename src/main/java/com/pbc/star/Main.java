package com.pbc.star;

import com.pbc.cuenta.cuenta;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Crear cuenta
        System.out.println("------ Banco El Ahorrador ------ ");
        System.out.println("¡Bienvenido!| Creemos su cuenta: ");
        System.out.print("Ingresa tú nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("¿Desea abrir la cuenta con dinero? (si/no): ");
        String respuesta = scanner.nextLine();

        cuenta miCuenta;

        if (respuesta.equals("si")) {
            System.out.print("¿Con cuánto desea abrir la cuenta? $");
            double saldoInicial = scanner.nextDouble();
            miCuenta = new cuenta(nombre, saldoInicial);
        } else {
            miCuenta = new cuenta(nombre);
        }

        System.out.println("---");
        System.out.println("Cuenta creada exitosamente!");
        System.out.println("Titular: " + miCuenta.getTitular());
        System.out.println("Saldo inicial: $" + miCuenta.getSaldo());
        System.out.println("---");

        // Menú
        int opcion = 0;

        while (opcion != 4) {

            System.out.println("------ ¿Qué desea hacer? ------");
            System.out.println("1. Depositar");
            System.out.println("2. Retirar");
            System.out.println("3. Ver saldo");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");

            opcion = scanner.nextInt();
            System.out.println("---");

            if (opcion == 1) {
                System.out.print("¿Cuánto desea depositar? $");
                double monto = scanner.nextDouble();
                miCuenta.depositar(monto);

            } else if (opcion == 2) {
                System.out.print("¿Cuánto desea retirar? $");
                double monto = scanner.nextDouble();
                miCuenta.retirar(monto);

            } else if (opcion == 3) {
                System.out.println("Saldo actual: $" + miCuenta.getSaldo());

            } else if (opcion == 4) {
                System.out.println("Gracias por usar Banco El Ahorrador :)");

            } else {
                System.out.println("Opción no válida.");
            }

            System.out.println("---");
        }

        scanner.close();
    }
}
