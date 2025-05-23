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
     @PutMapping("/alterar/{id}")
     public NinjaModel alterarNinjaPorId(@PathVariable Long id, @RequestBody NinjaModel ninjaAtualizado){
        return ninjaService.atualizarNinjaPorId(id, ninjaAtualizado);
     }

     //Deletar Ninja (Delete)
     @DeleteMapping("/deletarid/{id}")
     public void deletarNinjaPorId(@PathVariable Long id){
        ninjaService.deletarNinjaPorId(id);
     }

}
