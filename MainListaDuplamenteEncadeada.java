import java.io.*;

public class MainListaDuplamenteEncadeada {

    public static void escolhas() {
        System.out.print("Escolha a Opcao:");
        System.out.print(" \n1. Inserir Nó no fim");
        System.out.print(" \n2. Exibir Lista");
        System.out.print(" \n3. Ordenar Lista");
        System.out.print(" \n4. Sair");
        System.out.print("\nOpcao :\t ");
    }

    public static void main(String args[]) {
        ListaDuplamenteEncadeada Dlist = new ListaDuplamenteEncadeada();
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        int valor;

        try {
            escolhas();
            char opcao = entrada.readLine().charAt(0);
            while (opcao != '4') {
                switch (opcao) {
                    case '1' -> {
                        System.out.println("Insira um Nó no final da lista:");
                        System.out.println("Digite um valor:");
                        valor = Integer.parseInt(entrada.readLine());
                        Dlist.insereNoFim(new IntNoDuplo(valor));
                        System.out.println("Elemento inserido.");
                    }
                    case '2' -> {
                        System.out.println("Exibindo lista na ordem de inserção:");
                        Dlist.exibeLista();
                    }
                    case '3' -> {
                        System.out.println("Ordenando a lista...");
                        Dlist.ordenaLista();
                        System.out.println("Lista ordenada com sucesso!");
                    }
                    default -> System.out.println("Opcao Invalida!");
                }
                escolhas();
                opcao = entrada.readLine().charAt(0);
            }
        } catch (IOException | NumberFormatException erro) {
            System.out.println("Erro de Entrada de Dados");
        }
    }
}
