package org.j8unit.repository.java.nio.file.attribute;

import java.nio.file.attribute.UserPrincipalNotFoundException;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class UserPrincipalNotFoundExceptionTest
implements org.j8unit.repository.java.nio.file.attribute.UserPrincipalNotFoundExceptionTests<UserPrincipalNotFoundException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.nio.file.attribute.UserPrincipalNotFoundException]

    @Override
    public UserPrincipalNotFoundException createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.nio.file.attribute.UserPrincipalNotFoundException], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.nio.file.attribute.UserPrincipalNotFoundException]

}
