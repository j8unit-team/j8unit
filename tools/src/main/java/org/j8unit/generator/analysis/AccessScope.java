package org.j8unit.generator.analysis;

import static java.lang.reflect.Modifier.isStatic;
import static java.util.Collections.singletonList;
import static java.util.Objects.requireNonNull;
import static org.j8unit.generator.api.GlobalGeneratorConstants.SUT;
import static org.j8unit.generator.util.Java.diamond;
import static org.j8unit.generator.util.Java.extending;
import static org.j8unit.generator.util.Lists.join;
import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.AbstractMap.SimpleImmutableEntry;
import java.util.List;
import java.util.Map.Entry;
import java.util.function.BiFunction;
import java.util.function.Predicate;
import org.j8unit.J8UnitTest;
import org.j8unit.generator.api.BaseTestClassSupplier;
import org.j8unit.generator.api.BasicTestClassStatements;
import org.j8unit.generator.api.BasicTestInterfaceStatements;
import org.j8unit.generator.api.render.OriginRenderer;
import org.j8unit.generator.api.render.TargetRenderer;
import org.j8unit.generator.util.Mismatcher;
import org.j8unit.repository.RepositoryClassTests;
import org.j8unit.repository.RepositoryTests;

/**
 * <p>
 * Enumeration of the access scopes of {@linkplain Member type members]; Actually, there are only two.
 * </p>
 *
 * <dl>
 * <dt>Access Scope?</dt>
 * <dd>Type members ({@linkplain java.lang.reflect.Field fields}, {@linkplain java.lang.reflect.Constructor
 * constructors}, and {@linkplain java.lang.reflect.Method methods}) can be accessed either {@linkplain #CLASS via the
 * declaring class} or {@linkplain #INSTANCE via instances}.</dd>
 * </dl>
 *
 * <p>
 * Note, <em>although constructors are not static they are not accessed via instances</em>! Thus by the intention of
 * testing, constructors belong to its declaring class. In result, {@link #matches(Member)} of {@link #INSTANCE} will
 * return {@code false} for any constructor; respectively {@link #matches(Member)} of {@link #CLASS} will return
 * {@code true} immediately.
 * </p>
 *
 * <p>
 * This helper enumeration does provide further j8unit specific content:
 * </p>
 * <ul>
 * <li>{@link #getBaseJ8UnitInterfaceType()}</li>
 * <li>{@link #getGenericStatement(OriginRenderer, Class)</li>
 * <li>{@link #getTestInterfaceSuperTypeDefinition(OriginRenderer, Entry)}</li>
 * </ul>
 */
public enum AccessScope
implements Mismatcher<Member>, BaseTestClassSupplier, BasicTestInterfaceStatements, BasicTestClassStatements {

    /**
     * Enumeration constant representing access to type members via instances.
     *
     * This <em>does not include constructors</em>! This is because they do not represent inheritable behaviour of
     * sub-classes. Instead, sub-classes can use super class' constructors.
     */
    INSTANCE(m -> !(m instanceof Constructor) && !isStatic(m.getModifiers()), //
             RepositoryTests.class, //
             (r, t) -> join(extending(SUT, r.originCanonicalNameOf(t, r::listOfTypeVariableNamesOf)), r.listOfTypeParameterDefinitionsOf(t)), //
             (r, t) -> join(SUT, r.listOfTypeVariableNamesOf(t)), //
             (r, e) -> r.originCanonicalNameOf(e.getKey()) + diamond(r.originCanonicalNameOf(e.getValue(), r::listOfTypeVariableNamesOf))),

    /**
     * Enumeration constant representing access to type members via the declaring class.
     *
     * This <em>also includes constructors</em>! Also they can be accessed by sub-classes only, they belong to its
     * declaring class exclusively. Sub-classes reuse these super-class' constructors via its own ones.
     */
    CLASS(m -> (m instanceof Constructor) || isStatic(m.getModifiers()), //
          RepositoryClassTests.class, //
          (r, t) -> singletonList(extending(SUT, r.originCanonicalNameOf(t))), //
          (r, t) -> singletonList(SUT), //
          (r, e) -> r.originCanonicalNameOf(e.getKey()) + diamond(r.originCanonicalNameOf(e.getValue())));

    /**
     * The predicate to decide whether or not a given {@link Member member} matches {@code this} specific kind of access
     * scope.
     */
    private final Predicate<? super Member> predicate;

    /**
     * The base interface of any specific j8unit test interface according to this access scope.
     */
    private @SuppressWarnings("rawtypes") Class<? extends J8UnitTest> baseTestClass;

    /**
     * {@link BiFunction} to generate the generic statement of a specific j8unit test interface.
     */
    private final BiFunction<? super OriginRenderer, ? super Class<?>, ? extends List<String>> getTestInterfaceGenerics;

    /**
     * {@link BiFunction} to generate the super types' definitions of a specific j8unit test interface.
     */
    private final BiFunction<? super OriginRenderer, ? super Type, ? extends List<String>> getTestInterfaceSuperTypeGenerics;

    private @SuppressWarnings("rawtypes") BiFunction<? super OriginRenderer, ? super Entry<? extends Class<? extends J8UnitTest>, Class<?>>, String> getTestClassBaseTypeDefinition;

    /**
     * @param predicate
     *            predicate to decide whether or not a given {@link Member member} matches {@code this} specific kind of
     *            access scope
     * @param baseTestClass
     *            base interface of any specific j8unit test interface according to this access scope
     * @param getTestInterfaceGenerics
     *            generator to create the generic statement of a specific j8unit test interface
     * @param getTestInterfaceSuperTypeGenerics
     *            generator to create the super types' definitions of a specific j8unit test interface
     */
    private AccessScope(final Predicate<? super Member> predicate, final @SuppressWarnings("rawtypes") Class<? extends J8UnitTest> baseTestClass,
                        final BiFunction<? super OriginRenderer, ? super Class<?>, ? extends List<String>> getTestInterfaceGenerics,
                        final BiFunction<? super OriginRenderer, ? super Type, ? extends List<String>> getTestInterfaceSuperTypeGenerics,
                        final @SuppressWarnings("rawtypes") BiFunction<? super OriginRenderer, ? super Entry<? extends Class<? extends J8UnitTest>, Class<?>>, String> getTestClassBaseTypeDefinition) {
        this.predicate = predicate;
        this.baseTestClass = baseTestClass;
        this.getTestInterfaceGenerics = getTestInterfaceGenerics;
        this.getTestInterfaceSuperTypeGenerics = getTestInterfaceSuperTypeGenerics;
        this.getTestClassBaseTypeDefinition = getTestClassBaseTypeDefinition;
    }

    /**
     * <p>
     * Predicate method matching any {@link Member member} that fits to the specific access scope.
     * </p>
     *
     * <p>
     * In detail, <code>{@link #INSTANCE}.matches(member)</code> returns {@code false} for any {@linkplain Constructor
     * constructor} and any {@linkplain Modifier#isStatic(int) static} {@code member}. Any other execution of this
     * method will return {@code true} respectively.
     * </p>
     *
     * <p>
     * Correspondingly, <code>{@link #CLASS}.matches(member)</code> returns {@code true} for any constructor and any
     * {@code static} {@code member}, and returns {@code false} for any other execution of this method.
     * </p>
     *
     * @see #INSTANCE
     * @see #CLASS
     *
     * @param member
     *            the member to use for matching query
     * @return {@code true} iff the given {@code member} fits {@code this} access scope
     */
    @Override
    public final boolean matches(final Member member) {
        return this.predicate.test(member);
    }

    /**
     * {@inheritDoc}
     *
     * <p>
     * In detail, <code>{@link #INSTANCE}.getBaseJ8UnitBaseTestClass()</code> returns
     * <code>{@link RepositoryTests}.class</code>; <code>{@link #CLASS}.getBaseJ8UnitBaseTestClass()</code> returns
     * <code>{@link RepositoryClassTests}.class</code>.
     * </p>
     */
    @Override
    @SuppressWarnings("rawtypes")
    public final Class<? extends J8UnitTest> getBaseJ8UnitInterfaceType() {
        return this.baseTestClass;
    }

    /**
     * {@inheritDoc}
     *
     * <p>
     * For example (using the very basic {@link OriginRenderer}),
     * <ul>
     * <li><code>{@link #INSTANCE}.getGenericStatement({@link String}.class)</code> returns
     * <code>{@code <SUT extends java.lang.String>}</code>,</li>
     * <li><code>{@link #INSTANCE}.getGenericStatement({@link Enum}.class)</code> returns
     * <code>{@code <SUT extends java.lang.Enum<E>, E extends java.lang.Enum<E>>}</code>, and</li>
     * <li><code>{@link #INSTANCE}.getGenericStatement({@link java.util.Map}.class)</code> returns
     * <code>{@code <SUT extends java.util.Map<K, V>, K extends java.lang.Object, V extends java.lang.Object>}</code>.
     * </li>
     * </ul>
     * </p>
     *
     * <p>
     * Respectively (again using the very basic {@link OriginRenderer}),
     * <ul>
     * <li><code>{@link #CLASS}.getGenericStatement({@link String}.class)</code> returns
     * <code>{@code <SUT extends java.lang.String>}</code>,</li>
     * <li><code>{@link #CLASS}.getGenericStatement({@link Enum}.class)</code> returns
     * <code>{@code <SUT extends java.lang.Enum>}</code>, and</li>
     * <li><code>{@link #CLASS}.getGenericStatement({@link java.util.Map}.class)</code> returns
     * <code>{@code <SUT extends java.util.Map>}</code>.</li>
     * </ul>
     * </p>
     *
     * <p>
     * In case of a different {@link OriginRenderer}, the aforementioned results may differ.
     * </p>
     */
    @Override
    public final String getTestInterfaceGenericStatement(final OriginRenderer renderer, final Class<?> type) {
        requireNonNull(type);
        return diamond(this.getTestInterfaceGenerics.apply(renderer, type));
    }

    @Override
    public final <Renderer extends OriginRenderer & TargetRenderer> String getTestInterfaceSuperTypeDefinition(final Renderer renderer,
                                                                                                               final Entry<? extends Class<?>, ? extends Type> superType) {
        return renderer.targetCanonicalNameOf(superType.getKey()) + diamond(this.getTestInterfaceSuperTypeGenerics.apply(renderer, superType.getValue()));
    }

    @Override
    public final String getTestClassBaseTypeDefinition(final OriginRenderer renderer, final @SuppressWarnings("rawtypes") Class<? extends J8UnitTest> base,
                                                       final Class<?> clazz) {
        return this.getTestClassBaseTypeDefinition.apply(renderer, new SimpleImmutableEntry<>(base, clazz));
    }

}
