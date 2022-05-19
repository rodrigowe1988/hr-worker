import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class TesteCollections {
    public static void main(String[] args) {

        List<String> palavras = new ArrayList<String>();
        palavras.add("palavra 1");
        palavras.add("word 2");
        palavras.add("palabra 3");
        System.out.println("Original -> " + palavras);
        Collections.sort(palavras);
        System.out.println("Ordem alfabética -> " + palavras);
        Comparator<String> comparador = new ComparadorPorTamanho();
        Collections.sort(palavras, comparador);
        System.out.println("Por tamanho -> " + palavras);

        Consumer<String> consumidor = new ImprimeNaLinha();
        palavras.forEach(consumidor);
    }
}

class ImprimeNaLinha implements Consumer<String> {
    @Override
    public void accept(String s) {
        System.out.println(s);
    }
}

class ComparadorPorTamanho implements Comparator<String> {

    @Override
    public int compare(String s1, String s2) {
        if(s1.length() < s2.length())
            return -1;
        else if (s1.length() > s2.length())
            return 1;
        return 0;
    }
}