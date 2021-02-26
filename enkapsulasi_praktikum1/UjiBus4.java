
package enkapsulasi_praktikum1;


public class UjiBus4 {


    public static void main(String[] args) {
        Bus4 Bus = new Bus4(5);
        Bus.getpenumpang(17);
        Bus.getpenumpang(24);
        Bus.cetak();
        System.out.println();
        
        //menambahkan 1 penumpang dengan berat tertentu (kg)
        Bus.addPenumpang(76);
        Bus.cetak();
        System.out.println("berat rata-rata adalah : "+Bus.getAverage()+" kg\n");
        
        //menambahkan 1 penumpang dengan berat tertentu (kg)
        Bus.addPenumpang(68);
        Bus.cetak();
        System.out.println("berat rata-rata adalah : "+Bus.getAverage()+" kg\n");
        
        //menambahkan 1 penumpang dengan berat tertentu (kg)
        Bus.addPenumpang(80);
        Bus.cetak();
        System.out.println("berat rata-rata adalah : "+Bus.getAverage()+" kg\n");
        
       //menambahkan 1 penumpang dengan berat tertentu (kg)
        Bus.addPenumpang(100);
        Bus.cetak();
        System.out.println("berat rata-rata adalah : "+Bus.getAverage()+" kg\n");
    }
    
}
