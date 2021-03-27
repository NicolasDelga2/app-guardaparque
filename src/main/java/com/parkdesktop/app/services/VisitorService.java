package com.parkdesktop.app.services;

import com.parkdesktop.app.models.User;
import com.parkdesktop.app.models.Visitor;
import com.parkdesktop.app.repositories.VisitorRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VisitorService {

    private VisitorRepository visitorRepository;

    public List<Visitor> getVisitors() {
        return visitorRepository.findAll();
    }

    public Optional<Visitor> getVisitor(int id) {
        return visitorRepository.findById(id);
    }

    public void save(Visitor visitor) {
        visitorRepository.save(visitor);
    }

    public void delete(int id){
        visitorRepository.deleteById(id);
    }

}
