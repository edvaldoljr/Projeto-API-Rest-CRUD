package projeto;

/**
 * Criamos uma interface Repository onde vamos acessar as entidades do banco de dados
 */

import org.springframework.data.jpa.repository.JpaRepository;
/**
 *Vamos extender a clase usando JpaRepository<Onde vamos passar o paramêtro cliente e o tipo de id da nossa entidade cliente>
 * Fazendo isso já temos algumas implementações feitas.
 * Então extendendo JpaRepository vamos conseguir criar um Cliente, atualizar um cliente, consultar um cliente e deletar um cliente.
 * Além de outros métodos que já foram implementados
 */
public interface CarroRepository extends JpaRepository<CarroEntity, Long> {}