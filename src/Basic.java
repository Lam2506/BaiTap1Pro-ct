public class Basic {
	static void PTB2(float a, float b, float c) {
		double delta = Math.pow(b, 2) - 4 * a * c;
		if (delta < 0) {
			System.out.println("Vo nghiem");
		} else if (delta == 0) {
			double x = -b / 2 * a;
			System.out.println("phuong trinh co nghiem kep" + x);
		} else {
			double x1 = (-b - Math.sqrt(delta)) / 2 * a;
			double x2 = (-b + Math.sqrt(delta)) / 2 * a;
			String s = String.format("Nghiem x1 = %f\nNghiem x2 = %f ", x1, x2);
			System.out.println(s);

		}
	}
	static long GT(long n) {
		long rs = 1;
		for(long i = 1;i<=n;i++) {
			rs *= i;
		}
		return rs;//rs = rs * i
	}
	static long GT2(long n) {
		if(n==0)
			return 1;
		return n*GT2(n-1);
	}
	static long fibo(long n) {
		long f0 =0;
		long f1 =1;
		long fn =1;
		if (n==0) {
			return 0;
		}
		for(long i = 2; i<=n;i++) {
			fn = f1 + f0;
			f0 = f1;
			f1 = fn;
		}
		return fn;
	}
	static int Fibonacci(int f) {
		int f0 = 0;
		int f1 = 1;
		int fn = 1;
		if (f < 0) {
			return -1;
		} else if (f == 0 || f == 1) {
			return f;
		} else {
			for (int i = 2; i < f; i++) {
				f0 = f1;
				f1 = fn;
				fn = f0 + f1;
			}
		}
		return fn;
	}
	static long UCLN(float a,float b) {
		while(a!=b) {
			if (a>b) {
				a = a-b;
			}
			else {
				b= b-a;
			}
		}
		return 0;
	}
	static long DQ_UCLN(float a,float b) {
		if(b==0) 
			return  (long) a;
		return DQ_UCLN(b, a % b);
		}
	static long BCNN(float a,float b) {
		return (long) (a * b/DQ_UCLN(a, b));
	}
	static boolean laSNT(long n) {
		if( n<2)
			return false;
		for(long i= 2;i<n;i++)
			if(n%i ==0)
				return false;
		return true;
    }	
	static void LietKeSNT(long n) {
		String s = " ";
		for(long i = 2; i<=n;i++)
			if (laSNT(i))
			s = s + i +" ";
		System.out.println(s);
	}
	static void LietKe_n_SNT(long n) {
		String s = "";
		long dem = 0;
		long i = 2;
		while (dem!=n) {
			if (laSNT(i)) {
				s = s + i + " ";
				dem++;
			}
			i++;
		}
		System.out.println(s);
	}
	public static void LietKeSNT_5CS() {
		 System.out.println("Liet ke tat ca cac so nguyen to co 5 chu so:");
	        for (int i = 10001; i < 99999; i+=2) {
	            if (laSNT(i)) {
	                System.out.println(i);
	            }
	        }
	    }
	static long TongCacChuSo(long n) {
		long s = 0;
		int a = 10;
		while(n!=0){
			s = s + n % a;
			n = n / a;
		}
		System.out.println("Tong cac chu so nguyen n la: "+ s);
		return 0;
	}
	static long DaoSo(long n) {
		long s = 0;
		while (n!=0) {
			s = s * 10 + n%10;
			n = n/10;
		}
		return s;
	}
	static boolean LaSoThuanNghich(long n) {
		return n == DaoSo(n);
	}
}
