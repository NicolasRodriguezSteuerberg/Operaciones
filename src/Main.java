
public class Main {

    public static void main(String[] args) {
        int opcion;
        Float numero1, numero2;
        Float resultado;
        opcion = EntradaSalida.entradaInt("1 --> Hacer suma\n2 --> Hacer resta\n3 --> Hacer multiplicación\n4 --> Hacer división\n5 --> Raiz con cualquier indice\n6 --> Saír do programa");
        numero1 = EntradaSalida.entradaFloat("Teclee o primer número da operación");
        if(numero1 == null){
            EntradaSalida.salida("El primer numero tiene que ser un número válido", EntradaSalida.SALIDA_CONSOLA);
        }
        else {
            numero2 = EntradaSalida.entradaFloat("Teclee o segundo número da operación");
            if(numero2==null){
                EntradaSalida.salida("Tiene que ser un número, no una letra", EntradaSalida.SALIDA_CONSOLA);
            }
            else {
                if (opcion > 0 && opcion < 6) {
                    resultado = OperacionesBasicas.realizar(opcion, numero1, numero2);
                    if (Float.isNaN(resultado)) {
                        EntradaSalida.salida("Error", EntradaSalida.SALIDA_CONSOLA);
                    }
                    else {
                        EntradaSalida.salida(("O resultado da operación é " + resultado), EntradaSalida.SALIDA_WINDOW);
                    }
                }
                else {
                    EntradaSalida.salida("A opción foi incorrecta, saindo", EntradaSalida.SALIDA_WINDOW);
                }
            }
        }
    }
}