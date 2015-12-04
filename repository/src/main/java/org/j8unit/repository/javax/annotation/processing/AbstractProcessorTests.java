package org.j8unit.repository.javax.annotation.processing;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link javax.annotation.processing.AbstractProcessor class javax.annotation.processing.AbstractProcessor},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.annotation.processing.AbstractProcessorClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface AbstractProcessorTests<SUT extends javax.annotation.processing.AbstractProcessor>
extends org.j8unit.repository.javax.annotation.processing.ProcessorTests<SUT>,
        org.j8unit.repository.java.lang.ObjectTests<SUT>
{

    /**
     * <p>
     * Test method for {@link javax.annotation.processing.AbstractProcessor#getCompletions(javax.lang.model.element.Element,javax.lang.model.element.AnnotationMirror,javax.lang.model.element.ExecutableElement,java.lang.String) public java.lang.Iterable javax.annotation.processing.AbstractProcessor.getCompletions(javax.lang.model.element.Element,javax.lang.model.element.AnnotationMirror,javax.lang.model.element.ExecutableElement,java.lang.String)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_getCompletions_Element_AnnotationMirror_ExecutableElement_String() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.annotation.processing.AbstractProcessor#getSupportedAnnotationTypes() public java.util.Set javax.annotation.processing.AbstractProcessor.getSupportedAnnotationTypes()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_getSupportedAnnotationTypes() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.annotation.processing.AbstractProcessor#init(javax.annotation.processing.ProcessingEnvironment) public synchronized void javax.annotation.processing.AbstractProcessor.init(javax.annotation.processing.ProcessingEnvironment)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_init_ProcessingEnvironment() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.annotation.processing.AbstractProcessor#process(java.util.Set,javax.annotation.processing.RoundEnvironment) public abstract boolean javax.annotation.processing.AbstractProcessor.process(java.util.Set,javax.annotation.processing.RoundEnvironment)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_process_Set_RoundEnvironment() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.annotation.processing.AbstractProcessor#getSupportedOptions() public java.util.Set javax.annotation.processing.AbstractProcessor.getSupportedOptions()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_getSupportedOptions() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.annotation.processing.AbstractProcessor#getSupportedSourceVersion() public javax.lang.model.SourceVersion javax.annotation.processing.AbstractProcessor.getSupportedSourceVersion()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_getSupportedSourceVersion() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
