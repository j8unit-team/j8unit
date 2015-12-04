package org.j8unit.repository.javax.swing.table;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.swing.table.TableStringConverter class javax.swing.table.TableStringConverter},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.swing.table.TableStringConverterClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface TableStringConverterTests<SUT extends javax.swing.table.TableStringConverter>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.swing.table.TableStringConverter#toString(javax.swing.table.TableModel,int,int)
     * public abstract java.lang.String
     * javax.swing.table.TableStringConverter.toString(javax.swing.table.TableModel,int,int)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_toString_TableModel_int_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
