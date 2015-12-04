package org.j8unit.repository.java.util;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link java.util.Spliterators class java.util.Spliterators},
 * containing all class relevant test methods (at least the test methods of accessible constructors and
 * of accessible {@code static} methods). The counterpart test class containing the instance relevant test
 * methods is {@link org.j8unit.repository.java.util.SpliteratorsTests}.
 * </p>
 *
 * <p>
 * In addition, there may be assertions concerning the class itself.
 * For example, <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1"><q>by
 * virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
 * declaration cannot have formal parameters, type parameters, or a throws clause.</q> (JLS, Sec.&thinsp;9.6.1</a>
 * Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests}
 * provides a corresponding, inheritable test method:
 * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
 * Similarly, this class is not only intended to assert some static method's behaviour but also to verify
 * runtime constraints and further class specific requirements.
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.util.SpliteratorsTests
 */
@Category(J8UnitRepository.class)
public abstract interface SpliteratorsClassTests<SUT extends Class<? extends java.util.Spliterators>>
extends org.j8unit.repository.java.lang.ObjectClassTests<SUT>
{

    @Test
    public default void testBaseTypeIsAssignableFromCurrentType() throws Exception {
        // create new instance
        Class<? extends java.util.Spliterators> sut = createNewSUT();
        // assert assignability
        assertTrue(java.util.Spliterators.class.isAssignableFrom(sut));
    }

    /**
     * <p>
     * Test method for {@link java.util.Spliterators#iterator(java.util.Spliterator) public static java.util.Iterator java.util.Spliterators.iterator(java.util.Spliterator)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_iterator_Spliterator() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.Spliterators#iterator(java.util.Spliterator.OfInt) public static java.util.PrimitiveIterator$OfInt java.util.Spliterators.iterator(java.util.Spliterator$OfInt)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_iterator_OfInt() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.Spliterators#iterator(java.util.Spliterator.OfLong) public static java.util.PrimitiveIterator$OfLong java.util.Spliterators.iterator(java.util.Spliterator$OfLong)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_iterator_OfLong() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.Spliterators#iterator(java.util.Spliterator.OfDouble) public static java.util.PrimitiveIterator$OfDouble java.util.Spliterators.iterator(java.util.Spliterator$OfDouble)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_iterator_OfDouble() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.Spliterators#emptyDoubleSpliterator() public static java.util.Spliterator$OfDouble java.util.Spliterators.emptyDoubleSpliterator()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_emptyDoubleSpliterator() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.Spliterators#spliterator(double[],int) public static java.util.Spliterator$OfDouble java.util.Spliterators.spliterator(double[],int)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_spliterator_doubleArray_int() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.Spliterators#spliterator(double[],int,int,int) public static java.util.Spliterator$OfDouble java.util.Spliterators.spliterator(double[],int,int,int)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_spliterator_doubleArray_int_int_int() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.Spliterators#spliterator(java.util.Collection,int) public static java.util.Spliterator java.util.Spliterators.spliterator(java.util.Collection,int)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_spliterator_Collection_int() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.Spliterators#spliterator(java.util.PrimitiveIterator.OfInt,long,int) public static java.util.Spliterator$OfInt java.util.Spliterators.spliterator(java.util.PrimitiveIterator$OfInt,long,int)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_spliterator_OfInt_long_int() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.Spliterators#spliterator(java.util.PrimitiveIterator.OfLong,long,int) public static java.util.Spliterator$OfLong java.util.Spliterators.spliterator(java.util.PrimitiveIterator$OfLong,long,int)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_spliterator_OfLong_long_int() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.Spliterators#spliterator(java.util.PrimitiveIterator.OfDouble,long,int) public static java.util.Spliterator$OfDouble java.util.Spliterators.spliterator(java.util.PrimitiveIterator$OfDouble,long,int)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_spliterator_OfDouble_long_int() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.Spliterators#spliterator(java.util.Iterator,long,int) public static java.util.Spliterator java.util.Spliterators.spliterator(java.util.Iterator,long,int)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_spliterator_Iterator_long_int() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.Spliterators#spliterator(long[],int) public static java.util.Spliterator$OfLong java.util.Spliterators.spliterator(long[],int)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_spliterator_longArray_int() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.Spliterators#spliterator(int[],int) public static java.util.Spliterator$OfInt java.util.Spliterators.spliterator(int[],int)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_spliterator_intArray_int() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.Spliterators#spliterator(int[],int,int,int) public static java.util.Spliterator$OfInt java.util.Spliterators.spliterator(int[],int,int,int)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_spliterator_intArray_int_int_int() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.Spliterators#spliterator(java.lang.Object[],int,int,int) public static java.util.Spliterator java.util.Spliterators.spliterator(java.lang.Object[],int,int,int)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_spliterator_ObjectArray_int_int_int() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.Spliterators#spliterator(long[],int,int,int) public static java.util.Spliterator$OfLong java.util.Spliterators.spliterator(long[],int,int,int)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_spliterator_longArray_int_int_int() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.Spliterators#spliterator(java.lang.Object[],int) public static java.util.Spliterator java.util.Spliterators.spliterator(java.lang.Object[],int)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_spliterator_ObjectArray_int() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.Spliterators#emptyLongSpliterator() public static java.util.Spliterator$OfLong java.util.Spliterators.emptyLongSpliterator()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_emptyLongSpliterator() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.Spliterators#emptySpliterator() public static java.util.Spliterator java.util.Spliterators.emptySpliterator()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_emptySpliterator() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.Spliterators#spliteratorUnknownSize(java.util.PrimitiveIterator.OfLong,int) public static java.util.Spliterator$OfLong java.util.Spliterators.spliteratorUnknownSize(java.util.PrimitiveIterator$OfLong,int)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_spliteratorUnknownSize_OfLong_int() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.Spliterators#spliteratorUnknownSize(java.util.PrimitiveIterator.OfDouble,int) public static java.util.Spliterator$OfDouble java.util.Spliterators.spliteratorUnknownSize(java.util.PrimitiveIterator$OfDouble,int)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_spliteratorUnknownSize_OfDouble_int() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.Spliterators#spliteratorUnknownSize(java.util.PrimitiveIterator.OfInt,int) public static java.util.Spliterator$OfInt java.util.Spliterators.spliteratorUnknownSize(java.util.PrimitiveIterator$OfInt,int)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_spliteratorUnknownSize_OfInt_int() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.Spliterators#spliteratorUnknownSize(java.util.Iterator,int) public static java.util.Spliterator java.util.Spliterators.spliteratorUnknownSize(java.util.Iterator,int)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_spliteratorUnknownSize_Iterator_int() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.Spliterators#emptyIntSpliterator() public static java.util.Spliterator$OfInt java.util.Spliterators.emptyIntSpliterator()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_emptyIntSpliterator() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test class for {@link java.util.Spliterators$AbstractSpliterator class java.util.Spliterators$AbstractSpliterator},
     * containing all class relevant test methods (at least the test methods of accessible constructors and
     * of accessible {@code static} methods). The counterpart test class containing the instance relevant test
     * methods is {@link org.j8unit.repository.java.util.SpliteratorsTests.AbstractSpliteratorTests}.
     * </p>
     *
     * <p>
     * In addition, there may be assertions concerning the class itself.
     * For example, <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1"><q>by
     * virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
     * declaration cannot have formal parameters, type parameters, or a throws clause.</q> (JLS, Sec.&thinsp;9.6.1</a>
     * Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests}
     * provides a corresponding, inheritable test method:
     * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
     * Similarly, this class is not only intended to assert some static method's behaviour but also to verify
     * runtime constraints and further class specific requirements.
     * </p>
     *
     * @param SUT the type of the subject-under-test
     * @since 0.9.0
     * @see org.j8unit.repository.java.util.SpliteratorsTests.AbstractSpliteratorTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface AbstractSpliteratorClassTests<SUT extends Class<? extends java.util.Spliterators.AbstractSpliterator<T>>, T>
    extends org.j8unit.repository.java.util.SpliteratorClassTests<SUT,T>,
            org.j8unit.repository.java.lang.ObjectClassTests<SUT>
    {

        @Test
        public default void testBaseTypeIsAssignableFromCurrentType() throws Exception {
            // create new instance
            Class<? extends java.util.Spliterators.AbstractSpliterator<T>> sut = createNewSUT();
            // assert assignability
            assertTrue(java.util.Spliterators.AbstractSpliterator.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Test class for {@link java.util.Spliterators$AbstractIntSpliterator class java.util.Spliterators$AbstractIntSpliterator},
     * containing all class relevant test methods (at least the test methods of accessible constructors and
     * of accessible {@code static} methods). The counterpart test class containing the instance relevant test
     * methods is {@link org.j8unit.repository.java.util.SpliteratorsTests.AbstractIntSpliteratorTests}.
     * </p>
     *
     * <p>
     * In addition, there may be assertions concerning the class itself.
     * For example, <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1"><q>by
     * virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
     * declaration cannot have formal parameters, type parameters, or a throws clause.</q> (JLS, Sec.&thinsp;9.6.1</a>
     * Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests}
     * provides a corresponding, inheritable test method:
     * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
     * Similarly, this class is not only intended to assert some static method's behaviour but also to verify
     * runtime constraints and further class specific requirements.
     * </p>
     *
     * @param SUT the type of the subject-under-test
     * @since 0.9.0
     * @see org.j8unit.repository.java.util.SpliteratorsTests.AbstractIntSpliteratorTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface AbstractIntSpliteratorClassTests<SUT extends Class<? extends java.util.Spliterators.AbstractIntSpliterator>>
    extends org.j8unit.repository.java.util.SpliteratorClassTests.OfIntClassTests<SUT>,
            org.j8unit.repository.java.lang.ObjectClassTests<SUT>
    {

        @Test
        public default void testBaseTypeIsAssignableFromCurrentType() throws Exception {
            // create new instance
            Class<? extends java.util.Spliterators.AbstractIntSpliterator> sut = createNewSUT();
            // assert assignability
            assertTrue(java.util.Spliterators.AbstractIntSpliterator.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Test class for {@link java.util.Spliterators$AbstractDoubleSpliterator class java.util.Spliterators$AbstractDoubleSpliterator},
     * containing all class relevant test methods (at least the test methods of accessible constructors and
     * of accessible {@code static} methods). The counterpart test class containing the instance relevant test
     * methods is {@link org.j8unit.repository.java.util.SpliteratorsTests.AbstractDoubleSpliteratorTests}.
     * </p>
     *
     * <p>
     * In addition, there may be assertions concerning the class itself.
     * For example, <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1"><q>by
     * virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
     * declaration cannot have formal parameters, type parameters, or a throws clause.</q> (JLS, Sec.&thinsp;9.6.1</a>
     * Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests}
     * provides a corresponding, inheritable test method:
     * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
     * Similarly, this class is not only intended to assert some static method's behaviour but also to verify
     * runtime constraints and further class specific requirements.
     * </p>
     *
     * @param SUT the type of the subject-under-test
     * @since 0.9.0
     * @see org.j8unit.repository.java.util.SpliteratorsTests.AbstractDoubleSpliteratorTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface AbstractDoubleSpliteratorClassTests<SUT extends Class<? extends java.util.Spliterators.AbstractDoubleSpliterator>>
    extends org.j8unit.repository.java.util.SpliteratorClassTests.OfDoubleClassTests<SUT>,
            org.j8unit.repository.java.lang.ObjectClassTests<SUT>
    {

        @Test
        public default void testBaseTypeIsAssignableFromCurrentType() throws Exception {
            // create new instance
            Class<? extends java.util.Spliterators.AbstractDoubleSpliterator> sut = createNewSUT();
            // assert assignability
            assertTrue(java.util.Spliterators.AbstractDoubleSpliterator.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Test class for {@link java.util.Spliterators$AbstractLongSpliterator class java.util.Spliterators$AbstractLongSpliterator},
     * containing all class relevant test methods (at least the test methods of accessible constructors and
     * of accessible {@code static} methods). The counterpart test class containing the instance relevant test
     * methods is {@link org.j8unit.repository.java.util.SpliteratorsTests.AbstractLongSpliteratorTests}.
     * </p>
     *
     * <p>
     * In addition, there may be assertions concerning the class itself.
     * For example, <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1"><q>by
     * virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
     * declaration cannot have formal parameters, type parameters, or a throws clause.</q> (JLS, Sec.&thinsp;9.6.1</a>
     * Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests}
     * provides a corresponding, inheritable test method:
     * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
     * Similarly, this class is not only intended to assert some static method's behaviour but also to verify
     * runtime constraints and further class specific requirements.
     * </p>
     *
     * @param SUT the type of the subject-under-test
     * @since 0.9.0
     * @see org.j8unit.repository.java.util.SpliteratorsTests.AbstractLongSpliteratorTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface AbstractLongSpliteratorClassTests<SUT extends Class<? extends java.util.Spliterators.AbstractLongSpliterator>>
    extends org.j8unit.repository.java.util.SpliteratorClassTests.OfLongClassTests<SUT>,
            org.j8unit.repository.java.lang.ObjectClassTests<SUT>
    {

        @Test
        public default void testBaseTypeIsAssignableFromCurrentType() throws Exception {
            // create new instance
            Class<? extends java.util.Spliterators.AbstractLongSpliterator> sut = createNewSUT();
            // assert assignability
            assertTrue(java.util.Spliterators.AbstractLongSpliterator.class.isAssignableFrom(sut));
        }

    }

}
