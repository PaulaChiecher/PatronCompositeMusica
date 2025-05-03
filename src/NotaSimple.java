// Hoja: Nota musical individual
class NotaSimple implements NotaMusical {
    private String nombre;

    // Constructor que recibe el nombre de la nota
    public NotaSimple(String nombre) {
        this.nombre = nombre;
    }

    // Implementación del método reproducir para la nota simple
    @Override
    public void reproducir() {
        System.out.println("Reproduciendo nota: " + nombre);
    }
}
