package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.omg.CORBA.CharSeqHolder;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link CharSeqHolder} (by simply reusing the
 * J8Unit test interface {@link CharSeqHolderClassTests}).
 */

@RunWith(J8Unit4.class)
public class CharSeqHolderClassTest
implements CharSeqHolderClassTests<CharSeqHolder> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.CORBA.CharSeqHolder]

    @Override
    public Class<CharSeqHolder> createNewSUT() {
        return CharSeqHolder.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link org.omg.CORBA.CharSeqHolder#CharSeqHolder(char[]) public org.omg.CORBA.CharSeqHolder(char[])}.
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
    public void create_CharSeqHolder_charArray()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final CharSeqHolder sut = null; // = new CharSeqHolder(char[]);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link org.omg.CORBA.CharSeqHolder#CharSeqHolder()
     * public org.omg.CORBA.CharSeqHolder()}.
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
    public void create_CharSeqHolder()
    throws Exception {
        // create new instance
        final CharSeqHolder sut = new CharSeqHolder();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.CORBA.CharSeqHolder]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.CORBA.CharSeqHolder]

}
