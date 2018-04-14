package com.skillsup.main;

import com.skillsup.DAO.model.User;
import javafx.application.Application;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new GenericXmlApplicationContext("context-main.xml");
        //applicationContext.getBean(User.class);
    }
}
