public class Main {
    public static void main(String[] args) {
        Ints calc = new IntsCalculator();
        System.out.println(calc.sum(7, 1));
        System.out.println(calc.sub(4, 0));
        System.out.println(calc.mult(8, 3));
        System.out.println(calc.div(6, 2));
        System.out.println(calc.pow(9, 5));
    }
}