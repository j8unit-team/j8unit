package de.informaticum.j8junit.runners;

import org.junit.runners.BlockJUnit4ClassRunner;
import org.junit.runners.model.InitializationError;
import de.informaticum.j8junit.runners.model.J8TestClass;

public class J8BlockJUnit4ClassRunner
extends BlockJUnit4ClassRunner {

    public J8BlockJUnit4ClassRunner(final Class<?> klass)
    throws InitializationError {
        super(klass);
    }

    @Override
    protected J8TestClass createTestClass(final Class<?> testClass) {
        return new J8TestClass(testClass);
    }

}
