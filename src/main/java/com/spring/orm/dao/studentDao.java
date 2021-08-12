package com.spring.orm.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.spring.orm.entities.student;

public class studentDao {
private HibernateTemplate hibernatetemplate;

@Transactional
	public int insert(student stud)
	{
		Integer i=(Integer)this.hibernatetemplate.save(stud);
		return i;
	}

//get the single data
public student getStudent(int sid)
{
	return this.hibernatetemplate.get(student.class,sid);
}
//get multiple data
public List<student> getAllStudent()
{
	return this.hibernatetemplate.loadAll(student.class);
}
@Transactional
public void deleteStudent(int sid)
{
	student st=this.hibernatetemplate.get(student.class,sid);
	 this.hibernatetemplate.delete(st);
}

//update data

@Transactional
public void updateStudent(student stud)
{
	this.hibernatetemplate.update(stud);
}

	public HibernateTemplate getHibernatetemplate() {
		return hibernatetemplate;
	}
	public void setHibernatetemplate(HibernateTemplate hibernatetemplate) {
		this.hibernatetemplate = hibernatetemplate;
	}
}
