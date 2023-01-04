class GajiBersih{
    public String nama;
    public String jabatan;
    public double pajak;
    private double gajiPokok;
    private double gajiBersih;

    public GajiBersih(String nama, String jabatan, double pajak ){
        this.nama = nama;
        this.jabatan = jabatan;
        this.pajak = pajak;

    }
    // getter
    // public double getgajiBersih(){
    //     return this.gajiPokok;

    // }
    
    // setter 
    public void setgajiPokok(double gajiPokok){

        this.gajiPokok = gajiPokok;
    }
     public double getgajiBersih(){
         return gajiBersih = gajiPokok - (gajiPokok*pajak);
     }

public void display () {
    System.out.println("nama : "+ this.nama);
    System.out.println("jabatan: "+ this.jabatan);
    System.out.println("gajiBersih: "+ getgajiBersih());

}
    
}
public class App {
    public static void main(String[] args) throws Exception {
        GajiBersih gbh = new GajiBersih("Adam", "Direktur", 0.6);
        gbh.setgajiPokok(1000000);
        gbh. display();

    }
}
