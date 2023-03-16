package org.example;

public class Cat {
    private String name;
    private String catBreed;


    public String catBreed(){
        return catBreed;
    }

    public void setCatBreed(String catBreed) {
        this.catBreed = catBreed;
    }

    public String getCatBreed() {
        return catBreed;
    }

    public Cat(String name, String catBreed) {
        this.name = name;
        this.catBreed = catBreed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", catBreed='" + catBreed + '\'' +
                '}';
    }
}
