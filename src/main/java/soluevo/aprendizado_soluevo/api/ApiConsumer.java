package soluevo.aprendizado_soluevo.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(url = "https://viacep.com.br/ws", name = "cep")

public interface ApiConsumer {

    @GetMapping("/{cep}/json/")
    Model_Cep retornaCep(@PathVariable String cep);

    // //Exemplo se a Api tivesse um metodo post, para se enviar um objeto
    // @PostMapping()
    // Model_Cep enviaCep(Model_Cep endereco);

}
