package SpringPlayground.controller;

import SpringPlayground.model.Quote;
import SpringPlayground.service.QuoteService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping("/hello")
public class HelloController {

    private QuoteService quoteService;
    @GetMapping
    public String greet(@RequestParam(value = "name", defaultValue = "World") String name){
        return String.format("Hello %s", name);
    }

    @GetMapping("/random")
    public Quote randomQuote() {
        return quoteService.getRandom();
    }
}
