package com.shun.game.service;

import cn.hutool.core.io.resource.ResourceUtil;
import cn.hutool.core.text.csv.CsvReader;
import cn.hutool.core.text.csv.CsvUtil;

import com.shun.game.model.RenyuanBean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @User: layman
 * @Date: 2022/1/12 16:45
 * @Description: 人员
 */
@Service
@Component
public class RenyuanService {
    final CsvReader reader = CsvUtil.getReader();

    public List<RenyuanBean> findAll() {
        //假设csv文件在classpath目录下
        final List<RenyuanBean> result = reader.read(
                ResourceUtil.getUtf8Reader("file/finish_renyuan.csv"), RenyuanBean.class);
        return result;
    }

    public RenyuanBean getRenyuanByNum(int num) {
        List<RenyuanBean> allRenyuan = findAll();
        return allRenyuan.get(num);
    }
    public String[] getGJJByNum(int num){
        RenyuanBean renyuan = getRenyuanByNum(num);
        return renyuan.getGJJ();
    }
    public String[] getSBByNum(int num){
        RenyuanBean renyuan = getRenyuanByNum(num);
        return renyuan.getSB();
    }
    public String[] getYBByNum(int num){
        RenyuanBean renyuan = getRenyuanByNum(num);
        return renyuan.getYB();
    }
    public String[] getXDByNum(int num){
        RenyuanBean renyuan = getRenyuanByNum(num);
        return renyuan.getXD();
    }
    public String[] getDYDByNum(int num){
        RenyuanBean renyuan = getRenyuanByNum(num);
        return renyuan.getDYD();
    }
}
