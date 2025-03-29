import java.util.Scanner;

public class Main{
    public static void main (String[] args){
                                            
        Scanner lerOpcao = new Scanner(System.in);
        ConversorTemperatura converter = new ConversorTemperatura();
        int opcao;
    
        do { 
        
        listaDeOpcoes();

        System.out.println("Digite o número da opção desejada:");
        opcao = lerOpcao.nextInt();
        //lerOpcao.nextLine(); // coloquei e deu certo para ler e apresentar o nome

            switch(opcao){
                case 1:
                    System.out.println("Digite o valor em graus Celsius:"); // entrada de dados
                    converter.celsius(lerOpcao.nextDouble());
                    lerOpcao.nextLine(); // ler o enter do teclado
                    
                    double resultado = converter.conversor();
                
                    System.out.println("Temperatura em Fahrenheit: " + resultado );
                break; 

                // case 2:
                //     System.out.println("Digite o novo nome:"); // entrada de novos dados
                //     pessoa1.setNome(lerOpcao.nextLine());
                //     lerOpcao.nextLine();
                
                //     System.out.println("Digite a nova idade:");
                //     pessoa1.setIdade(lerOpcao.nextInt());
                //     lerOpcao.nextLine();

                //     System.out.println("Digite o novo e-mail:");
                //     pessoa1.setEmail(lerOpcao.nextLine());
                //     lerOpcao.nextLine();

                //     System.out.println("Dados atualizados com sucesso!:) ");
                // break; 

                case 3:
                    System.out.println("Você saiuu...:");     
                break; 

                default:
                    System.out.println("Opção não encontrada dentre as fornecidas pelo sistema!");     
                break;
            }
            
        } while(opcao!= 3); // repetir enquanto não digita a opção 3
    }

        private static void listaDeOpcoes(){
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("Oie, seja bem vind@ ao sistema de Conversão de Temperatura! Escolha uma operação:");
        System.out.println("1 - Converter temperatura em Celsius para Fahrenheit:");
        System.out.println("2 - Converter temperatura em Fahrenheit para Celsius:");
        System.out.println("3 - Sair do sistema!");
        }
}