import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcao;
        do {
            System.out.println("Menu de Seleção:");
            System.out.println("1. Cadastrar Doador");
            System.out.println("2. Cadastrar Instituição de Caridade");
            System.out.println("3. Cadastrar Doação");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    cadastrarDoador(scanner);
                    break;
                case 2:
                    cadastrarInstituicaoCaridade(scanner);
                    break;
                case 3:
                    cadastrarDoacao(scanner);
                    break;
                case 0:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha novamente.");
            }
        } while (opcao != 0);

        scanner.close();
    }

    private static void cadastrarDoador(Scanner scanner) {
        System.out.println("\nCadastro de Doador:");
        System.out.print("Nome: ");
        String nomeDoador = scanner.nextLine();
        System.out.print("CPF: ");
        String cpfDoador = scanner.nextLine();
        System.out.print("Endereço: ");
        String enderecoDoador = scanner.nextLine();
        System.out.print("Contato: ");
        String contatoDoador = scanner.nextLine();
        Doador doador = new Doador(nomeDoador, cpfDoador, enderecoDoador, contatoDoador);


        System.out.println("\nDoador cadastrado com sucesso:");
        System.out.println("Nome: " + doador.getNome());
        System.out.println("CPF: " + doador.getCpf());
        System.out.println("Endereço: " + doador.getEndereco());
        System.out.println("Contato: " + doador.getContato());
    }

    private static void cadastrarInstituicaoCaridade(Scanner scanner) {
        System.out.println("\nCadastro de Instituição de Caridade:");
        System.out.print("Nome: ");
        String nomeInstituicao = scanner.nextLine();
        System.out.print("CNPJ: ");
        String cnpjInstituicao = scanner.nextLine();
        System.out.print("Endereço: ");
        String enderecoInstituicao = scanner.nextLine();
        System.out.print("Contato: ");
        String contatoInstituicao = scanner.nextLine();
        System.out.print("Área de atuação: ");
        String areaAtuacaoInstituicao = scanner.nextLine();
        InstituicaoCaridade instituicao = new InstituicaoCaridade(nomeInstituicao, cnpjInstituicao, enderecoInstituicao, contatoInstituicao, areaAtuacaoInstituicao);


        System.out.println("\nInstituição de caridade cadastrada com sucesso:");
        System.out.println("Nome: " + instituicao.getNome());
        System.out.println("CNPJ: " + instituicao.getCnpj());
        System.out.println("Endereço: " + instituicao.getEndereco());
        System.out.println("Contato: " + instituicao.getContato());
        System.out.println("Área de Atuação: " + instituicao.getAreaAtuacao());
    }

    private static void cadastrarDoacao(Scanner scanner) {
        System.out.println("\nCadastro de Doação:");
        System.out.print("Tipo: ");
        String tipoDoacao = scanner.nextLine();
        System.out.print("Valor: ");
        double valorDoacao = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Data (dd/mm/aaaa): ");
        String dataDoacaoStr = scanner.nextLine();
        Date dataDoacao = new Date(dataDoacaoStr);

        Doacao doacao = new Doacao(tipoDoacao, valorDoacao, dataDoacao);


        System.out.println("\nDoação cadastrada com sucesso:");
        System.out.println("Tipo: " + doacao.getTipo());
        System.out.println("Valor: " + doacao.getValor());
        System.out.println("Data: " + doacao.getData());
    }
}
