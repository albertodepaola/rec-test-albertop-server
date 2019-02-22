package co.torre.test.recalbertop.recalbertop.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import co.torre.test.recalbertop.recalbertop.dto.TorreUserDto;
import co.torre.test.recalbertop.recalbertop.facade.TorreApiFacade;

@RestController
public class TorreUserApi {

    @Autowired
    private TorreApiFacade torreApiFacade;
    
    @GetMapping("/user")
    @ResponseBody
    public TorreUserDto getUserByName(@RequestParam("username") String username) {
        return torreApiFacade.getUserByUsername(username);
    }
}
