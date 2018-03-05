package io.asora.logs.controller;

import io.asora.logs.domain.LogEntry;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/log")
public class LogController {

    private List<LogEntry> logEntryList = new ArrayList<>();

    @RequestMapping(method = RequestMethod.GET)
    public List<LogEntry> findAll() {

        return logEntryList;
    }

    @RequestMapping(method = RequestMethod.POST)
    public String create(@RequestBody List<LogEntry> logEntries) {

        logEntries.forEach(item -> {
            logEntryList.add(item);
        });

        return "Logs were added!";
    }
}
