package org.j8unit.repository.javax.xml.bind.util;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link javax.xml.bind.util.JAXBResult class javax.xml.bind.util.JAXBResult},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.xml.bind.util.JAXBResultClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface JAXBResultTests<SUT extends javax.xml.bind.util.JAXBResult>
extends org.j8unit.repository.javax.xml.transform.sax.SAXResultTests<SUT>
{

    /**
     * <p>
     * Test method for {@link javax.xml.bind.util.JAXBResult#getResult() public java.lang.Object javax.xml.bind.util.JAXBResult.getResult() throws javax.xml.bind.JAXBException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getResult() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
