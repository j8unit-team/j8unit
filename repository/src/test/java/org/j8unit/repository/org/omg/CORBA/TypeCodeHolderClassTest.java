package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.omg.CORBA.TypeCodeHolder;

@RunWith(J8Unit4.class)
public class TypeCodeHolderClassTest
implements org.j8unit.repository.org.omg.CORBA.TypeCodeHolderClassTests<TypeCodeHolder> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.CORBA.TypeCodeHolder]

    @Override
    public Class<TypeCodeHolder> createNewSUT() {
        return TypeCodeHolder.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link org.omg.CORBA.TypeCodeHolder#TypeCodeHolder(org.omg.CORBA.TypeCode) public
     * org.omg.CORBA.TypeCodeHolder(org.omg.CORBA.TypeCode)}.
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
    public void create_TypeCodeHolder_TypeCode()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final TypeCodeHolder sut = null; // = new TypeCodeHolder(org.omg.CORBA.TypeCode);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link org.omg.CORBA.TypeCodeHolder#TypeCodeHolder()
     * public org.omg.CORBA.TypeCodeHolder()}.
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
    public void create_TypeCodeHolder()
    throws Exception {
        // create new instance
        final TypeCodeHolder sut = new TypeCodeHolder();
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.CORBA.TypeCodeHolder]

}
