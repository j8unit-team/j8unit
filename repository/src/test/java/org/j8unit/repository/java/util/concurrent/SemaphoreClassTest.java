package org.j8unit.repository.java.util.concurrent;

import java.util.concurrent.Semaphore;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Semaphore} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.java.util.concurrent.SemaphoreClassTests}).
 */
@RunWith(J8Unit4.class)
public class SemaphoreClassTest
implements SemaphoreClassTests<Semaphore> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.concurrent.Semaphore]

    @Override
    public Class<Semaphore> createNewSUT() {
        return Semaphore.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link java.util.concurrent.Semaphore#Semaphore(int)
     * public java.util.concurrent.Semaphore(int)}.
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
    public void create_Semaphore_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final Semaphore sut = null; // = new Semaphore(int);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.util.concurrent.Semaphore#Semaphore(int, boolean) public
     * java.util.concurrent.Semaphore(int,boolean)}.
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
    public void create_Semaphore_int_boolean()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final Semaphore sut = null; // = new Semaphore(int, boolean);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.concurrent.Semaphore]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.concurrent.Semaphore]

}
