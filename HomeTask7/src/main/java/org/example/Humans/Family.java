package org.example.Humans;



import org.example.Pets.Pet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Family {
    Human mother;
    Human father;
    List<Human> children = new ArrayList<>();
    Pet pet;

    public Family(Human mother, Human father) {
        this.mother = mother;
        this.father = father;
        mother.setFamily(this);
        father.setFamily(this);
    }

    public Family(Human mother, Human father, Pet pet, List<Human>  children) {
        this.mother = mother;
        this.father = father;
        mother.setFamily(this);
        father.setFamily(this);
        this.pet = pet;
        pet.setFamily(this);
        this.children = children;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Family family = (Family) o;
        return Objects.equals(mother, family.mother) && Objects.equals(father, family.father) && Arrays.equals(children, family.children) && Objects.equals(pet, family.pet);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(mother, father, pet);
        result = 31 * result + children.hashCode();
        return result;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public void setChildren(List<Human>  children) {
        this.children = children;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Human getMother() {
        return mother;
    }

    public Human getFather() {
        return father;
    }

    public List<Human>  getChildren() {
        return children;
    }

    public Pet getPet() {
        return pet;
    }

    public void addChild(Human child) {
       children.add(child);
    }

    public boolean deleteChild(int index) {
        children.remove(index); // ожидает булен а у меня дженерик
    }
    public boolean deleteChild(Human human){
        children.remove(human);  // ожидает булен а у меня дженерик
    }


    public int countFamily() {
        if (pet != null){
            return 3 + children.size();
        }
        return 2 + children.size();
    }

    @Override
    public String toString() {
        return "Family{" +
                "\nmother=" + mother +
                ",\nfather=" + father +
                ",\nchildren=" + children.toString() +
                ",\npet=" + pet +
                '}';
    }

    @Override
    protected void finalize() {
        System.out.println(this);
    }

}