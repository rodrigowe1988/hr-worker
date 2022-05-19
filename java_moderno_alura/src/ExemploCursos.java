import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Curso {
    public String nome;
    public int alunos;

    public Curso() {}

    public Curso(String nome, int alunos) {
        this.nome = nome;
        this.alunos = alunos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAlunos() {
        return alunos;
    }

    public void setAlunos(int alunos) {
        this.alunos = alunos;
    }
}

public class ExemploCursos {
    public static void main(String[] args) {
        List<Curso> cursos = new ArrayList<Curso>();
        cursos.add(new Curso("Python", 45));
        cursos.add(new Curso("Javascript", 150));
        cursos.add(new Curso("Java 8", 113));
        cursos.add(new Curso("C", 55));

        cursos.sort(Comparator.comparing(Curso::getAlunos));

        //retorna um stream
        cursos.stream()
                .filter(c -> c.getAlunos() >= 100)
                .forEach(c -> System.out.println(c.getNome()));

        //retorna um int para poder trabalhar com o valor
        cursos.stream()
                .filter(curso -> curso.getAlunos() >= 100)
                .map(Curso::getAlunos)
                .forEach(total -> System.out.println(total));

        //soma de todos os alunos da escola
        int sum = cursos.stream()
                .mapToInt(Curso::getAlunos)
                .sum();
        System.out.println("Total de alunos: " + sum);
    }
}
