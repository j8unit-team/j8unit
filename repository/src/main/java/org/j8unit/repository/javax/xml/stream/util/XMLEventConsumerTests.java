package org.j8unit.repository.javax.xml.stream.util;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link javax.xml.stream.util.XMLEventConsumer interface javax.xml.stream.util.XMLEventConsumer},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.xml.stream.util.XMLEventConsumerClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface XMLEventConsumerTests<SUT extends javax.xml.stream.util.XMLEventConsumer>
extends J8UnitTest<SUT>
{

    /**
     * <p>
     * Test method for {@link javax.xml.stream.util.XMLEventConsumer#add(javax.xml.stream.events.XMLEvent) public abstract void javax.xml.stream.util.XMLEventConsumer.add(javax.xml.stream.events.XMLEvent) throws javax.xml.stream.XMLStreamException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_add_XMLEvent() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
