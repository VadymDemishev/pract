package com.skillsup.main;


import com.skillsup.DAO.repo.UserDAO;
import com.skillsup.DAO.repo.impl.UserDAOImpl;
import com.skillsup.services.DTO.UserDTO;
import com.skillsup.services.UserServices;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new GenericXmlApplicationContext("context-main.xml");
        UserServices userServices = applicationContext.getBean(UserServices.class);
        UserDTO userDTO = new UserDTO(args[0],args[1],Integer.parseInt(args[2]));
        userServices.create(userDTO);
        UserDAOImpl userDAO = applicationContext.getBean(UserDAOImpl.class);
        System.out.println(userDAO.getUserMap().get(1L));
    }
}
