package pl.coderslab.beans;

public class MessageSender {
    MessageService messageService;
    String message;

    public MessageSender(MessageService messageService) {
        this.messageService = messageService;
    }

    public MessageSender(MessageService messageService, String message) {
        this.messageService = messageService;
        this.message = message;
    }

    public void sendMessage() {
        messageService.send();
    }
    public void setMessageFromProperty() {
        messageService.send(message);
    }
}
