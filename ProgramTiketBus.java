import java.util.Scanner;

public class ProgramTiketBus{
	
	public static void main (String[] args){
		
        String NamaPemesan;
		String TujuanBus = "";
		String Kelas;
        int RuteBus = 0;
        int JumlahKursi = 0;
		int HargaSatuan = 0;
		int TotalBayar = 0;
		
		for (int i = 0; i < 2; i++){
			Scanner input = new Scanner(System.in);
			System.out.print ("Nama Penumpang : ");
			NamaPemesan = input.nextLine();
			System.out.println ("1. Jakarta - Bandung");
			System.out.println ("2. Bandung - Jakarta");
			System.out.println ("3. Jakarta - Tasikmalaya");
			System.out.print("Rute Bus [1/2/3] : ");
			RuteBus = input.nextInt();
			
			Scanner inp = new Scanner(System.in);
			System.out.print("Kelas [AC/NON AC] : ");
			Kelas = inp.nextLine();
			System.out.print ("Jumlah Kursi : ");
			JumlahKursi = input.nextInt();
			
			
			if (RuteBus == 1){
				TujuanBus = "Jakarta - Bandung";
					if (Kelas == "AC"){
						HargaSatuan = 130000;
					}else{
						HargaSatuan = 900000;
					}
						TotalBayar = JumlahKursi * HargaSatuan;
					
			}		
				else if (RuteBus == 2){
					TujuanBus = "Bandung - Jakarta";
						if (Kelas == "AC"){
							HargaSatuan = 150000;
						}else{
							HargaSatuan = 70000;
						}
							TotalBayar = JumlahKursi * HargaSatuan;
				
				}		
				else if(RuteBus == 3){
					System.out.println("Jakarta - Tasikmalaya");
					TujuanBus = "Jakarta - Tasikmalaya";
						if (Kelas == "AC"){
							HargaSatuan = 70000;
						}else{
							HargaSatuan = 50000;
						}
							TotalBayar = JumlahKursi * HargaSatuan;
				
				}
				
							//System.out.println ("Total Bayar: " + TotalBayar);
			
			else{
				System.out.println ("Rute Tidak Ada");
			}
			
			
			System.out.println("");
			System.out.println("Terimakasih telah Memesan Tiket Bus dengan Rincian Sebagai Berikut : ");
			System.out.println("Nama Pemesan    : " + NamaPemesan);
			System.out.println("Rute            : " + TujuanBus);
			System.out.println("Kelas	        : " + Kelas);
			System.out.println("Harga Satuan 	: " + HargaSatuan);
			System.out.println("Jumlah Kursi 	: " + JumlahKursi);
			System.out.println("Total Bayar	: " + TotalBayar);
			System.out.println();
			System.out.println("Silakan Membayar di Alfamart Terdekat");
			System.out.println();
		}
	}
}