package com.example.springboot.testes.OOP;

import java.util.ArrayList;
import java.util.List;

public class MapperTestes {
    public static void main(String[] args) {
        /*
        int ArrayList;
        List<Integer> numList = new ArrayList<>();
        numList.add(1);
        

        String nome = "Banana";
        Integer ints = 48;
        print(nome);
        print("--------------");
        print(ints);

      
        List<Number> numbers1 = new ArrayList<>();
        numbers1.add(5);
        numbers1.add(10L);

        List<Number> numbers2 = new ArrayList<>();
        numbers2.add(15f);
        numbers2.add(20.0);

        List<Number> numbersMerged = (mergeWildcard(numbers1, numbers2);
        System.out.println(numbersMerged);
          */

        List<Pessoa> listaPessoas = new ArrayList<>();
        adicionarUsuario(listaPessoas);
        
        

    }

    public static void adicionarUsuario(List<? super Usuario> lista) {
        lista.add(new Usuario("carlo", "97997799"));
        System.out.println("Tamanho da lista: " + lista.size());
    }



  
    }


     class Pessoa {
        private  String nome;
        private  String numerTelefone;

        public Pessoa(String nome, String numerTelefone) {
            this.nome = nome;
            this.numerTelefone = numerTelefone;
        }
        
        public String getNome() {
            return nome;
        }
        public String getNumerTelefone() {
            return numerTelefone;
        }


        public void setNome(String nome) {
            this.nome = nome;
        }
        public void setNumbertelefone(String numberTelefone){
            this.numerTelefone = numberTelefone;
        }

        
    }

     class Usuario extends Pessoa {
        private String prontuario;

            public Usuario(String nome, String numerTelefone) {
                super(nome, numerTelefone);
                //TODO Auto-generated constructor stub
            }

            public String getProntuario() {
                return prontuario;
            }
            public void setProntuario(String prontuario) {
                this.prontuario = prontuario;
            }
    
    }

       /*
             Assinatura: <V> Function<T, V> andThen(Function<? super R, ? extends V> after)

             Tradução:
            <V> = Define o tipo de retorno final após a aplicação do andThen
             T  = Tipo da entrada original da função atual
             R  = Tipo de saída intermediária da função atual
             ? super R = O argumento da função after pode ser do tipo R ou de qualquer superclasse de R
             ? extends V = O retorno da função after será do tipo V
                 */

