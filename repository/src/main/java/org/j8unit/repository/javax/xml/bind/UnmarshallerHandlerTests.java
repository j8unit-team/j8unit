package org.j8unit.repository.javax.xml.bind;

import javax.xml.bind.UnmarshallerHandler;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.j8unit.repository.org.xml.sax.ContentHandlerTests;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
 * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test
 * {@link UnmarshallerHandler public abstract interface javax.xml.bind.UnmarshallerHandler}.
 * </p>
 *
 * <p>
 * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints. For
 * this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects (see
 * {@link org.j8unit.repository.javax.xml.bind.UnmarshallerHandlerClassTests}).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface UnmarshallerHandlerTests<SUT extends UnmarshallerHandler>
extends ContentHandlerTests<SUT> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.bind.UnmarshallerHandler]

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link javax.xml.bind.UnmarshallerHandler#getResult()
     * public abstract java.lang.Object javax.xml.bind.UnmarshallerHandler.getResult() throws
     * javax.xml.bind.JAXBException,java.lang.IllegalStateException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getResult()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.bind.UnmarshallerHandler]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.bind.UnmarshallerHandler]

}
