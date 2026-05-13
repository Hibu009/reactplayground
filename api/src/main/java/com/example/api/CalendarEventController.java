package com.example.api;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/calendar")
public class CalendarEventController {

    @GetMapping("/event")
    public Map<String, Object> getEvent(
            @RequestParam String username,
            @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime startTime,
            @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime endTime,
            @RequestParam Integer location) {

        Map<String, Object> response = new HashMap<>();
        response.put("username", username);
        response.put("startTime", startTime);
        response.put("endTime", endTime);
        response.put("location", location);

        return response;
    }
}