package org.j8unit.repository.java.text;

import static org.j8unit.util.TestParametersUtil.testParametersOfEnumClass;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.J8Unit4;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Unit4.class)
public class NormalizerTest
implements org.j8unit.repository.java.text.NormalizerTests<java.text.Normalizer> {

    @RunWith(J8Parameterized.class)
    @UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
    public static class FormTest
    implements org.j8unit.repository.java.text.NormalizerTests.FormTests<java.text.Normalizer.Form> {

        @Parameters(name = "{index}: {0}")
        public static Iterable<Object[]> sutData() {
            return testParametersOfEnumClass(java.text.Normalizer.Form.class);
        }

        @Parameter(0)
        public java.text.Normalizer.Form sut;

        @Override
        public java.text.Normalizer.Form createNewSUT() {
            return this.sut;
        }

    }

    @Override
    public java.text.Normalizer createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [java.text.Normalizer] available.");
    }

}
