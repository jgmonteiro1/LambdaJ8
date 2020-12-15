package consumer;

import java.util.function.Consumer;

import entities.Usuario;

public class Mostrador implements Consumer<Usuario> {

	@Override
	public void accept(Usuario t) {
		System.out.println(t.getNome());
		
	}

}
