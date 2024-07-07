
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "viacep", url = "https: //viacep.com.br/ws")
public interface ViaCepService {

    //@GetMapping

    @RequestMapping (method =  RequestMethod.GET, value = "/{cep}/json")
    Endereco consultarCep (@PathVariable("cep") String cep);

}
