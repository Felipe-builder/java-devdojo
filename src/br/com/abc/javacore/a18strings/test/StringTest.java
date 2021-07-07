package br.com.abc.javacore.a18strings.test;

public class StringTest {
    public static void main(String[] args) {
        String nome = "William"; //cria uma string no pool de String e faz a variável referenciar a ela.
        String nome1 = new String("Joana"); //criando 1 - variável de referência, 2 - um objeto do tipo String,
        //3 - uma string no pool de String;

        String sobrenome = " Suane";

        System.out.println(nome);
        System.out.println(nome1);
        System.out.println(nome + sobrenome);

        nome += sobrenome;
        System.out.println(nome);

        String nome2 = "João";
        nome2.concat(" Figueiredo"); // nome2 += " Figueiredo";
        //Strings são imútaveis
        System.out.println(nome2); // não pegou, pois está concatenado em memória e não na variável
        //na 'String constant pool' há "João" e "Figueiredo" e outras...
        nome2 = nome2.concat(" Figueiredo"); //agora a concatenação em memória foi de fato alocada para a variável
        System.out.println(nome2);

        String nome3 = "Lucas";
        String nome4 = "Lucas"; // a variável nome3 fez referência à string "Lucas" do pool de String
        System.out.println(nome3==nome4);
        System.out.println("Lucas"==nome4);

        String nome5 = new String("Lucas"); //Cria outra referência e por isso o comportamento anterior
        //não se repete ao equiparalas com '==' ;

        System.out.println(nome3 == nome5);

        System.out.println(nome5.charAt(3));
        String nome6 = "lucas";

        System.out.println(nome3 == nome6);
        System.out.println(nome3.equals(nome6));
        System.out.println(nome3.equalsIgnoreCase(nome6));
        System.out.println(nome3.length());
        String nome7 = "Paulo";
        System.out.println(nome7.replace('o', 'a'));
        System.out.println(nome.toLowerCase());
        System.out.println(nome.toUpperCase());
        String conta = "0123456789";
        System.out.println(conta.substring(1, 5));
        String teste = "     232  03 - 3   ";
        System.out.println(teste);
        System.out.println(teste.trim());
    }
}
