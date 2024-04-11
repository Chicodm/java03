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

import javax.swing.*;
public class Main {
    public static void main(String[] args) {
        int n, maior = -1;
        for(int i=0; i<10; i++){
            n = Integer.parseInt(JOptionPane.showInputDialog((i+1) + "o número: "));
            if(n>maior){
                maior = n;
            }
        }
        System.out.println("Maior: " + maior);
    }
}

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
