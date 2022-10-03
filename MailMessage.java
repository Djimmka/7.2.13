public class MailMessage<S extends  String> {
    private S from;
    private S to;
    private S message;
    public MailMessage(S from , S to, S message) {
        this.from = from;
        this.to = to;
        this.message = message;
    }

    public S getFrom()  {
        return from;
    }

    public S getMessage() {
        return message;
    }

    public S getTo() {
        return to;
    }
}
