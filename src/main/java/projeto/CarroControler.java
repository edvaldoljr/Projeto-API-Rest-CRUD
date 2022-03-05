package projeto;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor //Lombok irá criar um construtor com todos argumentos para as propriedades da minha classe
public class CarroControler {

	CarroRepository repository;
	
	//Para dizermos que essa classe é nosso controller precisamos da seguinte anotação @RestController
	//Método get
	@GetMapping("/carro")
	@ResponseStatus(HttpStatus.OK)
	public List<CarroEntity> getAllCarros(){
		return repository.findAll();
	}
	
	 //Agora vamos consultar um cliente por id
    //Como também é uma consulta iremos usar @GetMapping mas como o método retorna um id temos que informa no Path
	@GetMapping("/carro/{id}")
	@ResponseStatus(HttpStatus.OK)
	public CarroEntity buscarCarroPorId(@PathVariable Long id) {
		return repository.findById(id).get();
	}
	
	
	@PostMapping("/carro")
	 //Cada requisição seja realizada com sucesso vamos retornar um Status @ResponseStatus com os parametro (HttpStatus.CREATED)
    @ResponseStatus(HttpStatus.CREATED)
	public CarroEntity salvar(@RequestBody CarroEntity carro) {
		return repository.save(carro);
	}
	
	//Método remover cliente
    //Verbo http @DeleteMapping
	@DeleteMapping("/carro/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT) //NO_CONTENTE sem conteudo
	public void removerCarro(@PathVariable Long id) {
		repository.deleteById(id);
	}
}