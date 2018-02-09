/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rakib.controller;

import com.rakib.model.Student;
import com.rakib.util.HibernateUtil;
import org.hibernate.Session;

/**
 *
 * @author Rakib
 */
public class StudentEntry {

    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Student student = new Student("Rakib", 1);
        session.save(student);
        session.getTransaction().commit();
        session.close();
    }
}
