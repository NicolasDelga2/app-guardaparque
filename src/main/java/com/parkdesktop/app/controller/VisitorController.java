package com.parkdesktop.app.controller;

import com.parkdesktop.app.models.Visitor;
import com.parkdesktop.app.services.VisitorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/visitor")
public class VisitorController {

    @Autowired
    private VisitorService visitorService;

    @GetMapping("/visitors")
    public List<Visitor> getVisitors() {
        return visitorService.getVisitors();
    }

    @GetMapping("/getVisitor/{id}")
    public Optional<Visitor> getVisitor(Integer id) {
        return visitorService.getVisitor(id);
    }

    @PostMapping("/save")
    public void save(Visitor visitor) {
        visitorService.save(visitor);
    }

    @PutMapping("/update")
    public void update(Visitor visitor){
        visitorService.save(visitor);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Integer id){
        visitorService.delete(id);
    }
}
