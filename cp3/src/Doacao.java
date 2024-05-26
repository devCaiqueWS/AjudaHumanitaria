import java.util.Date;

/**
 * Classe que representa uma doação no sistema de gestão de assistência humanitária.
 */
public class Doacao {
    private String tipo;
    private double valor;
    private Date data;

    /**
     * Construtor da classe Doacao.
     * @param tipo Tipo de doação.
     * @param valor Valor da doação.
     * @param data Data da doação.
     */
    public Doacao(String tipo, double valor, Date data) {
        this.tipo = tipo;
        this.valor = valor;
        this.data = data;
    }

    /**
     * Retorna o tipo da doação.
     * @return Tipo da doação.
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Define o tipo da doação.
     * @param tipo Tipo da doação.
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * Retorna o valor da doação.
     * @return Valor da doação.
     */
    public double getValor() {
        return valor;
    }

    /**
     * Define o valor da doação.
     * @param valor Valor da doação.
     */
    public void setValor(double valor) {
        this.valor = valor;
    }

    /**
     * Retorna a data da doação.
     * @return Data da doação.
     */
    public Date getData() {
        return data;
    }

    /**
     * Define a data da doação.
     * @param data Data da doação.
     */
    public void setData(Date data) {
        this.data = data;
    }
}
