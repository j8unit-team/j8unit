package org.j8unit.repository.java.util.logging;

import java.util.logging.ErrorManager;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ErrorManagerClassTest
implements org.j8unit.repository.java.util.logging.ErrorManagerClassTests<ErrorManager> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.logging.ErrorManager]

    @Override
    public Class<ErrorManager> createNewSUT() {
        return ErrorManager.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link java.util.logging.ErrorManager#ErrorManager()
     * public java.util.logging.ErrorManager()}.
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
    public void create_ErrorManager()
    throws Exception {
        // create new instance
        final ErrorManager sut = new ErrorManager();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.logging.ErrorManager]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.logging.ErrorManager]

}
