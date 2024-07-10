public class TelegramAdapter implements Notifier {
    private TelegramNotifier telegramNotifier;
    
    public TelegramAdapter(TelegramNotifier notifier) {
    this.telegramNotifier = notifier;
    }
    
    @Override
    public void send(String message) {
    telegramNotifier.notify(message);
    }
}