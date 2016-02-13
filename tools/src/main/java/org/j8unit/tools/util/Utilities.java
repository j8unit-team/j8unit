package org.j8unit.tools.util;

import static java.lang.ClassLoader.getSystemClassLoader;
import static java.util.Objects.requireNonNull;
import static java.util.stream.Collectors.joining;
import static org.j8unit.tools.util.OptionalString.ofEmptyable;
import java.util.Arrays;
import java.util.Optional;
import java.util.concurrent.Callable;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public enum Utilities {
    ;

    /**
     * Capitalizes the first letter of a given {@link String}.
     *
     * @param string
     *            the input string
     * @return input string but with capitalized first letter
     */
    public static final String capFirst(final String string) {
        switch (requireNonNull(string)) {
            case "":
                return string;
            default:
                return string.substring(0, 1).toUpperCase() + string.substring(1);
        }
    }

    /**
     * Executes the given {@link Callable} and returns its result as an {@link Optional}. If an exception is thrown then
     * (a) the given {@link Exception} handler is called to consume that exception and (b) an
     * {@linkplain Optional#empty() empty Optional} is returned accordingly.
     *
     * @param callable
     *            the {@link Callable} to execute
     * @param handler
     *            the {@link Exception} sink, used if an exception is thrown while executing the given {@link Callable}
     * @return the result of the execution, enveloped into an {@link Optional}
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

    public static final <R> Optional<R> optionalise(final Callable<R> callable) {
        return optionalise(callable, NOOP);
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
    public static final <R> Supplier<R> runtimify(final Callable<R> callable)
    throws RuntimeException {
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
        return runtimify(requireNonNull(callable)).get();
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
        return requireNonNull(opt).map(Stream::of).orElse(Stream.empty());
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

    public static final Consumer<Object> NOOP = any -> {};

    public static final String implode(final Stream<? extends CharSequence> data, final String pre, final String post, final String delimiter,
                                       final String before, final String after) {
        requireNonNull(data);
        requireNonNull(delimiter);
        requireNonNull(pre);
        requireNonNull(post);
        requireNonNull(before);
        requireNonNull(after);
        return ofEmptyable(data.map(d -> pre + d + post).collect(joining(delimiter))).surround(before, after).orElse("");
    }

    public static final String implode(final Iterable<? extends CharSequence> data, final String pre, final String post, final String delimiter,
                                       final String before, final String after) {
        requireNonNull(data);
        requireNonNull(delimiter);
        requireNonNull(pre);
        requireNonNull(post);
        requireNonNull(before);
        requireNonNull(after);
        return implode(StreamSupport.stream(data.spliterator(), false), pre, post, delimiter, before, after);
    }

    public static final String bcsv(final Stream<? extends CharSequence> data) {
        requireNonNull(data);
        return implode(data, "", "", ", ", "<", ">");
    }

    public static final String bcsv(final Iterable<? extends CharSequence> data) {
        requireNonNull(data);
        return bcsv(StreamSupport.stream(data.spliterator(), false));
    }

    public static final String bcsv(final CharSequence... data) {
        requireNonNull(data);
        return bcsv(Arrays.stream(data));
    }

    public static final String csv(final Stream<? extends CharSequence> data) {
        requireNonNull(data);
        return implode(data, "", "", ", ", "", "");
    }

    public static final String csv(final Iterable<? extends CharSequence> data) {
        requireNonNull(data);
        return csv(StreamSupport.stream(data.spliterator(), false));
    }

    public static final String csv(final CharSequence... data) {
        requireNonNull(data);
        return csv(Arrays.stream(data));
    }

}
