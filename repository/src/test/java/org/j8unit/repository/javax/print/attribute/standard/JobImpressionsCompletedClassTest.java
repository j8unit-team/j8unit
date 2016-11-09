package org.j8unit.repository.javax.print.attribute.standard;

import javax.print.attribute.standard.JobImpressionsCompleted;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link JobImpressionsCompleted} (by simply
 * reusing the J8Unit test interface {@link JobImpressionsCompletedClassTests}).
 */

@RunWith(J8Unit4.class)
public class JobImpressionsCompletedClassTest
implements JobImpressionsCompletedClassTests<JobImpressionsCompleted> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.print.attribute.standard.JobImpressionsCompleted]

    @Override
    public Class<JobImpressionsCompleted> createNewSUT() {
        return JobImpressionsCompleted.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.print.attribute.standard.JobImpressionsCompleted#JobImpressionsCompleted(int) public
     * javax.print.attribute.standard.JobImpressionsCompleted(int)}.
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
    public void create_JobImpressionsCompleted_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final JobImpressionsCompleted sut = null; // = new JobImpressionsCompleted(int);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.print.attribute.standard.JobImpressionsCompleted]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.print.attribute.standard.JobImpressionsCompleted]

}
