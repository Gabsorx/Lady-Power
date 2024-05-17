package start.ladypower.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import jakarta.persistence.EntityNotFoundException;
import start.ladypower.dto.DenunciaDTO;

import start.ladypower.models.Denuncia;
import start.ladypower.repository.DenunciaRepository;
import start.ladypower.service.exception.DatabaseException;
import start.ladypower.service.exception.ResourceNotFoundException;

@Service
public class DenunciaService {

@Autowired
private DenunciaRepository repository;


@Transactional(readOnly = true)
public Page<DenunciaDTO> findAllPaged(Pageable pageable) {
Page<Denuncia> denuncia = repository.findAll(pageable);
return denuncia.map(obj -> new DenunciaDTO(obj));
}

@Transactional(readOnly = true)
public DenunciaDTO findById(Long id) {
Denuncia denuncia = repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("id não encontrado."));
return new DenunciaDTO(denuncia);
}

@Transactional
public DenunciaDTO insert(DenunciaDTO dto) {
Denuncia entity = new Denuncia();
entity = dtoToEntity(dto, entity);
entity = repository.save(entity);
return new DenunciaDTO(entity);
}

@Transactional
public DenunciaDTO update(Long id, DenunciaDTO dto) {
try {
    Denuncia entity = repository.getReferenceById(id);
    entity = dtoToEntity(dto, entity);
    repository.save(entity);
    return new DenunciaDTO(entity);
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

private Denuncia dtoToEntity(DenunciaDTO dto, Denuncia entity) {
    entity.setId(dto.getId());
    entity.setNome(dto.getNome());
    entity.setEndereco(dto.getEndereco());
    entity.setDescricao(dto.getDescricao());
    entity.setData(dto.getData());

        return entity;
}


}
