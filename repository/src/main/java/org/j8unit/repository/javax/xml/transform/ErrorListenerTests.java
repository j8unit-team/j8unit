package org.j8unit.repository.javax.xml.transform;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link javax.xml.transform.ErrorListener interface javax.xml.transform.ErrorListener},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.xml.transform.ErrorListenerClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface ErrorListenerTests<SUT extends javax.xml.transform.ErrorListener>
extends J8UnitTest<SUT>
{

    /**
     * <p>
     * Test method for {@link javax.xml.transform.ErrorListener#error(javax.xml.transform.TransformerException) public abstract void javax.xml.transform.ErrorListener.error(javax.xml.transform.TransformerException) throws javax.xml.transform.TransformerException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_error_TransformerException() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.transform.ErrorListener#warning(javax.xml.transform.TransformerException) public abstract void javax.xml.transform.ErrorListener.warning(javax.xml.transform.TransformerException) throws javax.xml.transform.TransformerException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_warning_TransformerException() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.transform.ErrorListener#fatalError(javax.xml.transform.TransformerException) public abstract void javax.xml.transform.ErrorListener.fatalError(javax.xml.transform.TransformerException) throws javax.xml.transform.TransformerException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_fatalError_TransformerException() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
