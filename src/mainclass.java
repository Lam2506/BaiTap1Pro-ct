import java.util.Scanner;

public class mainclass {
	public static void createMenu() {
		System.out.println("---------------------------------------------------------------");
		System.out.println("--- 1. Giai phuong trinh bac 2---------------------------------");
		System.out.println("--- 2. Tinh giai thua------------------------------------------");
		System.out.println("--- 3. Fibonacci thu n-----------------------------------------");
		System.out.println("--- 4. Liet ke so nguyen to nho hon n--------------------------");
		System.out.println("--- 5. Liet ke n so nguyen to----------------------------------");
		System.out.println("--- 6. Chuong trinh tim USCLL----------------------------------");
		System.out.println("--- 7. Chuong trinh tim BSCNN----------------------------------");
		System.out.println("--- 8. Chuong trinh liet ke cac so nguyen to nho hon n---------");
		System.out.println("--- 9. Chuong trinh liet ke cac so nguyen to dau tien----------");
		System.out.println("---10. Chuong trinh liet ke cac so nguyen to co 5 chu so-------");
		System.out.println("---11. Tinh tong cac chu so nguyen cua n-----------------------");
		System.out.println("---12. So thuan nghich co 6 chu so-----------------------------");
		System.out.println("---13. So fibonacci nho hon n la so nguyen to------------------");
		System.out.println("---14. Thoat khoi chuong trinh---------------------------------");
		System.out.println("---------------------------------------------------------------");
		try (Scanner s = new Scanner(System.in)) {
			System.out.print("Nhap chuc nang: ");
			int chon = s.nextInt();
			switch(chon) {
				case 1:
					System.out.println("---Giai phuong trinh bac 2---");
					System.out.print("Nhap a: ");
					float a = s.nextFloat();
					System.out.print("Nhap b: ");
					float b = s.nextFloat();
					System.out.print("Nhap c: ");
					float c = s.nextFloat();
					Basic.PTB2(a, b, c);
					break;
				case 2:
					System.out.println("---Tinh giai thua---");
					System.out.print("Nhap n: ");
					long n = s.nextLong();
					long rs = Basic.GT(n);
					System.out.printf("%d! = %d\n",n,rs);
					break;
				case 3:
					System.out.println("---Fibonacci thu n---");
					System.out.print("Nhap n: ");
					n = s.nextLong();
					System.out.print(n+" chu so dau tien cua day fibonnacci: ");
					for (int i = 0; i < n; i++) {
						System.out.print(Basic.Fibonacci(i) + " ");
					}
					break;
				case 4:
					System.out.println("---Liet ke so nguyen to nho hon n---");
					System.out.print("Nhap n: ");
					n = s.nextLong();
					Basic.LietKeSNT(n);
					break;
				case 5:
					System.out.println("---Liet ke n so nguyen to---");
					System.out.print("Nhap n: ");
					n = s.nextLong();
					Basic.LietKe_n_SNT(n);
					break;
				case 6:
					System.out.println("---Chuong trinh tim USCLN---");
					System.out.print("Nhap a: ");
					a = s.nextFloat();
					System.out.print("Nhap b: ");
					b = s.nextFloat();
					System.out.println("Uoc so chung giua "+ a +" va "+ b + " la: "+Basic.DQ_UCLN(a, b));
					break;
				case 7:
					System.out.println("---Chuong trinh tim BSCNN---");
					System.out.print("Nhap a: ");
					a = s.nextFloat();
					System.out.print("Nhap b: ");
					b = s.nextFloat();
					System.out.println("Uoc so chung giua "+ a +" va "+ b + " la: "+Basic.BCNN(a, b));
					break;
				case 8:
					System.out.println("---Chuong trinh liet ke cac so nguyen to nho hon n---");
					System.out.print("Nhap n: ");
					n = s.nextLong();
					System.out.print("Cac so nguyen to nho hon n:");Basic.LietKeSNT(n);
					break;
				case 9:
					System.out.println("Chuong trinh liet ke cac so nguyen to dau tien---");
					System.out.print("Nhap n: ");
					n = s.nextLong();
					System.out.print(n+" so nguyen to dau tien la:");Basic.LietKe_n_SNT(n);
					break;
				case 10:
					System.out.println("---Chuong trinh liet ke cac so nguyen to co 5 chu so---");
				    Basic.LietKeSNT_5CS();
					break;
				case 11:
					System.out.println("---Tinh tong cac chu so nguyen cua n---");
					System.out.print("Nhap n: ");
					n = s.nextLong();
					Basic.TongCacChuSo(n);
					break;
				case 12:
					System.out.println("---So thuan nghich co 6 chu so---");
					System.out.print("Nhap n: ");
					n = s.nextLong();
					System.out.println(Basic.LaSoThuanNghich(n));
					break;
				case 13:
					System.out.println("---So fibonacci nho hon n la so nguyen to---");
					System.out.print("Nhap n: ");
					n = s.nextLong();
			        System.out.printf("Cac so fibonacci nho hon %d va "
			                + "la so nguyen to: ", n);
			        int i = 0;
			        while (Basic.Fibonacci(i) < 100) {
			            int fi = Basic.Fibonacci(i);
			            if (Basic.laSNT(fi)) {
			                System.out.print(fi + " ");
			            }
			            i++;
			        }
					break;
				default:
					System.exit(0);
			}
		}
	}
}

