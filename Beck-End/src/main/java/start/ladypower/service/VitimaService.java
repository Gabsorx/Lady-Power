package start.ladypower.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import jakarta.persistence.EntityNotFoundException;
import start.ladypower.dto.VitimaDTO;
import start.ladypower.models.Vitima;
import start.ladypower.repository.VitimaRepository;
import start.ladypower.service.exception.DatabaseException;
import start.ladypower.service.exception.ResourceNotFoundException;

@Service
public class VitimaService {

@Autowired
private VitimaRepository repository;


@Transactional(readOnly = true)
public Page<VitimaDTO> findAllPaged(Pageable pageable) {
Page<Vitima> vitima = repository.findAll(pageable);
return vitima.map(obj -> new VitimaDTO(obj));
}

@Transactional(readOnly = true)
public VitimaDTO findById(Long id) {
Vitima vitima = repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("id não encontrado."));
return new VitimaDTO(vitima);
}

@Transactional
public VitimaDTO insert(VitimaDTO dto) {
Vitima entity = new Vitima();
entity = dtoToEntity(dto, entity);
entity = repository.save(entity);
return new VitimaDTO(entity);
}

@Transactional
public VitimaDTO update(Long id, VitimaDTO dto) {
try {
    Vitima entity = repository.getReferenceById(id);
    entity = dtoToEntity(dto, entity);
    repository.save(entity);
    return new VitimaDTO(entity);
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

private Vitima dtoToEntity(VitimaDTO dto, Vitima entity) {
    entity.setNome(((start.ladypower.dto.VitimaDTO) dto).getNome());
    entity.setIdade(((start.ladypower.dto.VitimaDTO) dto).getIdade());
        return entity;
}
}

