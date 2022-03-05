package projeto;

/**
 * Classe CarroEntity é onde vamos guardar nossas entidades do banco de dados.
 */
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Entity Para informa que é uma entidade de banco de dados.
@Entity
//@Data para criar os métodos getter e setter e o To String automaticamente.
@Data
//@AllArgsConstructor Para criar o construtor com as propriedades que criarmos de cliente.
@AllArgsConstructor
//@NoArgsConstructor Para criar um construtor vazio ou seja sem argumentos.
@NoArgsConstructor
//@Builder Para nos ajudar na criação de objetos Cliente.
@Builder
public class CarroEntity {
	
	//Atributos Cliente
    //Como é uma entidade temos que definir qual dos atributos será o id então usamos a anotação @Id
    //Para que não seja obrigatório ficarmos, gerando Id a cada novo Cliente vamos fazer a seguinte anotação @GeneratedValue com a estratégia (strategy = GenerationType.AUTO).
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	 Long id;
	 String marca;
	 String modelo;
	 Integer ano;
}