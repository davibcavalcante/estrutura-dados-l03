public class ListaDuplamenteEncadeada {
    IntNoDuplo primeiro, ultimo;

    ListaDuplamenteEncadeada() {
        primeiro = ultimo = null;
    }

    void insereNoFim(IntNoDuplo novoNo) {
        if (primeiro == null) {
            primeiro = ultimo = novoNo;
        } else {
            ultimo.prox = novoNo;
            novoNo.ant = ultimo;
            ultimo = novoNo;
        }
    }

    void ordenaLista() {
        if (primeiro == null || primeiro.prox == null) {
            return;
        }

        IntNoDuplo atual = primeiro.prox;
        while (atual != null) {
            IntNoDuplo temp = atual;
            int valorTemp = temp.valor;
            IntNoDuplo anterior = temp.ant;

            while (anterior != null && anterior.valor > valorTemp) {
                anterior.prox.valor = anterior.valor;
                anterior = anterior.ant;
            }

            if (anterior == null) {
                primeiro.valor = valorTemp;
            } else {
                anterior.prox.valor = valorTemp;
            }

            atual = atual.prox;
        }
    }

    void exibeLista() {
        IntNoDuplo temp_no = primeiro;
        int i = 0;
        while (temp_no != null) {
            System.out.println("Valor " + temp_no.valor + " posicao " + i);
            temp_no = temp_no.prox;
            i++;
        }
    }
}