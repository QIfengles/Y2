package com.sz.old.been;

/**
 * 狗狗类
 */
public class Dog {

    private String name;
    private Integer age;
    private Integer health;
    private String colour;


    /**
     * 为属性封装
     * @return
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getHealth() {
        return health;
    }

    public void setHealth(Integer health) {
        this.health = health;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }


    @Override
    public String toString() {
        return "dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", health=" + health +
                ", colour='" + colour + '\'' +
                '}';
    }
}
