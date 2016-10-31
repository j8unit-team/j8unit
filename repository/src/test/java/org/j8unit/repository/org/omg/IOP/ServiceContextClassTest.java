package org.j8unit.repository.org.omg.IOP;

import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.omg.IOP.ServiceContext;

@RunWith(J8Unit4.class)
public class ServiceContextClassTest
implements org.j8unit.repository.org.omg.IOP.ServiceContextClassTests<ServiceContext> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.IOP.ServiceContext]

    @Override
    public Class<ServiceContext> createNewSUT() {
        return ServiceContext.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link org.omg.IOP.ServiceContext#ServiceContext()
     * public org.omg.IOP.ServiceContext()}.
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
    public void create_ServiceContext()
    throws Exception {
        // create new instance
        final ServiceContext sut = new ServiceContext();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link org.omg.IOP.ServiceContext#ServiceContext(int, byte[]) public org.omg.IOP.ServiceContext(int,byte[])}.
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
    public void create_ServiceContext_int_byteArray()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final ServiceContext sut = null; // = new ServiceContext(int, byte[]);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.IOP.ServiceContext]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.IOP.ServiceContext]

}
