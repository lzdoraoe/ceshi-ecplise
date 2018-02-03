package com.usian.taotao.web.controller;


import com.usian.taotao.service.user.api.ContentService;
import com.usian.taotao.service.user.pojo.Content;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by 孙圣征 on 2017/7/11.
 */
@Controller
@RequestMapping("/content")
public class ContentController {

    @Autowired
    private ContentService contentService;


    @RequestMapping("/list")
    public String list(Model model){
        List<Content> contents = contentService.getContentList();
        model.addAttribute("contents", contents);
        return "content";
    }
}
