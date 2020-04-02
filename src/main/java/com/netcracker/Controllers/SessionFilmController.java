package com.netcracker.Controllers;

import com.netcracker.entity.SessionFilm;
import com.netcracker.service.SessionFilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.ResponseEntity.ok;

@RestController
@RequestMapping("/SessionFilm")
public class SessionFilmController {
    @Autowired
    private SessionFilmService sessionFilmService;

    @RequestMapping(value = "/{sessionId}", method = RequestMethod.GET)
    public ResponseEntity<SessionFilm> getSessionFilmById(@PathVariable(value = "sessionId") Long SessionId) {
        SessionFilm sessionFilm = sessionFilmService.getCinemaHallById(SessionId).get();
        return ResponseEntity.ok(sessionFilm);
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<SessionFilm> getAll() {
        return sessionFilmService.getAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    public SessionFilm save(@RequestBody SessionFilm sessionFilm) {
        return sessionFilmService.save(sessionFilm);
    }

    @RequestMapping(value = "/{idSession}", method = RequestMethod.DELETE)
    public void delete(@PathVariable(value = "idSession") Long id) {
        sessionFilmService.delete(id);
    }


}
