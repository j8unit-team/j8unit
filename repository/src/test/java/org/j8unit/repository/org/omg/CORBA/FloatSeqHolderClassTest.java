package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.omg.CORBA.FloatSeqHolder;

@RunWith(J8Unit4.class)
public class FloatSeqHolderClassTest
implements org.j8unit.repository.org.omg.CORBA.FloatSeqHolderClassTests<FloatSeqHolder> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.CORBA.FloatSeqHolder]

    @Override
    public Class<FloatSeqHolder> createNewSUT() {
        return FloatSeqHolder.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link org.omg.CORBA.FloatSeqHolder#FloatSeqHolder(float[]) public org.omg.CORBA.FloatSeqHolder(float[])}.
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
    public void create_FloatSeqHolder_floatArray()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final FloatSeqHolder sut = null; // = new FloatSeqHolder(float[]);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link org.omg.CORBA.FloatSeqHolder#FloatSeqHolder()
     * public org.omg.CORBA.FloatSeqHolder()}.
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
    public void create_FloatSeqHolder()
    throws Exception {
        // create new instance
        final FloatSeqHolder sut = new FloatSeqHolder();
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.CORBA.FloatSeqHolder]

}
