import java.util.Scanner;

public class Conversor {

    private double temperaturaEmCelcius, temperaturaEmFahrenheit, temperaturaEmKelvin;

    public void obterDados(){

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a temperatura em Celcius: ");
        temperaturaEmCelcius = sc.nextDouble();
        calculoTemperatura();
        exibirResultado();

    }

    private void calculoTemperatura(){

        temperaturaEmFahrenheit = (temperaturaEmCelcius * 1.8) + 32;

        temperaturaEmKelvin = temperaturaEmCelcius + 273.15;

    }

    private void exibirResultado(){
        System.out.printf("%.2fºC equivalem a:\n%.2fºF (Fahrenheit) \n%.2fºK (Kelvin)", temperaturaEmCelcius, temperaturaEmFahrenheit, temperaturaEmKelvin);
    }
}
