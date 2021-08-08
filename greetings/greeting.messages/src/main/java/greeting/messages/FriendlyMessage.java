package greeting.messages;

import greeting.api.MessageService;

public class FriendlyMessage implements MessageService  {

	@Override
	public String getMessage() {
		return "Hi Friend";
	}

}
