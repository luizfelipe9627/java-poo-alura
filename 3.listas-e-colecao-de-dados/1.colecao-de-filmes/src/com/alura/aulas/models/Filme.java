package com.alura.models;

import com.alura.interfaces.Classificavel;

// Criado uma classe chamada Filme que atráves do extends recebe todos os atributos e métodos da classe Titulo e implementa a interface Classificavel.
public class Filme extends Titulo implements Classificavel {
  // Quando um atributo é privado, ele não pode ser acessado diretamente por outras classes, somente pela própria classe.
  private String diretor; // Criado um atributo do tipo String chamado diretor, que armazena o nome do diretor do filme.

  // Criado um método getter(responsável por retornar o valor do atributo) chamado getDiretor que retorna um valor do tipo String.
  public String getDiretor() {
    return diretor; // Retorna o valor do atributo diretor.
  }

  // Criado um método setter(responsável por alterar o valor do atributo) chamado setDiretor que recebe um parâmetro do tipo String chamado diretor.
  public void setDiretor(String diretor) {
    this.diretor = diretor; // Atribui o valor diretor ao atributo diretor.
  }

  @Override // O @Override é uma anotação que indica que o método está sobrescrevendo um método da superclasse.
  // Criado um método chamado getClassificacao que retorna um valor do tipo inteiro. Esse método é obrigatório por causa da interface Classificavel.
  public int getClassificacao() {
    return (int) pegaMedia() / 2; // Retorna a média de avaliação do filme dividida por 2 e convertida para inteiro.
  }

  @Override // O @Override é uma anotação que indica que o método está sobrescrevendo um método da superclasse.
  // Está sobrescrevendo o método toString da superclasse Object,  fazendo com que retorne uma String ao invés de um endereço de memória.
  public String toString() {
    return "Filme: " + getNome() + " (" + getAnoDeLancamento() + ")"; // Retorna o nome do filme e o ano de lançamento.
  }
}