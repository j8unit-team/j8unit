package org.j8unit.repository.java.rmi.server;

import java.rmi.server.UID;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link UID} (by simply reusing the J8Unit test
 * interface {@link org.j8unit.repository.java.rmi.server.UIDClassTests}).
 */
@RunWith(J8Unit4.class)
public class UIDClassTest
implements UIDClassTests<UID> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.rmi.server.UID]

    @Override
    public Class<UID> createNewSUT() {
        return UID.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link java.rmi.server.UID#UID(short) public
     * java.rmi.server.UID(short)}.
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
    public void create_UID_short()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final UID sut = null; // = new UID(short);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link java.rmi.server.UID#UID() public
     * java.rmi.server.UID()}.
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
    public void create_UID()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final UID sut = new UID();
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.rmi.server.UID#read(java.io.DataInput) public
     * static java.rmi.server.UID java.rmi.server.UID.read(java.io.DataInput) throws java.io.IOException}.
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
    public void test_read_DataInput()
    throws Exception {
        // write some test for {@link java.rmi.server.UID#read(java.io.DataInput)}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.rmi.server.UID]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.rmi.server.UID]

}
