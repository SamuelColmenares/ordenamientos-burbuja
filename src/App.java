public class App {
    public static void main(String[] args) throws Exception {
        MetodosBurbuja ordenar = new MetodosBurbuja();

        int arreglo[] = { 21, 40, 4, 9, 10, 35 };
        //int arreglo2[] = { 21, 40, 4, 9, 10, 35 };
        //int arreglo3[] = { 21, 40, 4, 9, 10, 35 };
        //int arreglo4[] = { 21, 40, 4, 9, 10, 35 };

        System.out.println("METODO SIMPLE:");
        ordenar.imprimirArreglo(arreglo);
        ordenar.burbujaSimple(arreglo);

        //System.out.println("________________________________________________");
        //System.out.println("METODO MEJORADA:");
        //ordenar.imprimirArreglo(arreglo2);
        //ordenar.burbujaMejorada(arreglo2);

        //System.out.println("________________________________________________");
        //System.out.println("METODO OPTIMIZADA:");
        //ordenar.imprimirArreglo(arreglo3);
        //ordenar.burbujaOptimizada(arreglo3);

        //System.out.println("________________________________________________");
        //System.out.println("METODO FLAG:");
        //ordenar.imprimirArreglo(arreglo4);
        //ordenar.burbujaFlag(arreglo4);

    }
}
