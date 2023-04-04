public class Sessao {

    private int[][] cadeiras = new int[10][15];
    private Filme filme;

    // Construtor
    public Sessao(Filme filme) {
        this.filme = filme;
    }
    
    // Gets & Sets
    public Filme getFilme() {
        return filme;
    }
    public void setFilme(Filme filme) {
        this.filme = filme;
    }

    // Métodos
    public void alternarDisponibilidade(int i, int j) {
        // 0 é disponível e 1 siginifica indisponível
        if(cadeiras[i][j] == 0){
            this.cadeiras[i][j] = 1;
        }else if(cadeiras[i][j] == 1){
            this.cadeiras[i][j] = 0;
        }
    }
    // Mostra um mapa de cadeiras disponíveis (D) e indisponíveis (I)
    public void exibirCadeiras(){
        char[] alfabeto = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'};

        System.out.println("  1 2 3 4 5 6 7 8 9 10 11 12 13 14 15");
        for(int i = 0; i < 10; i++){
            System.out.print(alfabeto[i] + " ");
            for(int j = 0; j < 15; j++){
               if(this.cadeiras[i][j] == 0) {
                System.out.print("D ");
               }
               else {
                System.out.print("I ");
               }
            }
            System.out.println();
        }
    }
}
