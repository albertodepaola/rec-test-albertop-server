package co.torre.test.recalbertop.recalbertop.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import co.torre.test.recalbertop.recalbertop.dto.TorreUserDto;
import co.torre.test.recalbertop.recalbertop.facade.TorreBiosApiFacade;

@RestController
@RequestMapping(path = "/api/bios")
public class TorreBiosApi {

    @Autowired
    private TorreBiosApiFacade torreApiFacade;
    
    @GetMapping("/{username}")
    @ResponseBody
    public TorreUserDto getUserByName(@PathVariable("username") String username) {
        return torreApiFacade.getUserByUsername(username);
    }
}
