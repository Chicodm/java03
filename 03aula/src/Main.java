//import javax.swing.*;
//
//public class Main {
//    public static void main(String[] args) {
//        String nome, nomeUsuario;
//        nome = JOptionPane.showInputDialog("Nome: ");
//        nomeUsuario = JOptionPane.showInputDialog("Nome do usuario: ");
//
//        if(nome.equals(nomeUsuario)){
//            System.out.println("Iguais");
//        }else{
//            System.out.println("Diferentes");
//
//
//        }
//    }
//}

//import javax.swing.*;
//public class Main {
//    public static void main(String[] args) {
//        int n, maior = -1;
//        for(int i=0; i<10; i++){
//            n = Integer.parseInt(JOptionPane.showInputDialog((i+1) + "o número: "));
//            if(n>maior){
//                maior = n;
//            }
//        }
//        System.out.println("Maior: " + maior);
//    }
//}

//import javax.swing.*;
//public class Main {
//    public static void main(String[] args) {
//        int n, maior = -1;
//        for(int i=0; i<10; i++){
//            do {
//                n = Integer.parseInt(JOptionPane.showInputDialog((i + 1) + "o número: "));
//            }while(n<0 || n>100);
//            if(n>maior){
//                maior = n;
//            }
//        }
//        System.out.println("Maior: " + maior);
//    }
//}

//import javax.swing.*;
//
//public class Main {
//    public static void main(String[] args) {
//
//        int[] idades = new int[5];
//
//        for(int i=0; i<5; i++){
//            idades[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite a " + (i+1) + "a idade:"));
//        }
//
//        String texto = "";
//        for(int idade : idades){
//            texto += "Idade: " + idade + ";\n";
////            System.out.println("Idade: " + idade + ";");
//        }
//        JOptionPane.showMessageDialog(null, texto);
//        System.out.println(texto);
//    }
//}

//public class Main {
//    public static void main(String[] args) {
//        String[] mes = {"Jan", "Fev", "Mar", "Abr", "Mai", "Jun", "Jul", "Ago", "Set", "Out", "Nov", "Dez"};
//        int[] fim = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
//
//        for(int i=0; i<mes.length; i++){
//            System.out.println("O mês de " + mes[i] + " tem " + fim[i] + " dias");
//        }
//
//    }
//}

import javax.swing.*;
//import java.util.Arrays;
//
//public class Main {
//    public static void main(String[] args) {
//        int[] idades = {14,12,25,44,11,8};
//        Arrays.sort(idades);
//        for (int n : idades){
//            System.out.print(n + " ");
//        }
//        System.out.println("");
////        int i = Integer.parseInt(JOptionPane.showInputDialog("n: "));
//        int pos = Arrays.binarySearch(idades,14);
//        System.out.println("Valor na encontrado na posição: "+pos);
//    }
//}

//import java.util.ArrayList;
//import java.util.Collections;
//
//public class Main {
//    public static void main(String[] args) {
//        ArrayList<String> dinos = new ArrayList<String>();
//
//        dinos.add("Angaturama");
//        dinos.add("Uberabatitan");
//        dinos.add("Irritator");
//        dinos.add("Oxalaia Quilombensis");
//
//        System.out.println("Arraylist original: " + dinos);
//
//        String dino = dinos.get(1);
//        System.out.println("Dino selecionado: " + dino);
//
//        dinos.set(1, "Santanarraptor");
//        System.out.println("Modificado: " + dinos);
//
//        dinos.remove(2);
//        System.out.println("Removeu o 2: " + dinos);
//
//        int tamanho = dinos.size();
//        System.out.println("Tamanho: " + tamanho);
//
//        System.out.println("--= Percorrendo com for =--");
//        for (int i= 0; i<dinos.size(); i++){
//            System.out.println("Dino: " + dinos.get(i));
//        }
//
//        System.out.println("--= Percorrendo com 'forEach' =--");
//        for (String d : dinos){
//            System.out.println("Dino: " + d);
//        }
//
//        Collections.sort(dinos);
//        System.out.println("Organizado: " + dinos);
//
//        int indice = dinos.indexOf("Santanarraptor");
//        System.out.println("indexOf: " + indice);
//
//    }
//}
////https://www.w3schools.com/java/java_arraylist.asp

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos salários serão digitados? ");
        int n = scanner.nextInt();

        double[] salarios = new double[n];
        double totalAntigo = 0;
        double totalCorrigido = 0;
        double maiorSalario = Double.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            System.out.print("Digite o salário " + (i + 1) + ": ");
            salarios[i] = scanner.nextDouble();
            totalAntigo += salarios[i];

            if (salarios[i] > maiorSalario) {
                maiorSalario = salarios[i];
            }
        }

        for (int i = 0; i < n; i++) {
            if (salarios[i] < 2500) {
                salarios[i] *= 1.1;
            }
            totalCorrigido += salarios[i];
        }

        System.out.println("O maior salário é: R$" + maiorSalario);

        System.out.println("Total da folha de pagamento antiga: R$" + totalAntigo);

        System.out.println("Total da folha de pagamento corrigida: R$" + totalCorrigido);

        scanner.close();
    }
}
