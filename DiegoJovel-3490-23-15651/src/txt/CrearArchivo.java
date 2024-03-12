package txt;


	import java.io.FileWriter;
	import java.io.IOException;
	import java.io.PrintWriter;

	public class CrearArchivo {

	    public static void main(String[] args) {
	        String nombreArchivo = "DiegoJovel.txt";

	        String texto = "Escriba un programa que sea capaz de crear un archivo con el texto con su nombre sin espacios";

	        crearYEscribirArchivo(nombreArchivo, texto);

	        System.out.println("Archivo creado exitosamente: " + nombreArchivo);
	    }

	    private static void crearYEscribirArchivo(String nombreArchivo, String texto) {
	        try (PrintWriter escritor = new PrintWriter(new FileWriter(nombreArchivo))) {
	            escritor.println(texto);
	        } catch (IOException e) {
	            System.err.println("Error al crear o escribir en el archivo: " + e.getMessage());
	        }
	    }
	}

