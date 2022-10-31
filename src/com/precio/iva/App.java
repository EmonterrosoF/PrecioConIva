package com.precio.iva;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("precio con iva Q" + precioConIva(20));
    }

    static float precioConIva(float precio) {
        // iva en Guatemala 12%
        float iva = precio * 0.12f;

        return precio + iva;

        // otra opcion
        // return 1.12f * precio / 1;
    }
}
