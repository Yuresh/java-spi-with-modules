package greeting.messages;

import greeting.api.MessageService;

public class AngryMessage implements MessageService {

	@Override
	public String getMessage() {
		return "I am very disappointed";
	}

}
