import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MailService<T> implements Consumer {
    Map<T, String> items = new HashMap<>();

    @Override
    public void accept(Object o) {
        try {
            items.put(((Sendable<T>) o).getContent(), ((Sendable<T>) o).getTo());
        } catch (RuntimeException e) {
            ;
        }
    }

    public <T> Map<String, List<T>> getMailBox() {
        Map<String, List<T>> result = new HashMap<>() {
            @Override
            public List<T> get(Object key) {
                return this.getOrDefault(key, new ArrayList<>());
            }
        };;
//        List<T> lst = new ArrayList<>();
//        items.forEach(
//                s-> {
//                    lst.clear();
//                    if (result.containsKey()) {
//                        lst = result.get()
//                    }
//                }
//        );
        List<T> mails = new ArrayList<T>((Collection<? extends T>) items.keySet());
        List<String> to = new ArrayList<>(items.values());
        for (T mail : mails) {
            List<T> lst = new ArrayList<>();
            if (result.containsKey(items.get(mail))) {
                lst = result.get(items.get(mail));
            }
            lst.add(mail);
            result.putIfAbsent(items.get(mail), lst);
        }

//        Map<String, List<T>> result = items.entrySet().stream()
//                .collect(Collectors.groupingBy(s -> s.getValue(),
//                        Collectors.mapping(s -> s.getKey(),
//                                Collectors.toList()))));

        return result;
    }
}
