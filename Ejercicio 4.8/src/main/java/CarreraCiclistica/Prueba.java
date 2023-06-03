/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package CarreraCiclistica;

/**
 *
 * @author jg702
 */

import java.util.Scanner;
public class Prueba {

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Creación de un equipo de ciclistas");
        System.out.print("Ingrese el nombre del equipo: ");
        String nombreEquipo = scanner.nextLine();
        System.out.print("Ingrese el país del equipo: ");
        String paisEquipo = scanner.nextLine();
        Equipo equipo = new Equipo(nombreEquipo, paisEquipo);

        boolean agregarCiclista = true;
        while (agregarCiclista) {
            System.out.println("Creación de un ciclista");
            System.out.print("Ingrese el identificador del ciclista: ");
            int identificador = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer de entrada
            System.out.print("Ingrese el nombre del ciclista: ");
            String nombreCiclista = scanner.nextLine();
            System.out.print("Ingrese el tiempo acumulado del ciclista en minutos: ");
            int tiempoAcumulado = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer de entrada

            System.out.print("Ingrese el tipo de ciclista (1: Velocista, 2: Escalador, 3: Contrarrelojista): ");
            int tipoCiclista = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer de entrada

            Ciclista ciclista;
            switch (tipoCiclista) {
                case 1 -> {
                    System.out.print("Ingrese la potencia promedio: ");
                    double potenciaPromedio = scanner.nextDouble();
                    System.out.print("Ingrese la velocidad promedio: ");
                    double velocidadPromedio = scanner.nextDouble();
                    ciclista = new Velocista(identificador, nombreCiclista, tiempoAcumulado, potenciaPromedio, velocidadPromedio);
                }
                case 2 -> {
                    System.out.print("Ingrese la aceleración promedio: ");
                    float aceleracionPromedioSubida = scanner.nextFloat();
                    System.out.print("Ingrese el grado de la rampa: ");
                    float gradoRampaSoportada = scanner.nextFloat();
                    ciclista = new Escalador(identificador, nombreCiclista, tiempoAcumulado, aceleracionPromedioSubida, gradoRampaSoportada);
                }
                case 3 -> {
                    System.out.print("Ingrese la velocidad máxima: ");
                    double velocidadMaxima = scanner.nextDouble();
                    ciclista = new Contrarrelojista(identificador, nombreCiclista, tiempoAcumulado, velocidadMaxima);
                }
                default -> {
                    System.out.println("Tipo de ciclista inválido. Se creará un ciclista genérico.");
                    ciclista = new Ciclista(identificador, nombreCiclista, tiempoAcumulado) {
                        @Override
                        public String imprimirTipo() {
                            return "Es un Ciclista";
                        }
                    };
                }
            }

            equipo.añadirCiclista(ciclista);
            scanner.nextLine();

            System.out.print("¿Desea agregar otro ciclista al equipo? (S/N): ");
            String opcion = scanner.nextLine();
            agregarCiclista = opcion.equalsIgnoreCase("S");
        }

        equipo.calcularTiempoTotal();
        equipo.imprimirDatosEquipo();

        System.out.print("Ingrese el identificador de un ciclista para obtener sus datos: ");
        int identificadorCiclista = scanner.nextInt();
        equipo.imprimirDatosCiclista(identificadorCiclista);

        scanner.close();
    }
}
   
    
