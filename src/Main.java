import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	Scanner scan = new Scanner(System.in);
	String username;
	String nim;
	String mataKuliah;
	String mataKuliahWajib = "CB";
	String[] stokArray = {};
	ArrayList<String> stokBuah = new ArrayList<>();
	

	public Main() {
//		int umur;
		
		//looping
		
		//while loop
//		while(kondisi) {
//			//action
//		}
		
//		System.out.println("Selamat datang ke kantor lurah:");
//		System.out.print("Masukkan umur: ");
//		umur = scan.nextInt();
//		scan.nextLine();
//		
//		while(umur<18) {
//			System.out.println("Belum cukup umur, masukkan umur yang valid: ");
//			umur = scan.nextInt();
//			scan.nextLine();
//		}
//		System.out.println("Berhasil buat ktp");
		
		// do while
		
//		do {
//			
//		}while(//kondisi)
		
//		System.out.println("Selamat datang ke kantor lurah:");
//		System.out.print("Masukkan umur: ");
//		umur = scan.nextInt();
//		scan.nextLine();
//		
//		 do {
//			System.out.println("Belum cukup umur, masukkan umur yang valid: ");
//			umur = scan.nextInt();
//			scan.nextLine();
//		} while(umur<18);
//		System.out.println("Berhasil buat ktp");
		
		
		// for each
//		
//		for ( mulai ; condition; increment) {
//			action
//		}
		
//		for(int i = 0; i < 10; i++) {
//			for(int j = 0; j<i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		// string function
//		createUser();
		
		// math function
		
//		int a = 9;
//		double b = 1.733;
//		double c = 1.333;
//		// akar kuadrat
//		System.out.println(Math.sqrt(a));
//		
//		System.out.println(Math.floor(b));
//		
//		System.out.println(Math.ceil(c));
		
		// int hasil = (int) MathRandom() * 10; (ini salah)
		
//		gameRandom();
		
		// array
//		int[] tinggiBadan = {160, 150, 155, 130};
//		String[] nama = {"andi", "budi", "charlie", "dodi"};
//		
//		System.out.println(tinggiBadan[1]);
//		System.out.println(nama[1]);
//		
//		for(int i = 0; i<4; i++) {
//			tinggiBadan[i] = tinggiBadan[i] + 100;
//		}
		
//		tinggiBadan[3] = 200;
		
		// for each loop
//		for(String orang : nama) {
//			System.out.println(orang + " lagi makan");
//		}
//		
//		for(Integer tinggi : tinggiBadan) {
//			System.out.println(tinggi + " cm");
//		}
		
		// arrayList & vector
		
//		stockBuah();
		
//		function java
//		datatype namMethod() {}
		
		System.out.println(pertambahan(1, 2));
	}
	
	int pertambahan(int a, int b) {
		return a + b;
	}
	
	void stockBuah() {
		int input;
		String stock;
		
		do {
			System.out.println("Selamat datang di toko buah");
			System.out.println("Menu:");
			System.out.println("1. Tambah stock");
			System.out.println("2. Kurangin stock");
			System.out.println("3. Lihat stock");
			System.out.println("4. Reset stock");
			System.out.println("0. Keluar apps");
			System.out.print("Pilih menu >> ");
			
			input = scan.nextInt();
			scan.nextLine();
			
			switch (input) {
			case 1:
				System.out.print("Masukkan stock (String): ");
				stock = scan.nextLine();
				stokBuah.add(stock); // menambah (append) string ke arrlist
				System.out.println();
				break;
			case 2:
				int index;
				System.out.println("Stok buah hari ini ");
				for(int i = 0; i<stokBuah.size(); i++) {
					System.out.println(i + stokBuah.get(i));
				}
				System.out.println();
				
				System.out.print("Masukkan index stok (integer) yang ingin di kurangi: ");
				index = scan.nextInt();
				scan.nextLine();
				stokBuah.remove(index); // untuk hapus item pada index array tersebut
				System.out.println();
				break;
			case 3:
				System.out.println("Stok buah hari ini ");
				
				if(stokBuah.size() <=0)
					System.out.println("Stok buah kosong :<");
				
				for(int i = 0; i<stokBuah.size(); i++) {
					System.out.println(i + " " + stokBuah.get(i)); // get, untuk mendapatkan item pada arraylist tersebut
				}
				System.out.println();
				break;
			case 4:
				System.out.println("Resetting stock...");
				stokBuah.clear();
				System.out.println("Done resetting stock");
				System.out.println();
				break;
			case 0:
				System.out.println("Thank you");
			default:
				break;
			}
			
		}while(input != 0);
		
		
	}
	
	
	void createUser() {
		//string function in java
		System.out.println("Selamat datan di facebook");
		System.out.print("Masukkan username: ");
		username = scan.nextLine();
		
		// min username length is 5
		while(username.length() < 5) {
			System.out.println("Username must be at least 5 character!");
			System.out.print("Please input username: ");
			username = scan.nextLine();
		}
		
		System.out.println();
		// concat, untuk menambahkan string di akhir string target
		String info = "Binusian ".concat(username);
		System.out.println(info);
		System.out.println();
		
		System.out.print("Masukkan nim: ");
		nim = scan.nextLine();
		
		// nim must starts with 26
		while(!nim.startsWith("26")) {
			System.out.println("NIM must start with 26!");
			System.out.print("Please input NIM: ");
			nim = scan.nextLine();
		}
		
		System.out.print("Masukkan mata kuliah [separate with \",\"]: ");
		mataKuliah = scan.nextLine();
		
		// mata kuliah harus punya CB
		while(!mataKuliah.toUpperCase().contains(mataKuliahWajib.toUpperCase())) {
			System.out.println("Mata kuliah must contain CB!");
			System.out.print("Please input mata kuliah: ");
			mataKuliah = scan.nextLine();
		}
	}
	
	
	
	void gameRandom() {
		double hasil = Math.random()*10;
		
		int hasilAsli = (int) hasil;
		
		System.out.println("Masukkan tebakan kamu (1-10): ");
		int tebak = scan.nextInt();
		scan.nextLine();
		
		if (hasilAsli == tebak) {
			System.out.println("Kamu menang");
		} else {
			System.out.println("Kamu kalah");
		}
		
		System.out.println("Hasil: " + hasilAsli );
	}

	public static void main(String[] args) {
		new Main();

	}

}
