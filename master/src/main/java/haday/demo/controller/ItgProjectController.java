package haday.demo.controller;

import haday.demo.entity.fourth.ItgProject;
import haday.demo.service.ItgProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Description: 项目计息
 * @Author: dingj
 * @TIME: 2019/11/8 - 9:21
 */

@RestController
@RequestMapping("/project")
public class ItgProjectController {

    @Autowired
    ItgProjectService projectService;

    @GetMapping
    public ItgProject get(@RequestParam long id) {
        return projectService.get(id);
    }

    @GetMapping(value = "/getAll")
    public List<ItgProject> getAll() {
        return projectService.getAll();
    }

    @PostMapping
    public int add(@RequestBody ItgProject project) {
        return projectService.add(project);
    }

    @PutMapping
    public int update(@RequestParam long id,@RequestBody ItgProject project) {
        project.setId(id);
        return projectService.update(project);
    }

    @DeleteMapping
    public int delete(@RequestParam long id) {
        return projectService.delete(id);
    }

}
