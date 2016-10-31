package org.j8unit.repository.java.util;

import java.util.FormatterClosedException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class FormatterClosedExceptionClassTest
implements org.j8unit.repository.java.util.FormatterClosedExceptionClassTests<FormatterClosedException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.FormatterClosedException]

    @Override
    public Class<FormatterClosedException> createNewSUT() {
        return FormatterClosedException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.util.FormatterClosedException#FormatterClosedException() public
     * java.util.FormatterClosedException()}.
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
    public void create_FormatterClosedException()
    throws Exception {
        // create new instance
        final FormatterClosedException sut = new FormatterClosedException();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.FormatterClosedException]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.FormatterClosedException]

}
