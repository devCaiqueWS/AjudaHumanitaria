/**
 * Classe que representa um voluntário no sistema de gestão de assistência humanitária.
 */
public class Voluntario {
    private String nome;
    private String cpf;
    private String contato;

    /**
     * Construtor da classe Voluntario.
     * @param nome Nome completo do voluntário.
     * @param cpf Número do CPF do voluntário.
     * @param contato Informações de contato do voluntário.
     */
    public Voluntario(String nome, String cpf, String contato) {
        this.nome = nome;
        this.cpf = cpf;
        this.contato = contato;
    }

    /**
     * Retorna o nome do voluntário.
     * @return Nome do voluntário.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o nome do voluntário.
     * @param nome Nome do voluntário.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Retorna o CPF do voluntário.
     * @return CPF do voluntário.
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * Define o CPF do voluntário.
     * @param cpf CPF do voluntário.
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * Retorna as informações de contato do voluntário.
     * @return Informações de contato do voluntário.
     */
    public String getContato() {
        return contato;
    }

    /**
     * Define as informações de contato do voluntário.
     * @param contato Informações de contato do voluntário.
     */
    public void setContato(String contato) {
        this.contato = contato;
    }
}
