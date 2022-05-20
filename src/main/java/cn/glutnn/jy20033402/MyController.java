package cn.glutnn.jy20033402;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
public class MyController {
    @RequestMapping("index")
    public String index(Model model){
        ArrayList<Person> personList=new ArrayList<>();
        personList.add(new Person(1,"张三","男"));
        personList.add(new Person(2,"李四","男"));
        personList.add(new Person(34,"黄佰全","男"));
        model.addAttribute("personList",personList);
        return "index";
    }
}
