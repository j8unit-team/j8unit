package org.j8unit.generator.util;

import java.util.function.Function;

public enum Functions {
    ;

    @FunctionalInterface
    public static abstract interface CheckedFunction<T, R>
    extends Function<T, R> {

        public abstract R checkedApply(final T t)
        throws Exception;

        @Override
        public default R apply(final T t) {
            try {
                return this.checkedApply(t);
            } catch (final RuntimeException runtime) {
                throw runtime;
            } catch (final Exception checked) {
                return hiddenThrow(checked);
            }
        }

        @SuppressWarnings("unchecked")
        public static <R, E extends Exception> R hiddenThrow(final Exception any)
        throws E {
            throw (E) any;
        }

        public static <T, R> CheckedFunction<T, R> doIt(final CheckedFunction<T, R> code) {
            return code;
        }

    }

}
