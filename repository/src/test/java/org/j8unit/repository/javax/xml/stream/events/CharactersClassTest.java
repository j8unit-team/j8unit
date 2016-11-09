package org.j8unit.repository.javax.xml.stream.events;

import javax.xml.stream.events.Characters;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Characters} (by simply reusing the J8Unit
 * test interface {@link CharactersClassTests}).
 */

@RunWith(J8Unit4.class)
public class CharactersClassTest
implements CharactersClassTests<Characters> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.stream.events.Characters]

    @Override
    public Class<Characters> createNewSUT() {
        return Characters.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.stream.events.Characters]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.stream.events.Characters]

}
