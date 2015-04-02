package de.informaticum.j8junit.runners;

import org.junit.runners.Parameterized;
import de.informaticum.j8junit.runners.model.J8TestClass;

public class J8Parameterized
extends Parameterized {

    public J8Parameterized(final Class<?> klass)
    throws Throwable {
        super(klass);
    }

    @Override
    protected J8TestClass createTestClass(final Class<?> testClass) {
        return new J8TestClass(testClass);
    }

}
