package org.j8unit.tools;

import static java.util.Arrays.deepHashCode;
import java.lang.reflect.Type;

public class TypeImplementation
implements Type {

    private final String name;

    public TypeImplementation(final String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }

    @Override
    public boolean equals(final Object obj) {
        if (obj instanceof Type) {
            final Type that = (Type) obj;
            if (this == that) {
                return true;
            } else {
                return (this.getTypeName() == null ? that.getTypeName() == null : this.getTypeName().equals(that.getTypeName()));
            }
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return deepHashCode(new Object[] { this.getTypeName() });
    }
}
