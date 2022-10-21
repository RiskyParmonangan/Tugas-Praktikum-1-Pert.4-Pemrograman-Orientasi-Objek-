package person;

public class NewPerson {
    public static void main(String[] args){
        Person personku = new Person();

        personku.Nama = "Anton";
        personku.JenisKelamin = "LakiLaki";
        personku.Umur = 18;
        System.out.println("Nama: " + personku.Nama);
        System.out.println("JenisKelamin: " + personku.JenisKelamin);
        System.out.println("Umur: " + personku.Umur);
        
        personku.Nama = "Riko";
        personku.JenisKelamin = "LakiLaki";
        personku.Umur = 18;
        System.out.println("Nama: " + personku.Nama);
        System.out.println("JenisKelamin: " + personku.JenisKelamin);
        System.out.println("Umur: " + personku.Umur);
    }
}
