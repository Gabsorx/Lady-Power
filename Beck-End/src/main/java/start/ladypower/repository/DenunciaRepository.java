package start.ladypower.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import start.ladypower.models.Denuncia;
@Repository
public interface DenunciaRepository extends JpaRepository<Denuncia, Long> {
    

}