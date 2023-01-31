package SpringPlayground.service.impl;

import SpringPlayground.model.Quote;
import SpringPlayground.service.QuoteService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@AllArgsConstructor
public class QuoteServiceImpl implements QuoteService {
    private RestTemplate restTemplate;

    private static String url = "https://api.quotable.io/random";

    @Override
    public Quote getRandom() {
        return restTemplate.getForObject(url, Quote.class);
    }
}
