import java.util.Scanner;
class Parkir{
		Scanner input = new Scanner (System.in);
	
	private String kendaraan;
	private int lamaparkir;
    private int bayar;
    private String jawab;

	public Parkir(String kndrn,int lmp,int byr)
{

		this.kendaraan=kndrn;
		this.lamaparkir=lmp;
        this.bayar=byr;
}

		public void tampilBiayaParkir()
{
			System.out.println("Lahan Parkir");
			System.out.println("Jenis Kendaraan yang di parkir \t \t: "+this.kendaraan);
			System.out.println("Lama Parkir\t \t: "+this.lamaparkir);
			System.out.println("Jumlah Pembayaran \t \t: Rp" +this.bayar);
			}
 public class BiayaParkir{
 public void main(String[] args){
 Parkir  motor=new BiayaParkir("Motor,2 jam,6000");
    motor.tampilBiayaParkir();

   }
	
    }
}
