/**
 * Class: Predicate.java
 * Author: hector.hernandez
 * Date: Mar 21, 2020
 */
package bootcamp.java.number11;

/**
 * @author hector.hernandez
 * @Version 1.0
 */
@FunctionalInterface
public interface Predicate<T> {
	boolean test(T t);
}
