package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.omg.CORBA.ServiceInformation;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ServiceInformation} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.org.omg.CORBA.ServiceInformationClassTests}).
 */

@RunWith(J8Unit4.class)
public class ServiceInformationClassTest
implements ServiceInformationClassTests<ServiceInformation> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.CORBA.ServiceInformation]

    @Override
    public Class<ServiceInformation> createNewSUT() {
        return ServiceInformation.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link org.omg.CORBA.ServiceInformation#ServiceInformation() public org.omg.CORBA.ServiceInformation()}.
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
    public void create_ServiceInformation()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final ServiceInformation sut = new ServiceInformation();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link org.omg.CORBA.ServiceInformation#ServiceInformation(int[], org.omg.CORBA.ServiceDetail[]) public
     * org.omg.CORBA.ServiceInformation(int[],org.omg.CORBA.ServiceDetail[])}.
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
    public void create_ServiceInformation_intArray_ServiceDetailArray()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final ServiceInformation sut = null; // = new ServiceInformation(int[], org.omg.CORBA.ServiceDetail[]);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.CORBA.ServiceInformation]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.CORBA.ServiceInformation]

}
