package org.j8unit.generator.analysis;

import static java.util.Arrays.asList;
import static java.util.EnumSet.copyOf;
import static java.util.EnumSet.noneOf;
import static java.util.Objects.nonNull;
import static java.util.stream.Collectors.reducing;
import static org.j8unit.generator.analysis.AccessModifier.PACKAGE_PRIVATE;
import static org.j8unit.generator.analysis.AccessModifier.PROTECTED;
import static org.j8unit.generator.analysis.AccessModifier.PUBLIC;
import java.util.EnumSet;
import java.util.function.IntPredicate;
import org.j8unit.generator.util.ModifierBasedMatcher;

/**
 * <p>
 * Enumeration of the access levels of API components.
 * </p>
 *
 * <dl>
 * <dt>Access Level?</dt>
 * <dd>Depending on the kind of usage, a programmer accesses foreign components (placed within a different name-space)
 * by either using or extending them; Or a programmer originally creates such components. Accordingly, there are an
 * {@link #API} and a {@link #DEVELOPER} level, plus {@link #MANUFACTURER}. Additionally, there might be no access at
 * all ({@link #NONE}), but this is defined just for the sake of completeness.</dd>
 * </dl>
 *
 * <p>
 * This helper enumeration does <em>not</em> provide further j8unit specific content.
 * </p>
 */
public enum AccessLevel
implements ModifierBasedMatcher {

    /**
     * No access to any component.
     */
    NONE,

    /**
     * Normal programmer use foreign components. Thus, there is only access to {@link AccessModifier#PUBLIC public}
     * types and to its {@code public} members.
     */
    API(PUBLIC),

    /**
     * Developer extend foreign components. Thus, they have access to {@link AccessModifier#PUBLIC public} types and to
     * its {@code public} and {@link AccessModifier#PROTECTED protected} members.
     */
    DEVELOPER(PUBLIC, PROTECTED),

    /**
     * Manufacturer reside within the original name-space (java package) and, thus, have access to
     * {@link AccessModifier#PUBLIC public} and <em>{@linkplain AccessModifier#PACKAGE_PRIVATE package-private}</em>
     * types and to its {@code public}, {@link AccessModifier#PROTECTED protected}, and <em>package-private</em>
     * members.
     */
    MANUFACTURER(PUBLIC, PROTECTED, PACKAGE_PRIVATE);

    private IntPredicate access;

    /**
     * @param accesses
     *            the access modifiers this access level has access to
     */
    private AccessLevel(final AccessModifier... accesses) {
        assert nonNull(accesses);
        final EnumSet<AccessModifier> set = (accesses.length == 0) ? noneOf(AccessModifier.class) : copyOf(asList(accesses));
        this.access = set.stream().collect(reducing(($i) -> false, IntPredicate::or));

    }

    /**
     * Predicate-method matching any {@code modifier} that fits to {@code this} specific access level.
     *
     * @return {@code true} if the given {@code modifier} fits to {@code this} specific access level; {@code false}
     *         otherwise
     */
    @Override
    public final boolean test(final int modifier) {
        return this.access.test(modifier);
    }

}
