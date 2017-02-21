package org.j8unit.runners.conformance;

import static java.lang.String.format;
import static java.util.Collections.singleton;
import static java.util.stream.Collectors.toSet;
import static org.j8unit.util.Reflection.classForName;
import java.util.Optional;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Consumer;

/**
 * This is the default j8unit way to discover all the reusable j8unit test interfaces of a given API candidate type.
 *
 * First, it tries to discover the class names of all according test interfaces (see {@link #namesFor(Class)}).
 *
 * In a second step, each name is used to {@linkplain Class#forName(String) load that class at runtime}; In case some of
 * these classes cannot be found, the related {@link ClassNotFoundException} is passed to a given consumer of such
 * failures (see {@link #apply(Class, Consumer)}).
 *
 * @see APIConformance.ClassTestsDiscovery#value()
 * @see APIConformance.ClassTestsDiscovery#args()
 * @see APIConformance.InstanceTestsDiscovery#value()
 * @see APIConformance.InstanceTestsDiscovery#args()
 *
 * @since 4.12.2
 */
public class J8UnitRepositoryTestsDiscovery
implements BiFunction<Class<?>, Consumer<? super ClassNotFoundException>, Set<Class<?>>> {

    /**
     * Prefix of the j8unit repository.
     */
    public static final String J8UNIT_REPOSITORY_PREFIX = "org.j8unit.repository.";

    /**
     * Suffix of the j8unit repository's test interfaces which contain tests targeting the ({@code static}) class API.
     */
    public static final String J8UNIT_REPOSITORY_CLASS_TESTS_SUFFIX = "ClassTests";

    /**
     * Suffix of the j8unit repository's test interfaces which contain tests targeting the (non-{@code static}) instance
     * API.
     */
    public static final String J8UNIT_REPOSITORY_INSTANCE_TESTS_SUFFIX = "Tests";

    private final String prefix;

    private final String suffix;

    /**
     * Creates a new instance of this class; called reflectively by {@link APIConformance#getStrategy(Class, String[])}.
     *
     * @param prefix
     *            the prefix used to create the name of a corresponding j8unit test interface
     * @param suffix
     *            the suffix used to create the name of a corresponding j8unit test interface
     */
    public J8UnitRepositoryTestsDiscovery(final String prefix, final String suffix) {
        this.prefix = prefix;
        this.suffix = suffix;
    }

    /**
     * Returns the names of all j8unit test interfaces that provide tests according to the given API {@code candidate}
     * type.
     *
     * @param candidate
     *            the given API candidate type
     * @return the names of all j8unit test interfaces that provide tests according to the given API {@code candidate}
     *         type
     */
    protected final Set<String> namesFor(final Class<?> candidate) {
        if (candidate.getDeclaringClass() == null) {
            return singleton(this.prefix).parallelStream() //
                                         .map(n -> format("%s%s%s", n, candidate.getCanonicalName(), this.suffix)) //
                                         .collect(toSet());
        } else {
            return this.namesFor(candidate.getDeclaringClass()).parallelStream() //
                       .map(n -> format("%s.%s%s", n, candidate.getSimpleName(), this.suffix)) //
                       .collect(toSet());
        }
    }

    /**
     * Returns all j8unit test interfaces that provide tests according to the given API {@code candidate} type. It
     * therefore loads all classes identified by {@link #namesFor(Class)}. If any class is missing, the corresponding
     * {@link ClassNotFoundException} will be passed to the given {@code consumer}.
     *
     * @param candidate
     *            the given API candidate type
     * @param consumer
     *            the consumer of any thrown {@code ClassNotFoundException}
     * @return all j8unit test interfaces that provide tests according to the given API {@code candidate} type
     */
    @Override
    public Set<Class<?>> apply(final Class<?> candidate, final Consumer<? super ClassNotFoundException> consumer) {
        return this.namesFor(candidate).parallelStream().map(n -> classForName(n, consumer)).filter(Optional::isPresent).map(Optional::get).collect(toSet());
    }

}
