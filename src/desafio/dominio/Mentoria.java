package desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo{

    private LocalDate data;

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Mentoria: \n");
        sb.append(" -> titulo: " + getTitulo() + "\n");
        sb.append(" -> descricão: " + getDescricao() + "\n");
        sb.append(" -> data: " + data + "\n");
        return sb.toString();
    }
}
