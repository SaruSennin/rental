package rental.rental.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;
import rental.rental.entity.Type;
import rental.rental.reposytory.TypeRepository;

import java.util.Optional;

@Service
public class TypeService {

    private TypeRepository typeRepository;

    @Autowired
    public TypeService(TypeRepository typeRepository) {
        this.typeRepository = typeRepository;
    }

    public Optional<Type> findById(Long id) {
        return typeRepository.findById(id);
    }

    public Iterable<Type> findAll() {
        return typeRepository.findAll();
    }

    public Type save(Type type) {
        return typeRepository.save(type);
    }

    public void deleteById(Long id) {
        typeRepository.deleteById(id);
    }

    @EventListener(ApplicationReadyEvent.class)
    public void fillDB() {
        save(new Type("magazyn", true));
        save(new Type("czasopismo", true));
        save(new Type("gazeta", true));
        save(new Type("ksiazka", true));
        save(new Type("film", true));
    }


}
