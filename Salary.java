public class Salary implements Sendable{
    private String from;
    private String to;
    private Integer content;

    public Salary(String from, String to, Integer content){
     this.from = from;
     this.to = to;
     this.content = content;
    }

    public String getFrom()  { return this.from; }

    public Integer getContent() {
        return this.content;
    }

    public String getTo() {
        return this.to;
    }
}
