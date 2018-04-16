package com.skillsup.main;


import com.skillsup.DAO.repo.UserDAO;
import com.skillsup.DAO.repo.impl.UserDAOImpl;
import com.skillsup.services.DTO.UserDTO;
import com.skillsup.services.ProductService;
import com.skillsup.services.UserServices;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class Main {
    public static void main(String[] args) throws IOException {
        ApplicationContext applicationContext = new GenericXmlApplicationContext("context-main.xml");
        UserServices userServices = applicationContext.getBean(UserServices.class);
        //UserServices productServices = applicationContext.getBean(ProductService.class);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        boolean result = true;
        while (result){
            String line = reader.readLine();
            args = line.split(" ");
            switch (args[0]){
                case "C":
                    UserDTO userDTO = new UserDTO(args[1],args[2],Integer.parseInt(args[3]));
                    userServices.create(userDTO);
                    break;
                case "L":
                    UserDAOImpl userDAO = applicationContext.getBean(UserDAOImpl.class);
                    System.out.println(userDAO.findAll());
                    break;
                default:
                    if(line.equals("exit")){
                        result = false;
                        System.out.println("go out");
                    }else{
                        System.out.println("НЕПОНЯТНО");
                    }
            }
        }


    }
}
