/**
 * Clase para manejo de funciones de ordenamiento burbuja.
 */
public class MetodosBurbuja {

    /**
     * Ordena arreglo con metodo burbuja simple.
     * 
     * @param arreglo Arreglo a ordenar.
     */
    public void burbujaSimple(int[] arreglo) {
        int i = 0, j = 0, temporal = 0, iteraciones = 0;

        for (i = 0; i < arreglo.length; i++) {

            for (j = 0; j < arreglo.length - 1; j++) {

                if (arreglo[j] > arreglo[j + 1]) {
                    temporal = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temporal;

                    imprimirArreglo(arreglo);
                }

                iteraciones++;
            }
        }

        System.out.println("Cantidad iteraciones método simple: " + iteraciones);
    }

    /**
     * Ordena arreglo con metodo burbuja mejorada.
     * 
     * @param arreglo Arreglo a ordenar.
     */
    public void burbujaMejorada(int[] arreglo) {
        int i = 0, j = 0, temporal = 0, iteraciones = 0;

        for (i = 1; i < arreglo.length; i++) {

            for (j = 0; j < arreglo.length - 1; j++) {

                if (arreglo[j] > arreglo[j + 1]) {
                    temporal = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temporal;
                    imprimirArreglo(arreglo);
                }

                iteraciones++;
            }
        }

        System.out.println("Cantidad iteraciones método mejorado: " + iteraciones);
    }

    /**
     * Ordena arreglo con metodo burbuja optimizada.
     * 
     * @param arreglo Arreglo a ordenar.
     */
    public void burbujaOptimizada(int[] arreglo) {
        int i = 0, j = 0, temporal = 0, iteraciones = 0;

        for (i = 0; i < arreglo.length; i++) {

            for (j = 0; j < i; j++) {

                if (arreglo[i] < arreglo[j]) {
                    temporal = arreglo[j];
                    arreglo[j] = arreglo[i];
                    arreglo[i] = temporal;
                    imprimirArreglo(arreglo);
                }

                iteraciones++;
            }
        }

        System.out.println("Cantidad iteraciones método optimizada: " + iteraciones);
    }

    /**
     * Ordena arreglo con metodo burbuja optimizada con Flag.
     * 
     * @param arreglo Arreglo a ordenar.
     */
    public void burbujaFlag(int arreglo[]) { 
        int tam = arreglo.length, iteraciones = 0;

        for (int i = 0; i < tam - 1; i++) {
            boolean flag = true;

            for (int j = 0; j < tam - i - 1; j++) {

                if (arreglo[j] > arreglo[j + 1]) {
                    int temporal = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temporal;
                    imprimirArreglo(arreglo);

                    flag = false;
                }

                iteraciones++;
            }

            if (flag) {
                break;
            }
        }

        System.out.println("Cantidad iteraciones método Flag: " + iteraciones);
    }

    /**
     * Imprime arreglo en consola.
     * 
     * @param arreglo Arreglo a ordenar.
     */
    public void imprimirArreglo(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("[" + arreglo[i] + "] ");
        }

        System.out.println();
    }
}
