package org.j8unit.repository.java.awt.color;

import java.awt.color.ProfileDataException;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ProfileDataExceptionTest
implements org.j8unit.repository.java.awt.color.ProfileDataExceptionTests<ProfileDataException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.color.ProfileDataException]

    @Override
    public ProfileDataException createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.awt.color.ProfileDataException], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.color.ProfileDataException]

}
