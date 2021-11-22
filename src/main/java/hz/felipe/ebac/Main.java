package hz.felipe.ebac;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static List<Pessoas> masculino = new ArrayList<>();
    private static List<Pessoas> feminino = new ArrayList<>();


    public static void main(String args[]) {
        Integer resposta = cadastrar();

        while (resposta == 1){
            cadastroPessoas();
            resposta = cadastrar();
        }
        if (resposta == 2) {
            imprimirLista();
        }else{
            imprimirLista();
        }

    }


    public static List<Pessoas> cadastroPessoas() {
        String nome;
        String sexo;
        Integer respSexo;
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe o nome:");
        nome = ler.next();
        System.out.println("Informe o respSexo:  1.M ou 2.F");
        respSexo = ler.nextInt();
        if (respSexo == 1){
            sexo = "Masculino";
            Pessoas pessoa = new Pessoas(nome, sexo);
            masculino.add(pessoa);
            return masculino;

        } else if (respSexo == 2) {
            sexo = "Feminino";
            Pessoas pessoa = new Pessoas(nome, sexo);
            feminino.add(pessoa);
            return  feminino;
        } else{
            return null;
        }

    }

    private static Integer cadastrar() {
        Integer resp;
        Scanner ler = new Scanner(System.in);
        System.out.println("Quer cadastrar uma pessoa?  Digite:  1.Sim  2.Não");
        resp = ler.nextInt();

        if (resp == 1){
            return resp;
        }else if (resp == 2){
            return resp;
        }else{
            System.out.println("Escolha inválida");
            cadastrar();
            resp = 0;
        }
        return resp;
    }

    private static void imprimirLista() {
        System.out.println("Masculino: ");
        System.out.println(masculino);
        System.out.println("\n\nFeminino: ");
        System.out.println(feminino);
    }


}
