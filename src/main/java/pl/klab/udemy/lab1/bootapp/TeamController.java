package pl.klab.udemy.lab1.bootapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/teams")
//@RestController
public class TeamController {

    @Autowired
    private TeamRepository teamRepository;

    @RequestMapping("")
    public Iterable<Team> getTeams() {
        return teamRepository.findAll();
    }

    @RequestMapping("/{id}")
    public Team getTeam(@PathVariable Long id) {
        return teamRepository.findOne(id);
    }
}
