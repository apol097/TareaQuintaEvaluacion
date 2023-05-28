public class RegistroAlumnos{
    Colors console = new Colors();
    private String[][] alumnos;

    public RegistroAlumnos(String[][] alumnos) {
        this.alumnos = alumnos;
    }

    public void agregarAlumno(String matricula, String nombre, String apellido, String direccion, String telefono, String genero, String correo) {
        String[] nuevoAlumno = {matricula, nombre, apellido, direccion, telefono, genero, correo};
        String[][] nuevaMatriz = new String[alumnos.length + 1][alumnos[0].length];
        
        for (int i = 0; i < alumnos.length; i++) {
            nuevaMatriz[i] = alumnos[i];
        }

        nuevaMatriz[alumnos.length] = nuevoAlumno;
        this.alumnos = nuevaMatriz;
    }

    public void imprimirAlumnos() {
        console.printGreen("\nNo. Carnet\tNombre\tApellido\tDireccion\tTelefono\tSexo\t\tCorreo");
        console.printWhite("\n--------------------------------------------------------------------------------------------------------------------------\n");
        for (String[] alumno : alumnos) {
            for (String atributo : alumno) {
                console.printBlue(  atributo + "\t"  );
            }
            System.out.println();
        }
    }

    public void ordenarAlumnos(int columna){
        Sort.shell(alumnos, columna);
    }
    public void ordenarAlumnos(){
        ordenarAlumnos(0);
    }
    public static void main(String[] args) {
        Colors console = new Colors();
        String[][] alumno = {
            {"17-2030-2012", "Jose", "Artiga", "Calle Arce n 1020", "2275-8888", "Masculino", "jose.perez@mail.utec.edu.sv"},
            // Otros alumnos...
        };

        RegistroAlumnos alumnos = new RegistroAlumnos(alumno);
        console.printRed("Alumnos sin ordenar:\n");
        alumnos.agregarAlumno("17-1750-2023", "Maria", "Delgado", "Calle Rosas n 456", "2333-9999", "Femenino", "maria.lopez@mail.utec.edu.sv");
       
        //se manda a imprimir los alumnos
        
        alumnos.imprimirAlumnos();
        alumnos.ordenarAlumnos();
        console.printRed("\nAlumnos ordenados por matrícula:\n");
        alumnos.imprimirAlumnos();
    }
}
