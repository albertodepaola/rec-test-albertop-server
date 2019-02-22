package co.torre.test.recalbertop.recalbertop.facade;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import co.torre.test.recalbertop.recalbertop.dto.TorreUserDto;

@FeignClient(name = "torre-api", url = "https://torre.bio")
public interface TorreApiFacade {
    
    @RequestMapping( path = "/api/bios/{username}", method = RequestMethod.GET)
    TorreUserDto getUserByUsername(@PathVariable("username") String username);

}
