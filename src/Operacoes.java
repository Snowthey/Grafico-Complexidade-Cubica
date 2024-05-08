public class Operacoes {

    public int multiplicarMatrizes(int [][] matriz1, int[][] matriz2){
        int linhas1 = matriz1.length;
        int colunas1 = matriz1[0].length;
        int linhas2 = matriz2.length;
        int colunas2 = matriz2[0].length;

        if(colunas1 != colunas2){
            return -1;
        }

        int[][] resultado = new int[linhas1][colunas2];
        int operacoes = 0;

        for(int i = 0; i < linhas1; i++){
            for(int j = 0; j < colunas2; j++){
                for(int k = 0; k < colunas1; k++){
                    resultado[i][j] += matriz1[i][k] * matriz2[k][j];
                    operacoes++;
                }
            }
        }

        return operacoes;
    }
}
