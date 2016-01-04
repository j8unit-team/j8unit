package org.j8unit.tools;

import static java.util.Arrays.deepHashCode;
import static java.util.Objects.requireNonNull;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;

final class ParameterizedTypeImplementation
implements ParameterizedType {

    private final Type raw;

    private final Type owner;

    private final Type[] arguments;

    public ParameterizedTypeImplementation(final Type raw, final Type owner, final Type... arguments) {
        this.raw = requireNonNull(raw);
        this.arguments = requireNonNull(arguments);
        this.owner = owner;
    }

    @Override
    public Type getRawType() {
        return this.raw;
    }

    @Override
    public Type getOwnerType() {
        return this.owner;
    }

    @Override
    public Type[] getActualTypeArguments() {
        return this.arguments.clone();
    }

    @Override
    public boolean equals(final Object obj) {
        if (obj instanceof ParameterizedType) {
            final ParameterizedType that = (ParameterizedType) obj;
            if (this == that) {
                return true;
            } else {
                return (this.getOwnerType() == null ? that.getOwnerType() == null : this.getOwnerType().equals(that.getOwnerType()))
                       && (this.getRawType() == null ? that.getRawType() == null : this.getRawType().equals(that.getRawType()))
                       && Arrays.equals(this.getActualTypeArguments(), that.getActualTypeArguments());
            }
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return deepHashCode(new Object[] { this.getRawType(), this.getActualTypeArguments(), this.getOwnerType() });
    }
}
