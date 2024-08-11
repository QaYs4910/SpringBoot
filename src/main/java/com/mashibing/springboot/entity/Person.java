package com.mashibing.springboot.entity;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

@Component //加入容器
@ConfigurationProperties(prefix = "person") //读取配置
public class Person {


    private String name;
    private Integer age;
    private String sex;
    private List<String> likes;


    public Person() {
    }

    public Person(String name, Integer age, String sex, List<String> likes) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.likes = likes;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    public List<String> getLikes() {
        return likes;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setLikes(List<String> likes) {
        this.likes = likes;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", likes=" + likes +
                '}';
    }
}
