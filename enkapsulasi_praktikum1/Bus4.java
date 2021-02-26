package enkapsulasi_praktikum1;

public class Bus4{
    public double penumpang;
    public double maxPenumpang;
    public double counter;
    
    
    //konstruktor kelas bus
    public Bus4(double maxPenumpang){
        this.maxPenumpang = maxPenumpang;
        penumpang = 0;
        counter = 0;
    }
    
    //method mutator untuk penambahkan 1 penumpang dengan berat tertentu
    public void addPenumpang(double penumpang){
        double temp;
        temp = this.penumpang+1;
        counter = counter + penumpang;
        if (temp >= maxPenumpang){
            System.out.println("penumpang melebihi kuota");
        }else{
            this.penumpang = temp;
        }
    }
    
    public void getpenumpang(int password){
        if (password == 24){
            System.out.println("password benar");
        }else{
            System.out.println("password salah");
        }
        
    }
    
    public double getAverage(){
        double rata2 = counter/penumpang;
        return rata2;
    }
    
    public void cetak(){
        System.out.println("Penumpang Bus sekarang adalah "+ penumpang);
        System.out.println("penumpang maksimum seharusnya adalah "+ maxPenumpang);
        System.out.println("berat total dari seluruh penumpang adalah : "+counter+" kg");
        
    }
}
