package org.j8unit.repository.javax.print;

import javax.print.AttributeException;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link AttributeException} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.print.AttributeExceptionClassTests}).
 */
@RunWith(J8Unit4.class)
public class AttributeExceptionClassTest
implements AttributeExceptionClassTests<AttributeException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.print.AttributeException]

    @Override
    public Class<AttributeException> createNewSUT() {
        return AttributeException.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.print.AttributeException]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.print.AttributeException]

}
