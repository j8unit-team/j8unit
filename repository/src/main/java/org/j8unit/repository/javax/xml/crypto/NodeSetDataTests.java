package org.j8unit.repository.javax.xml.crypto;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link javax.xml.crypto.NodeSetData interface javax.xml.crypto.NodeSetData},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.xml.crypto.NodeSetDataClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface NodeSetDataTests<SUT extends javax.xml.crypto.NodeSetData>
extends org.j8unit.repository.javax.xml.crypto.DataTests<SUT>
{

    /**
     * <p>
     * Test method for {@link javax.xml.crypto.NodeSetData#iterator() public abstract java.util.Iterator javax.xml.crypto.NodeSetData.iterator()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_iterator() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
