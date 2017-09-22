package com.chy.test;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Blob;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.engine.jdbc.LobCreator;

import com.chy.po.DataType;
import com.chy.util.HibernateUtil;


public class Test {
    public static void main(String[] args) {
        Session session=HibernateUtil.getSession();
        Transaction tr = session.beginTransaction();
        DataType dt=new DataType();
        dt.setId(1);
        File file=new File("E:/JAVAWEB.png");
        System.out.println(file.length());
        LobCreator creator = Hibernate.getLobCreator(session);
        try{
            Blob blob= (Blob) creator.createBlob(new FileInputStream(file),file.length());
            dt.setD_blob(blob);
        }catch (Exception e){
            e.printStackTrace();
        }
        session.save(dt);
        tr.commit();
        session.close();
    }
}
