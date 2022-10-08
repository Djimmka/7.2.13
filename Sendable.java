public interface Sendable<T> {
    String from = "";
    String to = "";

    public String getFrom();

    public String getTo();

    public T getContent();
}
