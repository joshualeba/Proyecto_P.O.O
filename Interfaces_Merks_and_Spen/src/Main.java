import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        while (true) {
            // Opciones del menú principal
            String[] opciones = {
                    "Gestión de usuarios",
                    "Gestión de artículos",
                    "Gestión de categorías",
                    "Gestión de solicitudes de artículos",
                    "Gestión de departamentos",
                    "Salir"
            };

            // Mostrar el menú principal con una lista desplegable
            String seleccion = (String) JOptionPane.showInputDialog(
                    null,
                    "Seleccione una opción:",
                    "Menú principal",
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    opciones,
                    opciones[0] // Opción por defecto
            );

            // Si el usuario cierra el diálogo o selecciona "Salir", salir del programa
            if (seleccion == null || seleccion.equals("Salir")) {
                JOptionPane.showMessageDialog(null, "Saliendo del programa...");
                return; // Terminar el programa
            }

            // Manejar la selección del usuario
            switch (seleccion) {
                case "Gestión de usuarios":
                    JOptionPane.showMessageDialog(null, "Lógica para gestión de usuarios");
                    break;
                case "Gestión de artículos":
                    JOptionPane.showMessageDialog(null, "Lógica para gestión de artículos");
                    break;
                case "Gestión de categorías":
                    JOptionPane.showMessageDialog(null, "Lógica para gestión de categorías");
                    break;
                case "Gestión de solicitudes de artículos":
                    JOptionPane.showMessageDialog(null, "Lógica para gestión de solicitudes de artículos");
                    break;
                case "Gestión de departamentos":
                    JOptionPane.showMessageDialog(null, "Lógica para gestión de departamentos");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida. Intente de nuevo.");
            }
        }
    }
}