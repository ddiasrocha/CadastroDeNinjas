package dev.java10x.cadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@ResponseBody
@RestController
@RequestMapping("/ninjas")
public class NinjaController {

    private NinjaService ninjaService;
    public NinjaController(NinjaService ninjaService) {
        this.ninjaService = ninjaService;
    }

    @GetMapping("/boasvindas")
    public String boasVindas(){
        return "Essa é a minha primeira mensagem nessa rota!";
    }
     //Adicionar Ninja (Create)
     @PostMapping("/criar")
     public NinjaModel criarNinja(@RequestBody NinjaModel ninja){
        return ninjaService.criarNinja(ninja);
     }

     //Mostrar todos os Ninjas (Read)
     @GetMapping("/listar")
     public List<NinjaModel> listarNinjas(){
        return ninjaService.listarNinjas();
     }

     //Procurar Ninja por ID (Read)
     @GetMapping("/listar/{id}")
     public NinjaModel listarNinjasPorId(@PathVariable Long id){
        return ninjaService.listarNinjasPorID(id);
     }

     //Alterar dados dos Ninjas (Update)
     @PutMapping("/alterarid")
     public String alterarNinjaPorId(){
        return "Alterar Ninja por ID";
     }

     //Deletar Ninja (Delete)
     @DeleteMapping("/deletarId")
     public String deletarNinjaPorId(){
        return "Ninja Deletado por ID";
     }

}
