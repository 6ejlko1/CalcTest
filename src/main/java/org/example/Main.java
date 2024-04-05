package org.example;

public class Main {
    public static void main(String[] args) {

        Calculator calc = Calculator.instance.get();

        int Plus = calc.plus.apply(8, 2);
        int Minus = calc.minus.apply(6, 6);
        int Devide = calc.devide.apply(10, 2);
        int Multyply = calc.multiply.apply(2, 100);
        int Pow = calc.pow.apply(6);
        int Abs = calc.abs.apply(10);

        calc.println.accept(Plus);
        calc.println.accept(Minus);
        calc.println.accept(Multyply);
        calc.println.accept(Pow);
        calc.println.accept(Abs);

        if (Devide == 0) {
            throw new IllegalArgumentException("На 0 делить нельзя");
        } else calc.println.accept(Devide);
    }
}
