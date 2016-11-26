package org.j8unit.repository.javax.management;

import javax.management.RuntimeMBeanException;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link RuntimeMBeanException} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.javax.management.RuntimeMBeanExceptionTests}).
 */
@RunWith(J8Unit4.class)
public class RuntimeMBeanExceptionTest
implements RuntimeMBeanExceptionTests<RuntimeMBeanException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.management.RuntimeMBeanException]

    @Override
    public RuntimeMBeanException createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.management.RuntimeMBeanException], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.management.RuntimeMBeanException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.management.RuntimeMBeanException]

}
