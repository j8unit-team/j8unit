package org.j8unit.repository.javax.xml.crypto.dsig;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link javax.xml.crypto.dsig.SignatureProperty interface javax.xml.crypto.dsig.SignatureProperty},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.xml.crypto.dsig.SignaturePropertyClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface SignaturePropertyTests<SUT extends javax.xml.crypto.dsig.SignatureProperty>
extends org.j8unit.repository.javax.xml.crypto.XMLStructureTests<SUT>
{

    /**
     * <p>
     * Test method for {@link javax.xml.crypto.dsig.SignatureProperty#getContent() public abstract java.util.List javax.xml.crypto.dsig.SignatureProperty.getContent()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getContent() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.crypto.dsig.SignatureProperty#getTarget() public abstract java.lang.String javax.xml.crypto.dsig.SignatureProperty.getTarget()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getTarget() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.crypto.dsig.SignatureProperty#getId() public abstract java.lang.String javax.xml.crypto.dsig.SignatureProperty.getId()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getId() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
