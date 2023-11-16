package AvaliaçãoFormativa;

public class PrincipalPessoa {

	public static void main(String[] args) {

		Fisica Fisica = new Fisica("Beatriz","122 123 234 22", "738399303");
		System.out.println("Pessoa Fisica:");
		System.out.println("Nome: " + Fisica.getNome());
		System.out.println("CPF: " + Fisica.getCpf());
		System.out.println("RG: "+ Fisica.getRg());
	}

}
