package org.j8unit.repository.javax.xml.validation;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TypeInfoProviderClassTest
implements org.j8unit.repository.javax.xml.validation.TypeInfoProviderClassTests<javax.xml.validation.TypeInfoProvider> {

    @Override
    public Class<javax.xml.validation.TypeInfoProvider> createNewSUT() {
        return javax.xml.validation.TypeInfoProvider.class;
    }

}
