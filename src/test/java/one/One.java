package one;

public class One {
	public void a() {
		d();
	}

	public void b() {
		String a = "pal";
		System.out.println(a.charAt(8));
	}

	public void c() {
		b();
	}

	public void d() {
		c();
	}

	public static void main(String[] args) {
One aa = new One();
		try{aa.c();}
		catch(StringIndexOutOfBoundsException pp) {
			System.out.println(pp);
		}
	}
}
