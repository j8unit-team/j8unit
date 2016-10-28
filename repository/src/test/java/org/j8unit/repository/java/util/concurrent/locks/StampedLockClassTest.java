package org.j8unit.repository.java.util.concurrent.locks;

import java.util.concurrent.locks.StampedLock;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class StampedLockClassTest
implements org.j8unit.repository.java.util.concurrent.locks.StampedLockClassTests<StampedLock> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.concurrent.locks.StampedLock]

    @Override
    public Class<StampedLock> createNewSUT() {
        return StampedLock.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link StampedLock#StampedLock() public
     * java.util.concurrent.locks.StampedLock()}.
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
    public void create_StampedLock()
    throws Exception {
        // create new instance
        final StampedLock sut = new StampedLock();
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.concurrent.locks.StampedLock]

}
