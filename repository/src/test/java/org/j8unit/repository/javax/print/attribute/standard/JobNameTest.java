package org.j8unit.repository.javax.print.attribute.standard;

import javax.print.attribute.standard.JobName;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class JobNameTest
implements org.j8unit.repository.javax.print.attribute.standard.JobNameTests<JobName> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.print.attribute.standard.JobName]

    @Override
    public JobName createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.print.attribute.standard.JobName], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.print.attribute.standard.JobName]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.print.attribute.standard.JobName]

}
