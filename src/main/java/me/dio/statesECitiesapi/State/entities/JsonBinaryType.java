package me.dio.statesECitiesapi.State.entities;

import org.hibernate.boot.model.TypeDefinition;

import java.lang.annotation.Annotation;
import java.util.Map;

public class JsonBinaryType extends TypeDefinition {

    public JsonBinaryType(String name, Class<?> typeImplementorClass, String[] registrationKeys, Map<String, String> parameters) {
        super(name, typeImplementorClass, registrationKeys, parameters);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public Class<JsonBinaryType> typeClass() {
        return null;
    }

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
    public Class<? extends Annotation> annotationType() {
        return null;
    }
}
