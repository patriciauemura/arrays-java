package br.com.dio.exercicios.arrays;

public class Ex5_Matrizes {
    public static void main(String[] args) {
        int[] idades = new int[10]; //indicando quantidade de espaços
        idades[0]=27; //atribuindo valor a posição
        idades[1]=31;
        System.out.println("idade 0: " + idades[0]);
        System.out.println("idade 1: " + idades[1]);
        System.out.println("idade 2: " + idades[2]);

        int[] i = {10,25}; //indica os elementos, presume-se o tamanho
        System.out.println("i 0: " + i[0]);
        System.out.println("i 1: " + i[1]);

        int[] k = new int[] {1,2,3}; //indica a qtde e elementos
        System.out.println("k 0: " + k[0]);
        System.out.println("k 1: " + k[1]);
        System.out.println("k 2: " + k[2]);


        //for each
        idades = new int[] {12,35,45,22,9,37,51,61};
        for (int idade:idades) { //para cada elemento em idades, atribuir para variável int idade
            System.out.println("idade: " + idade);
        }

        for (int a = 0; a < idades.length; a++){ //se precisar de acesso ao índice do elemento esta opção é melhor
            int idade = idades[a];
            System.out.println("idade: " + idade);
        }

        //é possível ter estruturas de controle dentro do for
        for (int idade:idades) {
            if (idade >= 18) {
                System.out.println("Idade " + idade + " é maior que 18 anos");
            }
        }

        for (int a = 0; a < idades.length; a++) {
            int idade = idades[a];
            if (idade >= 18) {
                System.out.println("Idade " + idade + " é maior que 18 anos");
            }
        }


        // matrizes
        long[][] m = new long[3][3];

        char[][] jogo = new char[3][3];
        jogo[0][0] = 'X';
        jogo[2][1] = 'O';
        System.out.println("Posição 0 " + jogo [0][0]);
        System.out.println("Posição 8 " + jogo [2][1]);

        int[][][] n = new int[3][3][3];
        n[0][0][0] = 10;
        n[1][1][0] = 15;

        int[][] b = new int[][] {{1,2},{3,4}};
        int[][] l = {{5,6},{7,8}};
        int[][][] t = new int[][][] {{{1,2},{3,4}},{{5,6}, {7, 8}}};
        int[][][]  x = {{{9,10},{11,12}},{{13,14},{15,16}}};

        //percorrendo matrizes
        int[][] idades_ = new int[][] {{12,35},{45,22}};

        for (int[] id1 : idades_) { //um for para cada dimensão
            for (int id2 : id1) {
                System.out.println(id2);
            }
        }

        for (int c = 0; c < idades_.length; c++) {
            int[] id = idades_[c];
            for (int d = 0; d < id.length; d++){
                System.out.println(idades_[c][d]);
            }
        }

        byte[] bytes = new byte[2];
        bytes[1] = 100;

        float[] floats = new float[2];
        floats[1] = 10.98f;

        for (byte byte_ : bytes) {
            System.out.println("byte: " + byte_);
        }

        for (float float_ : floats) {
            System.out.println("float " + float_);
        }

    }
}
