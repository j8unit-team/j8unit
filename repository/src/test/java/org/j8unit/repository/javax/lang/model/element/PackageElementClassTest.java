package org.j8unit.repository.javax.lang.model.element;

import javax.lang.model.element.PackageElement;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link PackageElement} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.lang.model.element.PackageElementClassTests}).
 */
@RunWith(J8Unit4.class)
public class PackageElementClassTest
implements PackageElementClassTests<PackageElement> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.lang.model.element.PackageElement]

    @Override
    public Class<PackageElement> createNewSUT() {
        return PackageElement.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.lang.model.element.PackageElement]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.lang.model.element.PackageElement]

}
