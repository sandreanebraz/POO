public class Comissionado extends Funcionario{
    float venda;
    float comissao;

    public Comissionado(String nome, float venda, float comissao) {
        super(nome);
        this.venda = venda;
        this.comissao = comissao;
    }

    public float pagamento() {
        return venda*comissao;
    }
}
