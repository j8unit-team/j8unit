package org.j8unit.generator.analysis;

import java.io.Serializable;

public class AccessLevelHelperClass {

    public AccessLevelHelperClass(final String publicConstructor) {
    }

    AccessLevelHelperClass(final Comparable<? super String> packagePrivateConstructor) {
    }

    protected AccessLevelHelperClass(final Serializable protectedConstructor) {
    }

    private AccessLevelHelperClass(final CharSequence privateConstructor) {
    }

    @Override
    public String toString() {
        return super.toString();
    }

    String toStringPackagePrivate() {
        return this.toString();
    }

    protected String toStringProtected() {
        return this.toString();
    }

    private String toStringPrivate() {
        return this.toString();
    }

}
