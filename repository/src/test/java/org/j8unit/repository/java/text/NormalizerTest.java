package org.j8unit.repository.java.text;

import static org.j8unit.util.TestParametersUtil.testParametersOfEnumClass;
import java.text.Normalizer;
import java.text.Normalizer.Form;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(J8Unit4.class)
public class NormalizerTest
implements org.j8unit.repository.java.text.NormalizerTests<Normalizer> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.text.Normalizer]

    @Override
    public Normalizer createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.text.Normalizer], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.text.Normalizer]

    @RunWith(J8Unit4.class)
    public static class FormTest
    implements org.j8unit.repository.java.text.NormalizerTests.FormTests<Form> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.text.Normalizer$Form]

        @Parameters(name = "{index}: {0}")
        public static Iterable<Object[]> sutData() {
            return testParametersOfEnumClass(Form.class);
        }

        @Parameter(0)
        public Form sut;

        @Override
        public Form createNewSUT() {
            return this.sut;
        }

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.text.Normalizer$Form]

    }

}
