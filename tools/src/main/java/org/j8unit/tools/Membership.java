package org.j8unit.tools;

import static java.util.Arrays.stream;
import static java.util.stream.Collectors.joining;
import static org.j8unit.tools.GeneratorSetup.NL;
import static org.j8unit.tools.GeneratorSetup.SPACE;
import static org.j8unit.tools.GeneratorSetup.canonicalNameOf;
import static org.j8unit.tools.GeneratorSetup.canonicalNameWithTypeParametersNames;
import static org.j8unit.tools.GeneratorSetup.createTypeParametersUsage;
import static org.j8unit.tools.GeneratorSetup.isRawGeneric;
import static org.j8unit.tools.GeneratorSetup.typeParametersDefinitionsOf;
import static org.j8unit.tools.OptionalString.ofEmptyable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.Optional;
import org.j8unit.repository.RepositoryClassTests;
import org.j8unit.repository.RepositoryTests;

public enum Membership {

    CLASS {

        @Override
        public boolean matches(final Member member) {
            return member instanceof Constructor ? this.matches((Constructor<?>) member) : Modifier.isStatic(member.getModifiers());
        }

        @Override
        public boolean matches(final Constructor<?> constructor) {
            return true;
        }

        @Override
        public String getTestClassSuperTypes(final Map<Class<?>, Type> parents, final GeneratorSetup setup, final boolean isRawGeneric) {
            return OptionalString.ofEmptyable(parents.entrySet().stream() //
                                                     .map(e -> setup.getTestClassName(e.getKey(), this) + "<SUT>") //
                                                     .collect(joining("," + NL + SPACE + "        "))) //
                                 .orElse(RepositoryClassTests.class.getSimpleName() + "<SUT>");
        }

        @Override
        public String getSutSuperTypes(final Class<?> clazz) {
            return canonicalNameOf(clazz);
        }

        @Override
        public String getTestClassSuppressWarnings(final Class<?> clazz) {
            return !typeParametersDefinitionsOf(clazz).isEmpty() ? "@" + SuppressWarnings.class.getSimpleName() + "(\"rawtypes\")" : "";
        }

    },

    INSTANCE {

        @Override
        public boolean matches(final Member member) {
            return member instanceof Constructor ? this.matches((Constructor<?>) member) : !Modifier.isStatic(member.getModifiers());
        }

        @Override
        public boolean matches(final Constructor<?> constructor) {
            return false;
        }

        @Override
        public String getTestClassSuperTypes(final Map<Class<?>, Type> parents, final GeneratorSetup setup, final boolean isRawGeneric) {
            if (isRawGeneric) {
                return OptionalString.ofEmptyable(parents.entrySet().stream() //
                                                         .map(e -> setup.getTestClassName(e.getKey(), this)) //
                                                         .collect(joining("," + NL + SPACE + SPACE + SPACE))) //
                                     .orElse(RepositoryTests.class.getSimpleName() + "<SUT>");
            } else {
                return OptionalString.ofEmptyable(parents.entrySet().stream() //
                                                         .map(e -> setup.getTestClassName(e.getKey(), this) //
                                                                   + "<SUT" + ofEmptyable(createTypeParametersUsage(e.getValue())).prepend(",").orElse("")
                                                                   + ">") //
                                                         .collect(joining("," + NL + SPACE + SPACE + SPACE))) //
                                     .orElse(RepositoryTests.class.getSimpleName() + "<SUT>");
            }
        }

        @Override
        public String getSutSuperTypes(final Class<?> clazz) {
            return canonicalNameWithTypeParametersNames(clazz, this) + ofEmptyable(typeParametersDefinitionsOf(clazz)).prepend(", ").orElse("");
        }

        @Override
        public String getTestClassSuppressWarnings(final Class<?> clazz) {
            return isRawGeneric(clazz) ? "@" + SuppressWarnings.class.getSimpleName() + "(\"rawtypes\")" : "";
        }

    };

    public abstract String getTestClassSuperTypes(final Map<Class<?>, Type> parents, GeneratorSetup setup, boolean isRawGeneric);

    public abstract boolean matches(final Member member);

    public final boolean mismatches(final Member member) {
        return !this.matches(member);
    }

    public abstract boolean matches(final Constructor<?> constructor);

    public final boolean mismatches(final Constructor<?> constructor) {
        return !this.matches(constructor);
    }

    public static final Membership membershipOf(final Member member) {
        final Optional<Membership> membership = stream(Membership.values()).filter(k -> k.matches(member)).findFirst();
        assert membership.isPresent();
        return membership.get();
    }

    public abstract String getSutSuperTypes(Class<?> clazz);

    public abstract String getTestClassSuppressWarnings(Class<?> clazz);

    public String getTestClassName(final Class<?> clazz, final GeneratorSetup setup) {
        return setup.simpleTestName(clazz, this);
    }

}
