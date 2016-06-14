package org.j8unit.generator.util;

import static java.util.Objects.requireNonNull;
import java.util.concurrent.Callable;
import java.util.function.Supplier;

/**
 * <p>
 * Utility enum (aka. helper class) providing fancy {@link Supplier}/{@link Callable} stuff.
 * </p>
 */
public enum Suppliers {
    ;

    /**
     * Converts a {@link Callable} into a {@link Supplier}; i.&thinsp;e., the {@link Exception} throwing
     * {@link Callable} is accordingly wrapped to envelope any checked exception by an {@linkplain RuntimeException
     * unchecked exception}.
     *
     * @param callable
     *            the origin {@code Exception} throwing {@code Callable}
     * @param <R>
     *            the type of the supplied element
     * @return the {@linkplain RuntimeException unchecked version} of the input {@code Callable} as a {@link Supplier}
     *         type
     */
    public static final <R> Supplier<R> runtimify(final Callable<? extends R> callable) {
        requireNonNull(callable);
        return () -> {
            try {
                return callable.call();
            } catch (final RuntimeException any) {
                throw any;
            } catch (final Exception any) {
                throw new RuntimeException(any);
            }
        };
    }

    /**
     * {@linkplain Callable#call() Executes} the given {@link Callable} and returns its result. If a checked
     * {@link Exception} is thrown it will be wrapped into an enveloping unchecked {@link RuntimeException}.
     *
     * @param callable
     *            the {@code Callable} to execute
     * @param <R>
     *            the type of the supplied element
     * @return the result of the execution
     * @throws RuntimeException
     *             the unchecked wrapper of any checked exception
     */
    public static final <R> R runtimed(final Callable<? extends R> callable)
    throws RuntimeException {
        requireNonNull(callable);
        return runtimify(requireNonNull(callable)).get();
    }

}
