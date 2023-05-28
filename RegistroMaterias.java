public class RegistroMaterias {
    Colors console = new Colors();
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
        
        console.printGreen("\nCodigo\tNombre");
        console.printWhite("\n--------------------------------------\n");
        for (String[] materia : materias) {
            for (String atributo : materia) {
                console.printBlue(  atributo + "\t"  );

            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        String[][] materia = {
            {"M1", "Métodos I"},
            {"P1", "Programacion I"},
            // Otras materias...
        };

        RegistroMaterias materias = new RegistroMaterias(materia);
        System.out.println("Materias sin agregar:");
        materias.imprimirMaterias();

        materias.agregarMateria("M2", "Métodos II");
        System.out.println("\nMaterias con la nueva materia agregada:");
        materias.imprimirMaterias();
    }
}
