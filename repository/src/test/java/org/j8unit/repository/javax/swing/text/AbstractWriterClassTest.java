package org.j8unit.repository.javax.swing.text;

import javax.swing.text.AbstractWriter;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link AbstractWriter} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.swing.text.AbstractWriterClassTests}).
 */

@RunWith(J8Unit4.class)
public class AbstractWriterClassTest
implements AbstractWriterClassTests<AbstractWriter> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.text.AbstractWriter]

    @Override
    public Class<AbstractWriter> createNewSUT() {
        return AbstractWriter.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.text.AbstractWriter]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.text.AbstractWriter]

}
