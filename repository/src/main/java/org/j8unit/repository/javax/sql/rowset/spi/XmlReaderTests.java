package org.j8unit.repository.javax.sql.rowset.spi;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link javax.sql.rowset.spi.XmlReader interface javax.sql.rowset.spi.XmlReader},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.sql.rowset.spi.XmlReaderClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface XmlReaderTests<SUT extends javax.sql.rowset.spi.XmlReader>
extends org.j8unit.repository.javax.sql.RowSetReaderTests<SUT>
{

    /**
     * <p>
     * Test method for {@link javax.sql.rowset.spi.XmlReader#readXML(javax.sql.rowset.WebRowSet,java.io.Reader) public abstract void javax.sql.rowset.spi.XmlReader.readXML(javax.sql.rowset.WebRowSet,java.io.Reader) throws java.sql.SQLException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_readXML_WebRowSet_Reader() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
