package com.usian.taotao.service.user.user.api.impl;

import com.usian.taotao.service.user.api.ContentService;
import com.usian.taotao.service.user.pojo.Content;
import com.usian.taotao.service.user.user.mapper.ContentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 孙圣征 on 2017/7/12.
 */
@Service("contentServiceImpl")
public class ContentServiceImpl implements ContentService {

    @Autowired
    private ContentMapper contentMapper;

    @Override
    public List<Content> getContentList() {
        return contentMapper.selectAllContent();
    }
}
