package org.j8unit.repository.java.beans;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class FeatureDescriptorTest
implements org.j8unit.repository.java.beans.FeatureDescriptorTests<java.beans.FeatureDescriptor> {

    @Override
    public java.beans.FeatureDescriptor createNewSUT() {
        return new java.beans.FeatureDescriptor();
    }

}
