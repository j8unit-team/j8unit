package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.omg.CORBA.StringHolder;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link StringHolder} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.org.omg.CORBA.StringHolderClassTests}).
 */

@RunWith(J8Unit4.class)
public class StringHolderClassTest
implements StringHolderClassTests<StringHolder> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.CORBA.StringHolder]

    @Override
    public Class<StringHolder> createNewSUT() {
        return StringHolder.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link org.omg.CORBA.StringHolder#StringHolder(String)
     * public org.omg.CORBA.StringHolder(java.lang.String)}.
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
    public void create_StringHolder_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final StringHolder sut = null; // = new StringHolder(String);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link org.omg.CORBA.StringHolder#StringHolder()
     * public org.omg.CORBA.StringHolder()}.
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
    public void create_StringHolder()
    throws Exception {
        // create new instance
        final StringHolder sut = new StringHolder();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.CORBA.StringHolder]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.CORBA.StringHolder]

}
