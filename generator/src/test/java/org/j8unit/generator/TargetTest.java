package org.j8unit.generator;

import static org.junit.Assert.assertEquals;
import java.lang.Thread.State;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Optional;
import org.j8unit.generator.api.ImportMemory;
import org.j8unit.generator.api.render.FancyTargetRenderer;
import org.j8unit.generator.api.render.TargetRenderer;
import org.junit.Test;

public class TargetTest {

    public static final TargetRenderer TR1 = new TargetRenderer() {

        @Override
        public String targetSimpleNameOf(final Method method) {
            return method.getName();
        }

        @Override
        public String targetSimpleNameOf(final Constructor<?> constructor) {
            return constructor.getDeclaringClass().getSimpleName();
        }

        @Override
        public String targetSimpleNameOf(final Class<?> type) {
            return type.getSimpleName();
        }

        @Override
        public Optional<String> targetPackageFor(final Package pakkage) {
            return Optional.ofNullable(pakkage.getName());
        }

    };

    public static final TargetRenderer TR2 = new FancyTargetRenderer() {

        @Override
        public String targetSimpleNameOf(final Method method) {
            return method.getName();
        }

        @Override
        public String targetSimpleNameOf(final Constructor<?> constructor) {
            return constructor.getDeclaringClass().getSimpleName();
        }

        @Override
        public String targetSimpleNameOf(final Class<?> type) {
            return type.getSimpleName();
        }

        @Override
        public Optional<String> targetPackageFor(final Package pakkage) {
            return Optional.ofNullable(pakkage.getName());
        }

        @Override
        public void setImportMemory(final ImportMemory memory) {
        }

        @Override
        public ImportMemory getImportMemory() {
            return new ImportMemory();
        }

    };

    @Test
    public void testName()
    throws Exception {
        final Class<State> c = State.class;
        assertEquals("java.lang.Thread.State", TR1.targetCanonicalNameOf(c));
        assertEquals("java.lang.Thread.State", TR1.targetJavadocNameOf(c));
        // importable --> simple name
        assertEquals("State", TR2.targetCanonicalNameOf(c));
        // full name but "java.lang" --> basic name
        assertEquals("Thread.State", TR2.targetJavadocNameOf(c));
    }

}
