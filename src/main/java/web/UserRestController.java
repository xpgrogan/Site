package web;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.google.gson.Gson;

import service.UserService;
import beans.User;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/home")
public class UserRestController {

    @Autowired
    UserService us = new UserService();

//    @RequestMapping(value = "/", method = RequestMethod.GET)
//    public String getDefaultUser(ModelMap model) {
//
//        model.addAttribute("fName", "xavier");
//        model.addAttribute("lName", "grogan");
//        return "list";
//
//    }
    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public List getAllUsers()
    {
        List usersList = us.getAllUsers();
        return usersList;
    }

//    @RequestMapping(method=RequestMethod.GET)
//    public @ResponseBody String login_JSON( @RequestBody String[] credentials, ModelMap modelMap, HttpSession session){
//        System.out.println("test");
//        User user = us.getUserById(1);
//        System.out.println("User's name: " + user.getFirst());
//        modelMap.addAttribute("userFirst", user.getFirst());
//        modelMap.addAttribute("userLast", user.getLast());
//        session.setAttribute("user", user);
//
//        if (modelMap.containsAttribute("user"))
//            System.out.println(user);
//
//        System.out.println("end of user rest controller");
//        String employeeJson = new Gson().toJson(user);
//        return employeeJson;
//    }
}
