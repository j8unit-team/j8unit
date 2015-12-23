package org.j8unit.tools;

import static java.lang.ClassLoader.getSystemClassLoader;
import java.util.Optional;
import java.util.concurrent.Callable;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Stream;

public enum GeneratorUtil {
    ;

    /**
     * Capitalizes the first letter of a given {@link String}.
     *
     * @param string
     *            the input string
     * @return input string but with capitalized first letter
     */
    public static final String capFirst(final String string) {
        switch (string) {
            case "":
                return string;
            default:
                return string.substring(0, 1).toUpperCase() + string.substring(1);
        }
    }

    /**
     * Executes the given {@link Callable} and returns its result as an {@link Optional}. If an exception is thrown (a)
     * the given {@link Exception} handler is called to consume that exception and (b) an {@linkplain Optional#empty()
     * empty Optional} is accordingly.
     *
     * @param callable
     *            the {@link Callable} to execute
     * @param handler
     *            the {@link Exception} sink, used if an exception is thrown while executing the given {@link Callable}
     * @return the result of the execution, enveloped into an {@link Optional}
     */
    public static final <R> Optional<R> optionalise(final Callable<R> callable, final Consumer<? super Exception> handler) {
        try {
            return Optional.ofNullable(callable.call());
        } catch (final Exception any) {
            handler.accept(any);
            return Optional.empty();
        }
    }

    /**
     * Executes the given {@link Callable} and returns its result. If an unchecked exception is thrown it will be
     * wrapped into an enveloping unchecked {@link RuntimeException}.
     *
     * @param callable
     *            the {@link Callable} to execute
     * @return the result of the execution
     * @throws RuntimeException
     */
    public static final <R> R runtimed(final Callable<R> callable)
    throws RuntimeException {
        return runtimify(callable).get();
    }

    /**
     * Converts a {@link Callable} into a {@link Supplier}; i.&thinsp;e., the {@link Exception} throwing
     * {@link Callable} is accordingly wrapped to envelope any checked exception by an {@linkplain RuntimeException
     * unchecked exception}.
     *
     * @param callable
     *            the origin {@link Exception} throwing {@link Callable}
     * @return the {@linkplain RuntimeException unchecked version} of the input {@link Callable} as a {@link Supplier}
     *         type
     */
    public static final <R> Supplier<R> runtimify(final Callable<R> callable) {
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
     * Converts an {@link Optional} to a {@link Stream}, either {@linkplain Stream#empty() empty} or
     * {@linkplain Stream#of(Object) singleton}.
     *
     * @deprecated If Java 9 is released, replace this helper method by
     *             <a href="http://download.java.net/jdk9/docs/api/java/util/Optional.html#stream--">Optional#stream()
     *             </a>
     */
    @Deprecated
    public static final <T> Stream<T> toStream(final Optional<T> opt) {
        return opt.map(Stream::of).orElse(Stream.empty());
    }

    /**
     * Tries to load a class by its name. If for any exceptional reason the class cannot be loaded, the thrown
     * {@link Exception} will print its stack trace to {@link System#err}.
     *
     * @see #optionalise(Callable, Consumer)
     * @param name
     *            the name of the {@link Class} to load
     * @return the loaded {@link Class}, enveloped into an {@link Optional}
     */
    public static final Optional<Class<?>> tryLoadClass(final String name) {
        return optionalise(() -> getSystemClassLoader().loadClass(name), e -> e.printStackTrace(System.err));
    }

}
