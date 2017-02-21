package ejemplo.modelo.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import ejemplo.modelo.entidad.Idioma;

public interface RepositorioIdioma extends JpaRepository<Idioma, Long>{

}
