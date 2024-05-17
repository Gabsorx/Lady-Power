package start.ladypower.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import jakarta.persistence.EntityNotFoundException;
import start.ladypower.dto.AgressorDTO;
import start.ladypower.models.Agressor;
import start.ladypower.repository.AgressorRepository;
import start.ladypower.service.exception.DatabaseException;
import start.ladypower.service.exception.ResourceNotFoundException;


@Service
public class AgressorService {
    
@Autowired
private AgressorRepository repository;


@Transactional(readOnly = true)
public Page<AgressorDTO> findAllPaged(Pageable pageable) {
Page<Agressor> agressor = repository.findAll(pageable);
return agressor.map(obj -> new AgressorDTO(obj));
}

@Transactional(readOnly = true)
public AgressorDTO findById(Long id) {
Agressor agressor = repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("id não encontrado."));
return new AgressorDTO(agressor);
}

@Transactional
public AgressorDTO insert(AgressorDTO dto) {
Agressor entity = new Agressor();
entity = dtoToEntity(dto, entity);
entity = repository.save(entity);
return new AgressorDTO(entity);
}

@Transactional
public AgressorDTO update(Long id, AgressorDTO dto) {
try {
    Agressor entity = repository.getReferenceById(id);
    entity = dtoToEntity(dto, entity);
    repository.save(entity);
    return new AgressorDTO(entity);
    } catch (EntityNotFoundException erro){
        throw new ResourceNotFoundException("erro");
    }  
}

@Transactional(propagation = Propagation.SUPPORTS)
public void delete(Long id) {

if(!repository.existsById(id)) {
throw new ResourceNotFoundException("Este recurso não existe");
}

try {

repository.deleteById(id);

} catch(DataIntegrityViolationException e) {
throw new DatabaseException("Falha de integridade referencial");
}

}

private Agressor dtoToEntity(AgressorDTO dto, Agressor entity) {
    entity.setNome(((start.ladypower.dto.AgressorDTO) dto).getNome());
    entity.setIdade(((start.ladypower.dto.AgressorDTO) dto).getIdade());
    entity.setEndereco(dto.getEndereco());
        return entity;
}
}
