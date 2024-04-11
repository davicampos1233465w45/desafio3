package prova;

public class FIbonacci {
    public static void main(String[] args) {
        int n = 10; // Altere esse valor para o número de termos que deseja na sequência

        System.out.println("Sequência de Fibonacci com " + n + " termos:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
