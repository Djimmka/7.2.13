public class MailMessage implements Sendable{
    private String from;
    private String to;
    private String content;
    public MailMessage(String from , String to, String message) {
        this.from = from;
        this.to = to;
        this.content = message;
    }

    public String getFrom()  { return this.from; }

    public String getContent() {
        return this.content;
    }

    public String getTo() {
        return this.to;
    }
}
