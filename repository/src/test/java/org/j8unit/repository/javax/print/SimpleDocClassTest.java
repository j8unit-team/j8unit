package org.j8unit.repository.javax.print;

import javax.print.SimpleDoc;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SimpleDocClassTest
implements org.j8unit.repository.javax.print.SimpleDocClassTests<SimpleDoc> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.print.SimpleDoc]

    @Override
    public Class<SimpleDoc> createNewSUT() {
        return SimpleDoc.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.print.SimpleDoc#SimpleDoc(Object, javax.print.DocFlavor, javax.print.attribute.DocAttributeSet)
     * public javax.print.SimpleDoc(java.lang.Object,javax.print.DocFlavor,javax.print.attribute.DocAttributeSet)}.
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
    public void create_SimpleDoc_Object_DocFlavor_DocAttributeSet()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final SimpleDoc sut = null; // = new SimpleDoc(Object, javax.print.DocFlavor,
                                    // javax.print.attribute.DocAttributeSet);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.print.SimpleDoc]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.print.SimpleDoc]

}
