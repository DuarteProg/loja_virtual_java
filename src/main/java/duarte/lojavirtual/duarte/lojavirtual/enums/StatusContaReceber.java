package duarte.lojavirtual.duarte.lojavirtual.enums;

public enum StatusContaReceber {

    COBRANCA("Pagar"),
    VENCIDA("Vencida"),
    ABERTA("Aberta"),
    QUITADA("Quitada");

    private String descricao;

    StatusContaReceber(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return this.getDescricao();
    }
}
