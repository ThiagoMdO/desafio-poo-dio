package desafio.dominio;

public class Curso extends Conteudo{
    private double cargaHoraria;


    public double getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(double cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO * 10d;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Curso: \n");
        sb.append(" -> titulo: " + getTitulo() + "\n");
        sb.append(" -> descricão: " + getDescricao() + "\n");
        sb.append(" -> carga horaria: " + cargaHoraria + "\n");
        return sb.toString();
    }
}
