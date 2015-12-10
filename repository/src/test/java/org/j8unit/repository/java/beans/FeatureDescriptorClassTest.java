package org.j8unit.repository.java.beans;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class FeatureDescriptorClassTest
implements org.j8unit.repository.java.beans.FeatureDescriptorClassTests<java.beans.FeatureDescriptor> {

    @Override
    public Class<java.beans.FeatureDescriptor> createNewSUT() {
        return java.beans.FeatureDescriptor.class;
    }

}
