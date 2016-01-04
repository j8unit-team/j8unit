package org.j8unit.tools.util;

import static java.util.Objects.requireNonNull;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class OptionalString {

    private static final OptionalString EMPTY = new OptionalString();

    private final String value;

    private OptionalString() {
        this.value = null;
    }

    public static OptionalString empty() {
        return EMPTY;
    }

    private OptionalString(final String value) {
        requireNonNull(value);
        if ("".equals(value)) {
            throw new IllegalArgumentException();
        }
        this.value = value;
    }

    public static OptionalString of(final String value) {
        return new OptionalString(value);
    }

    public static OptionalString ofEmptyable(final String value) {
        return (value == null) || "".equals(value) ? empty() : of(value);
    }

    public boolean isPresent() {
        return (this.value != null) && !"".equals(this.value);
    }

    public String get() {
        if (this.isPresent()) {
            return this.value;
        }
        throw new NoSuchElementException("No non-empty value present");
    }

    public void ifPresent(final Consumer<? super String> consumer) {
        if (this.isPresent()) {
            consumer.accept(this.value);
        }
    }

    public OptionalString filter(final Predicate<? super String> predicate) {
        requireNonNull(predicate);
        if (this.isPresent()) {
            return predicate.test(this.value) ? this : empty();
        }
        return this;
    }

    public OptionalString prepend(final String prefix) {
        requireNonNull(prefix);
        if (this.isPresent()) {
            return of(prefix + this.value);
        }
        return this;
    }

    public OptionalString append(final String suffix) {
        requireNonNull(suffix);
        if (this.isPresent()) {
            return of(this.value + suffix);
        }
        return this;
    }

    public OptionalString surround(final String prefix, final String suffix) {
        requireNonNull(prefix);
        requireNonNull(suffix);
        if (this.isPresent()) {
            return of(prefix + this.value + suffix);
        }
        return this;
    }

    public OptionalString map(final UnaryOperator<String> mapper) {
        requireNonNull(mapper);
        if (this.isPresent()) {
            return ofEmptyable(mapper.apply(this.value));
        }
        return this;
    }

    public <U> Optional<U> map(final Function<? super String, ? extends U> mapper) {
        requireNonNull(mapper);
        if (this.isPresent()) {
            return Optional.ofNullable(mapper.apply(this.value));
        }
        return Optional.empty();
    }

    public OptionalString flatMap(final Function<? super String, OptionalString> mapper) {
        requireNonNull(mapper);
        if (this.isPresent()) {
            return requireNonNull(mapper.apply(this.value));
        }
        return this;
    }

    public String orElse(final String other) {
        return this.isPresent() ? this.value : other;
    }

    public String orElseGet(final Supplier<? extends String> other) {
        return this.isPresent() ? this.value : other.get();
    }

    public <X extends Throwable> String orElseThrow(final Supplier<? extends X> exceptionSupplier)
    throws X {
        if (this.isPresent()) {
            return this.value;
        } else {
            throw exceptionSupplier.get();
        }
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OptionalString)) {
            return false;
        }
        final OptionalString other = (OptionalString) obj;
        return Objects.equals(this.value, other.value);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(this.value);
    }

    @Override
    public String toString() {
        return this.isPresent() ? String.format("OptionalString[%s]", this.value) : "OptionalString.empty";
    }

}
