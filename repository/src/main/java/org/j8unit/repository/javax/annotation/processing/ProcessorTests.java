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
 * non-{@code static} methods) of {@linkplain javax.annotation.processing.Processor interface
 * javax.annotation.processing.Processor}. The complementary j8unit test interface containing the class relevant aspects
 * is {@link ProcessorClassTests}.
 * </p>
 *
 * @see javax.annotation.processing.Processor interface javax.annotation.processing.Processor (the hereby targeted
 *      class-under-test class)
 * @see ProcessorClassTests ProcessorClassTests (the complementary j8unit test interface containing the class relevant
 *      test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ProcessorTests<SUT extends javax.annotation.processing.Processor>
extends RepositoryTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.annotation.processing.Processor#getSupportedOptions() public abstract java.util.Set
     * <java.lang.String> javax.annotation.processing.Processor.getSupportedOptions()}.
     *
     * <p>
     * Test method for {@link javax.annotation.processing.Processor#getSupportedOptions() public abstract java.util.Set
     * javax.annotation.processing.Processor.getSupportedOptions()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.annotation.processing.Processor#getSupportedOptions() public abstract java.util.Set
     *      javax.annotation.processing.Processor.getSupportedOptions() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getSupportedOptions()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.annotation.processing.Processor#getSupportedSourceVersion() public abstract
     * javax.lang.model.SourceVersion javax.annotation.processing.Processor.getSupportedSourceVersion()}.
     *
     * <p>
     * Test method for {@link javax.annotation.processing.Processor#getSupportedSourceVersion() public abstract
     * javax.lang.model.SourceVersion javax.annotation.processing.Processor.getSupportedSourceVersion()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.annotation.processing.Processor#getSupportedSourceVersion() public abstract
     *      javax.lang.model.SourceVersion javax.annotation.processing.Processor.getSupportedSourceVersion() (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getSupportedSourceVersion()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.annotation.processing.Processor#getSupportedAnnotationTypes() public abstract
     * java.util.Set<java.lang.String> javax.annotation.processing.Processor.getSupportedAnnotationTypes()}.
     *
     * <p>
     * Test method for {@link javax.annotation.processing.Processor#getSupportedAnnotationTypes() public abstract
     * java.util.Set javax.annotation.processing.Processor.getSupportedAnnotationTypes()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.annotation.processing.Processor#getSupportedAnnotationTypes() public abstract java.util.Set
     *      javax.annotation.processing.Processor.getSupportedAnnotationTypes() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getSupportedAnnotationTypes()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.annotation.processing.Processor#getCompletions(javax.lang.model.element.Element, javax.lang.model.element.AnnotationMirror, javax.lang.model.element.ExecutableElement, String)
     * public abstract java.lang.Iterable<? extends javax.annotation.processing.Completion>
     * javax.annotation.processing.Processor.getCompletions(javax.lang.model.element.Element,javax.lang.model.element.AnnotationMirror,javax.lang.model.element.ExecutableElement,java.lang.String)}
     * .
     *
     * <p>
     * Test method for
     * {@link javax.annotation.processing.Processor#getCompletions(javax.lang.model.element.Element, javax.lang.model.element.AnnotationMirror, javax.lang.model.element.ExecutableElement, String)
     * public abstract java.lang.Iterable
     * javax.annotation.processing.Processor.getCompletions(javax.lang.model.element.Element,javax.lang.model.element.AnnotationMirror,javax.lang.model.element.ExecutableElement,java.lang.String)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.annotation.processing.Processor#getCompletions(javax.lang.model.element.Element,
     *      javax.lang.model.element.AnnotationMirror, javax.lang.model.element.ExecutableElement, String) public
     *      abstract java.lang.Iterable
     *      javax.annotation.processing.Processor.getCompletions(javax.lang.model.element.Element,javax.lang.model.
     *      element.AnnotationMirror,javax.lang.model.element.ExecutableElement,java.lang.String) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getCompletions_Element_AnnotationMirror_ExecutableElement_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.annotation.processing.Processor#init(javax.annotation.processing.ProcessingEnvironment) public
     * abstract void javax.annotation.processing.Processor.init(javax.annotation.processing.ProcessingEnvironment)}.
     *
     * <p>
     * Test method for
     * {@link javax.annotation.processing.Processor#init(javax.annotation.processing.ProcessingEnvironment) public
     * abstract void javax.annotation.processing.Processor.init(javax.annotation.processing.ProcessingEnvironment)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.annotation.processing.Processor#init(javax.annotation.processing.ProcessingEnvironment) public
     *      abstract void javax.annotation.processing.Processor.init(javax.annotation.processing.ProcessingEnvironment)
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_init_ProcessingEnvironment()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.annotation.processing.Processor#process(java.util.Set, javax.annotation.processing.RoundEnvironment)
     * public abstract boolean javax.annotation.processing.Processor.process(java.util.Set<? extends
     * javax.lang.model.element.TypeElement>,javax.annotation.processing.RoundEnvironment)}.
     *
     * <p>
     * Test method for
     * {@link javax.annotation.processing.Processor#process(java.util.Set, javax.annotation.processing.RoundEnvironment)
     * public abstract boolean
     * javax.annotation.processing.Processor.process(java.util.Set,javax.annotation.processing.RoundEnvironment)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.annotation.processing.Processor#process(java.util.Set, javax.annotation.processing.RoundEnvironment)
     *      public abstract boolean
     *      javax.annotation.processing.Processor.process(java.util.Set,javax.annotation.processing.RoundEnvironment)
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_process_Set_RoundEnvironment()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
