package com.example.ridesharepc1.Controller;

import com.example.ridesharepc1.Model.Users;
import com.example.ridesharepc1.Service.UsersService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class UsersController<UsersService> {

    private final   UsersService usersService;

    public UsersController(UsersService usersService){
        this.usersService = usersService;
    }
    @GetMapping
        public ResponseEntity<Page<Users>> getALlUsers(
                @PageableDefault(page = 0, size = 5) Pageable pageable) {

            Page<Users> usersPage= usersService.getAllUsers(pageable);
            return ResponseEntity.ok(usersPage);
        }


}
