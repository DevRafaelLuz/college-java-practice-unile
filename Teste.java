public class Teste {
    public static void main(String[] args) {
        DisciplinaGraduacao dg = new DisciplinaGraduacao();
        dg.nome = "Design Patterns";
        dg.nota = 7;

        DisciplinaEspecializacao de = new DisciplinaEspecializacao();
        de.nome = "Gestão de Projetos";
        de.conceito = "B";

        System.out.println("Resultado Design Patterns: " + dg.exibirNota());
        System.out.println("Resultado de Gestão de Projetos: " + de.exibirNota());
    }
}
