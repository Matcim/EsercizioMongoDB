package co.Develhope.EsercizioMongoDB.controller;


import co.Develhope.EsercizioMongoDB.user.User;
import co.Develhope.EsercizioMongoDB.userRepository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
;import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserRepository userRepository;

    @PostMapping
    public User postUser(@RequestBody User user) {

        User user1 = userRepository.save(user);

        return user1;
    }
     @GetMapping("/{id}")
    public Optional<User> getUsers(@PathVariable String id){
         try {
             if (id != null){
                 System.out.println("errore");
             }else
                 System.out.println("id andato a buon fine");
         }catch (Exception e){
             e.printStackTrace();
         }
         return userRepository.findById(id);
     }

     @GetMapping
     public List<User> getUsers(){

        return userRepository.findAll();
     }

     @PutMapping("/update")
     public User putUser(@PathVariable(required = false) String update, @RequestBody User user){

        try {
           if (!userRepository.existsById(update)){
               System.out.println("errore");
               throw new Exception("impossibile trovare id");
           }else
               System.out.println("corretto");
        }catch (Exception e){
            e.printStackTrace();
            user.setId(update);
        }
        return userRepository.save(user);
     }

     @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable String id){

        userRepository.deleteById(id);
     }
}
