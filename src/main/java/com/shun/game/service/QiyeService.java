package com.shun.game.service;

import cn.hutool.core.io.resource.ResourceUtil;
import cn.hutool.core.text.csv.CsvReader;
import cn.hutool.core.text.csv.CsvUtil;

import com.shun.game.model.QiyeBean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @User: layman
 * @Date: 2022/1/12 16:45
 * @Description: 企业
 */
@Service
@Component
public class QiyeService {
    final CsvReader reader = CsvUtil.getReader();

    public List<QiyeBean> findAll() {
        //假设csv文件在classpath目录下
        final List<QiyeBean> result = reader.read(
                ResourceUtil.getUtf8Reader("file/finish_qiye.csv"), QiyeBean.class);
        return result;
    }

    public QiyeBean getQiyeByNum(int num) {
        List<QiyeBean> allQiye = findAll();
        return allQiye.get(num);
    }

    public String[] getGJJByNum(int num){
        QiyeBean qiye = getQiyeByNum(num);
        return qiye.getGJJ();
    }
    public String[] getSBByNum(int num){
        QiyeBean qiye = getQiyeByNum(num);
        return qiye.getSB();
    }
    public String[] getYBByNum(int num){
        QiyeBean qiye = getQiyeByNum(num);
        return qiye.getYB();
    }
    public String[] getXDByNum(int num){
        QiyeBean qiye = getQiyeByNum(num);
        return qiye.getXD();
    }
    public String[] getDYDByNum(int num){
        QiyeBean qiye = getQiyeByNum(num);
        return qiye.getDYD();
    }
}
