package com.netcracker.Controllers;

import com.netcracker.entity.Category;
import com.netcracker.entity.CinemaHall;
import com.netcracker.service.CategoryService;
import com.netcracker.service.CinemaHallService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/cinemaHall")
public class CinemaHallController {
    @Autowired
    CinemaHallService cinemaHallService;

    @RequestMapping(method = RequestMethod.POST)
    public CinemaHall save(@RequestBody CinemaHall cinemaHall) {
        return cinemaHallService.save(cinemaHall);
    }

    @RequestMapping(value = "/{cinemaHallId}", method = RequestMethod.GET)
    public ResponseEntity<CinemaHall> getCategory(@PathVariable(value = "cinemaHallId") Long id) {
        CinemaHall cinemaHall = cinemaHallService.getCinemaHallById(id).get();
        return ResponseEntity.ok(cinemaHall);
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<CinemaHall> getAll() {
        return cinemaHallService.getAll();
    }

    @RequestMapping(value = "/{cinemaHallId}", method = RequestMethod.DELETE)
    public void delete(@PathVariable(value = "cinemaHallId") Long id) {
        cinemaHallService.delete(id);
    }
}
