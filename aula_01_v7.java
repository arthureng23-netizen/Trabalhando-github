public class aula_01_v7 {
    public static void main(String[] args) {
        int i = 1, soma = 0;
        while(i <= 50) {
            if(i % 2 == 0) {
                System.out.println(i);
                soma += i;
            }
            i++;
        }
        System.out.println("A soma dos números pares é: " + soma);
    }
}