package greeting.messages;

import greeting.api.MessageService;

public class EmotionalMessage implements MessageService {

	@Override
	public String getMessage() {
		return "Every heart has a pain";
	}

}
