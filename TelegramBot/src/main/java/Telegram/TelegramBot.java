package Telegram;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;

public class TelegramBot extends TelegramLongPollingBot{

	@Override
	public void onUpdateReceived(Update update) {
		// TODO Auto-generated method stub
		
			if(update.hasMessage()) {
				Message message = update.getMessage();
				
				if(message.hasText()) {
					String text = message.getText();
					
					if(text.equals("/start")) {
						
						SendMessage messagesend = new SendMessage();
						messagesend.setChatId(messagesend.getChatId().toString());
						messagesend.setText("Message");
						try {
							execute(messagesend);
						}catch (Exception e) {
							// TODO: handle exception
							e.printStackTrace();
						}
					}
				}
			}
	}

	@Override
	public String getBotUsername() {
		// TODO Auto-generated method stub
		return "Bot_username";
	}

	@Override
	public String getBotToken() {
		// TODO Auto-generated method stub
		return "Bot token";
	}

	
	
}
