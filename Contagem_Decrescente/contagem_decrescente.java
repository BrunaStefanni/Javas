public class contagem_decrescente {
        public static void main(String[] args) {

            int numero = 10;

            do {
                System.out.println(numero);
                numero--;
            } while (numero >= 0);

            System.out.println("Fim");

        }

}

/*
int numero = 10; → começa a contagem no número 10.
do { } → contém as instruções que serão executadas.
System.out.println(numero); → mostra o número no ecrã.
numero--; → diminui o número em 1 a cada repetição.
while (numero >= 0); → repete enquanto o número for maior ou igual a zero.
 */