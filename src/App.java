import entities.Contato;

public class App {
    public static void main(String[] args) throws Exception {

        Contato ctt = new Contato(982065384, "Luiz Eduardo Fontenele Araujo", "Rua Almirante Soares Dutra");
        System.out.println(ctt.getNome());
        System.out.println(ctt.getEndereco());
    }
}
