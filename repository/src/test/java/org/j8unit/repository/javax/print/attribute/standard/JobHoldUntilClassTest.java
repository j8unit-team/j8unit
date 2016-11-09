package org.j8unit.repository.javax.print.attribute.standard;

import javax.print.attribute.standard.JobHoldUntil;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link JobHoldUntil} (by simply reusing the
 * J8Unit test interface {@link JobHoldUntilClassTests}).
 */

@RunWith(J8Unit4.class)
public class JobHoldUntilClassTest
implements JobHoldUntilClassTests<JobHoldUntil> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.print.attribute.standard.JobHoldUntil]

    @Override
    public Class<JobHoldUntil> createNewSUT() {
        return JobHoldUntil.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.print.attribute.standard.JobHoldUntil#JobHoldUntil(java.util.Date) public
     * javax.print.attribute.standard.JobHoldUntil(java.util.Date)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void create_JobHoldUntil_Date()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final JobHoldUntil sut = null; // = new JobHoldUntil(java.util.Date);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.print.attribute.standard.JobHoldUntil]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.print.attribute.standard.JobHoldUntil]

}
