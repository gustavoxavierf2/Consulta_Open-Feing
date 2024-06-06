package soluevo.aprendizado_soluevo.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Service_Cep {
    @Autowired
    ApiConsumer apiConsumerCep;

    public Model_Cep getCep(String cep){
        return apiConsumerCep.retornaCep(cep);
    }

    // public Model_Cep postCep(Model_Cep endereco){
    //     return apiConsumerCep.enviaCep(endereco);
    // }
}
