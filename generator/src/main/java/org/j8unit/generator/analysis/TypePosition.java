package org.j8unit.generator.analysis;

import static java.lang.reflect.Modifier.isStatic;
import static java.util.Arrays.stream;
import static java.util.Objects.nonNull;
import static java.util.Objects.requireNonNull;
import java.lang.reflect.Modifier;
import java.util.Optional;
import java.util.function.Predicate;
import javax.lang.model.element.NestingKind;
import org.j8unit.generator.util.Matcher;

/**
 * <p>
 * Enumeration of the positions of Java types; Actually, there are five:
 * </p>
 *
 * <ul>
 * <li>Top level types ({@link #TOP_LEVEL})</li>
 * <li>Nested types (static member types) ({@link #NESTED})</li>
 * <li>Inner types (non-static member types) ({@link #INNER})</li>
 * <li>Local types (named types declared within a method) ({@link #LOCAL})</li>
 * <li>Anonymous types ({@link #ANONYMOUS})</li>
 * </ul>
 *
 * <p>
 * This helper enumeration does <em>not</em> provide further j8unit specific content.
 * </p>
 *
 * @see Class#getEnclosingClass() source code of {@code Class#getEnclosingClass()}
 * @see <a href="https://docs.oracle.com/javase/tutorial/java/javaOO/nested.html">The Java&trade; Tutorials: Nested
 *      Classes</a>
 * @see <a href="https://docs.oracle.com/javase/tutorial/java/javaOO/localclasses.html">The Java&trade; Tutorials: Local
 *      Classes</a>
 * @see <a href="https://docs.oracle.com/javase/tutorial/java/javaOO/anonymousclasses.html">The Java&trade; Tutorials:
 *      Anonymous Classes</a>
 */
public enum TypePosition
implements Matcher<Class<?>> {

    /**
     * <p>
     * Enumeration constant representing top level types; that is, all types without an enclosing type.
     * </p>
     *
     * @see Class#getEnclosingClass()
     */
    TOP_LEVEL(t -> t.getEnclosingClass() == null, NestingKind.TOP_LEVEL),

    /**
     * <p>
     * Enumeration constant representing nested types; that is, all static member types.
     * </p>
     *
     * @see Class#isMemberClass()
     * @see Modifier#isStatic(int)
     */
    NESTED(t -> t.isMemberClass() && isStatic(t.getModifiers()), NestingKind.MEMBER),

    /**
     * <p>
     * Enumeration constant representing inner types; that is, all non-static member types.
     * </p>
     *
     * @see Class#isMemberClass()
     * @see Modifier#isStatic(int)
     */
    INNER(t -> t.isMemberClass() && !isStatic(t.getModifiers()), NestingKind.MEMBER),

    /**
     * <p>
     * Enumeration constant representing local types; that is, all named types declared within a method.
     * </p>
     *
     * @see Class#isLocalClass()
     */
    LOCAL(Class::isLocalClass, NestingKind.LOCAL),

    /**
     * <p>
     * Enumeration constant representing anonymous types.
     * </p>
     *
     * @see Class#isAnonymousClass()
     */
    ANONYMOUS(Class::isAnonymousClass, NestingKind.ANONYMOUS);

    /**
     * The predicate to decide whether or not a given {@link Class type} matches {@code this} specific kind of Java
     * type.
     */
    private final Predicate<Class<?>> predicate;

    // TODO (Issue #37): What can we do with the nesting-kind information? Most probably, there are fancy ideas out
    // there ...
    @SuppressWarnings("unused")
    private final NestingKind kind;

    /**
     * @param predicate
     *            the type-position matching predicate
     * @param kind
     *            the according nesting kind
     */
    private TypePosition(final Predicate<Class<?>> predicate, final NestingKind kind) {
        assert nonNull(predicate);
        assert nonNull(kind);
        this.predicate = predicate;
        this.kind = kind;
    }

    /**
     * <p>
     * Predicate method matching any {@link Class type} that fits to the specific kind of Java type.
     * </p>
     *
     * @see #TOP_LEVEL
     * @see #NESTED
     * @see #INNER
     * @see #LOCAL
     * @see #ANONYMOUS
     *
     * @param type
     *            the Java type to use for matching query
     * @return {@code true} if the given modifier fits to the specific kind of Java type; {@code false} otherwise
     */
    @Override
    public final boolean test(final Class<?> type) {
        requireNonNull(type);
        return this.predicate.test(type);
    }

    /**
     * Returns the {@link TypePosition} {@code enum} constant according to the query Java {@code type}.
     *
     * @param type
     *            the query Java type
     * @return the {@code TypeKind} {@code enum} constant according to the query Java {@code type}
     */
    public static final TypePosition kindOf(final Class<?> type) {
        requireNonNull(type);
        final Optional<TypePosition> kind = stream(values()).filter(k -> k.matches(type)).findFirst();
        assert kind.isPresent() : "A class cannot have a kind different to top-level, nested, inner, local, or anonymous!";
        return kind.get();
    }

}
