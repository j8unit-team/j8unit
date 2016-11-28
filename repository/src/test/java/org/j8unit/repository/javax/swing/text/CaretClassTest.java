package org.j8unit.repository.javax.swing.text;

import javax.swing.text.Caret;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Caret} (by simply reusing the J8Unit test
 * interface {@link org.j8unit.repository.javax.swing.text.CaretClassTests}).
 */
@RunWith(J8Unit4.class)
public class CaretClassTest
implements CaretClassTests<Caret> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.text.Caret]

    @Override
    public Class<Caret> createNewSUT() {
        return Caret.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.text.Caret]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.text.Caret]

}
