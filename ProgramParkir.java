import java.util.Scanner;

public class ProgramParkir{
	
	public static void main (String[] args){
		
        String PlatNomor;
		String jenis_Kendaraan;
		int JenisKendaraan;
        int HargaAwal = 0;
        int HargaBerikutnya = 0;
        int JamMasuk = 0;
		int JamKeluar = 0;
		int TotalBayar = 0;
		int TotalJam = 0;
		
			for (int i = 0; i < 2; i++){
				Scanner input = new Scanner(System.in);
				System.out.print ("Plat Nomor : ");
				PlatNomor = input.nextLine();
				System.out.println ("1. Mobil");
				System.out.println ("2. Motor");
				System.out.print("Jenis Kendaraan [1/2] : ");
				JenisKendaraan = input.nextInt();
				System.out.print ("Jam Masuk : ");
				JamMasuk = input.nextInt();
				System.out.print ("Jam Keluar : ");
				JamKeluar = input.nextInt();
			
				if (JamMasuk > JamKeluar){
					TotalJam = (JamKeluar - JamMasuk) + 24;	
				}
				else{
					TotalJam = JamKeluar - JamMasuk;
				}
			
			if (JenisKendaraan == 1 ){
				jenis_Kendaraan = "Mobil";
				HargaAwal = 5000;
				HargaBerikutnya = 3000 * (TotalJam - 1);
				TotalBayar = HargaAwal + HargaBerikutnya;
			}
			else if (JenisKendaraan == 2){
					jenis_Kendaraan = "Motor";
					HargaAwal = 3000;
					HargaBerikutnya = 1500 * (TotalJam - 1);
					TotalBayar = HargaAwal + HargaBerikutnya;
					
					System.out.println ("Biaya Parkir : " + TotalBayar);
			}
			else{
				System.out.println ("Tidak Terdefinisi");
			}
			System.out.println("");
			System.out.println("Terimakasih telah melakukan transaksi dengan rincian sebagai berikut : ");
			System.out.println("Plat Nomor      : " + PlatNomor);
			System.out.println("Jenis Kendaraan : " + JenisKendaraan);
			System.out.println("Lama Parkir	: " + TotalJam + " Jam");
			System.out.println("Total Bayar 	: " + TotalBayar);
			System.out.println();
			System.out.println("Semoga Pelayanan Kami Memuaskan");
			System.out.println();
		}
	}
}