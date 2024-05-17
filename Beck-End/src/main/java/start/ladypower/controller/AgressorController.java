package start.ladypower.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import start.ladypower.dto.AgressorDTO;
import start.ladypower.models.Agressor;
import start.ladypower.repository.AgressorRepository;
import start.ladypower.service.AgressorService;


@SuppressWarnings("unused")
@RestController
@RequestMapping(value = "/agressor")
public class AgressorController {
    
    @Autowired
    private AgressorService service;

    @Transactional(readOnly = true)
    @GetMapping
    public ResponseEntity<Page<AgressorDTO>> findAll(Pageable pageable) { 


        Page<AgressorDTO> list = service.findAllPaged(pageable);

        return ResponseEntity.ok().body(list);
    }

    @Transactional(readOnly = true)
    @GetMapping(value = "/{id}")
    public ResponseEntity<AgressorDTO> findAll(@PathVariable Long id) { 
        AgressorDTO category = (AgressorDTO) service.findById(id);

        return ResponseEntity.ok().body(category);
    }

    @Transactional(readOnly = true)
    @PostMapping
    public ResponseEntity<AgressorDTO> insert(@RequestBody AgressorDTO dto) {
        dto = service.insert(dto);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
        .buildAndExpand(dto.getId()).toUri();
        return ResponseEntity.created(uri).body(dto);
    }


    @Transactional(readOnly = true)
    @PutMapping(value = "/{id}")
    public ResponseEntity<AgressorDTO> update(@PathVariable Long id, @RequestBody AgressorDTO dto) {
        dto = service.update(id, dto);
        return ResponseEntity.ok().body(dto);
    }
    
    @Transactional(readOnly = true)
    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }

}