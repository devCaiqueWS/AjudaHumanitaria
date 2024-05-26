import java.util.ArrayList;

/**
 * Classe que representa um doador no sistema de gestão de assistência humanitária.
 */
public class Doador {
    private String nome;
    private String cpf;
    private String endereco;
    private String contato;
    private ArrayList<Doacao> historicoDoacoes;

    /**
     * Construtor da classe Doador.
     * @param nome Nome completo do doador.
     * @param cpf Número do CPF do doador.
     * @param endereco Endereço do doador.
     * @param contato Informações de contato do doador.
     */
    public Doador(String nome, String cpf, String endereco, String contato) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.contato = contato;
        this.historicoDoacoes = new ArrayList<>();
    }

    /**
     * Retorna o nome do doador.
     * @return Nome do doador.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o nome do doador.
     * @param nome Nome do doador.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Retorna o CPF do doador.
     * @return CPF do doador.
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * Define o CPF do doador.
     * @param cpf CPF do doador.
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * Retorna o endereço do doador.
     * @return Endereço do doador.
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * Define o endereço do doador.
     * @param endereco Endereço do doador.
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * Retorna as informações de contato do doador.
     * @return Informações de contato do doador.
     */
    public String getContato() {
        return contato;
    }

    /**
     * Define as informações de contato do doador.
     * @param contato Informações de contato do doador.
     */
    public void setContato(String contato) {
        this.contato = contato;
    }

    /**
     * Retorna o histórico de doações realizadas pelo doador.
     * @return Lista de doações realizadas pelo doador.
     */
    public ArrayList<Doacao> getHistoricoDoacoes() {
        return historicoDoacoes;
    }

    /**
     * Adiciona uma doação ao histórico do doador.
     * @param doacao Doação a ser adicionada ao histórico do doador.
     */
    public void adicionarDoacao(Doacao doacao) {
        historicoDoacoes.add(doacao);
    }
}
