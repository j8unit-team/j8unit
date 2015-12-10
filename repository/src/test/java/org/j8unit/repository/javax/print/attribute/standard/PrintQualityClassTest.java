package org.j8unit.repository.javax.print.attribute.standard;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PrintQualityClassTest
implements org.j8unit.repository.javax.print.attribute.standard.PrintQualityClassTests<javax.print.attribute.standard.PrintQuality> {

    @Override
    public Class<javax.print.attribute.standard.PrintQuality> createNewSUT() {
        return javax.print.attribute.standard.PrintQuality.class;
    }

}
