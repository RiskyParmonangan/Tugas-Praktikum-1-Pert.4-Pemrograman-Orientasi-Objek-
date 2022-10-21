# Tugas-Praktikum-1-Pert.4-Pemrograman-Orientasi-Objek-

package person;

public class Person {
    String Nama,JenisKelamin;
    int Umur;
}


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
