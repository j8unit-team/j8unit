package org.j8unit.repository.javax.lang.model.element;

import javax.lang.model.element.PackageElement;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PackageElementClassTest
implements org.j8unit.repository.javax.lang.model.element.PackageElementClassTests<PackageElement> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.lang.model.element.PackageElement]

    @Override
    public Class<PackageElement> createNewSUT() {
        return PackageElement.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.lang.model.element.PackageElement]

}
