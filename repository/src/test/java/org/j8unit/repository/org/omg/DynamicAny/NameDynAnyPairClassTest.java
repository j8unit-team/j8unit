package org.j8unit.repository.org.omg.DynamicAny;

import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.omg.DynamicAny.NameDynAnyPair;

@RunWith(J8Unit4.class)
public class NameDynAnyPairClassTest
implements org.j8unit.repository.org.omg.DynamicAny.NameDynAnyPairClassTests<NameDynAnyPair> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.DynamicAny.NameDynAnyPair]

    @Override
    public Class<NameDynAnyPair> createNewSUT() {
        return NameDynAnyPair.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link org.omg.DynamicAny.NameDynAnyPair#NameDynAnyPair() public org.omg.DynamicAny.NameDynAnyPair()}.
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
    public void create_NameDynAnyPair()
    throws Exception {
        // create new instance
        final NameDynAnyPair sut = new NameDynAnyPair();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link org.omg.DynamicAny.NameDynAnyPair#NameDynAnyPair(String, org.omg.DynamicAny.DynAny) public
     * org.omg.DynamicAny.NameDynAnyPair(java.lang.String,org.omg.DynamicAny.DynAny)}.
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
    public void create_NameDynAnyPair_String_DynAny()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final NameDynAnyPair sut = null; // = new NameDynAnyPair(String, org.omg.DynamicAny.DynAny);
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.DynamicAny.NameDynAnyPair]

}
