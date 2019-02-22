package co.torre.test.recalbertop.recalbertop.facade;

import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import co.torre.test.recalbertop.recalbertop.dto.ConnectionDto;
import co.torre.test.recalbertop.recalbertop.dto.PersonDto;
import co.torre.test.recalbertop.recalbertop.dto.TorreUserDto;

@FeignClient(name = "torre-api", url = "https://torre.bio")
public interface TorreBiosApiFacade {

    @RequestMapping(path = "/api/bios/{username}", method = RequestMethod.GET)
    TorreUserDto getUserByUsername(@PathVariable("username") String username);

    @RequestMapping(path = "/api/people", method = RequestMethod.GET)
    List<PersonDto> getUsersByNameLike(@RequestParam("q") String name, @RequestParam("limit") Integer limit);

    @RequestMapping(path = "/api/people/{username}/connections", method = RequestMethod.GET)
    List<ConnectionDto> getUserConnectionsByNameLike(@PathVariable("username") String username,
            @RequestParam("q") String name,
            @RequestParam("limit") Integer limit);

}
