import java.util.ArrayList;

/**
 * Classe que representa uma instituição de caridade no sistema de gestão de assistência humanitária.
 */
public class InstituicaoCaridade {
    private String nome;
    private String cnpj;
    private String endereco;
    private String contato;
    private String areaAtuacao;
    private ArrayList<Voluntario> voluntarios;
    private ArrayList<Doacao> historicoDoacoesRecebidas;

    /**
     * Construtor da classe InstituicaoCaridade.
     * @param nome Nome da instituição de caridade.
     * @param cnpj Número do CNPJ da instituição de caridade.
     * @param endereco Endereço da instituição de caridade.
     * @param contato Informações de contato da instituição de caridade.
     * @param areaAtuacao Área de atuação da instituição de caridade.
     */
    public InstituicaoCaridade(String nome, String cnpj, String endereco, String contato, String areaAtuacao) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.endereco = endereco;
        this.contato = contato;
        this.areaAtuacao = areaAtuacao;
        this.voluntarios = new ArrayList<>();
        this.historicoDoacoesRecebidas = new ArrayList<>();
    }

    /**
     * Retorna o nome da instituição de caridade.
     * @return Nome da instituição de caridade.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o nome da instituição de caridade.
     * @param nome Nome da instituição de caridade.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Retorna o CNPJ da instituição de caridade.
     * @return CNPJ da instituição de caridade.
     */
    public String getCnpj() {
        return cnpj;
    }

    /**
     * Define o CNPJ da instituição de caridade.
     * @param cnpj CNPJ da instituição de caridade.
     */
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    /**
     * Retorna o endereço da instituição de caridade.
     * @return Endereço da instituição de caridade.
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * Define o endereço da instituição de caridade.
     * @param endereco Endereço da instituição de caridade.
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * Retorna as informações de contato da instituição de caridade.
     * @return Informações de contato da instituição de caridade.
     */
    public String getContato() {
        return contato;
    }

    /**
     * Define as informações de contato da instituição de caridade.
     * @param contato Informações de contato da instituição de caridade.
     */
    public void setContato(String contato) {
        this.contato = contato;
    }

    /**
     * Retorna a área de atuação da instituição de caridade.
     * @return Área de atuação da instituição de caridade.
     */
    public String getAreaAtuacao() {
        return areaAtuacao;
    }

    /**
     * Define a área de atuação da instituição de caridade.
     * @param areaAtuacao Área de atuação da instituição de caridade.
     */
    public void setAreaAtuacao(String areaAtuacao) {
        this.areaAtuacao = areaAtuacao;
    }

    /**
     * Retorna a lista de voluntários associados à instituição de caridade.
     * @return Lista de voluntários associados à instituição de caridade.
     */
    public ArrayList<Voluntario> getVoluntarios() {
        return voluntarios;
    }

    /**
     * Adiciona um voluntário à lista de voluntários associados à instituição de caridade.
     * @param voluntario Voluntário a ser adicionado à lista.
     */
    public void adicionarVoluntario(Voluntario voluntario) {
        voluntarios.add(voluntario);
    }

    /**
     * Retorna o histórico de doações recebidas pela instituição de caridade.
     * @return Lista de doações recebidas pela instituição de caridade.
     */
    public ArrayList<Doacao> getHistoricoDoacoesRecebidas() {
        return historicoDoacoesRecebidas;
    }

    /**
     * Adiciona uma doação ao histórico de doações recebidas pela instituição de caridade.
     * @param doacao Doação a ser adicionada ao histórico.
     */
    public void adicionarDoacaoRecebida(Doacao doacao) {
        historicoDoacoesRecebidas.add(doacao);
    }
}
