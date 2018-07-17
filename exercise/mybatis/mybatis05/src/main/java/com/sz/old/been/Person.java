package com.sz.old.been;

/**
 * 上机练习
 */
public class Person {
    //说话的人
    private String name_person;
    //说话的内容
    private String words_person;

    public String getName_person() {
        return name_person;
    }

    public void setName_person(String name_person) {
        this.name_person = name_person;
    }

    public String getWords_person() {
        return words_person;
    }

    public void setWords_person(String words_person) {
        this.words_person = words_person;
    }

    @Override
    public String toString() {
        return "person{" +
                "name_person='" + name_person + '\'' +
                ", words_person='" + words_person + '\'' +
                '}';
    }
}
