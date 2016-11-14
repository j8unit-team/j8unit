package org.j8unit.generator.api;

import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;
import static org.j8unit.generator.api.GeneratorSetup.similarTo;
import static org.j8unit.generator.api.RepositoryApp.INSTANCE_TESTS_SETUP;
import static org.j8unit.generator.api.RepositoryApp.JAVA8_ROOT_PACKAGES;
import static org.j8unit.generator.util.Optionals.optionalise;
import static org.j8unit.generator.util.TypeAnalysis.scopedTypes;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Optional;
import java.util.Set;

public class PostGeneratom {

    public static void main(final String[] args)
    throws Exception {
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

}
