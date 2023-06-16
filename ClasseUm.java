 abstract class Produto {
     private String codigoBarras;
     private String nome;
     private double preco;

     public Produto(String codigoBarras, String nome, double preco) {
         this.codigoBarras = codigoBarras;
         this.nome = nome;
         this.preco = preco;
     }
     public String getCodigoBarras() {
         return codigoBarras;
     }
     public String getNome() {
         return nome;
     }

     public double getPreco() {
         return preco;
     }
     public abstract void mostrarDetalhesDoItem();

     @Override
     public boolean equals(Object obj) {
         if (this == obj)
             return true;
         if (obj == null || getClass() != obj.getClass())
             return false;
         Produto produto = (Produto) obj;
         return codigoBarras.equals(produto.codigoBarras);
     }
 }
 class Livro extends Produto {
    private String autor;

     public Livro(String codigoBarras, String nome, double preco, String autor) {
         super(codigoBarras, nome, preco);
         this.autor = autor;
     }
     public String getAutor() {
         return autor;
     }
     @Override
     public void mostrarDetalhesDoItem() {
         System.out.println("Livro: " + getNome());
         System.out.println("Preço: " + getPreco());
         System.out.println("Autor: " + autor);
     }
 }
 class CD extends Produto {
     private int numeroFaixas;

     public CD(String codigoBarras, String nome, double preco, int numeroFaixas) {
         super(codigoBarras, nome, preco);
         this.numeroFaixas = numeroFaixas;
     }
     public int getNumeroFaixas() {
         return numeroFaixas;
     }
     @Override
     public void mostrarDetalhesDoItem() {
         System.out.println("CD: " + getNome());
         System.out.println("Preço: " + getPreco());
         System.out.println("Número de faixas: " + numeroFaixas);
     }
 }
 class DVD extends Produto {
     private int duracao;

     public DVD(String codigoBarras, String nome, double preco, int duracao) {
         super(codigoBarras, nome, preco);
         this.duracao = duracao;
     }
     public int getDuracao() {
         return duracao;

     }

     @Override
     public void mostrarDetalhesDoItem() {
         System.out.println("DVD: " + getNome());
         System.out.println("Preço: " + getPreco());
         System.out.println("Duração: " + duracao + " minutos");

     }
 }
 class Loja {
     public static void main(String[] args) {
         Produto[] produtos = new Produto[5];
         produtos[0] = new Livro("123456789", "Livro 1", 19.99, "Autor 1");
         produtos[1] = new CD("987654321", "CD 1", 9.99, 12);
         produtos[2] = new DVD("456789123", "DVD 1", 29.99, 120);
         produtos[3] = new Livro("111222333", "Livro 2", 15.99, "Autor 2");
         produtos[4] = new CD("444555666", "CD 2", 12.99, 10);

         for (Produto produto : produtos) {
             produto.mostrarDetalhesDoItem();
             System.out.println();
         }
         Produto produtoBusca = new CD("987654321", "CD 1", 9.99, 12);
         buscarProduto(produtoBusca, produtos);

         Produto produtoIgual = new CD("987654321", "CD 1", 9.99, 12);
         Produto produtoDiferente = new CD("111222333", "CD 1", 9.99, 12);
         System.out.println("Os produtos são iguais? " + produtoIgual.equals(produtoDiferente));
     }
     public static void buscarProduto(Produto produto, Produto[] produtos) {
         for (int i = 0; i < produtos.length; i++) {
             if (produto.equals(produtos[i])) {
                 System.out.println("O produto " + produto.getNome() + " foi encontrado na posição " + i + " do vetor.");
                 return;


             }
         }
         System.out.println("O produto " + produto.getNome() + " não foi encontrado no vetor.");

     }
 }