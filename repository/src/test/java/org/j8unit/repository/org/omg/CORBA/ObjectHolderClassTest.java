package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.omg.CORBA.ObjectHolder;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ObjectHolder} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.org.omg.CORBA.ObjectHolderClassTests}).
 */
@RunWith(J8Unit4.class)
public class ObjectHolderClassTest
implements ObjectHolderClassTests<ObjectHolder> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.CORBA.ObjectHolder]

    @Override
    public Class<ObjectHolder> createNewSUT() {
        return ObjectHolder.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link org.omg.CORBA.ObjectHolder#ObjectHolder(org.omg.CORBA.Object) public
     * org.omg.CORBA.ObjectHolder(org.omg.CORBA.Object)}.
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
    public void create_ObjectHolder_Object()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final ObjectHolder sut = null; // = new ObjectHolder(org.omg.CORBA.Object);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link org.omg.CORBA.ObjectHolder#ObjectHolder()
     * public org.omg.CORBA.ObjectHolder()}.
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
    public void create_ObjectHolder()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final ObjectHolder sut = new ObjectHolder();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.CORBA.ObjectHolder]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.CORBA.ObjectHolder]

}
