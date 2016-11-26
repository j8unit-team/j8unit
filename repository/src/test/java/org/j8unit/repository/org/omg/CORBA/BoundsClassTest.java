package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.omg.CORBA.Bounds;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Bounds} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.org.omg.CORBA.BoundsClassTests}).
 */
@RunWith(J8Unit4.class)
public class BoundsClassTest
implements org.j8unit.repository.org.omg.CORBA.BoundsClassTests<Bounds> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.CORBA.Bounds]

    @Override
    public Class<Bounds> createNewSUT() {
        return Bounds.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link org.omg.CORBA.Bounds#Bounds() public
     * org.omg.CORBA.Bounds()}.
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
    public void create_Bounds()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final Bounds sut = new Bounds();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link org.omg.CORBA.Bounds#Bounds(String) public
     * org.omg.CORBA.Bounds(java.lang.String)}.
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
    public void create_Bounds_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final Bounds sut = null; // = new Bounds(String);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.CORBA.Bounds]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.CORBA.Bounds]

}
