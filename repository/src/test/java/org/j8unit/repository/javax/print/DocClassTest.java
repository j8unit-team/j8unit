package org.j8unit.repository.javax.print;

import javax.print.Doc;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Doc} (by simply reusing the J8Unit test
 * interface {@link org.j8unit.repository.javax.print.DocClassTests}).
 */

@RunWith(J8Unit4.class)
public class DocClassTest
implements org.j8unit.repository.javax.print.DocClassTests<Doc> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.print.Doc]

    @Override
    public Class<Doc> createNewSUT() {
        return Doc.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.print.Doc]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.print.Doc]

}
