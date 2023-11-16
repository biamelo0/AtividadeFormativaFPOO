package AvaliaçãoFormativa;

public class PrincipalUsuario {

	public static void main(String[] args) {
		Usuario usuario1 = new Usuario(10,"Beatriz",913733,"Permitido","biamelo099");
		System.out.println(usuario1.getId());
		System.out.println(usuario1.getNome());
		System.out.println(usuario1.getPassword());
		System.out.println(usuario1.getPermissao());
		System.out.println(usuario1.getUsuario());
		

	}

}
