public class Horista extends Funcionario{
    int hora;
    float valorHora;

    public Horista(String nome, int hora, float valorHora) {
        super(nome);
        this.hora = hora;
        this.valorHora = valorHora;
    }

    public float pagamento() {
        return hora*valorHora;
    }
}
