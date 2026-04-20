import java.util.Scanner;
public class aula_01_v8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite 10 números inteiros: ");
        int valor = sc.nextInt();
        if(valor == -1)
        {
            System.out.println("Programa encerrado.");
        }
        else
        {
            int soma = 0, maior = Integer.MIN_VALUE, menor = Integer.MAX_VALUE, pares = 0, impares = 0;
            float media = 0;
            for(int i = 1; i <= 9; i++){
                System.out.println("Digite o número " + i + ": ");
                valor = sc.nextInt();
                soma += valor;
                if(valor > maior) {
                    maior = valor;
                }
                if(valor < menor) {
                    menor = valor;
                }
                if(valor % 2 == 0) {
                    pares++;
                } else {
                    impares++;
                }
            }
            media = (float) soma / 10;
            System.out.println("Soma: " + soma);
            System.out.println("Média: " + media);
            System.out.println("Maior: " + maior);
            System.out.println("Menor: " + menor);
            System.out.println("Pares: " + pares);
            System.out.println("Ímpares: " + impares);
        }

    }
    }



