package org.j8unit.runners.parameterized;

import org.junit.runner.Runner;
import org.junit.runners.model.InitializationError;
import org.junit.runners.parameterized.BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runners.parameterized.TestWithParameters;

public class J8BlockJUnit4ClassRunnerWithParametersFactory
extends BlockJUnit4ClassRunnerWithParametersFactory {

    @Override
    public Runner createRunnerForTestWithParameters(final TestWithParameters test)
    throws InitializationError {
        return new J8BlockJUnit4ClassRunnerWithParameters(test);
    }

}
