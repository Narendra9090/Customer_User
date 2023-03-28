package com.example.Customer_User.Controller;

import com.example.Customer_User.Model.User;
import com.example.Customer_User.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {


    @Autowired
    UserService service;

    //C- create or insert

    @PostMapping("/add_user")
    public String add(@RequestBody User user){

        return service.add(user);
    }

    //READ

    @GetMapping("/get_all_user") //@RequestMapping(value = "/get_all_user", method = RequestMethod.GET)
    public List<User> getAll(){

        return service.getAll();
    }

    //UPDATE

    @PutMapping("/update_user_db")// @RequestMapping(value = "/update_user_db", method = RequestMethod.PUT)
    public String update(@RequestParam long id, @RequestParam String name){

        return service.update(id,name);
    }

    //DELETE

    @DeleteMapping("/delete_user_db/{id}")//@RequestMapping(value = "/delete_user_db/{id}", method = RequestMethod.DELETE)
    public String delete(@PathVariable long id){

        return service.delete(id);
    }
}
