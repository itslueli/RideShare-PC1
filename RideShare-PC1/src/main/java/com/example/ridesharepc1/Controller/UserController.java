package com.example.ridesharepc1.Controller;

import com.example.ridesharepc1.Model.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class UserController<UsersService> {

    private final   UsersService userService;

    public UserController(UsersService userService){
        this.userService = userService;
    }
    @GetMapping
        public ResponseEntity<Page<User>> getALlUsers(
                @PageableDefault(page = 0, size = 5) Pageable pageable) {

            Page<User> usersPage= userService.getAllUsers(pageable);
            return ResponseEntity.ok(usersPage);
        }


}
