import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

import consumer.Mostrador;
import entities.Usuario;

public class Main {

	public static void main(String[] args) {
		
		Usuario user1 = new Usuario("Paulo Silveira", 150);
		Usuario user2 = new Usuario("Rodrigo Turini", 120);
		Usuario user3 = new Usuario("Guilherme Silveira", 190);
		

		List<Usuario> usuarios = Arrays.asList(user1, user2, user3);
		
		//Percorrendo a lista
		for(Usuario u : usuarios) {
		System.out.println(u.getNome());
		}
		System.out.println("----------------");
		
		//Percorrendo a lista utilizando um consumer
		Mostrador mostrador = new Mostrador();
		usuarios.forEach(mostrador);
		
		System.out.println("----------------");
		//Percorrendo a lista utilizando una função anônima
		usuarios.forEach(new Consumer<Usuario>() {
			public void accept(Usuario u) {
				System.out.println(u.getNome());
			}
		});
		
		Consumer<Usuario> lambda =  u -> System.out.println(u.getNome());
		System.out.println("----------------");
		usuarios.forEach(u -> System.out.println(u.getNome()));
	}

}
