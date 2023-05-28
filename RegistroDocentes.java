public class RegistroDocentes {
    Colors console = new Colors();
    private String[][] docentes;

    public RegistroDocentes(String[][] docentes) {
        this.docentes = docentes;
    }

    public void agregarDocente(String codigo, String nombre, String apellido, String correo) {
        String[] nuevoDocente = {codigo, nombre, apellido, correo};
        String[][] nuevaMatriz = new String[docentes.length + 1][docentes[0].length];

        for (int i = 0; i < docentes.length; i++) {
            nuevaMatriz[i] = docentes[i];
        }

        nuevaMatriz[docentes.length] = nuevoDocente;
        docentes = nuevaMatriz;
    }

    public void imprimirDocentes() {
        console.printGreen("\nCodigo\tNombre\tApellido\tCorreo");
        console.printWhite("\n------------------------------------------------------------\n");
        for (String[] docente : docentes) {
            for (String atributo : docente) {
                console.printBlue(  atributo + "\t"  );
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Colors console = new Colors();
        String[][] docente = {
            {"D1", "Hugo", "Ortiz", "hortiz@mail.utec.edu.sv"},
            // Otros docentes...
        };

        RegistroDocentes docentes = new RegistroDocentes(docente);
        console.printRed("Docentes sin agregar:\n");
        docentes.imprimirDocentes();

        docentes.agregarDocente("D2", "Luis", "García", "lgarcia@mail.utec.edu.sv");
        console.printRed("\nDocentes con el nuevo docente agregado:\n");
        docentes.imprimirDocentes();
    }
}
