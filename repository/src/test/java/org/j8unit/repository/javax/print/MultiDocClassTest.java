package org.j8unit.repository.javax.print;

import javax.print.MultiDoc;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link MultiDoc} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.javax.print.MultiDocClassTests}).
 */
@RunWith(J8Unit4.class)
public class MultiDocClassTest
implements MultiDocClassTests<MultiDoc> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.print.MultiDoc]

    @Override
    public Class<MultiDoc> createNewSUT() {
        return MultiDoc.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.print.MultiDoc]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.print.MultiDoc]

}
