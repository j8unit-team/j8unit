package org.j8unit.repository.javax.xml.crypto.dsig.keyinfo;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link javax.xml.crypto.dsig.keyinfo.KeyValue interface javax.xml.crypto.dsig.keyinfo.KeyValue},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.xml.crypto.dsig.keyinfo.KeyValueClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface KeyValueTests<SUT extends javax.xml.crypto.dsig.keyinfo.KeyValue>
extends org.j8unit.repository.javax.xml.crypto.XMLStructureTests<SUT>
{

    /**
     * <p>
     * Test method for {@link javax.xml.crypto.dsig.keyinfo.KeyValue#getPublicKey() public abstract java.security.PublicKey javax.xml.crypto.dsig.keyinfo.KeyValue.getPublicKey() throws java.security.KeyException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getPublicKey() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
