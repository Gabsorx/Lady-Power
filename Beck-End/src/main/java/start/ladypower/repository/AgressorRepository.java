package start.ladypower.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import start.ladypower.models.Agressor;
@Repository
public interface AgressorRepository extends JpaRepository<Agressor, Long> {
   
    


}