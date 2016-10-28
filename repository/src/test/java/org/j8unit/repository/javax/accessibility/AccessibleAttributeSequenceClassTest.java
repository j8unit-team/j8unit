package org.j8unit.repository.javax.accessibility;

import javax.accessibility.AccessibleAttributeSequence;
import javax.swing.text.AttributeSet;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AccessibleAttributeSequenceClassTest
implements org.j8unit.repository.javax.accessibility.AccessibleAttributeSequenceClassTests<AccessibleAttributeSequence> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.accessibility.AccessibleAttributeSequence]

    @Override
    public Class<AccessibleAttributeSequence> createNewSUT() {
        return AccessibleAttributeSequence.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link AccessibleAttributeSequence#AccessibleAttributeSequence(int, int, AttributeSet) public
     * javax.accessibility.AccessibleAttributeSequence(int,int,javax.swing.text.AttributeSet)}.
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
    public void create_AccessibleAttributeSequence_int_int_AttributeSet()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final AccessibleAttributeSequence sut = null; // = new AccessibleAttributeSequence(int, int, AttributeSet);
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.accessibility.AccessibleAttributeSequence]

}
