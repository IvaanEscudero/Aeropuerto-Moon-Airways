# Aeropuerto-Moon-Airways - Sistema de Gestión de Vuelos

![Logotipo del Aeropuerto](/src/Recursos/logo.jpeg)

## Descripción
Este sistema es una aplicación de escritorio desarrollada en **Java** que simula la operativa de un aeropuerto. Los usuarios pueden interactuar con una interfaz gráfica para gestionar todo el proceso de viaje, desde la consulta hasta el pago.

Este proyecto fue desarrollado para la asignatura de **Ingeniería del Software (ISI)** en la **Universitat de València** en 2021.

  ## Características
* **Consulta de Vuelos:** Buscador de vuelos disponibles en tiempo real.
* **Sistema de Reservas:** Selección de asientos y gestión de datos del pasajero.
* **Pasarela de Pago:** Simulación de proceso de pago para la emisión de billetes.
* **Interfaz Intuitiva:** Desarrollada con Swing.

## Tecnologías y Arquitectura
* **Lenguaje:** Java
* **Interfaz:** Java Swing
* **Patrón de Diseño:** MVC (Modelo-Vista-Controlador)

## Cómo ejecutar el proyecto

1.  **Clonar el repositorio:**
    ```bash
    git clone [https://github.com/IvaanEscudero/Proyecto_Aeropuerto.git](https://github.com/IvaanEscudero/Proyecto_Aeropuerto.git)
    ```
2.  **Ejecución rápida (Línea de comandos):**
    Ve a la carpeta `dist` del proyecto y ejecuta el archivo JAR:
    ```bash
    java -jar "Proyecto_aeropuerto.jar"
    ```
    *Nota: Asegúrate de mantener la carpeta `lib` junto al archivo JAR para que las dependencias funcionen correctamente.*

3.  **Abrir en IDE (NetBeans/IntelliJ):**
    * Importa el proyecto.
    * Si necesitas cambiar la clase principal: `Propiedades > Run > Main Class`.
