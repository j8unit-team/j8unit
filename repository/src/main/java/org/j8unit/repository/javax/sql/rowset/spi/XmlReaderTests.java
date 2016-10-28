package org.j8unit.repository.javax.sql.rowset.spi;

import java.io.Reader;
import javax.sql.rowset.WebRowSet;
import javax.sql.rowset.spi.XmlReader;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
 * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test {@link XmlReader
 * public abstract interface javax.sql.rowset.spi.XmlReader}.
 * </p>
 *
 * <p>
 * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints. For
 * this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects (see
 * {@link org.j8unit.repository.javax.sql.rowset.spi.XmlReaderClassTests}).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */

@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface XmlReaderTests<SUT extends XmlReader>
extends org.j8unit.repository.javax.sql.RowSetReaderTests<SUT> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.sql.rowset.spi.XmlReader]

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link XmlReader#readXML(WebRowSet, Reader) public abstract
     * void javax.sql.rowset.spi.XmlReader.readXML(javax.sql.rowset.WebRowSet,java.io.Reader) throws
     * java.sql.SQLException}.
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
    public default void test_readXML_WebRowSet_Reader()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.sql.rowset.spi.XmlReader]

}
