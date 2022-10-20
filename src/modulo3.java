class Professor {
    private String nome;
    private int idade;
    private String tipo;

    public void imprimeNome() {
        System.out.println(nome);
    }

    public void imprimeIdade() {
        System.out.println(idade);
    }

    public void imprimeSexo() {
        System.out.println(tipo);
    }

    public Professor(String n, int i, String s) {
        nome = n;
        idade = i;
        tipo = s;
    }


    public static void main(String[] args) {
        Professor professor1;
        professor1 = new Professor("João",25,"Parcial");
        professor1.imprimeNome();
        professor1.imprimeIdade();
        professor1.imprimeSexo();
    }
}

