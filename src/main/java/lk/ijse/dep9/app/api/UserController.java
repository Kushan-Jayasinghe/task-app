package lk.ijse.dep9.app.api;


import lk.ijse.dep9.app.entity.User;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/users")

public class UserController {
    @ResponseStatus(HttpStatus.CREATED);
    @PostMapping(consumes = "application/json")
    public void createUserAccount(@RequestBody UserDTO user ){
        System.out.println(user);
    }


    @PatchMapping("/me")
    public void  updateUserAccountDetails(){

    }

}
