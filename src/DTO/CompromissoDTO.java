
package DTO;


public class CompromissoDTO {
    private String data;
    private String horario;
    private String descricao;
    private String clienteAssociado;

    public CompromissoDTO(String data, String horario, String descricao, String clienteAssociado) {
        this.data = data;
        this.horario = horario;
        this.descricao = descricao;
        this.clienteAssociado = clienteAssociado;
    }

    // Getters e Setters
    public String getData() { return data; }
    public void setData(String data) { this.data = data; }

    public String getHorario() { return horario; }
    public void setHorario(String horario) { this.horario = horario; }

    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }

    public String getClienteAssociado() { return clienteAssociado; }
    public void setClienteAssociado(String clienteAssociado) { this.clienteAssociado = clienteAssociado; }
}

