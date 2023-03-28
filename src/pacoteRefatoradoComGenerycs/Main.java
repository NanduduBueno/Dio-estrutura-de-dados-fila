package pacoteRefatoradoComGenerycs;

public class Main {
    public static void main(String[] args){
        FilaRefatoradaComGenerycs<String> minhaFila = new FilaRefatoradaComGenerycs<>();

        minhaFila.enqueue("primeiro");
        minhaFila.enqueue("segundo");
        minhaFila.enqueue("terceiro");
        minhaFila.enqueue("quarto");

        System.out.println(minhaFila);

        System.out.println(minhaFila.dequeue());

        System.out.println(minhaFila);

        System.out.println(minhaFila.first());

        System.out.println(minhaFila.dequeue());

        System.out.println(minhaFila.first());
    }
}
