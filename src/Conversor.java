import java.util.Scanner;

public class Conversor {

    private double temperatura, fahrenheit, kelvin;

    public void obterDados(){

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a temperatura em Celcius: ");
        temperatura = sc.nextDouble();
        calculoTemperatura();
        exibirResultado();

    }

    private void calculoTemperatura(){

        fahrenheit = (temperatura * 1.8) + 32;

        kelvin = temperatura + 273.15;

    }

    private void exibirResultado(){
        System.out.printf("%.2fºC equivalem a:\n%.2fºF (Fahrenheit) \n%.2fºK (Kelvin)", temperatura, fahrenheit, kelvin);
    }
}
