package FunctionalInterface;

@FunctionalInterface
interface Validator<T> {

    //Functional Interface Only one Method Abastract
    boolean validate(T t);


}
