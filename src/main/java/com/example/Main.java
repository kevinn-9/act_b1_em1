package com.example;

public class Main {
    public static void main(String[] args) {

        // TODO: Crear método main para:
        // 1. Crear dos objetos Estudiante con diferentes valores
        Estudiante estudiante1 = new Estudiante("Laura", 22, 8.7);
        Estudiante estudiante2 = new Estudiante("Mateo", 19, 7.4);
        // 2. Mostrar la información de ambos estudiantes
        System.out.println("--- Información de Estudiantes ---");
        estudiante1.mostrarInformacion();
        System.out.println();
        estudiante2.mostrarInformacion();
        // 3. Modificar algún atributo usando un setter
        estudiante1.setPromedio(9.3);
        estudiante2.setEdad(20);
        // 4. Mostrar la información actualizada
        System.out.println("\n--- Información Actualizada de Estudiantes ---");
        estudiante1.mostrarInformacion();
        System.out.println();
        estudiante2.mostrarInformacion();

        // TODO: Crear método main para:
        // 1. Crear un libro usando el constructor completo
    Libro libro1 = new Libro("El principito", "Antoine de Saint-Exupéry", 45000.0); // Precio en COP
        // 2. Crear un libro usando el constructor con solo titulo y autor
    Libro libro2 = new Libro("Cien poemas de amor y una cancion desesperada", "Pablo Neruda", 55000.0); // Precio en COP
        // 3. Mostrar información de ambos libros
        System.out.println("\n--- Información de Libros ---");
        libro1.mostrarInformacion();
        System.out.println();
        libro2.mostrarInformacion();
        // 4. Aplicar descuento usando ambas versiones del método
        libro1.aplicarDescuento(15); // 15% de descuento
        libro2.aplicarDescuento(25, 20000); // 25% de descuento, máximo 20000
        // 5. Mostrar información actualizada de los libros
        System.out.println("\n--- Información Actualizada de Libros ---");
        libro1.mostrarInformacion();
        System.out.println();
        libro2.mostrarInformacion();
    }
}