import java.util.Scanner; // Importa a classe Scanner para ler entradas do teclado

// Declara a classe principal
class Main {
    public static void main(String[] args) {
        // Declaração das variáveis para armazenar os números e a operação escolhida
        int num1, num2;
        int operador;

        // Cria o objeto Scanner para ler a entrada do usuário
        Scanner le = new Scanner(System.in);
        
        // Solicita e lê o primeiro número
        System.out.println("Entre com o numero 1");
        num1 = le.nextInt();

        // Solicita e lê o segundo número
        System.out.println("Entre com o numero 2");
        num2 = le.nextInt();
        
        // Exibe o menu de operações e solicita a escolha do usuário
        System.out.println("Qual operacao: "+ "\n1 - Soma\n2 -"+ " Subtracao \n3 - Multiplicacao"+"\n4 - Divisao");
        operador = le.nextInt(); // Lê a operação escolhida
        
        // Usa switch para executar a operação correspondente
        switch(operador){
            case 1: // Soma
                num1 += num2;
                System.out.println("Resultado soma: " + num1);
                break;
                
            case 2: // Subtração (ATENÇÃO: está subtraindo ao contrário: num2 - num1)
                num2 -= num1;
                System.out.println("Resultado subtracao: " + num2);
                break;

            case 3: // Multiplicação
                num1 *= num2;
                System.out.println("Resultado multiplicacao: " + num1);
                break;

            case 4: // Divisão (cuidado com divisão por zero!)
                num1 /= num2;
                System.out.println("Resultado divisao: " + num1);
                break;
        }
    }
} // Fim da classe
