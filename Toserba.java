package PBO;
import java.util.Scanner;
public class Toserba {
    public static void main(String[] args) {
        int pilih, total = 0;
        String Id[] = {"a001","a002","a003","a004","a005"};
        String []Nama = {"Buku","Pensil","Pulpen","Penggaris","Kertas"};
        String []beliId = new String[3];
        String []beliNama = new String[3];
        int []beliHarga = new int[3];
        int []Harga = {3000,4000,5000,6000,7000};
        int jumlahBayar[] = new int[3];
        int jumlahBeli[] = new int[3];
        Scanner sc = new Scanner(System.in);
        System.out.println("TOKO SERBA ADA");
        System.out.println("**************");
        System.out.print("Masukkan Item Barang : ");
        pilih = sc.nextInt();
        for (int i = 0; i < pilih; i++) {
            System.out.println("Data ke "+(i+1));
            System.out.print("Masukkan Kode\t\t: ");
            beliId[i] = sc.next();
            System.out.print("Masukkan jumlah Beli\t: ");
            jumlahBeli[i] = sc.nextInt();
            for (int j = 0; j < 3; j++){
                if (beliId[i].equals(Id[j])) {
                    beliNama[i] = Nama[j];
                    beliHarga[i] = Harga[j];
                    jumlahBayar[i] = jumlahBeli[i]*Harga[j];
                }
            } 
        }
        System.out.println("\n\nTOKO SERBA ADA");
        System.out.println("******************************");
        System.out.println("No\tKode Barang\tNama Barang\tHarga\tJumlah Beli\tJumlah Bayar");
        System.out.println("=============================================================================");
        for (int i = 0; i < pilih; i++) {
            System.out.print((i+1)+"\t"+beliId[i]+"\t\t ");
            System.out.print(beliNama[i]+"\t\t "+beliHarga[i]);
            System.out.println("\t   "+jumlahBeli[i]+"\t\t  "+jumlahBayar[i]);
            total += jumlahBayar[i];
        }
        System.out.println("=============================================================================");
        System.out.println("Total Bayar\t\t\t\t\t\t "+total);
        System.out.println("=============================================================================");
    }
}