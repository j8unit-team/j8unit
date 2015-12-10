package org.j8unit.repository.javax.lang.model.element;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PackageElementClassTest
implements org.j8unit.repository.javax.lang.model.element.PackageElementClassTests<javax.lang.model.element.PackageElement> {

    @Override
    public Class<javax.lang.model.element.PackageElement> createNewSUT() {
        return javax.lang.model.element.PackageElement.class;
    }

}
