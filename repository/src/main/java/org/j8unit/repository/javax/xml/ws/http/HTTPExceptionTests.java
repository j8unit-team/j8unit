package org.j8unit.repository.javax.xml.ws.http;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link javax.xml.ws.http.HTTPException class javax.xml.ws.http.HTTPException},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.xml.ws.http.HTTPExceptionClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface HTTPExceptionTests<SUT extends javax.xml.ws.http.HTTPException>
extends org.j8unit.repository.javax.xml.ws.ProtocolExceptionTests<SUT>
{

    /**
     * <p>
     * Test method for {@link javax.xml.ws.http.HTTPException#getStatusCode() public int javax.xml.ws.http.HTTPException.getStatusCode()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getStatusCode() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
