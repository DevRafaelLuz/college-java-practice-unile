public class DisciplinaGraduacao extends Disciplina {
    public double nota;

    @Override
    public String exibirNota() {
        if (nota < 7) {
            this.resultado = "Reprovado";
        } else {
            this.resultado = "Aprovado";
        }
        return this.resultado;
    }
}
