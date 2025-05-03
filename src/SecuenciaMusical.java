// Compuesto: Secuencia de notas musicales
class SecuenciaMusical implements NotaMusical {
    private String nombreSecuencia;
    private NotaMusical nota1;
    private NotaMusical nota2;
    private NotaMusical nota3;
    private NotaMusical nota4;
    private NotaMusical nota5;
    private NotaMusical nota6;
    private NotaMusical nota7;

    // Constructor que recibe el nombre de la secuencia musical
    public SecuenciaMusical(String nombreSecuencia) {
        this.nombreSecuencia = nombreSecuencia;
    }

    // Métodos para establecer las notas dentro de la secuencia
    public void setNota1(NotaMusical n) { nota1 = n; }
    public void setNota2(NotaMusical n) { nota2 = n; }
    public void setNota3(NotaMusical n) { nota3 = n; }
    public void setNota4(NotaMusical n) { nota4 = n; }
    public void setNota5(NotaMusical n) { nota5 = n; }
    public void setNota6(NotaMusical n) { nota6 = n; }
    public void setNota7(NotaMusical n) { nota7 = n; }

    // Implementación del método reproducir para la secuencia de notas
    @Override
    public void reproducir() {
        // Imprime el nombre de la secuencia antes de reproducir las notas
        System.out.println(">> Secuencia: " + nombreSecuencia);

        // Reproduce cada una de las notas que forman la secuencia, si están disponibles
        if (nota1 != null) nota1.reproducir();
        if (nota2 != null) nota2.reproducir();
        if (nota3 != null) nota3.reproducir();
        if (nota3 != null) nota4.reproducir();
        if (nota3 != null) nota5.reproducir();
        if (nota3 != null) nota6.reproducir();
        if (nota3 != null) nota7.reproducir();
    }
}
