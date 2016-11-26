package org.j8unit.repository.java.security.spec;

import java.security.spec.ECFieldF2m;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ECFieldF2m} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.java.security.spec.ECFieldF2mClassTests}).
 */
@RunWith(J8Unit4.class)
public class ECFieldF2mClassTest
implements ECFieldF2mClassTests<ECFieldF2m> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.security.spec.ECFieldF2m]

    @Override
    public Class<ECFieldF2m> createNewSUT() {
        return ECFieldF2m.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link java.security.spec.ECFieldF2m#ECFieldF2m(int)
     * public java.security.spec.ECFieldF2m(int)}.
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
    public void create_ECFieldF2m_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final ECFieldF2m sut = null; // = new ECFieldF2m(int);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.security.spec.ECFieldF2m#ECFieldF2m(int, int[]) public java.security.spec.ECFieldF2m(int,int[])}.
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
    public void create_ECFieldF2m_int_intArray()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final ECFieldF2m sut = null; // = new ECFieldF2m(int, int[]);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.security.spec.ECFieldF2m#ECFieldF2m(int, java.math.BigInteger) public
     * java.security.spec.ECFieldF2m(int,java.math.BigInteger)}.
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
    public void create_ECFieldF2m_int_BigInteger()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final ECFieldF2m sut = null; // = new ECFieldF2m(int, java.math.BigInteger);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.security.spec.ECFieldF2m]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.security.spec.ECFieldF2m]

}
