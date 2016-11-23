package org.j8unit.repository.org.omg.CORBA.TypeCodePackage;

import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.omg.CORBA.TypeCodePackage.Bounds;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Bounds} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.org.omg.CORBA.TypeCodePackage.BoundsClassTests}).
 */

@RunWith(J8Unit4.class)
public class BoundsClassTest
implements BoundsClassTests<Bounds> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.CORBA.TypeCodePackage.Bounds]

    @Override
    public Class<Bounds> createNewSUT() {
        return Bounds.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link org.omg.CORBA.TypeCodePackage.Bounds#Bounds()
     * public org.omg.CORBA.TypeCodePackage.Bounds()}.
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
     * Test method for the hereby targeted constructor-under-test
     * {@link org.omg.CORBA.TypeCodePackage.Bounds#Bounds(String) public
     * org.omg.CORBA.TypeCodePackage.Bounds(java.lang.String)}.
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

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.CORBA.TypeCodePackage.Bounds]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.CORBA.TypeCodePackage.Bounds]

}
