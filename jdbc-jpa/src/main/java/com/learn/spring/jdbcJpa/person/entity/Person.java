package com.learn.spring.jdbcJpa.person.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name = "find_all_person", query = "select p from Person p ")
public class Person {

	@Id
	@GeneratedValue
	Integer id;
	String name;
	Date birthday;

	public Person() {

	}

	public Person(String name, Date birthday) {
		super();
		this.name = name;
		this.birthday = birthday;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthday() {
		return this.birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	@Override
	public String toString() {
		return "\nPerson [id=" + id + ", name=" + name + ", birthday=" + birthday + "]";
	}

}
