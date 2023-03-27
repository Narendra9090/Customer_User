package com.example.Customer_User.Service;

import com.example.Customer_User.Model.User;
import com.example.Customer_User.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository repository;

    //CREATE OR INSERT
    public String add(User user){

        repository.save(user);// insert to db

        return "Successfully Saved to Database";
    }


    public List<User> getAll(){

        return repository.findAll();// select * from User

    }

    public String update(long id, String name){

        //STEP 1
        User user= repository.getById(id); // it will trigger select * from table where id="id"

        //STEP 2

        user.setFirst_name(name);
        repository.save(user);// insert the data with modified name

        return "Successfully Updated name as "+name;
    }


    public String delete(long id){

        repository.deleteById(id);// delete from table id="id"

        return "Successfully deleted ";
    }


}
