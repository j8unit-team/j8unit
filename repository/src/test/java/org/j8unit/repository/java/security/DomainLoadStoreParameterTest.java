package org.j8unit.repository.java.security;

import java.security.DomainLoadStoreParameter;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link DomainLoadStoreParameter} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.java.security.DomainLoadStoreParameterTests}).
 */
@RunWith(J8Unit4.class)
public class DomainLoadStoreParameterTest
implements DomainLoadStoreParameterTests<DomainLoadStoreParameter> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.security.DomainLoadStoreParameter]

    @Override
    public DomainLoadStoreParameter createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.security.DomainLoadStoreParameter], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.security.DomainLoadStoreParameter]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.security.DomainLoadStoreParameter]

}
