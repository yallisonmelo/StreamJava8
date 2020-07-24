package FunctionalInterface;

import java.util.Objects;
import java.util.function.Consumer;

@FunctionalInterface
public interface ConsumerExample<T> {

    void accept(T t);

    default Consumer<T> andThen(ConsumerExample<? super T> after) {
        Objects.requireNonNull(after);
        return (T t) -> {
            accept(t);
            after.accept(t);
        };
    }
}
