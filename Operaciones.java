package clases;

public class Operaciones {

/** Hecho por Neos Rafael Ruiz Sanchez
 *operaciones matemáticas básicas.
 */
    double num1;
    double num2;

    /**
     * Constructor por defecto.
     */
    public Operaciones() {

    }

    /**
     * Constructor con parámetros.
     * @param num1 Primer número de la operación.
     * @param num2 Segundo número de la operación.
     */
    public Operaciones(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    /**
     * Calcula la suma de los dos números.
     * @return El resultado de la suma.
     */
    public double suma() {
        return num1 + num2;
    }

    /**
     * Calcula la resta de los dos números.
     * @return El resultado de la resta.
     */
    public double resta() {
        return num1 - num2;
    }

    /**
     * Calcula la multiplicación de los dos números.
     * @return El resultado de la multiplicación.
     */
    public double multiplicacion() {
        return num1 * num2;
    }

    /**
     * Calcula la división de los dos números.
     * Si el segundo número es cero, devuelve cero.
     * @return El resultado de la división.
     */
    public double division() {
        double res = 0;

        if (num2 != 0) {
            res = num1 / num2;
        }
        return res;
    }

    /**
     * Devuelve el número mayor entre los dos números.
     * @return El número mayor.
     */
    public double max() {
        return num1 > num2 ? num1 : num2;
    }

    /**
     * Devuelve el número menor entre los dos números.
     * @return El número menor.
     */
    public double min() {
        return num1 < num2 ? num1 : num2;
    }
}
