package org.j8unit.repository.org.omg.CORBA.portable;

import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.omg.CORBA.portable.ServantObject;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ServantObject} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.org.omg.CORBA.portable.ServantObjectClassTests}).
 */
@RunWith(J8Unit4.class)
public class ServantObjectClassTest
implements ServantObjectClassTests<ServantObject> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.CORBA.portable.ServantObject]

    @Override
    public Class<ServantObject> createNewSUT() {
        return ServantObject.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link org.omg.CORBA.portable.ServantObject#ServantObject() public org.omg.CORBA.portable.ServantObject()}.
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
    public void create_ServantObject()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final ServantObject sut = new ServantObject();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.CORBA.portable.ServantObject]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.CORBA.portable.ServantObject]

}
