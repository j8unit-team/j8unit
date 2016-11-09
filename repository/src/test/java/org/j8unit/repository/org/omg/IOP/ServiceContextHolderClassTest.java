package org.j8unit.repository.org.omg.IOP;

import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.omg.IOP.ServiceContextHolder;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ServiceContextHolder} (by simply reusing
 * the J8Unit test interface {@link ServiceContextHolderClassTests}).
 */

@RunWith(J8Unit4.class)
public class ServiceContextHolderClassTest
implements ServiceContextHolderClassTests<ServiceContextHolder> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.IOP.ServiceContextHolder]

    @Override
    public Class<ServiceContextHolder> createNewSUT() {
        return ServiceContextHolder.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link org.omg.IOP.ServiceContextHolder#ServiceContextHolder(org.omg.IOP.ServiceContext) public
     * org.omg.IOP.ServiceContextHolder(org.omg.IOP.ServiceContext)}.
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
    public void create_ServiceContextHolder_ServiceContext()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final ServiceContextHolder sut = null; // = new ServiceContextHolder(org.omg.IOP.ServiceContext);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link org.omg.IOP.ServiceContextHolder#ServiceContextHolder() public org.omg.IOP.ServiceContextHolder()}.
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
    public void create_ServiceContextHolder()
    throws Exception {
        // create new instance
        final ServiceContextHolder sut = new ServiceContextHolder();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.IOP.ServiceContextHolder]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.IOP.ServiceContextHolder]

}
