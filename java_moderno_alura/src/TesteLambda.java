import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class TesteLambda {
    public static void main(String[] args) {

        List<String> palavras = new ArrayList<String>();
        palavras.add("palavra 1");
        palavras.add("word 2");
        palavras.add("palabra 3");
        System.out.println("Original -> " + palavras);
        Collections.sort(palavras);
        System.out.println("Ordem alfabética -> " + palavras);

        palavras.sort(Comparator.comparingInt(String::length));
        System.out.println("Por tamanho -> " + palavras);

        Consumer<String> consumidor = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };
        palavras.forEach(consumidor);
    }
}

