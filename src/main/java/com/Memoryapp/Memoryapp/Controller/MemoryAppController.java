package com.Memoryapp.Memoryapp.Controller;

import com.Memoryapp.Memoryapp.Check.Check;
import com.Memoryapp.Memoryapp.Model.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import com.Memoryapp.Memoryapp.repository.repository;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;


@Controller
public class MemoryAppController {
    @Autowired
    public repository repo;

    public MemoryAppController(repository repo){

        this.repo = repo;
    }
    @RequestMapping(value="/" , method = {RequestMethod.GET, RequestMethod.POST} )
    public String Homepage(Model model){
        ArrayList<List> dingdongs = (ArrayList<List>) StreamSupport //
                .stream(repo.findAll().spliterator(), false) //
                .collect(Collectors.toList());
           // System.out.println(dingdongs.get(1).getDay());
            ArrayList<List> john = new ArrayList<List>();
            Check kevin = new Check();
            ArrayList<List> robin = new ArrayList<List>(kevin.check7daysahead(dingdongs));
            for(int i = 0; i < robin.size(); i++){
            john.add(robin.get(i));}
        model.addAttribute("list", john );
        return "Homepage";
    }
    @GetMapping("/showall")
    public String Showall(Model model){
        model.addAttribute("list", repo.findAll());
        return "showall";

    }
    @GetMapping("/enterdata")
    public  String enterdata(Model model){
        model.addAttribute("list", new List());
        return "enterdata";

    }

    @PostMapping("/processdata")
    public String processdata(@ModelAttribute("list") List list, BindingResult result, ModelMap model) {

        if(result.hasErrors()){
            return"enterdata";
        }
        repo.save(list);
        return "redirect:/";
    }
    @GetMapping("/deletedata")
    public  String deletedata(Model model){
        model.addAttribute("list", new List());
        return "deletedata";

    }

    @PostMapping("/processdelete")
    public String processdelete(@ModelAttribute("list") List list, BindingResult result, ModelMap model) {
        System.out.println(list.getDay());
        if(result.hasErrors()){
            return"deletedata";
        }
        var list1 = repo.findbyDayandMonth(list.getDay(), list.getMonth());
        System.out.println(list.getDay());
        if(!list1.isEmpty()){
            System.out.println(list1.size());
            //String id1 = j.split("");
            for(int i = 0; i < list1.size(); i++) {
                System.out.println(list1.get(i).getName());
                repo.deleteById(list1.get(i).getId());
            }

        }else{
            return "deletedata";
  }
        return "redirect:/";
    }
}
