package com.example.bubblesort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class FirstController{
    
    // @Autowired
    // private TableRepository tableRepository;

    // @GetMapping
    // public String main(Map<String, Object> model){
    //     // Iterable<Table> tables = tableRepository.findAll();
    //     // model.put("tables", tables);
    //     System.out.println("gggd");
    //     return "home";
    // }

    @GetMapping("/")
    public String main(ModelMap model){
        // Iterable<Table> tables = tableRepository.findAll();
        model.addAttribute("tables", "erzhena");
        System.out.println("model");
        return "home";
    }

    // @PostMapping
    // public String add(@RequestParam String name, Map<String, Object> model){
    //     Table table = new Table(name);
    //     tableRepository.save(table);
    //     Iterable<Table> tables = tableRepository.findAll();
    //     model.put("tables", tables);
    //     System.out.println(model);
    //     return "home";
    // }
}