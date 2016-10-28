package org.j8unit.repository.javax.print.attribute.standard;

import javax.print.attribute.standard.JobImpressions;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class JobImpressionsTest
implements org.j8unit.repository.javax.print.attribute.standard.JobImpressionsTests<JobImpressions> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.print.attribute.standard.JobImpressions]

    @Override
    public JobImpressions createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.print.attribute.standard.JobImpressions], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.print.attribute.standard.JobImpressions]

}
