package com.company.vetor;


import java.lang.reflect.Array;

public class Vetor<T> {

    private T[] elements;
    private static int size;

    public Vetor(int capacity){
        this.elements = (T[]) new Object[capacity]; // solution of the book java effective
        this.size = 0;
    }
    public Vetor(int capacity, Class<T> typeClass){
        this.elements = (T[]) Array.newInstance(typeClass, capacity); // solution using reflection
        size = 0;
    }
    public boolean add(T element){
        increaseCapacity();
        if(size < this.elements.length){
            this.elements[size()] = element;
            size++;
            return true;
        }
        return false;
    }

    /**
     * Esse método foi feito para adicionar o valor em qualquer posição do vetor já preenchido.
     * Ele adiciona o elemento na posição certa e ajusta o vetor
     * Caso queria adicionar um elemento na última posição do vetor, temos o método add(String element)
     * @param position
     * @param element
     * @return
     */
    public boolean add(int position, T element){
        validatePosition(position);
        increaseCapacity();
        for (int i = size-1; i>= position;i--){
            this.elements[i + 1] = this.elements[i];
        };
        this.elements[position] = element;
        size++;
        return true;
    }

    private void increaseCapacity() {
        if(size == this.elements.length){
            Object[] newVetor= new Object[this.elements.length * 2]; // duplicamos a capacidade do vetor, pois é algo custoso de se fazer e não queremos fazer isso sempre
            for (int i = 0; i< size();i++){
                newVetor[i] = this.elements[i];
            }
            this.elements = (T[]) newVetor;
        }
    }

    public int size(){
        return size;
    }

    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append("[");

        for (int i = 0; i < size()-1; i++){
            builder.append(this.elements[i]);
            builder.append(", ");
        }
        if(size() > 0){
            builder.append(this.elements[size()-1]);
        }
        builder.append("]");
        return builder.toString();
    }

    public Object get(int position){
        validatePosition(position);
        return this.elements[position];

    }
    public int indexOf(T value){
        for (int i = 0; i < size();i++){
            if (this.elements[i].equals(value))
                return i;
        }
        return -1;
    }
    public int lastIndexOf(T value){
        int position = -1;
        for (int i = 0; i < size();i++){
            if (this.elements[i].equals(value))
                position = i;
        }
        return position;
    }
    public boolean contains(T value){
        return indexOf(value) > -1;
    }

    public void remove(int position){
        validatePosition(position);
        for(int i = position; i < size()-1; i++) {
            this.elements[i] = this.elements[i + 1];
        }
        size--;
    }
    public boolean remove(T value){
        int position = indexOf(value);
        if (position > -1){
            remove(position);
            return true;
        }
        return false;
    }
    public void clean(){
        for (int i = size() - 1; i >=0;i--){
            this.elements[i] = null;
        }
        size = 0;
    }

    public void validatePosition(int position){
        if(!(position >= 0 && position < size()))
            throw new IllegalArgumentException("position invalid");
    }

    public int lenght(){
        return this.elements.length;
    }
}
