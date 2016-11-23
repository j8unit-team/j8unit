package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.omg.CORBA.StringSeqHolder;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link StringSeqHolder} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.org.omg.CORBA.StringSeqHolderClassTests}).
 */

@RunWith(J8Unit4.class)
public class StringSeqHolderClassTest
implements StringSeqHolderClassTests<StringSeqHolder> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.CORBA.StringSeqHolder]

    @Override
    public Class<StringSeqHolder> createNewSUT() {
        return StringSeqHolder.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link org.omg.CORBA.StringSeqHolder#StringSeqHolder(String[]) public
     * org.omg.CORBA.StringSeqHolder(java.lang.String[])}.
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
    public void create_StringSeqHolder_StringArray()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final StringSeqHolder sut = null; // = new StringSeqHolder(String[]);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link org.omg.CORBA.StringSeqHolder#StringSeqHolder()
     * public org.omg.CORBA.StringSeqHolder()}.
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
    public void create_StringSeqHolder()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final StringSeqHolder sut = new StringSeqHolder();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.CORBA.StringSeqHolder]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.CORBA.StringSeqHolder]

}
