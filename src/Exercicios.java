public class Exercicios {
    public static void main(String[] args) {
        int i, num = 100, totalPares = 0;

        System.out.println("1. Lista de numeros de 100 ate 200"); //exercicio 1, numeros de 100 a 200
        while (num < 201) {
            System.out.println(num);
            num++;
        }
        for (num = 2; num < 1001; num += 2) { //exercicio 2, numeros de 100 a 200
            totalPares += num;
        }
        System.out.printf("\n2. Soma de pares = %d\n" ,totalPares);
        System.out.println("\n3. Lista de multiplos de 5 de 1 ate 100"); //exercicio 3, multiplos de 5 a de 1 a 100
        for (num = 5; num < 101; num += 5) {
            System.out.println(num);
        }
        System.out.println("\n4. Lista de fatorias de 1 a 6"); //exercicio 4, fatoriais de 1 a 6
        num=1;
        for(i=1;i<=6;i++){
            num=num*i;
            System.out.println(num);
        }
        System.out.println("\n5. Lista da sequencia de fibonacii ate 50"); //exercicio 5, fibonacci ate 50
        int n0=0,n1=1;
        System.out.printf("%d\n%d\n",n0,n1);
        for(i=2;i<10;++i){
            num=n0+n1;
            System.out.println(num);
            n0=n1;
            n1=num;
        }
        System.out.println("\n6. Lista de numeros dependente da paridade, ate chegar a 1"); //exercicio 6, x até 1
        int x=13;
        System.out.printf("\nPara x = %d\n", x);
        while(x!=1) {
            if(x%2 == 0) {
                x = x / 2;
                System.out.printf("%d -> ",x);
            }
            else {
                x = 3*x + 1;
                System.out.printf("%d -> ",x);
            }
        }
        System.out.print("Fim");
    }
}
