import java.util.Scanner;

public class desafio {
    public static void main(String[] args) {
        Ex1();
        Ex2();
        Ex5();
    }

    public static void Ex1(){

int INDICE = 13, SOMA = 0, K = 0;

while( K < INDICE )

{

K = K + 1;

SOMA = SOMA + K;

}
System.out.println(SOMA);

// Ao final do processamento, qual será o valor da variável SOMA? R=91
}

public static void Ex2 (){
    Scanner scanner = new Scanner(System.in);

    int numeroVerificar = 13;  

    if (verificarFibonacci(numeroVerificar)) {
        System.out.println(numeroVerificar + " pertence à sequência de Fibonacci.");
    } else {
        System.out.println(numeroVerificar + " não pertence à sequência de Fibonacci.");
    }
}

static boolean verificarFibonacci(int numero) {
    int primeiro = 0, segundo = 1, proximo = 0;

    while (proximo < numero) {
        if (proximo == numero) {
            return true;
        }
        proximo = primeiro + segundo;
        primeiro = segundo;
        segundo = proximo;
    }

    return false;
}
    
    
/*Ex 3: 
 * a) cada número da sequencia adiciona o valor 2
 * b) cada numero se multiplica por 2
 * c) cada numero ao quadrado, ex: 0 ao quadrado = 0, 1 ao quadrado = 1, 2 ao quadrado = 4
 * d) o numero anterior é multiplicado por 2
 * e) fibonacci, alem de facilmente reconhecido por começar com 1 1, segue a logica de se somar aos 2 numeros anteriores
 * f) entre os primeiros dois numeros, adiciona 8, entre os proximos 2 numeros, adiciona 2, e entre os proximos 2, adiciona só 1. não parece ter uma sequencia logica de numeros, porem a sonoridade é semelhante, então acredito que o proximo seja 200, ja que o inicio se fala igual aos outros numeros.

Ex 4:
Considerando que eu tenha todos os interrupitores em uma sala só, eu ligo 2, um desses 2 eu apago depois de um tempo. vou para uma das salas e vejo qual o estado da lampada, se está acesa (o que significa que é esse interruptor), se está apagada porém com uma leve luz que fica logo apos apagar a luz, o que significa que é aquela ja que a luz acendeu, ou se nunca sequer apagou. basta repetir isso 2 vezes para descobrir de qual sala fica cada interruptor, pois, no ultimo caso basta ir por eliminação.
 */

 public static void Ex5 (){
    String palavra = "Ohana";
    String palavraInvertida ="";
    for (int i = palavra.length() - 1; i >= 0; i--) {
            palavraInvertida += palavra.charAt(i);
        } System.out.println(palavraInvertida);
 }

}



