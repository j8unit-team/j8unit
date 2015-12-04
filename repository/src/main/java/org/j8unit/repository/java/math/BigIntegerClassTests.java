package org.j8unit.repository.java.math;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.math.BigInteger class java.math.BigInteger}, containing all class relevant test methods
 * (at least the test methods of accessible constructors and of accessible {@code static} methods). The counterpart test
 * class containing the instance relevant test methods is {@link org.j8unit.repository.java.math.BigIntegerTests}.
 * </p>
 *
 * <p>
 * In addition, there may be assertions concerning the class itself. For example,
 * <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
 * <q>by virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
 * declaration cannot have formal parameters, type parameters, or a throws clause.</q> (JLS, Sec.&thinsp;9.6.1</a> Thus,
 * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests} provides a corresponding, inheritable test
 * method: {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
 * Similarly, this class is not only intended to assert some static method's behaviour but also to verify runtime
 * constraints and further class specific requirements.
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.math.BigIntegerTests
 */
@Category(J8UnitRepository.class)
public abstract interface BigIntegerClassTests<SUT extends Class<? extends java.math.BigInteger>>
extends org.j8unit.repository.java.lang.ComparableClassTests<SUT, java.math.BigInteger>, org.j8unit.repository.java.lang.NumberClassTests<SUT> {

    /**
     * Test method for {@link java.math.BigInteger#BigInteger(byte[]) public java.math.BigInteger(byte[])}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_BigInteger_byteArray()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.math.BigInteger sut = null; // = new BigInteger(byte[]);
    }

    /**
     * Test method for {@link java.math.BigInteger#BigInteger(int,byte[]) public java.math.BigInteger(int,byte[])}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_BigInteger_int_byteArray()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.math.BigInteger sut = null; // = new BigInteger(int,byte[]);
    }

    /**
     * Test method for {@link java.math.BigInteger#BigInteger(int,int,java.util.Random) public
     * java.math.BigInteger(int,int,java.util.Random)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_BigInteger_int_int_Random()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.math.BigInteger sut = null; // = new BigInteger(int,int,java.util.Random);
    }

    /**
     * Test method for {@link java.math.BigInteger#BigInteger(int,java.util.Random) public
     * java.math.BigInteger(int,java.util.Random)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_BigInteger_int_Random()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.math.BigInteger sut = null; // = new BigInteger(int,java.util.Random);
    }

    /**
     * Test method for {@link java.math.BigInteger#BigInteger(java.lang.String) public
     * java.math.BigInteger(java.lang.String)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_BigInteger_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.math.BigInteger sut = null; // = new BigInteger(java.lang.String);
    }

    /**
     * Test method for {@link java.math.BigInteger#BigInteger(java.lang.String,int) public
     * java.math.BigInteger(java.lang.String,int)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_BigInteger_String_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.math.BigInteger sut = null; // = new BigInteger(java.lang.String,int);
    }

    /**
     * <p>
     * Test method for {@link java.math.BigInteger#probablePrime(int,java.util.Random) public static
     * java.math.BigInteger java.math.BigInteger.probablePrime(int,java.util.Random)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_probablePrime_int_Random()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.math.BigInteger#valueOf(long) public static java.math.BigInteger
     * java.math.BigInteger.valueOf(long)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_valueOf_long()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<? extends java.math.BigInteger> sut = createNewSUT();
        // assert assignability
        assertTrue(java.math.BigInteger.class.isAssignableFrom(sut));
    }

}
