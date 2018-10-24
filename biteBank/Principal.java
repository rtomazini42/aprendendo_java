package bityBank;

public class Principal {

	public static void main(String[] args) {
		Conta conta1 = new Conta();
		conta1.setSaldo(200);
		conta1.setSaldo(conta1.getSaldo() + 100);
		System.out.println(conta1.getSaldo());
		conta1.setNome("Yuri");
		String user;
		user = conta1.getNome();
		System.out.println(user);
	}

}
