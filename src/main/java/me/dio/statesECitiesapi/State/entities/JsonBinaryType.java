package me.dio.statesECitiesapi.State.entities;

import org.hibernate.mapping.TypeDef;

import java.lang.annotation.Annotation;

public class JsonBinaryType extends TypeDef {

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public Class<JsonBinaryType> typeClass() {
        return null;
    }

    @Override
    public String name() {
        return null;
    }

    @Override
    public boolean equals(Object obj) {
        return false;
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public String toString() {
        return null;
    }

    @Override
    public Class<? extends Annotation> annotationType() {
        return null;
    }
}
