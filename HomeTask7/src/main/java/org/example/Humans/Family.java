package org.example.Humans;



import org.example.Pets.Pet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Family {
    Woman mother;
    Man father;
    List<Human> children = new ArrayList<>();
    Pet pet;

    public Family(Woman mother, Man father) {
        this.mother = mother;
        this.father = father;
        mother.setFamily(this);
        father.setFamily(this);
    }

    public Family(Woman mother, Man father, Pet pet, List<Human>  children) {
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
        return Objects.equals(mother, family.mother) && Objects.equals(father, family.father) && Objects.equals(children , family.children) && Objects.equals(pet, family.pet);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(mother, father, pet);
        result = 31 * result + children.hashCode();
        return result;
    }

    public void setMother(Woman mother) {
        this.mother = mother;
    }

    public void setFather(Man father) {
        this.father = father;
    }

    public void setChildren(List<Human>  children) {
        this.children = children;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Woman getMother() {
        return mother;
    }

    public Man getFather() {
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
        if (index >= 0 && index < children.size()) {
            children.remove(index);
            return true;
        }
        return false;
    }
    public boolean deleteChild(Human human){
        return children.remove(human);
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