import entities.Contato;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {

        List<Contato> contatos = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        int opc = -1;
       
        while (opc != -1){
            System.out.println("---------MENU---------");
            System.out.println("1. Adicionar Contato");
            System.out.println("2. Excluir Contato");
            System.out.print("3. Visualizar Lista de Contatos");
            System.out.println("0. Sair!");

            opc = scan.nextInt();

            switch (opc) {
                case 1:
                    
                        System.out.println("Digite o Nome do Contato: ");
                        String nome = scan.nextLine();
                        System.out.println("Digite o Número de Telefone: ");
                        long telefone = scan.nextLong();
                        System.out.println("Digite o Endereço: ");
                        String endereco = scan.nextLine();
                        scan.nextLine();
                        int id = contatos.size() + 1;
                        Contato novoContato = new Contato(telefone, nome, endereco, id);
                    break;
               
                case 2:

                System.out.print("Digite o ID do Contato a Ser Excluido");
                int exclusao = scan.nextInt();
                contatos.removeIf(excluirid -> excluirid.getId()== exclusao);
                System.out.println("Contato Removido");
                    break;
                
                case 3:
                    System.out.println("-----LISTA DE CONTATOS-----");
                    for (Contato c : contatos ){
                        System.out.println(c);
                    }
                    break;

                case 0:
                    System.out.print("Encerrando Programa");
            }
        }
    
    }
}
