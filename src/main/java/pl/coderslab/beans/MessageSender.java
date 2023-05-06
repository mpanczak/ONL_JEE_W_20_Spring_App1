package pl.coderslab.beans;

public class MessageSender {
    MessageService messageService;

    public MessageSender(MessageService messageService) {
        this.messageService = messageService;
    }

    public void sendMessage() {
        messageService.send();
    }
}
