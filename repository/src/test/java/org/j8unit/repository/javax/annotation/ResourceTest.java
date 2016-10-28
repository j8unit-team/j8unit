package org.j8unit.repository.javax.annotation;

import static org.j8unit.util.TestParametersUtil.testParametersOfEnumClass;
import javax.annotation.Resource;
import javax.annotation.Resource.AuthenticationType;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(J8Unit4.class)
public class ResourceTest
implements org.j8unit.repository.javax.annotation.ResourceTests<Resource> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.annotation.Resource]

    @Override
    public Resource createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.annotation.Resource], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.annotation.Resource]

    @RunWith(J8Unit4.class)
    public static class AuthenticationTypeTest
    implements org.j8unit.repository.javax.annotation.ResourceTests.AuthenticationTypeTests<AuthenticationType> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.annotation.Resource$AuthenticationType]

        @Parameters(name = "{index}: {0}")
        public static Iterable<Object[]> sutData() {
            return testParametersOfEnumClass(AuthenticationType.class);
        }

        @Parameter(0)
        public AuthenticationType sut;

        @Override
        public AuthenticationType createNewSUT() {
            return this.sut;
        }

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.annotation.Resource$AuthenticationType]

    }

}
