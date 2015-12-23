package org.j8unit.repository.javax.sql.rowset.spi;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.sql.rowset.spi.XmlWriter interface
 * javax.sql.rowset.spi.XmlWriter}, containing all instance relevant test methods (i.&thinsp;e., test methods of non-
 * {@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.javax.sql.rowset.spi.XmlWriterTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.sql.rowset.spi.XmlWriterClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.sql.rowset.spi.XmlWriter
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface XmlWriterTests<SUT extends javax.sql.rowset.spi.XmlWriter>
extends org.j8unit.repository.javax.sql.RowSetWriterTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.sql.rowset.spi.XmlWriter#writeXML(javax.sql.rowset.WebRowSet, java.io.Writer) public
     * abstract void javax.sql.rowset.spi.XmlWriter.writeXML(javax.sql.rowset.WebRowSet,java.io.Writer) throws
     * java.sql.SQLException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.sql.rowset.spi.XmlWriter#writeXML(javax.sql.rowset.WebRowSet, java.io.Writer)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_writeXML_WebRowSet_Writer()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
