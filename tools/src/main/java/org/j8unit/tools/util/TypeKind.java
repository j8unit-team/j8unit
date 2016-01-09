package org.j8unit.tools.util;

import static java.util.Arrays.stream;
import java.lang.reflect.Modifier;
import java.util.Optional;

/**
 * {@linkplain Class#getEnclosingClass() There are five kinds of classes (or interfaces):}
 * <ul>
 * <li>Top level classes</li>
 * <li>Nested classes (static member classes)</li>
 * <li>Inner classes (non-static member classes)</li>
 * <li>Local classes (named classes declared within a method)</li>
 * <li>Anonymous classes</li>
 * </ul>
 * 
 * @see <a href="https://docs.oracle.com/javase/tutorial/java/javaOO/nested.html"> The Java&trade; Tutorials: Nested
 *      Classes</a>
 * @see <a href="https://docs.oracle.com/javase/tutorial/java/javaOO/localclasses.html"> The Java&trade; Tutorials:
 *      Local Classes</a>
 * @see <a href="https://docs.oracle.com/javase/tutorial/java/javaOO/anonymousclasses.html"> The Java&trade; Tutorials:
 *      Anonymous Classes</a>
 *
 * @author Stefan Gasterst&auml;dt (SGA)
 */
public enum TypeKind {

    TOP_LEVEL {

        @Override
        public boolean matches(final Class<?> clazz) {
            return clazz.getEnclosingClass() == null;
        }

    },

    NESTED {

        @Override
        public boolean matches(final Class<?> clazz) {
            return clazz.isMemberClass() && Modifier.isStatic(clazz.getModifiers());
        }

    },

    INNER {

        @Override
        public boolean matches(final Class<?> clazz) {
            return clazz.isMemberClass() && !Modifier.isStatic(clazz.getModifiers());
        }

    },

    LOCAL {

        @Override
        public boolean matches(final Class<?> clazz) {
            return clazz.isLocalClass();
        }

    },

    ANONYMOUS {

        @Override
        public boolean matches(final Class<?> clazz) {
            return clazz.isAnonymousClass();
        }

    };

    public abstract boolean matches(final Class<?> clazz);

    public final boolean mismatches(final Class<?> clazz) {
        return !this.matches(clazz);
    }

    public static final TypeKind kindOf(final Class<?> clazz) {
        final Optional<TypeKind> kind = stream(TypeKind.values()).filter(k -> k.matches(clazz)).findFirst();
        assert kind.isPresent() : "A class cannot have a kind different to top-level, nested, inner, local, or anonymous!";
        return kind.get();
    }

}
