package org.j8unit.generator.util;

import static java.util.Objects.requireNonNull;
import static org.j8unit.generator.util.Consumers.NOOP;
import java.util.Optional;
import java.util.concurrent.Callable;
import java.util.function.Consumer;
import java.util.stream.Stream;

/**
 * <p>
 * Utility enum (aka. helper class) providing fancy {@link Optional} stuff.
 * </p>
 */
public enum Optionals {
    ;

    /**
     * Converts an {@link Optional} to a {@link Stream}, either {@linkplain Stream#empty() empty} or
     * {@linkplain Stream#of(Object) singleton}.
     *
     * @deprecated If Java 9 is released, replace this helper method by
     *             <a href="http://download.java.net/jdk9/docs/api/java/util/Optional.html#stream--">Optional#stream()
     *             </a>
     */
    @Deprecated
    public static final <T> Stream<T> toStream(final Optional<T> opt) {
        requireNonNull(opt);
        return opt.map(Stream::of).orElse(Stream.empty());
    }

    /**
     * {@linkplain Callable#call() Executes} the given {@link Callable} and returns its result as an {@link Optional}.
     * If an {@link Exception} is thrown then (1<sup>st</sup>) the given {@code handler} is called to consume that
     * {@code Exception} and (2 <sup>nd</sup>) an {@linkplain Optional#empty() empty Optional} is returned accordingly.
     *
     * @param callable
     *            the {@code Callable} to execute
     * @param handler
     *            the {@code Exception} sink, used if an {@code Exception} is thrown while executing the given
     *            {@code Callable}
     * @param <R>
     *            the type of the result
     * @return the result of the execution, enveloped into an {@code Optional}
     */
    public static final <R> Optional<R> optionalise(final Callable<R> callable, final Consumer<? super Exception> handler) {
        requireNonNull(callable);
        requireNonNull(handler);
        try {
            return Optional.ofNullable(callable.call());
        } catch (final Exception any) {
            handler.accept(any);
            return Optional.empty();
        }
    }

    /**
     * Similar to {@link #optionalise(Callable, Consumer)} with using {@link Consumers#NOOP} to consume any occurring
     * {@link Exception}.
     *
     * @param callable
     *            the {@code Callable} to execute
     * @param <R>
     *            the type of the result
     * @return the result of the execution, enveloped into an {@code Optional}
     */
    public static final <R> Optional<R> optionalise(final Callable<R> callable) {
        requireNonNull(callable);
        return optionalise(callable, NOOP);
    }

}
