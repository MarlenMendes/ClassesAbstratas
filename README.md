# ClassesAbstratas
LISTA DE EXERCÍCIOS POO CLASSES ABSTRATAS

## 1 - Crie uma hierarquia de classes para uma loja que venda livros, CDs e DVDs.
Sobrescreva o método mostrarDetalhesDoItem para que imprima:

- Para livros: nome, preço e autor;
- Para CDs: nome, preço e número de faixas;
- Para DVDs: nome, preço e duração.

Evite ao máximo repetição de código. Em seguida, crie uma classe Loja com o
método main() que adicione 5 produtos diferentes (a sua escolha) a um vetor e, por
fim, imprima o conteúdo.

Modifique o código do programa anterior, da seguinte forma:
a) Adicione um atributo que represente o código de barras do produto (é um
valor obrigatório e, portanto, deve ser pedido no construtor);
b) Sobrescreva o método equals() retornando true se dois produtos possuem
o mesmo código de barras;
c) Na classe Loja, implemente um simples procedimento de busca que, dado
um produto e um vetor de produtos, indique em que posição do vetor se encontra o
produto especificado ou imprima que o mesmo não foi encontrado;
d) No método Loja.main(), após a impressão do vetor (feita na questão
anterior, escolha um dos 5 produtos e crie duas novas instâncias idênticas a ele:
uma com o mesmo código de barras e outra com o código diferente.

## 2 - Implemente uma classe abstracta de nome Forma onde são declarados dois métodos abstractos:

- calcularArea(): Float
- calcularPerimetro(): Float

Crie, como subclasse de Forma, uma classe de nome Retangulo cujas instâncias
são caracterizadas pelos atributos lado e altura ambos do tipo Float. Implemente na
classe Retangulo os métodos herdados de Forma e outros que ache necessários.

Crie, como subclasse de Forma, uma classe de nome Círculo cujas instâncias são

Lista de Exercícios POO

caracterizadas pelo atributo raio do tipo Float. Implemente na classe Circulo os
métodos herdados de Forma e outros que ache necessários.

Crie, como subclasse de Retangulo, uma classe de nome Quadrado cujas
instâncias são caracterizadas por terem os atributos lado e altura com o mesmo
valor.

Elabore um teste onde é declarado um array, de dimensão 5. Nesse array devem
ser guardadas instâncias de Retangulo, Círculo e Quadrado seguindo uma ordem
aleatória.

** Depois implemente um ciclo que percorra o array invocando, relativamente a cada
um dos objetos guardados, os métodos calcularArea e calcularPerimetro**



## Exercício Interfaces

## 1. Siga as instruções abaixo para implementar o exercício:
- Crie uma interface Lampada com métodos ligar() e desligar(), cujo
contrato significa simplesmente imprimir mensagens informativas na
tela;
- Crie uma classe FabricaLampada que possui duas classes filhas que
implementam a interface Lampada: Incandescente e Fluorescente;
- Crie ainda um método construir(), que receba um parâmetro indicando
o tipo de lâmpada e retorne o objeto Lampada criado;
- Crie uma classe Exercicio01 com o método main(). Pergunte ao
usuário qual lâmpada ele quer construir, ligue e desligue a lâmpada.

## 2. Nosso banco precisa tributar dinheiro de alguns bens que nossos clientes possuem. Para isso, vamos criar uma interface para o cálculo dos tributos.

Lemos essa interface da seguinte maneira: "todos que quiserem ser
tributáveis precisam saber calcular tributos, devolvendo um double".
Alguns bens são tributáveis e outros não,
a. ContaPoupanca não é tributável
b. já para ContaCorrente você precisa pagar 1% da conta
c. SeguroDeVida tem uma taxa fixa de 42 reais.
Escreva classes que implementem esta interface e calculem o tributo de
acordo com a regra de negócio acima.
