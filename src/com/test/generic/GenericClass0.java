package com.test.generic;

public class GenericClass0<T> implements GenericInterface<T>
{
    private T prize;

    @Override
    public void set(T value) {
        prize=value ;
    }


    @Override
    public T getPrize() {
        return prize;
    }
}
