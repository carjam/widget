package com.companyx.widget;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class WidgetController {

    @Autowired
    WidgetRepository widgetRespository;

    @GetMapping("/Widget")
    public List<Widget> index(){
        return widgetRespository.findAll();
    }

    @GetMapping("/Widget/{id}")
    public Widget show(@PathVariable String id){
        int WidgetId = Integer.parseInt(id);
        return widgetRespository.findOne(WidgetId);
    }

    @PostMapping("/Widget/search")
    public List<Widget> search(@RequestBody Map<String, String> body){
        String searchTerm = body.get("text");
        return widgetRespository.findByNameContaining(searchTerm);
    }

    @PostMapping("/Widget")
    public Widget create(@RequestBody Map<String, String> body){
        String name = body.get("name");
        return widgetRespository.save(new Widget(name));
    }

    @PutMapping("/Widget/{id}")
    public Widget update(@PathVariable String id, @RequestBody Map<String, String> body){
        int WidgetId = Integer.parseInt(id);
        // getting Widget
        Widget Widget = widgetRespository.findOne(WidgetId);
        Widget.setName(body.get("name"));
        return widgetRespository.save(Widget);
    }

    @DeleteMapping("Widget/{id}")
    public boolean delete(@PathVariable String id){
        int WidgetId = Integer.parseInt(id);
        widgetRespository.delete(WidgetId);
        return true;
    }


}