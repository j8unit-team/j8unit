package org.j8unit.repository.java.lang;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain Package class java.lang.Package}. The complementary j8unit test interface
 * containing the class relevant aspects is {@link PackageClassTests}.
 * </p>
 *
 * @see Package class java.lang.Package (the hereby targeted class-under-test class)
 * @see PackageClassTests PackageClassTests (the complementary j8unit test interface containing the class relevant test
 *      methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface PackageTests<SUT extends Package>
extends org.j8unit.repository.java.lang.reflect.AnnotatedElementTests<SUT>, ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link Package#isAnnotationPresent(Class) public boolean
     * java.lang.Package.isAnnotationPresent(java.lang.Class<? extends java.lang.annotation.Annotation>)}.
     *
     * <p>
     * Test method for {@link Package#isAnnotationPresent(Class) public boolean
     * java.lang.Package.isAnnotationPresent(java.lang.Class)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see Package#isAnnotationPresent(Class) public boolean java.lang.Package.isAnnotationPresent(java.lang.Class)
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_isAnnotationPresent_Class()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link Package#isSealed(java.net.URL) public boolean java.lang.Package.isSealed(java.net.URL)}.
     *
     * <p>
     * Test method for {@link Package#isSealed(java.net.URL) public boolean java.lang.Package.isSealed(java.net.URL)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see Package#isSealed(java.net.URL) public boolean java.lang.Package.isSealed(java.net.URL) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isSealed_URL()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link Package#isSealed() public boolean java.lang.Package.isSealed()}.
     *
     * <p>
     * Test method for {@link Package#isSealed() public boolean java.lang.Package.isSealed()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see Package#isSealed() public boolean java.lang.Package.isSealed() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isSealed()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link Package#getName() public java.lang.String java.lang.Package.getName()}.
     *
     * <p>
     * Test method for {@link Package#getName() public java.lang.String java.lang.Package.getName()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see Package#getName() public java.lang.String java.lang.Package.getName() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getName()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link Package#getAnnotations() public java.lang.annotation.Annotation[]
     * java.lang.Package.getAnnotations()}.
     *
     * <p>
     * Test method for {@link Package#getAnnotations() public java.lang.annotation.Annotation[]
     * java.lang.Package.getAnnotations()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see Package#getAnnotations() public java.lang.annotation.Annotation[] java.lang.Package.getAnnotations() (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getAnnotations()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link Package#isCompatibleWith(String) public boolean
     * java.lang.Package.isCompatibleWith(java.lang.String) throws java.lang.NumberFormatException}.
     *
     * <p>
     * Test method for {@link Package#isCompatibleWith(String) public boolean
     * java.lang.Package.isCompatibleWith(java.lang.String) throws java.lang.NumberFormatException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see Package#isCompatibleWith(String) public boolean java.lang.Package.isCompatibleWith(java.lang.String) throws
     *      java.lang.NumberFormatException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isCompatibleWith_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link Package#getImplementationTitle() public java.lang.String
     * java.lang.Package.getImplementationTitle()}.
     *
     * <p>
     * Test method for {@link Package#getImplementationTitle() public java.lang.String
     * java.lang.Package.getImplementationTitle()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see Package#getImplementationTitle() public java.lang.String java.lang.Package.getImplementationTitle() (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getImplementationTitle()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link Package#getDeclaredAnnotations() public java.lang.annotation.Annotation[]
     * java.lang.Package.getDeclaredAnnotations()}.
     *
     * <p>
     * Test method for {@link Package#getDeclaredAnnotations() public java.lang.annotation.Annotation[]
     * java.lang.Package.getDeclaredAnnotations()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see Package#getDeclaredAnnotations() public java.lang.annotation.Annotation[]
     *      java.lang.Package.getDeclaredAnnotations() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getDeclaredAnnotations()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link Package#getSpecificationVendor() public java.lang.String
     * java.lang.Package.getSpecificationVendor()}.
     *
     * <p>
     * Test method for {@link Package#getSpecificationVendor() public java.lang.String
     * java.lang.Package.getSpecificationVendor()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see Package#getSpecificationVendor() public java.lang.String java.lang.Package.getSpecificationVendor() (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getSpecificationVendor()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link Package#getSpecificationTitle() public java.lang.String
     * java.lang.Package.getSpecificationTitle()}.
     *
     * <p>
     * Test method for {@link Package#getSpecificationTitle() public java.lang.String
     * java.lang.Package.getSpecificationTitle()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see Package#getSpecificationTitle() public java.lang.String java.lang.Package.getSpecificationTitle() (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getSpecificationTitle()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link Package#getAnnotation(Class) public <A> A java.lang.Package.getAnnotation(java.lang.Class
     * <A>)}.
     *
     * <p>
     * Test method for {@link Package#getAnnotation(Class) public java.lang.annotation.Annotation
     * java.lang.Package.getAnnotation(java.lang.Class)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see Package#getAnnotation(Class) public java.lang.annotation.Annotation
     *      java.lang.Package.getAnnotation(java.lang.Class) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getAnnotation_Class()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link Package#getDeclaredAnnotationsByType(Class) public <A> A[]
     * java.lang.Package.getDeclaredAnnotationsByType(java.lang.Class<A>)}.
     *
     * <p>
     * Test method for {@link Package#getDeclaredAnnotationsByType(Class) public java.lang.annotation.Annotation[]
     * java.lang.Package.getDeclaredAnnotationsByType(java.lang.Class)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see Package#getDeclaredAnnotationsByType(Class) public java.lang.annotation.Annotation[]
     *      java.lang.Package.getDeclaredAnnotationsByType(java.lang.Class) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getDeclaredAnnotationsByType_Class()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link Package#getAnnotationsByType(Class) public <A> A[]
     * java.lang.Package.getAnnotationsByType(java.lang.Class<A>)}.
     *
     * <p>
     * Test method for {@link Package#getAnnotationsByType(Class) public java.lang.annotation.Annotation[]
     * java.lang.Package.getAnnotationsByType(java.lang.Class)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see Package#getAnnotationsByType(Class) public java.lang.annotation.Annotation[]
     *      java.lang.Package.getAnnotationsByType(java.lang.Class) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getAnnotationsByType_Class()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link Package#hashCode() public int java.lang.Package.hashCode()}.
     *
     * <p>
     * Test method for {@link Package#hashCode() public int java.lang.Package.hashCode()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see Package#hashCode() public int java.lang.Package.hashCode() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_hashCode()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link Package#getImplementationVendor() public java.lang.String
     * java.lang.Package.getImplementationVendor()}.
     *
     * <p>
     * Test method for {@link Package#getImplementationVendor() public java.lang.String
     * java.lang.Package.getImplementationVendor()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see Package#getImplementationVendor() public java.lang.String java.lang.Package.getImplementationVendor() (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getImplementationVendor()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link Package#getSpecificationVersion() public java.lang.String
     * java.lang.Package.getSpecificationVersion()}.
     *
     * <p>
     * Test method for {@link Package#getSpecificationVersion() public java.lang.String
     * java.lang.Package.getSpecificationVersion()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see Package#getSpecificationVersion() public java.lang.String java.lang.Package.getSpecificationVersion() (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getSpecificationVersion()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link Package#getImplementationVersion() public java.lang.String
     * java.lang.Package.getImplementationVersion()}.
     *
     * <p>
     * Test method for {@link Package#getImplementationVersion() public java.lang.String
     * java.lang.Package.getImplementationVersion()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see Package#getImplementationVersion() public java.lang.String java.lang.Package.getImplementationVersion() (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getImplementationVersion()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link Package#getDeclaredAnnotation(Class) public <A> A
     * java.lang.Package.getDeclaredAnnotation(java.lang.Class<A>)}.
     *
     * <p>
     * Test method for {@link Package#getDeclaredAnnotation(Class) public java.lang.annotation.Annotation
     * java.lang.Package.getDeclaredAnnotation(java.lang.Class)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see Package#getDeclaredAnnotation(Class) public java.lang.annotation.Annotation
     *      java.lang.Package.getDeclaredAnnotation(java.lang.Class) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getDeclaredAnnotation_Class()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link Package#toString() public java.lang.String java.lang.Package.toString()}.
     *
     * <p>
     * Test method for {@link Package#toString() public java.lang.String java.lang.Package.toString()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see Package#toString() public java.lang.String java.lang.Package.toString() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_toString()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
