module greeting.messages {
	requires greeting.api;
	
	provides greeting.api.MessageService with 
		greeting.messages.FriendlyMessage,
		greeting.messages.AngryMessage,
		greeting.messages.EmotionalMessage ;
	
}