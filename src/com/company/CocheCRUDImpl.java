package com.company;

public class CocheCRUDImpl implements CocheCRUD{
    @Override
    public void save() {
        System.out.println("Método Guardar.");
    }

    @Override
    public void findAll() {
        System.out.println("Metodo retornar todos.");
    }

    @Override
    public void delete() {
        System.out.println("Método borrar.");
    }
}
