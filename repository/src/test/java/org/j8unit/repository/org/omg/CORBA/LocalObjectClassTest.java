package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.omg.CORBA.LocalObject;

@RunWith(J8Unit4.class)
public class LocalObjectClassTest
implements org.j8unit.repository.org.omg.CORBA.LocalObjectClassTests<LocalObject> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.CORBA.LocalObject]

    @Override
    public Class<LocalObject> createNewSUT() {
        return LocalObject.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link org.omg.CORBA.LocalObject#LocalObject() public
     * org.omg.CORBA.LocalObject()}.
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
    public void create_LocalObject()
    throws Exception {
        // create new instance
        final LocalObject sut = new LocalObject();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.CORBA.LocalObject]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.CORBA.LocalObject]

}
