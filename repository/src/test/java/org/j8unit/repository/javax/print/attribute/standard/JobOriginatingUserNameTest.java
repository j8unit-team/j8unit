package org.j8unit.repository.javax.print.attribute.standard;

import javax.print.attribute.standard.JobOriginatingUserName;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link JobOriginatingUserName} (by simply
 * reusing the J8Unit test interface
 * {@link org.j8unit.repository.javax.print.attribute.standard.JobOriginatingUserNameTests}).
 */

@RunWith(J8Unit4.class)
public class JobOriginatingUserNameTest
implements JobOriginatingUserNameTests<JobOriginatingUserName> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.print.attribute.standard.JobOriginatingUserName]

    @Override
    public JobOriginatingUserName createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.print.attribute.standard.JobOriginatingUserName], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.print.attribute.standard.JobOriginatingUserName]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.print.attribute.standard.JobOriginatingUserName]

}
