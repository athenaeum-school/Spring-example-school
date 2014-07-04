package com.athenaeum.helloworld;

public class StandardOutMessageRenderer implements MessageRenderer {

	private MessageProvider messageProvider = null;
	
	public void render() {
		// TODO Auto-generated method stub
		if(messageProvider == null) {
			throw new RuntimeException(
				"MessageProvider must be instantiated."
					+ StandardOutMessageRenderer.class.getName()
			);
		}
		System.out.println(messageProvider.getMessage());
	}

	public void setMessageProvider(MessageProvider provider) {
		// TODO Auto-generated method stub
		this.messageProvider = provider;
	}

	public MessageProvider getMessageProvider() {
		// TODO Auto-generated method stub
		return this.messageProvider;
	}

}
