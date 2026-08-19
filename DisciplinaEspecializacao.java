public class DisciplinaEspecializacao extends Disciplina {
    public String conceito;

    @Override
    public String exibirNota() {
        if (this.conceito.equals("D")) {
            this.resultado = "Reprovado";
        } else {
            this.resultado = "Aprovado";
        }
        return this.resultado;
    }

}
