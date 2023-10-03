import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua altura:");
        Double altura = sc.nextDouble();
        System.out.println("Digite seu peso:");
        Double peso = sc.nextDouble();

        Double IMC = (peso/(altura * altura));
        System.out.println("Seu IMC é: " + IMC);


        if(IMC < 18.5){
            System.out.println("Abaixo do peso ideal");
        } else if (IMC <= 24.9  && IMC >= 18.5){
            System.out.println("Peso normal");
        } else if(IMC <=29.9 && IMC >= 25){
            System.out.println("Sobrepeso");
        } else if(IMC <=34.9 && IMC >= 30){
            System.out.println("Obesidade grau 1");
        } else if(IMC <= 39.9 && IMC >= 35){
            System.out.println("Obesidade grau 2");
        } else {
            System.out.println("Obesidade grau 3");
        }
    }
}