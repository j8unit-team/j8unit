package org.j8unit.repository.java.lang.annotation;

import static org.j8unit.util.TestParametersUtil.testParametersOfEnumClass;
import java.lang.annotation.RetentionPolicy;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(J8Unit4.class)
public class RetentionPolicyTest
implements org.j8unit.repository.java.lang.annotation.RetentionPolicyTests<RetentionPolicy> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.lang.annotation.RetentionPolicy]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOfEnumClass(RetentionPolicy.class);
    }

    @Parameter(0)
    public RetentionPolicy sut;

    @Override
    public RetentionPolicy createNewSUT() {
        return this.sut;
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.lang.annotation.RetentionPolicy]

}
