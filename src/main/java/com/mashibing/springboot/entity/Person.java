package com.mashibing.springboot.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

@Component //加入容器
@ConfigurationProperties(prefix = "person") //读取配置
public class Person {

//    @Value("${person.name}")
    private String LastName;
//    @Value("${person.age}")
    private Integer age;
//    @Value("${person.sex}")
    private String sex;
//    @Value("${person.likes}")
    private List<String> likes;

    public Person(String lastName, Integer age, String sex, List<String> likes) {
        LastName = lastName;
        this.age = age;
        this.sex = sex;
        this.likes = likes;
    }

    public Person() {
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
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
                "LastName='" + LastName + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", likes=" + likes +
                '}';
    }
}
