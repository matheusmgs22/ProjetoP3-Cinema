import java.util.Scanner;
public class Critico extends Usuario{
    private String origem;
    private double nota;
    private int quantidade_criticos = 0;
    private double notas = 0;
    private double media = 0;

    public Critico(String user, String CPF, String senha, int idade, String sexo, String email, String numeroCartao,
            String nomeCartao, String codigoVerificadorDoCartao, String origem, double nota, int quantidade_criticos) {
        super(user, CPF, senha, idade, sexo, email, numeroCartao, nomeCartao, codigoVerificadorDoCartao);
        this.origem = origem;
        this.nota = nota;
        this.quantidade_criticos = quantidade_criticos;
    }

    public Critico() {
    }
    public double getNotas() {
      return notas;
    }
    public double getMedia() {
      return media;
    }
    public String getOrigem() {
      return origem;
    }
    public void setOrigem(String origem) {
      this.origem = origem;
    }

    public double getNota() {
      return nota;
    }

    public void setNota(double nota) {
      this.nota = nota;
    }

    public int getQuantidade_criticos() {
      return quantidade_criticos;
    }

    public void setQuantidade_criticos(int quantidade_criticos) {
      this.quantidade_criticos = quantidade_criticos;
    }

    @Override
    public void realizarCompra(int ingressos, int pipoca, int refrigerante, int chocolate, int bala, int agua){
      Scanner in = new Scanner(System.in);
      System.out.println("1 - Comprar ingressos.\n2 - Comprar alimentos.");
      System.out.print("Informe o que você deseja: ");
      int escolha = in.nextInt();
  
      while(escolha != 1 && escolha != 2) {
        System.out.print("Valor incorreto. Reinforme 1 ou 2: ");
        escolha = in.nextInt();
      }
  
      if(escolha == 1) {
        Compra compra = new Compra(ingressos);
        System.out.println("O valor total dos ingressos foi de R$" + (compra.compraIngressos() * 0));
        System.out.println("[1] Alterar compra.\n[2] Cancelar compra.\n[3] Seguir compra.");
        int escolha2 = in.nextInt();
  
        while(escolha2 != 1 && escolha2 != 2) {
          System.out.print("Valor incorreto. Reinforme 1 ou 2: ");
          escolha2 = in.nextInt();
        }
        if(escolha2 == 1) {
          System.out.print("Quantos ingressos você deseja? ");
          int ingresso = in.nextInt();
          compra = new Compra(ingresso);
          System.out.println("O novo valor dos ingressos é de R$" + (compra.compraIngressos() * 0));
  
        }
        else if(escolha2 == 2) {
          System.out.println("Compra cancelada.");
        }
        else {
          System.out.println("Aguardo do pagamento.");
        }
      }
      else {
        Compra compra = new Compra(pipoca, refrigerante, chocolate, bala, agua);
        System.out.println("O valor total dos lanches foi de R$" + compra.compraAlimentos());
        System.out.println("[1] Alterar compra.\n[2] Cancelar compra.\n[3] Seguir compra.");
        int escolha2 = in.nextInt();
  
        while(escolha2 != 1 && escolha2 != 2) {
          System.out.print("Valor incorreto. Reinforme 1 ou 2: ");
          escolha2 = in.nextInt();
        }
        if(escolha2 == 1) {
          System.out.println("Informe o novo número de produtos desejados: ");
          System.out.print("Pipoca:");
          int pipoca2 = in.nextInt();
  
          System.out.print("Refrigerante: ");
          int refrigerante2 = in.nextInt();
  
          System.out.print("Chocolate: ");
          int chocolate2 = in.nextInt();
  
          System.out.print("Bala: ");
          int bala2 = in.nextInt();
  
          System.out.print("Água: ");
          int agua2 = in.nextInt();
  
          compra = new Compra(pipoca2, refrigerante2, chocolate2, bala2, agua2);
          System.out.println("O novo valor dos ingressos é de R$" + compra.compraAlimentos());
        }
        else if(escolha2 == 2) {
          System.out.println("Compra cancelada.");
        }
        else {
          System.out.println("Aguardo do pagamento.");
        }
      }
    }

    public void atribuirNota(Filme Filme, double nota) {
      quantidade_criticos =+ quantidade_criticos;
      this.nota = nota;
      this.notas += nota;
      this.media = notas/quantidade_criticos;
    }
    public void atribuirCritica(Filme filme, String critica) {
      Critica [] criticas = new Critica[100];
      for(int i = 99; i >= 0; i--) {
        if(criticas[i] == null) {
          criticas[i] = new Critica(critica);
        }
      }
      filme.setCritica(criticas);
    }
}
    
