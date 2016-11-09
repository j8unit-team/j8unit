package org.j8unit.repository.javax.annotation.processing;

import javax.annotation.processing.Filer;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Filer} (by simply reusing the J8Unit test
 * interface {@link FilerClassTests}).
 */

@RunWith(J8Unit4.class)
public class FilerClassTest
implements FilerClassTests<Filer> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.annotation.processing.Filer]

    @Override
    public Class<Filer> createNewSUT() {
        return Filer.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.annotation.processing.Filer]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.annotation.processing.Filer]

}
