package org.j8unit.generator.analysis;

import static java.util.Objects.nonNull;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;
import java.util.function.IntPredicate;
import org.j8unit.generator.util.ModifierBasedMatcher;

/**
 * <p>
 * Enumeration of the access modifiers of Java types and members/fields; Actually, there are four.
 * </p>
 *
 * <dl>
 * <dt>Access Modifier?</dt>
 * <dd>Both {@linkplain Class classes} and {@linkplain Member members} can be limited in its accessibility. In addition
 * to the obvious {@link #PUBLIC public}, {@link #PROTECTED protected}, and {@link #PRIVATE private} access this
 * enumeration contains an explicit element representing the modifier-less {@linkplain #PACKAGE_PRIVATE package private}
 * case.</dd>
 * </dl>
 *
 * <p>
 * This helper enumeration does <em>not</em> provide further j8unit specific content.
 * </p>
 *
 * @see <a href="https://docs.oracle.com/javase/tutorial/java/javaOO/accesscontrol.html">The Java&trade; Tutorials:
 *      Controlling Access to Members of a Class</a>
 */
public enum AccessModifier
implements ModifierBasedMatcher {

    /**
     * <p>
     * Enumeration constant representing {@code public} access.
     * </p>
     */
    PUBLIC(Modifier::isPublic, Lookup.PUBLIC),

    /**
     * <p>
     * Enumeration constant representing {@code protected} access.
     * </p>
     */
    PROTECTED(Modifier::isProtected, Lookup.PROTECTED),

    /**
     * <p>
     * Enumeration constant representing {@code private} access.
     * </p>
     */
    PRIVATE(Modifier::isPrivate, Lookup.PRIVATE),

    /**
     * <p>
     * Enumeration constant representing <em>package private</em> access (aka. default access).
     * </p>
     */
    PACKAGE_PRIVATE(PUBLIC.predicate.or(PROTECTED.predicate).or(PRIVATE.predicate).negate(), Lookup.PACKAGE);

    /**
     * The predicate to decide whether or not a given modifier bit mask matches this access level.
     */
    private final IntPredicate predicate;

    // TODO (Issue #36): What can we do with the modifier's bit-mask information? Most probably, there are fancy ideas
    // out there ...
    @SuppressWarnings("unused")
    private final int bitMask;

    /**
     * @param predicate
     *            the level matching predicate
     * @param bitMask
     *            a single-bit mask representing the access level
     */
    private AccessModifier(final IntPredicate predicate, final int bitMask) {
        assert nonNull(predicate);
        this.predicate = predicate;
        this.bitMask = bitMask;
    }

    /**
     * <p>
     * Predicate-method matching any {@code modifier} that fits to {@code this} specific access modifier.
     * </p>
     *
     * @param modifier
     *            the modifier to use for matching query
     * @return {@code true} if the given {@code modifier} fits to {@code this} specific access modifier; {@code false}
     *         otherwise
     */
    @Override
    public final boolean matches(final int modifier) {
        return this.predicate.test(modifier);
    }

}
