//al3x002
import java.util.Scanner;
public class Samochod {
    private String marka;
    private String model;
    private int przebieg;
    private double paliwo;
    private double spalanie;

    public Samochod() {}

    public Samochod(String marka, String model, int przebieg, double paliwo, double spalanie) {
        this.marka = marka;
        this.model = model;
        this.przebieg = przebieg;
        this.paliwo = paliwo;
        this.spalanie = spalanie;
    }
    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrzebieg() {
        return przebieg;
    }

    public void setPrzebieg(int przebieg) {
        this.przebieg = przebieg;
    }

    public double getPaliwo() {
        return paliwo;
    }

    public void setPaliwo(double paliwo) {
        this.paliwo = paliwo;
    }

    public double getSpalanie() {
        return spalanie;
    }

    public void setSpalanie(double spalanie) {
        this.spalanie = spalanie;
    }
    public void Wczytaj() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj markę samochodu:");
        this.marka = scanner.nextLine();
        System.out.println("Podaj model samochodu:");
        this.model = scanner.nextLine();
        System.out.println("Podaj przebieg samochodu:");
        this.przebieg = scanner.nextInt();
        System.out.println("Podaj ilość paliwa w zbiorniku:");
        this.paliwo = scanner.nextDouble();
        System.out.println("Podaj spalanie samochodu:");
        this.spalanie = scanner.nextDouble();
    }
    public void Wypisz() {
        System.out.println("Marka: " + this.marka);
        System.out.println("Model: " + this.model);
        System.out.println("Przebieg: " + this.przebieg);
        System.out.println("Ilość paliwa: " + this.paliwo);
        System.out.println("Spalanie: " + this.spalanie);
    }
    public void Inicjalizuj(String marka, String model, int przebieg, double paliwo, double spalanie) {
        this.marka = marka;
        this.model = model;
        this.przebieg = przebieg;
        this.paliwo = paliwo;
        this.spalanie = spalanie;
    }
    public void Tankuj(double iloscPaliwa) {
        this.paliwo += iloscPaliwa;
    }
    public void Jedz(int liczbaKilometrow) {
        double zuzytePaliwo = liczbaKilometrow / 100.0 * this.spalanie;
        if (zuzytePaliwo <= this.paliwo) {
            this.przebieg += liczbaKilometrow;
            this.paliwo -= zuzytePaliwo;
            System.out.println("Przejechano " + liczbaKilometrow + " kilometrów.");
        } else {
            System.out.println("Brak wystarczającej ilości paliwa.");
        }
    }
    public static void main(String[] args) {
        Samochod samochod1 = new Samochod();
        samochod1.Wczytaj();
        samochod1.Wypisz();
    
        Samochod samochod2 = new Samochod("BMW", "M4", 60000, 30.0, 7.5);
        samochod2.Wypisz();
    
        samochod2.Tankuj(20.0);
        samochod2.Jedz(150);
        samochod2.Wypisz();
    }   
}