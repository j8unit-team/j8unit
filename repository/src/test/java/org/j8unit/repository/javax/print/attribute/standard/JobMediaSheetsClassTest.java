package org.j8unit.repository.javax.print.attribute.standard;

import javax.print.attribute.standard.JobMediaSheets;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class JobMediaSheetsClassTest
implements org.j8unit.repository.javax.print.attribute.standard.JobMediaSheetsClassTests<JobMediaSheets> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.print.attribute.standard.JobMediaSheets]

    @Override
    public Class<JobMediaSheets> createNewSUT() {
        return JobMediaSheets.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.print.attribute.standard.JobMediaSheets#JobMediaSheets(int) public
     * javax.print.attribute.standard.JobMediaSheets(int)}.
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
    public void create_JobMediaSheets_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final JobMediaSheets sut = null; // = new JobMediaSheets(int);
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.print.attribute.standard.JobMediaSheets]

}
