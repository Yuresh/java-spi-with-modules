package greeting.client;

import java.util.ServiceLoader;

import greeting.api.MessageService;

public class TestClient {

	public static void main(String[] args) {
		ServiceLoader<MessageService> ms = ServiceLoader.load(MessageService.class);
		
		for (MessageService m : ms) {
			System.out.println(m.getMessage());
		}
	}

}
