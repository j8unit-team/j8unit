package org.j8unit.generator.util;

import static java.util.Objects.requireNonNull;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

/**
 * <p>
 * A container object which may or may not contain a non-{@code null} <em>and</em> non-{@linkplain String#isEmpty()
 * empty} {@linkplain String string} value. Iff a non-empty value is present, {@link #isPresent()} will return
 * {@code true} and {@link #get()} will return the value.
 * </p>
 *
 * <p>
 * Additional methods that depend on the presence or absence of a contained value are provided, such as
 * {@link #orElse(String)} (return a default string value if value is not present) and {@link #ifPresent(Consumer)}
 * (execute a block of code if the value is present).
 * </p>
 *
 * <p>
 * This is a <a href="https://docs.oracle.com/javase/8/docs/api/java/lang/doc-files/ValueBased.html">value-based</a>
 * class; use of identity-sensitive operations (including reference equality ({@code ==}), identity hash code, or
 * synchronization) on instances of {@code OptionalString} may have unpredictable results and should be avoided.
 * </p>
 */
public final class OptionalString {

    /**
     * Common instance for {@link #empty()}.
     */
    private static final OptionalString EMPTY = new OptionalString();

    /**
     * This is the value of this optional {@link String} container. It is either (A) {@code null} or
     * {@linkplain String#isEmpty() empty} (indicating no value is present) or it is (B) the value.
     *
     * @see #isPresent()
     */
    private final String value;

    /**
     * Constructs an empty instance of this class.
     */
    private OptionalString() {
        this.value = null;
    }

    /**
     * Returns an empty {@link OptionalString} instance; That is, no {@link #value} is present.
     *
     * @return an empty {@link OptionalString} instance
     */
    public static final OptionalString empty() {
        return EMPTY;
    }

    /**
     * Constructs an instance of this class, containing the given {@code value}.
     *
     * @param value
     *            the non-{@code null} <em>and</em> non-empty value to be present
     * @throws NullPointerException
     *             if {@code value} is {@code null}
     * @throws IllegalArgumentException
     *             if {@code value} is {@linkplain String#isEmpty() is empty}
     */
    private OptionalString(final String value)
    throws NullPointerException, IllegalArgumentException {
        requireNonNull(value);
        if (value.isEmpty()) {
            throw new IllegalArgumentException();
        }
        this.value = value;
    }

    /**
     * Returns an instance of this class, containing the given {@code value}.
     *
     * @param value
     *            the non-{@code null} <em>and</em> non-empty value to be present
     * @return an instance of this class, containing the given {@code value}
     * @throws NullPointerException
     *             if {@code value} is {@code null}
     * @throws IllegalArgumentException
     *             if {@code value} is {@linkplain String#isEmpty() is empty}
     */
    public static final OptionalString of(final String value)
    throws NullPointerException, IllegalArgumentException {
        return new OptionalString(value);
    }

    /**
     * Returns an instance of this class describing the specified {@code value}, if non-{@code null} <em>and</em>
     * non-empty; Otherwise returns an {@linkplain #empty() empty OptionalString instance}.
     *
     * @param value
     *            the possibly-{@code null} or possibly-empty value to describe
     * @return an instance of this class describing the specified {@code value}, if non-{@code null} <em>and</em>
     *         non-empty; Otherwise returns an empty {@link OptionalString} instance
     */
    public static final OptionalString ofEmptyable(final String value) {
        return (value == null) || value.isEmpty() ? empty() : of(value);
    }

    /**
     * Returns an instance of this class {@linkplain #ofEmptyable(String) describing} the specified {@code optional}
     * {@link String} value, if {@linkplain Optional#isPresent() present}; Otherwise returns an {@linkplain #empty()
     * empty OptionalString instance}.
     *
     * @param optional
     *            the possibly-empty value to describe
     * @return an instance of this class describing the specified {@code value}, if non-{@code null} <em>and</em>
     *         non-empty; Otherwise returns an empty {@link OptionalString} instance
     */
    public static final OptionalString ofOptional(final Optional<String> optional) {
        requireNonNull(optional);
        return ofEmptyable(optional.orElse(null));
    }

    /**
     * Return {@code true} if there is a {@linkplain #value} present, otherwise {@code false}.
     *
     * @return {@code true} iff there is a value present
     */
    public final boolean isPresent() {
        return (this.value != null) && !this.value.isEmpty();
    }

    /**
     * If a {@linkplain #value} is present in this {@link OptionalString}, returns the value; Otherwise throws
     * {@code NoSuchElementException}.
     *
     * @return the non-{@code null} <em>and</em> non-{@linkplain String#isEmpty() empty} value held by {@code this}
     *         instance
     * @throws NoSuchElementException
     *             iff there is no value present
     *
     * @see OptionalString#isPresent()
     */
    public final String get()
    throws NoSuchElementException {
        if (this.isPresent()) {
            return this.value;
        }
        throw new NoSuchElementException("No non-empty string value present!");
    }

    /**
     * If a {@linkplain #value} is present in {@code this} instance, invoke the specified {@link Consumer consumer} with
     * the value; Otherwise do nothing.
     *
     * @param consumer
     *            block to be executed if a value is present
     * @throws NullPointerException
     *             if value is present and the specified {@code consumer} is {@code null}
     *
     * @see OptionalString#isPresent()
     */
    public final void ifPresent(final Consumer<? super String> consumer)
    throws NullPointerException {
        if (this.isPresent()) {
            requireNonNull(consumer);
            consumer.accept(this.value);
        }
    }

    /**
     * If a {@linkplain #value} is present and the value matches the given {@link Predicate predicate}, returns
     * {@code this} instance; Otherwise returns an {@linkplain #empty() empty OptionalString instance}.
     *
     * @param predicate
     *            a predicate to apply to the value, if present
     * @return {@code this} instance if a value is present and the value matches the given {@link Predicate predicate};
     *         Otherwise returns an empty {@link OptionalString} instance
     * @throws NullPointerException
     *             if value is present and the specified {@code predicate} is {@code null}
     *
     * @see OptionalString#isPresent()
     */
    public final OptionalString filter(final Predicate<? super String> predicate) {
        if (this.isPresent()) {
            requireNonNull(predicate);
            return predicate.test(this.value) ? this : empty();
        }
        return this;
    }

    public final OptionalString map(final UnaryOperator<String> mapper) {
        if (this.isPresent()) {
            requireNonNull(mapper);
            return ofEmptyable(mapper.apply(this.value));
        }
        return this;
    }

    public final OptionalString prepend(final String prefix) {
        if (this.isPresent()) {
            requireNonNull(prefix);
            return of(prefix + this.value);
        }
        return this;
    }

    public final OptionalString append(final String suffix) {
        if (this.isPresent()) {
            requireNonNull(suffix);
            return of(this.value + suffix);
        }
        return this;
    }

    public final OptionalString surround(final String prefix, final String suffix) {
        if (this.isPresent()) {
            requireNonNull(prefix);
            requireNonNull(suffix);
            return of(prefix + this.value + suffix);
        }
        return this;
    }

    public final OptionalString format(final String format) {
        if (this.isPresent()) {
            requireNonNull(format);
            return of(String.format(format, this.value));
        }
        return this;
    }

    /**
     * If a {@linkplain #value} is present, {@linkplain Function#apply(Object) applies} the provided {@code mapper}
     * {@linkplain Function function} to it, and if the result is non-{@code null}, returns an {@link Optional}
     * describing the result. Otherwise returns an {@linkplain Optional#empty() empty Optional}.
     *
     * @param <U>
     *            the type of the result of the {@code mapper} function
     * @param mapper
     *            a mapping function to apply to the value, if present
     * @return an {@code Optional} describing the result of applying a mapping function to the value of {@code this}
     *         instance, if a value is present, otherwise an empty {@code Optional}
     * @throws NullPointerException
     *             if the mapping function is null
     *
     * @see OptionalString#isPresent()
     */
    public final <U> Optional<U> map(final Function<? super String, ? extends U> mapper) {
        if (this.isPresent()) {
            requireNonNull(mapper);
            return Optional.ofNullable(mapper.apply(this.value));
        }
        return Optional.empty();
    }

    public final OptionalString flatMap(final Function<? super String, OptionalString> mapper) {
        if (this.isPresent()) {
            requireNonNull(mapper);
            return requireNonNull(mapper.apply(this.value));
        }
        return this;
    }

    public final String orElse(final String other) {
        return this.isPresent() ? this.value : other;
    }

    public final String orEmpty() {
        return this.orElse("");
    }

    public final String orElseGet(final Supplier<? extends String> other) {
        return this.isPresent() ? this.value : requireNonNull(other).get();
    }

    public final <X extends Throwable> String orElseThrow(final Supplier<? extends X> exceptionSupplier)
    throws X {
        if (this.isPresent()) {
            return this.value;
        } else {
            throw requireNonNull(exceptionSupplier).get();
        }
    }

    @Override
    public final boolean equals(final Object other) {
        if (this == other) {
            return true;
        } else if (other instanceof OptionalString) {
            final OptionalString that = (OptionalString) other;
            return Objects.equals(this.value, that.value);
        } else {
            return false;
        }
    }

    @Override
    public final int hashCode() {
        return Objects.hashCode(this.value);
    }

    @Override
    public final String toString() {
        return this.isPresent() ? String.format("%s[%s]", OptionalString.class.getSimpleName(),
                                                this.value) : String.format("%s.empty", OptionalString.class.getSimpleName());
    }

    public final Stream<String> toStream() {
        return this.isPresent() ? Stream.of(this.value) : Stream.empty();
    }

}
