public class OperacionesBasicas {
    private static Float resultado = null;
    static final int SUMA = 1;
    static final int RESTA = 2;
    static final int MULTIPLICACION = 3;
    static final int DIVISION = 4;
    static final int RAICES = 5;

    /**
     * @param device --> operación a realizar (1-SUMA, 2-RESTA, 3-MULTIPLICACIÓN, 4-DIVISIÓN, 5-RAICES)
     * @param num1 --> primer numero de la operación (en caso de raiz es el radicando)
     * @param num2 --> segundo numero de la operación (divisor en caso de division, en caso de raiz el indice)
     * @return resultado
     */
    public static Float realizar(int device, float num1, float num2){

        switch (device){
            case SUMA:
                try{
                    resultado = num1 + num2;
                }catch (Exception e){
                    System.out.println("Error");
                }
                break;
            case RESTA:
                try{
                    resultado = num1 - num2;
                }catch (Exception e){
                    System.out.println("Error");
                }
                break;
            case MULTIPLICACION:
                try{
                    resultado = num1*num2;
                }catch (Exception e){
                    System.out.println("Error");
                }
                break;
            case DIVISION:
                try{
                    resultado = num1/num2;
                }catch (Exception e){
                    System.out.println("Error");
                }
                break;
            case RAICES:
                try {
                    resultado = (float) Math.pow(num1, 1/num2);
                }catch (Exception e){
                    System.out.println("Error");
                }
        }
        return resultado;
    }

}
