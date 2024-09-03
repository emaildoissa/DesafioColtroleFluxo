import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro numero: ");
        int parametroUm = scanner.nextInt();

        System.err.println();

        System.out.print("Digite o segundo numero: ");
        int parametroDois = scanner.nextInt();

        scanner.close();
        try {
            if( parametroUm < parametroDois){
                throw new ParametrosInvalidosException("O segundo parametro não pode ser maior q o primeiro parametro");
            }
            contar(parametroUm, parametroDois);
        }catch (ParametrosInvalidosException exception){
            System.out.println("Erro: " + exception.getMessage());
        }
    }
    public static void contar(int paramentroUm, int paramentroDois) throws ParametrosInvalidosException{
        int contagem = paramentroUm - paramentroDois;
        for(int x = 1; x <= contagem; x++ ){
            System.out.println("imprimindo numero " + x);
        }
    }
}
