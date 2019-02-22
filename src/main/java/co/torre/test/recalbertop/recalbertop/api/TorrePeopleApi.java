package co.torre.test.recalbertop.recalbertop.api;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import co.torre.test.recalbertop.recalbertop.dto.ConnectionDto;
import co.torre.test.recalbertop.recalbertop.dto.PersonDto;
import co.torre.test.recalbertop.recalbertop.facade.TorreBiosApiFacade;

@RestController
@RequestMapping(path = "/api/people")
public class TorrePeopleApi {

    @Autowired
    private TorreBiosApiFacade torreBiosApiFacade;
    
    @GetMapping
    @ResponseBody
    public List<PersonDto> getUserByName(@RequestParam(value = "q", required = false) String name,
            @RequestParam(value = "limit", required = false) Integer limit) {
        return torreBiosApiFacade.getUsersByNameLike(name, limit);
    }
    
    @GetMapping("/{username}/connections")
    @ResponseBody
    public List<ConnectionDto> getUserConnectionsByUsernameName(@PathVariable("username") String username,
            @RequestParam(value = "q", required = false) String name,
            @RequestParam(value = "limit", required = false) Integer limit) {
        
        return torreBiosApiFacade.getUserConnectionsByNameLike(username, name, limit);
    }
}
