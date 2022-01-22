package com.shun.game.controller;

import com.shun.game.service.QiyeService;
import com.shun.game.service.RenyuanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.websocket.server.PathParam;
import java.util.HashMap;
import java.util.Map;


@Controller
@RequestMapping(value = "/")
public class IndexController {

    @Autowired
    private QiyeService qiyeService;
    @Autowired
    private RenyuanService renyuanService;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String index() {
        return "index";
    }

    //@RequestMapping(value = "/1", method = RequestMethod.GET)
    //public String index1() {
    //    return "1";
    //}
    @RequestMapping(value = "list1", method = RequestMethod.GET)
    @ResponseBody
    public Map<String,Object> getList1() {
        Map<String,Object> map = new HashMap<>();
        map.put("msg", "ok");
        map.put("data", qiyeService.findAll());
        return map;
    }

    @RequestMapping(value ="qiye/{num}" , method = RequestMethod.GET)
    @ResponseBody
    public Map<String,Object> getQiyeByNum(@PathVariable int num) {
        Map<String,Object> map = new HashMap<>();
        map.put("msg", "ok");
        map.put("data", qiyeService.getQiyeByNum(num));
        return map;
    }

    @RequestMapping(value = "list2", method = RequestMethod.GET)
    @ResponseBody
    public Map<String,Object> getList2() {
        Map<String,Object> map = new HashMap<>();
        map.put("msg", "ok");
        map.put("data", renyuanService.findAll());
        return map;
    }

    @RequestMapping(value ="renyuan/{num}" , method = RequestMethod.GET)
    @ResponseBody
    public Map<String,Object> getRenyuanByNum(@PathVariable int num) {
        Map<String,Object> map = new HashMap<>();
        map.put("msg", "ok");
        map.put("data", renyuanService.getRenyuanByNum(num));
        return map;
    }
}
