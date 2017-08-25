package org.j8unit.generator.api;

import static java.lang.System.exit;
import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;
import static org.j8unit.generator.api.GeneratorSetup.similarTo;
import static org.j8unit.generator.api.RepositoryApp.INSTANCE_TESTS_SETUP;
import static org.j8unit.generator.api.RepositoryApp.JAVA8_ROOT_PACKAGES;
import static org.j8unit.generator.util.Optionals.optionalise;
import static org.j8unit.generator.util.TypeAnalysis.classHierarchy;
import static org.j8unit.generator.util.TypeAnalysis.scopedTypes;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import org.j8unit.generator.api.GeneratorSetup;

public class PostGeneratom {

    public static void main(final String[] args)
    throws Exception {
        countAppearance();
        exit(0);
        testInstancesPlusDefaultConstructor();
    }

    private static void testInstancesPlusDefaultConstructor()
    throws Exception {
        for (final String root : JAVA8_ROOT_PACKAGES) {
            final GeneratorSetup setup = similarTo(INSTANCE_TESTS_SETUP).forJavaPackage(root).build();
            for (final Class<?> type : setup.exploreOriginTypes()) {
                for (final Class<?> scoped : scopedTypes(type).collect(toList())) {
                    fieldsAndConstructor(scoped, setup);
                }
            }
        }
    }

    private static void fieldsAndConstructor(final Class<?> type, final GeneratorSetup setup) {
        final Set<? extends Field> instances = Arrays.stream(type.getDeclaredFields()) //
                                                     .filter(f -> type.isAssignableFrom(f.getType())) //
                                                     .filter(INSTANCE_TESTS_SETUP::useField) //
                                                     .filter(f -> Modifier.isStatic(f.getModifiers())) //
                                                     .collect(toSet());
        final Optional<Constructor<?>> candidate = optionalise(type::getDeclaredConstructor);
        final Optional<Constructor<?>> constructor = candidate.filter(INSTANCE_TESTS_SETUP::useConstructor);
        if ((instances.size() > 0) && constructor.isPresent()) {
            System.out.println(type);
        }
    }

    private static void countAppearance()
    throws Exception {
        final Map<Class<?>, Integer> count = new LinkedHashMap<>();
        for (final String root : JAVA8_ROOT_PACKAGES) {
            final GeneratorSetup setup = similarTo(INSTANCE_TESTS_SETUP).forJavaPackage(root).build();
            for (final Class<?> type : setup.exploreOriginTypes()) {
                for (final Class<?> scoped : scopedTypes(type).collect(toList())) {
                    explore(scoped, count);
                }
            }
        }
        count.entrySet() //
             .stream() //
             .filter(e -> e.getKey().getName().startsWith("java.io")) //
             .sorted((x, y) -> Integer.compare(x.getValue(), y.getValue())) //
             .forEach(System.out::println);
    }

    private static void explore(final Class<?> type, final Map<Class<?>, Integer> count) {
        final Iterator<Class<?>> hierarchy = classHierarchy(type);
        hierarchy.forEachRemaining(t -> count.merge(t, 1, Integer::sum));
        final Set<Class<?>> interfaces = getInterfaces(type);
        interfaces.forEach(t -> count.merge(t, 1, Integer::sum));
    }

    /**
     * <p>
     * In opposite to {@link Class#getInterfaces()} this method returns all (!) {@code interface}s of a given
     * {@link Class}. The {@link Set} is ordered in the same order the {@code interface}s are implemented.
     * </p>
     *
     * @param clazz
     *            the {@link Class} to return all of its {@code interface}s
     * @return an ordered {@link Set} of all {@code interface}s implemented by the given {@link Class}
     */
    private static final Set<Class<?>> getInterfaces(final Class<?> clazz) {
        return getInterfaces(clazz.getInterfaces());
    }

    /**
     * <p>
     * Helper method for {@link #getInterfaces(Class)}.
     * </p>
     */
    private static final Set<Class<?>> getInterfaces(final Class<?>[] allInterfaces) {
        final Set<Class<?>> results = new LinkedHashSet<>();
        for (final Class<?> eachInterface : allInterfaces) {
            results.add(eachInterface);
            results.addAll(getInterfaces(eachInterface.getInterfaces()));
        }
        return results;
    }

}
