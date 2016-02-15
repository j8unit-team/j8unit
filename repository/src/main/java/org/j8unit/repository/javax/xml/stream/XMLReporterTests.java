package org.j8unit.repository.javax.xml.stream;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.xml.stream.XMLReporter interface javax.xml.stream.XMLReporter}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link XMLReporterClassTests}.
 * </p>
 *
 * @see javax.xml.stream.XMLReporter interface javax.xml.stream.XMLReporter (the hereby targeted class-under-test class)
 * @see XMLReporterClassTests XMLReporterClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface XMLReporterTests<SUT extends javax.xml.stream.XMLReporter>
extends RepositoryTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.xml.stream.XMLReporter#report(String, String, Object, javax.xml.stream.Location)
     * public abstract void
     * javax.xml.stream.XMLReporter.report(java.lang.String,java.lang.String,java.lang.Object,javax.xml.stream.Location)
     * throws javax.xml.stream.XMLStreamException}.
     *
     * <p>
     * Test method for {@link javax.xml.stream.XMLReporter#report(String, String, Object, javax.xml.stream.Location)
     * public abstract void
     * javax.xml.stream.XMLReporter.report(java.lang.String,java.lang.String,java.lang.Object,javax.xml.stream.Location)
     * throws javax.xml.stream.XMLStreamException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.stream.XMLReporter#report(String, String, Object, javax.xml.stream.Location) public abstract void
     *      javax.xml.stream.XMLReporter.report(java.lang.String,java.lang.String,java.lang.Object,javax.xml.stream.
     *      Location) throws javax.xml.stream.XMLStreamException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_report_String_String_Object_Location()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
