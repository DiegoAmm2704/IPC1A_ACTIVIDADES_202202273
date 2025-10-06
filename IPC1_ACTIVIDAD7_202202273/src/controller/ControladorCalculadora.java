package controller;

import model.Calculadora;
import model.Usuario;

public class ControladorCalculadora {
    private Calculadora calculadora;
    private Usuario usuario;

    public ControladorCalculadora(Usuario usuario, Calculadora calculadora) {
        this.usuario = usuario;
        this.calculadora = calculadora;
    }
    public double sumar(double a, double b) {
        double res = calculadora.sumar(a, b);
        return res;
    }

    public double restar(double a, double b) {
        return calculadora.restar(a,b);
    }

    public double multiplicar(double a, double b) {
        return calculadora.multiplicar(a,b);
    }

    public double dividir(double a, double b) {
        return calculadora.dividir(a,b);
    }

    public Usuario getUsuario() {
        return usuario;
    }
}
