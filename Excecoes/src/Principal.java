
public class Principal {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		a(-100);

		System.out.println("terminando execu��o de main() ");
	}

	public static void a(int i) {
		System.out.println("executando a() com " + i);
		try {
			b(i);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("tratando a exce��o: " + e.getMessage());
		}
		System.out.println("terminando execu��o de a() ");

	}

	public static void b(int i) throws Exception {
		System.out.println("executando b() com " + i);
		if (i > 0) {
			throw new Exception("mensagem");
		}
	}
}
