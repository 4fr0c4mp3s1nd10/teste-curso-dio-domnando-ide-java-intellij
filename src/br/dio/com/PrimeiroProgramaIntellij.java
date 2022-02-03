package br.dio.com;

import br.dio.com.modal.gato;

public class PrimeiroProgramaIntellij {
    public static void main(String[] args) {
        gato gato = new gato();
        System.out.println(gato);
        livro livro = new livro("O problema dos 3 corpos",  300);
        System.out.println(livro);
    }

        /*int a = 5;
        int b = 3;
        System.out.println("Hello world!" + (a+b));*/

    }
        class livro {
            private String nome;
            private Integer numPaginas;

            public livro(String nome, Integer numPaginas) {
                this.nome = nome;
                this.numPaginas = numPaginas;
            }

            public String getNome() {
                return nome;
            }

            public void setNome(String nome) {
                this.nome = nome;
            }

            public Integer getNumPaginas() {
                return numPaginas;
            }

            public void setNumPaginas(Integer numPaginas) {
                this.numPaginas = numPaginas;
            }

            @Override
            public String toString() {
                return "livro{" +
                        "nome='" + nome + '\'' +
                        ", numPaginas=" + numPaginas +
                        '}';
            }
        }

