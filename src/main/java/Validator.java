@FunctionalInterface
interface Validator<T> {
    boolean validate(T t);

}
