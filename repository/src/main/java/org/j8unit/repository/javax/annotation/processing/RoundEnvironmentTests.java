package org.j8unit.repository.javax.annotation.processing;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.annotation.processing.RoundEnvironment interface
 * javax.annotation.processing.RoundEnvironment}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link RoundEnvironmentClassTests}.
 * </p>
 *
 * @see javax.annotation.processing.RoundEnvironment interface javax.annotation.processing.RoundEnvironment (the hereby
 *      targeted class-under-test class)
 * @see RoundEnvironmentClassTests RoundEnvironmentClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface RoundEnvironmentTests<SUT extends javax.annotation.processing.RoundEnvironment>
extends RepositoryTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.annotation.processing.RoundEnvironment#errorRaised() public abstract boolean
     * javax.annotation.processing.RoundEnvironment.errorRaised()}.
     *
     * <p>
     * Test method for {@link javax.annotation.processing.RoundEnvironment#errorRaised() public abstract boolean
     * javax.annotation.processing.RoundEnvironment.errorRaised()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.annotation.processing.RoundEnvironment#errorRaised() public abstract boolean
     *      javax.annotation.processing.RoundEnvironment.errorRaised() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_errorRaised()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.annotation.processing.RoundEnvironment#getRootElements() public abstract
     * java.util.Set<? extends javax.lang.model.element.Element>
     * javax.annotation.processing.RoundEnvironment.getRootElements()}.
     *
     * <p>
     * Test method for {@link javax.annotation.processing.RoundEnvironment#getRootElements() public abstract
     * java.util.Set javax.annotation.processing.RoundEnvironment.getRootElements()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.annotation.processing.RoundEnvironment#getRootElements() public abstract java.util.Set
     *      javax.annotation.processing.RoundEnvironment.getRootElements() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getRootElements()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.annotation.processing.RoundEnvironment#getElementsAnnotatedWith(Class) public
     * abstract java.util.Set<? extends javax.lang.model.element.Element>
     * javax.annotation.processing.RoundEnvironment.getElementsAnnotatedWith(java.lang.Class<? extends
     * java.lang.annotation.Annotation>)}.
     *
     * <p>
     * Test method for {@link javax.annotation.processing.RoundEnvironment#getElementsAnnotatedWith(Class) public
     * abstract java.util.Set javax.annotation.processing.RoundEnvironment.getElementsAnnotatedWith(java.lang.Class)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.annotation.processing.RoundEnvironment#getElementsAnnotatedWith(Class) public abstract java.util.Set
     *      javax.annotation.processing.RoundEnvironment.getElementsAnnotatedWith(java.lang.Class) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getElementsAnnotatedWith_Class()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.annotation.processing.RoundEnvironment#getElementsAnnotatedWith(javax.lang.model.element.TypeElement)
     * public abstract java.util.Set<? extends javax.lang.model.element.Element>
     * javax.annotation.processing.RoundEnvironment.getElementsAnnotatedWith(javax.lang.model.element.TypeElement)}.
     *
     * <p>
     * Test method for
     * {@link javax.annotation.processing.RoundEnvironment#getElementsAnnotatedWith(javax.lang.model.element.TypeElement)
     * public abstract java.util.Set
     * javax.annotation.processing.RoundEnvironment.getElementsAnnotatedWith(javax.lang.model.element.TypeElement)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.annotation.processing.RoundEnvironment#getElementsAnnotatedWith(javax.lang.model.element.TypeElement)
     *      public abstract java.util.Set
     *      javax.annotation.processing.RoundEnvironment.getElementsAnnotatedWith(javax.lang.model.element.TypeElement)
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getElementsAnnotatedWith_TypeElement()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.annotation.processing.RoundEnvironment#processingOver() public abstract boolean
     * javax.annotation.processing.RoundEnvironment.processingOver()}.
     *
     * <p>
     * Test method for {@link javax.annotation.processing.RoundEnvironment#processingOver() public abstract boolean
     * javax.annotation.processing.RoundEnvironment.processingOver()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.annotation.processing.RoundEnvironment#processingOver() public abstract boolean
     *      javax.annotation.processing.RoundEnvironment.processingOver() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_processingOver()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
