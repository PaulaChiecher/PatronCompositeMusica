// Clase principal donde se configura y ejecuta el programa
public class MainMusica {
    public static void main(String[] args) {
        // Creación de notas individuales
        NotaMusical doNota = new NotaSimple("Do");
        NotaMusical reNota = new NotaSimple("Re");
        NotaMusical miNota = new NotaSimple("Mi");
        NotaMusical faNota = new NotaSimple("Fa");
        NotaMusical solNota = new NotaSimple("Sol");
        NotaMusical laNota = new NotaSimple("La");
        NotaMusical siNota = new NotaSimple("Si");


        // Creación de una secuencia musical y asignación de notas a la secuencia
        SecuenciaMusical melodia = new SecuenciaMusical("Melodía Principal");
        melodia.setNota1(doNota); // Se asigna la nota "Do"
        melodia.setNota2(reNota); // Se asigna la nota "Re"
        melodia.setNota3(miNota); // Se asigna la nota "Mi"
        melodia.setNota4(faNota); // Se asigna la nota "Fa"
        melodia.setNota5(solNota); // Se asigna la nota "Sol"
        melodia.setNota6(laNota); // Se asigna la nota "La"
        melodia.setNota7(siNota); // Se asigna la nota "Si"

        // Reproducción de la secuencia musical
        melodia.reproducir();
    }
}
