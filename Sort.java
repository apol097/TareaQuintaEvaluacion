public class Sort {
    public static void shell(String[][] matriz, int columna) {
        int n = matriz.length;
        
        // Calcula el tamaño de los intervalos
        int intervalo = 1;
        while (intervalo < n / 3) {
            intervalo = intervalo * 3 + 1;
        }
        
        // Aplica el algoritmo de ordenamiento Shell
        while (intervalo > 0) {
            for (int i = intervalo; i < n; i++) {
                String[] temp = matriz[i];
                int j = i;
                
                // Compara los elementos dentro de la columna especificada
                while (j >= intervalo && matriz[j - intervalo][columna].compareTo(temp[columna]) > 0) {
                    matriz[j] = matriz[j - intervalo];
                    j -= intervalo;
                }
                
                matriz[j] = temp;
            }
            
            intervalo = intervalo / 3;
        }
    }
    
    public static void main(String[] args) {
        // Ejemplo de uso
        String[][] matriz = {
            {"M", "30", "F"},
            {"N", "12", "D"},
            {"F", "45", "E"}
        };
        
        int columnaOrdenar = 1; // Ordenar por la segunda columna (índice 1)
        columnaOrdenar = columnaOrdenar - 1;
        // Imprime la matriz sin ordenar
        System.out.println("Matriz sin ordenar:");
        imprimirMatriz(matriz);
        
        // Ordena la matriz utilizando el método shellSort
        shell(matriz, columnaOrdenar);
        
        // Imprime la matriz ordenada
        System.out.println("Matriz ordenada:");
        imprimirMatriz(matriz);

        String[][] matriz2 = {
            {"M", "20", "F"},
            {"N", "42", "D"},
            {"F", "95", "E"}
        };
        System.out.println("Matriz sin ordenar:");
        imprimirMatriz(matriz2);
        shell(matriz2, columnaOrdenar);
        
        // Imprime la matriz ordenada
        System.out.println("Matriz ordenada:");
        imprimirMatriz(matriz2);
    }
    
    public static void imprimirMatriz(String[][] matriz) {
        for (String[] fila : matriz) {
            for (String elemento : fila) {
                System.out.print(elemento + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}

