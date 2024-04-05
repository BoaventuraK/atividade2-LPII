package questao3;

import java.util.Scanner;
import questao3.Operacoes;

public class AppCalculadora {
    public static void main(String[] args){
        int operacao=0;
        double num1=0, num2=0, resultado=0;

        Scanner sc=new Scanner(System.in);
        Operacoes op=new Operacoes();

        do {
            System.out.println("MENU: ");
            System.out.println("(1) - soma");
            System.out.println("(2) - Subtração");
            System.out.println("(3) - Divisão");
            System.out.println("(4) - Multiplicação");
            System.out.println("(5) - Finalizar programa");
            operacao=sc.nextInt();

            if(operacao==1||operacao==2||operacao==3||operacao==4){
                System.out.println("Informe um valor para num1: ");
                num1=sc.nextDouble();

                System.out.println("Informe um valor para num2: ");
                num2=sc.nextDouble();
            }

            switch (operacao) {
                case 1:
                    resultado = op.somaValores(num1, num2);
                    System.out.println(String.format("O resultado é: %.2f",resultado));
                    break;

                case 2:
                    resultado = op.subitraiValores(num1, num2);
                    System.out.println(String.format("O resultado é: %.2f",resultado));
                    break;

                case 3:
                    resultado = op.divideValores(num1, num2);
                    System.out.println(String.format("O resultado é: %.2f",resultado));
                    break;

                case 4:
                    resultado = op.multiplicaValores(num1, num2);
                    System.out.println(String.format("O resultado é: %.2f",resultado));
                    break;

                case 5:
                    System.out.println("Terminando programa!");
                    break;

                default:
                    System.out.println("Essa opção não existe. Tente novamente!");
                    break;
            }
        }while (operacao != 5);

        sc.close();
    }
}
