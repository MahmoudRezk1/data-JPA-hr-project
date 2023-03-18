package com.global.hr.datajpahrproject.config;

import com.global.hr.datajpahrproject.entity.Role;
import com.global.hr.datajpahrproject.entity.User;
import com.global.hr.datajpahrproject.service.RoleService;
import com.global.hr.datajpahrproject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

@Component
public class AppStartUp implements CommandLineRunner {
    @Autowired
    private UserService userService;
    @Autowired
    private RoleService roleService;
    @Override
    public void run(String... args) throws Exception {
        if (userService.findAll().isEmpty()) {
//        create roles
            Role role1 = new Role();
            role1.setName("admin");

            Role role2 = new Role();
            role2.setName("user");

            roleService.insert(role1);
            roleService.insert(role2);

            Set<Role> adminRole = new HashSet<>();
            adminRole.add(role1);
            Set<Role> userRole = new HashSet<>();
            userRole.add(role2);

//        create users
            User user1 = new User();
            user1.setUserName("Admin");
            user1.setPassword("123");
            user1.setRoles(adminRole);

            userService.insert(user1);

            User user2 = new User();
            user2.setUserName("User");
            user2.setPassword("456");
            user2.setRoles(userRole);

            userService.insert(user2);
        }
    }
}
