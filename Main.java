import java.util.Scanner;

public class Main{
    public static void main (String[] args){
                                            
        Scanner lerOpcao = new Scanner(System.in);
        ConversorTemperatura converter = new ConversorTemperatura();
        int opcao;
        boolean arredondar;
        String resposta;
        double ajuste;
    
        do { 
        
        listaDeOpcoes();

        System.out.println("Digite o número da opção desejada:");
        opcao = lerOpcao.nextInt();
        lerOpcao.nextLine();

            switch(opcao){
                case 1:
                    System.out.println("Digite o valor em graus Celsius:"); // entrada de dados
                        int valor = (lerOpcao.nextInt());
                    lerOpcao.nextLine(); // ler o enter do teclado     
                
                    System.out.println("Temperatura em Fahrenheit: " + converter.conversor(valor) );
                break; 

                case 2:
                    System.out.println("Digite o valor em graus Fahrenheit:"); // entrada de dados
                        double valor1 = (lerOpcao.nextDouble());
                    lerOpcao.nextLine(); // ler o enter do teclado     
                
                    System.out.println("Temperatura em Celsius: " + converter.conversor(valor1) );
                break; 

                case 3:
                    System.out.println("Digite o valor em graus Celsius:"); // entrada de dados
                        int valor2 = (lerOpcao.nextInt());
                    lerOpcao.nextLine(); // ler o enter do teclado     

                    System.out.println("Digite o valor do ajuste:"); 
                        ajuste = (lerOpcao.nextDouble());
                    lerOpcao.nextLine(); // ler o enter do teclado     

                    System.out.println("Deseja arredondar? (digite sim ou não):"); 
                        resposta = (lerOpcao.nextLine());
                    lerOpcao.nextLine(); // ler o enter do teclado   
                    
                    if(resposta == "sim"){
                        arredondar = true;
                        System.out.println("Temperatura em Fahrenheit, com ajuste de " + ajuste+ " e arredondamento :"+ converter.conversor(valor2,ajuste,arredondar) );
                    } else {
                        arredondar = false;
                        System.out.println("Temperatura em Fahrenheit, com ajuste de " + ajuste+ " :"+ converter.conversor(valor2,ajuste,arredondar) );
                    }
                break;
            
                case 4:
                    System.out.println("Digite o valor em graus Fahrenheit:"); // entrada de dados
                        double valor3 = (lerOpcao.nextDouble());
                    lerOpcao.nextLine(); // ler o enter do teclado     

                    System.out.println("Digite o valor do ajuste:");
                        ajuste = (lerOpcao.nextDouble());
                    lerOpcao.nextLine(); // ler o enter do teclado     

                    System.out.println("Deseja arredondar? (digite sim ou não):"); 
                        resposta = (lerOpcao.nextLine());
                    lerOpcao.nextLine(); // ler o enter do teclado   
                    
                    if(resposta == "sim"){
                        arredondar = true;
                        System.out.println("Temperatura em Celsius, com ajuste de " + ajuste+ " e arredondamento :"+ converter.conversor(valor3,ajuste,arredondar) );
                    } else {
                        arredondar = false;
                        System.out.println("Temperatura em Celsius, com ajuste de " + ajuste+ " :"+ converter.conversor(valor3,ajuste,arredondar) );
                    }
                    
                break; 

                case 5:
                    System.out.println("Você saiuu...:");     
                break; 

                default:
                    System.out.println("Opção não encontrada dentre as fornecidas pelo sistema!");     
                break;
            }
            
        } while(opcao!= 5); // repetir enquanto não digita a opção 5
    } 
        private static void listaDeOpcoes(){
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("Oie, seja bem vind@ ao sistema de Conversão de Temperatura! Escolha uma operação:");
        System.out.println("1 - Converter temperatura em Celsius para Fahrenheit:");
        System.out.println("2 - Converter temperatura em Fahrenheit para Celsius:");
        System.out.println("3 - Converter temperatura em Celsius para Fahrenheit, com ajuste extra e arredondamento");
        System.out.println("(ex: 30°C em F° = 86.0, com ajuste de 2 e arredondamento = 88.0) :");
        System.out.println("4 - Converter temperatura em Fahrenheit para Celsius, com ajuste extra e arredondamento");
        System.out.println("(ex: 53°F em C° = 11.6667, com ajuste de 2 e arredondamento = 14.0) :");
        System.out.println("5 - Sair do sistema!");
        }     
}