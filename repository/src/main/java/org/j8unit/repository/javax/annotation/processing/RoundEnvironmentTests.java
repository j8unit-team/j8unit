package org.j8unit.repository.javax.annotation.processing;

import org.j8unit.J8UnitTest;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.annotation.processing.RoundEnvironment interface
 * javax.annotation.processing.RoundEnvironment}, containing all instance relevant test methods (i.&thinsp;e., test
 * methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.annotation.processing.RoundEnvironmentClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface RoundEnvironmentTests<SUT extends javax.annotation.processing.RoundEnvironment>
extends J8UnitTest<SUT> {

    /**
     * <p>
     * Test method for {@link javax.annotation.processing.RoundEnvironment#errorRaised() public abstract boolean
     * javax.annotation.processing.RoundEnvironment.errorRaised()}.
     * </p>
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
     * java.util.Set javax.annotation.processing.RoundEnvironment.getRootElements()}.
     * </p>
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
     * Test method for {@link javax.annotation.processing.RoundEnvironment#getElementsAnnotatedWith(java.lang.Class)
     * public abstract java.util.Set
     * javax.annotation.processing.RoundEnvironment.getElementsAnnotatedWith(java.lang.Class)}.
     * </p>
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
     * public abstract java.util.Set
     * javax.annotation.processing.RoundEnvironment.getElementsAnnotatedWith(javax.lang.model.element.TypeElement)}.
     * </p>
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
     * </p>
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
