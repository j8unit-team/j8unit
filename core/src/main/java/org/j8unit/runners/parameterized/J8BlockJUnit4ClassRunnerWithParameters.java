package org.j8unit.runners.parameterized;

import org.j8unit.runners.model.J8TestClass;
import org.junit.runners.model.InitializationError;
import org.junit.runners.parameterized.BlockJUnit4ClassRunnerWithParameters;
import org.junit.runners.parameterized.TestWithParameters;

public class J8BlockJUnit4ClassRunnerWithParameters
extends BlockJUnit4ClassRunnerWithParameters {

    public J8BlockJUnit4ClassRunnerWithParameters(final TestWithParameters test)
    throws InitializationError {
        super(test);
    }

    @Override
    protected J8TestClass createTestClass(final Class<?> testClass) {
        return new J8TestClass(testClass);
    }

}
