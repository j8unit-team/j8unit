package org.j8unit.repository.java.security.spec;

import java.math.BigInteger;
import java.security.spec.ECField;
import java.security.spec.EllipticCurve;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class EllipticCurveClassTest
implements org.j8unit.repository.java.security.spec.EllipticCurveClassTests<EllipticCurve> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.security.spec.EllipticCurve]

    @Override
    public Class<EllipticCurve> createNewSUT() {
        return EllipticCurve.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link EllipticCurve#EllipticCurve(ECField, BigInteger, BigInteger, byte[]) public
     * java.security.spec.EllipticCurve(java.security.spec.ECField,java.math.BigInteger,java.math.BigInteger,byte[])}.
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
    public void create_EllipticCurve_ECField_BigInteger_BigInteger_byteArray()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final EllipticCurve sut = null; // = new EllipticCurve(ECField, BigInteger, BigInteger, byte[]);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link EllipticCurve#EllipticCurve(ECField, BigInteger, BigInteger) public
     * java.security.spec.EllipticCurve(java.security.spec.ECField,java.math.BigInteger,java.math.BigInteger)}.
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
    public void create_EllipticCurve_ECField_BigInteger_BigInteger()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final EllipticCurve sut = null; // = new EllipticCurve(ECField, BigInteger, BigInteger);
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.security.spec.EllipticCurve]

}
