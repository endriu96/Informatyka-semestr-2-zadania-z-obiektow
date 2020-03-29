/*Zadania
1.Stwórz klasę osoba zawierającą Imię, Nazwisko,mail,telefon,wiek
2.Utwórz 2 obiektyy klasy Osoba
3.Przypisz wartości do pól obiektu Czlowiek1
4.Przypisz wartości do obiektu używając konstruktora
5.Dodaj do klasy pole statyczne prezes i wyjaśnij cechy pola statycznego.
/*Pola statyczne różnią się od pól instancji (niestatycznych) tym, że są one współdzielone przez wszystkie obiekty tej klasy,
tzn. przynależą one do całej klasy, a nie konkretnie utworzonego obiektu.
Metody statyczne, natomiast, różnią się od metod niestatycznych tym, że nie mogą korzystać z pól i metod niestatycznych.
6.Dodaj do klasy  pole prywatne  ,,salary "i omów  co powoduje  parametr private.
7.Dodaj  gettery i  settery, aby móc zmieniać lub odczytywać wartość pola prywatnego
8. Utwórz nową klasę Pracownik,dziedziczącą po klasie  osoba
9.Utwórz przeciążone wersje konstruktorów ,ustawiające zawartości pól imie, nazwisko oraz kolejny dla wszystkich pól

http://www.maciejmuras.com/?page_id=509
 */





class Osoba {

    String imie;
    String nazwisko;
    String telefon;
    int wiek;
    static String prezes;
    private int salary;

    int getSalary() {
        return salary;
    }

void setSalary(int salary) {
        if (salary<2100) System.out.println("Zarobek zbyt niski,niezgodny z prawem, nie przypisuje wartości ");
        else
        this.salary = salary;
    }



    Osoba(String imie, String nazwisko, String telefon, int wiek) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.telefon = telefon;
        this.wiek = wiek;
    }
    Osoba(String imie, String nazwisko ){
        this.imie=imie;
        this.nazwisko=nazwisko;
    }
    Osoba(String imie, String nazwisko, String telefon, int wiek,String prezes,int salary) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.telefon = telefon;
        this.wiek = wiek;
    }

}

class Pracownik extends Osoba {
    int poczatek_zatrudnienia;
    String nazwaStanowiska;

Pracownik(String imie, String nazwisko, String telefon, int wiek, int poczatek_zatrudnienia, String nazwaStanowiska) {
        super(imie, nazwisko, telefon, wiek);
        this.poczatek_zatrudnienia = poczatek_zatrudnienia;
        this.nazwaStanowiska = nazwaStanowiska;
    }

}

public  class Obiektowość {
    public static void main(String[] args) {
        Osoba Czlowiek1 = new Osoba("Anna","Kowalska","606654154", 30);
        Osoba.prezes="Jan Kowalski";
        Czlowiek1.setSalary(5040);
       // System.out.println(Czlowiek1.salary);//pole private więc jest błąd
        System.out.println(Czlowiek1.getSalary());
       Osoba Czlowiek2 = new Osoba("Jan","Wisniewski","500-112-600",45);
       System.out.println(Czlowiek2.prezes);
        Czlowiek2.prezes="Beata Polak";
        System.out.println(Czlowiek1.prezes);
        Osoba Czlowiek3=new Osoba("Zosia","Długopolska");
        Osoba Czlowiek4=new Osoba("Mikolaj", "Marzec", "500-222-654", 35, "Jan Kowalski", 6000);



       /*Czlowiek1.imie="Anna";
        Czlowiek1.nazwisko="Kowalska";
        Czlowiek1.telefon="606654154";
        Czlowiek1.wiek=30;

        */
    }


}