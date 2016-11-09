package org.j8unit.repository.java.util.concurrent;

import static org.junit.Assert.fail;
import java.util.concurrent.AbstractExecutorService;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link AbstractExecutorService} (by simply
 * reusing the J8Unit test interface {@link AbstractExecutorServiceClassTests}).
 */

@RunWith(J8Unit4.class)
public class AbstractExecutorServiceClassTest
implements AbstractExecutorServiceClassTests<AbstractExecutorService> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.concurrent.AbstractExecutorService]

    @Override
    public Class<AbstractExecutorService> createNewSUT() {
        return AbstractExecutorService.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.util.concurrent.AbstractExecutorService#AbstractExecutorService() public
     * java.util.concurrent.AbstractExecutorService()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("Cannot construct an abstract class!")
    @Test
    @Category(Draft.class)
    public void create_AbstractExecutorService()
    throws Exception {
        fail("Cannot construct an abstract class!");
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.concurrent.AbstractExecutorService]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.concurrent.AbstractExecutorService]

}
