package org.j8unit.generator.util;

public enum FooBar {

    ;

    public static @interface FooAnnotation {
    }

    public @interface BarAnnotation {
    }

    public static interface FooInterface {
    }

    public interface BarInterface {
    }

    public static class FooClass {

        /* package-private */ static class SubFooClass {
        }

    }

    public class BarClass {
    }

}
