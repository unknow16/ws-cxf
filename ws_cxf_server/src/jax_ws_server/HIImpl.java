package jax_ws_server;

public class HIImpl implements HI{

	@Override
	public String sayHi(String name) {
		return "hi " + name;
	}

}
