public class RegistroMaterias {
    private String[][] materias;

    public RegistroMaterias(String[][] materias) {
        this.materias = materias;
    }

    public void agregarMateria(String codigo, String nombre) {
        String[] nuevaMateria = {codigo, nombre};
        String[][] nuevaMatriz = new String[materias.length + 1][materias[0].length];

        for (int i = 0; i < materias.length; i++) {
            nuevaMatriz[i] = materias[i];
        }

        nuevaMatriz[materias.length] = nuevaMateria;
        this.materias = nuevaMatriz;
    }

    public void imprimirMaterias() {
        for (String[] materia : materias) {
            for (String atributo : materia) {
                System.out.print(atributo + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        String[][] materias = {
            {"M1", "Métodos I"},
            // Otras materias...
        };

        RegistroMaterias registroMaterias = new RegistroMaterias(materias);
        System.out.println("Materias sin agregar:");
        registroMaterias.imprimirMaterias();

        registroMaterias.agregarMateria("M2", "Métodos II");
        System.out.println("\nMaterias con la nueva materia agregada:");
        registroMaterias.imprimirMaterias();
    }
}
