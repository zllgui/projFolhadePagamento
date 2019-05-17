
import java.util.Scanner;



/**
 *
 * @author Guilherme Luzzi
 */
public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        Funcionario f1 = new Funcionario();
        
        byte menu;
        
        do{
            System.out.println("Digite \n1-Digitar dados\n2-Ver dados\n3-Ver respostas\n0-Sair");
            menu = ler.nextByte();
            switch(menu){
                case 1:
                    System.out.println("Digite seu nome: ");
                    ler.nextLine();
                    f1.nome = ler.nextLine();
                    System.out.println("Digite seu cargo: ");
                    f1.cargo = ler.nextLine();
                do{    
                    System.out.println("Digite seu CPF: ");
                    f1.cpf = ler.nextLine();
                        if(f1.cpf.length() !=11){
                            System.out.println("Erro! Digite um CPF válido:");
                        }
                }while(f1.cpf.length() !=11);        
                    
                do{
                    System.out.println("Infomr o valor da hora: ");
                    f1.valorHora = ler.nextDouble();
                        if(f1.valorHora<0){
                            System.out.println("Erro! valores válidos");
                        }
                }while(f1.valorHora<0);
                
                do{
                    System.out.println("Informe o valor de horas trabalhadas: ");
                    f1.horasTrabalhadas = ler.nextDouble();
                        if(f1.horasTrabalhadas<0){
                            System.out.println("Erro! Digite horas válidas");
                        }
                }while(f1.horasTrabalhadas<0);
                
                do{
                    System.out.println("Informe o número de dependentes: ");
                    f1.quantidadeDependentes = ler.nextByte();
                        if(f1.quantidadeDependentes<0 || f1.quantidadeDependentes>6){
                            System.out.println("Erro! Dependentes demais");
                        }
                }while(f1.quantidadeDependentes<0 || f1.quantidadeDependentes>6);
                
                do{
                    System.out.println("Informe o valor da passagem: ");
                    f1.valorTotalPassagem = ler.nextDouble();
                        if(f1.valorTotalPassagem<0){
                            System.out.println("Erro! Digite um valor válido");
                        }
                }while(f1.valorTotalPassagem<0);
                
                do{
                    System.out.println("Informa o tipo de insalubridade: \n1-Nenhum\n2-Mínimo\n3-Média\n4-Máxima");
                    f1.tipoInsalubridade = ler.nextByte();
                        if(f1.tipoInsalubridade<0){
                            System.out.println("Erro! Tipo inexistente");
                        }
                }while(f1.tipoInsalubridade<0);
                    break;
                case 2:
                    System.out.println(f1);
                    break;
                case 3: 
                     System.out.println("\n\n----------------");
                     System.out.println("Respostas:");
                     System.out.println("Seu nome é: " +f1.nome);
                     System.out.println("Seu cargo é: " +f1.cargo);
                     System.out.println("Seu CPF é: " +f1.cpf);
                     System.out.println("Seu salário bruto é:" +f1.calcularSalario());
                     System.out.println("O tipo de insalubridade é: " +f1.tipoInsalubridade);
                     System.out.println("O Benefício de dependentes é: " +f1.calcularBeneficioDependentes());
                     System.out.println("O valor do vale transporte é: " +f1.calcularValeTransporte());
                     System.out.println("O Inss é: " +f1.calcularInss());
                     System.out.println("Seu salário liquido é: " +f1.calcularSalarioLiquido());
                    break;
                case 0:
                     System.out.println("Obrigado campeão! Volte sempre");
                     break;
                default:
                    System.out.println("Opção inválida");
            }
        }while(menu!=0);
    }
    
}
