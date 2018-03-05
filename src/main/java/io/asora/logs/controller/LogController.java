package io.asora.logs.controller;

import io.asora.logs.domain.LogEntry;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class LogController {

    private List<LogEntry> logEntryList = new ArrayList<>();

    @RequestMapping(value = "/log", method = RequestMethod.GET)
    public List<LogEntry> list() {

        return logEntryList;
    }
}
