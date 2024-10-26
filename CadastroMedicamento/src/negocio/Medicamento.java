package negocio;

import java.time.LocalDate;

public class Medicamento {
    private int id;
    private String nome;
    private String principioAtivo;
    private LocalDate dataFabricacao;
    private LocalDate dataValidade;
    private String medicamentoControlado;
    private String medicamentoLiquidoOuComprimido;

    public static int proximoIdMedicamento = 1;


    public Medicamento(String nome, String principioAtivo, LocalDate dataFabricacao, LocalDate dataValidade, int id, String medicamentoControlado, String medicamentoLiquidoOuComprimido){
        this.setNome(nome);
        this.setPrincipioAtivo(principioAtivo);
        this.setDataFabricacao(dataFabricacao);
        this.setDataValidade(dataValidade);
        this.setMedicamentoControlado(medicamentoControlado);
        this.setMedicamentoLiquidoOuComprimido(medicamentoLiquidoOuComprimido);
    }

    public Medicamento() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPrincipioAtivo() {
        return principioAtivo;
    }

    public void setPrincipioAtivo(String principioAtivo) {
        this.principioAtivo = principioAtivo;
    }

    public LocalDate getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(LocalDate dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    public LocalDate getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(LocalDate dataValidade) {
        this.dataValidade = dataValidade;
    }

    public String getMedicamentoControlado() {
        return medicamentoControlado;
    }

    public void setMedicamentoControlado(String medicamentoControlado) {
        this.medicamentoControlado = medicamentoControlado;
    }

    public String getMedicamentoLiquidoOuComprimido() {
        return medicamentoLiquidoOuComprimido;
    }

    public void setMedicamentoLiquidoOuComprimido(String medicamentoLiquidoOuComprimido) {
        this.medicamentoLiquidoOuComprimido = medicamentoLiquidoOuComprimido;
    }

    public static int getProximoIdMedicamento() {
        return proximoIdMedicamento++;
    }

    @Override
    public String toString() {
        return "Medicamento{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", principioAtivo='" + principioAtivo + '\'' +
                ", dataFabricacao=" + dataFabricacao +
                ", dataValidade=" + dataValidade +
                ", medicamentoControlado='" + medicamentoControlado + '\'' +
                ", medicamentoLiquidoOuComprimido='" + medicamentoLiquidoOuComprimido + '\'' +
                '}';
    }
}

