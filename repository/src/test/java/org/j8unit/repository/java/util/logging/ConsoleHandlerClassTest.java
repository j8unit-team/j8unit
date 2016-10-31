package org.j8unit.repository.java.util.logging;

import java.util.logging.ConsoleHandler;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ConsoleHandlerClassTest
implements org.j8unit.repository.java.util.logging.ConsoleHandlerClassTests<ConsoleHandler> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.logging.ConsoleHandler]

    @Override
    public Class<ConsoleHandler> createNewSUT() {
        return ConsoleHandler.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.util.logging.ConsoleHandler#ConsoleHandler() public java.util.logging.ConsoleHandler()}.
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
    public void create_ConsoleHandler()
    throws Exception {
        // create new instance
        final ConsoleHandler sut = new ConsoleHandler();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.logging.ConsoleHandler]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.logging.ConsoleHandler]

}
