package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.omg.CORBA.ServiceInformationHolder;

@RunWith(J8Unit4.class)
public class ServiceInformationHolderClassTest
implements org.j8unit.repository.org.omg.CORBA.ServiceInformationHolderClassTests<ServiceInformationHolder> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.CORBA.ServiceInformationHolder]

    @Override
    public Class<ServiceInformationHolder> createNewSUT() {
        return ServiceInformationHolder.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link org.omg.CORBA.ServiceInformationHolder#ServiceInformationHolder(org.omg.CORBA.ServiceInformation) public
     * org.omg.CORBA.ServiceInformationHolder(org.omg.CORBA.ServiceInformation)}.
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
    public void create_ServiceInformationHolder_ServiceInformation()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final ServiceInformationHolder sut = null; // = new ServiceInformationHolder(org.omg.CORBA.ServiceInformation);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link org.omg.CORBA.ServiceInformationHolder#ServiceInformationHolder() public
     * org.omg.CORBA.ServiceInformationHolder()}.
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
    public void create_ServiceInformationHolder()
    throws Exception {
        // create new instance
        final ServiceInformationHolder sut = new ServiceInformationHolder();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.CORBA.ServiceInformationHolder]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.CORBA.ServiceInformationHolder]

}
