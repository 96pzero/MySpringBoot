package com.zero.bean;

import org.hibernate.validator.constraints.Email;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import java.util.Date;
import java.util.List;
import java.util.Map;
@Component
@Validated //不支持校验
public class Person2 {

    /**
     * 相当于
     * <bean class="Person">
     *      <property name="lastName" value="字面量/${key}从环境变量,配置文件中获取值/#{SpEL}"></property>
     * </bean>
     */
    @Email //此处并没有校验邮箱格式
    @Value("${person.last-name}")//一对一模式，对属性名写法要求严
    private String lastName;
    @Value("#{11 * 2}")//支持SpEL
    private Integer age;
    @Value("true")
    private Boolean boss;
    private Date birth;
    /**
     * @Value("${person.maps.k1}")
     * 不支持复杂模式
     */
    private Map<String,Object> maps;
    private List<Object> lists;
    private Dog dog;

    @Override
    public String toString() {
        return "Person2{" +
                "lastName='" + lastName + '\'' +
                ", age=" + age +
                ", boss=" + boss +
                ", birth=" + birth +
                ", maps=" + maps +
                ", lists=" + lists +
                ", dog=" + dog +
                '}';
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Boolean getBoss() {
        return boss;
    }

    public void setBoss(Boolean boss) {
        this.boss = boss;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public Map<String, Object> getMaps() {
        return maps;
    }

    public void setMaps(Map<String, Object> maps) {
        this.maps = maps;
    }

    public List<Object> getLists() {
        return lists;
    }

    public void setLists(List<Object> lists) {
        this.lists = lists;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }
}
