public class Shell {
    public static void sort(String[][] matriz, int columna) {
        int n = matriz.length;
        int intervalo = 1;
        while (intervalo < n / 3) { intervalo = intervalo * 3 + 1; }
        while (intervalo > 0) {
            for (int i = intervalo; i < n; i++) {
                String[] temp = matriz[i];
                int j = i;
                while (j >= intervalo && matriz[j - intervalo][columna].compareTo(temp[columna]) > 0) {
                    matriz[j] = matriz[j - intervalo];
                    j -= intervalo;
                }
                matriz[j] = temp;
            }  
            intervalo = intervalo / 3;
        }
    }
}

