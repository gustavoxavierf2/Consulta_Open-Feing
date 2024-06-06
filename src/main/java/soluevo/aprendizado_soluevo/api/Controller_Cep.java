package soluevo.aprendizado_soluevo.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/soluevo")
public class Controller_Cep {

    @Autowired
    private Service_Cep service_Cep;

    @GetMapping("/{cep}")
    public ResponseEntity<Model_Cep> retornaCep(@PathVariable String cep){
        Model_Cep response = service_Cep.getCep(cep);
        return ResponseEntity.status(HttpStatus.OK).body(response);
    }
  
    // @PostMapping
    // public ResponseEntity<Model_Cep> enviaCep(@RequestBody Model_Cep request){
    //     Model_Cep response = service_Cep.postCep(request);
    //     if (response != null) {
    //         return ResponseEntity.status(HttpStatus.OK).body(response);
    //     }
    //     return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(response);
        
    // }
}
