package com.shun.game.model;

import cn.hutool.core.annotation.Alias;
import lombok.Data;

/**
 * @User: layman
 * @Date: 2022/1/12 16:14
 * @Description:
 */
// lombok注解
@Data
public class QiyeBean {

    // 如果csv中标题与字段不对应，可以使用alias注解设置别名
    private Integer num;
    @Alias("主键ID")
    private String id;
    @Alias("企业名称")
    private String name;
    @Alias("注册号")
    private String regCode;
    @Alias("法人")
    private String legPerson;
    @Alias("社会统一信用代码")
    private String creditCode;
    @Alias("行业")
    private String industry;
    private String gjj_202001;
    private String gjj_202002;
    private String gjj_202003;
    private String gjj_202004;
    private String gjj_202005;
    private String gjj_202006;
    private String gjj_202007;
    private String gjj_202008;
    private String gjj_202009;
    private String gjj_202010;
    private String gjj_202011;
    private String gjj_202012;
    private String shebao_202001;
    private String shebao_202002;
    private String shebao_202003;
    private String shebao_202004;
    private String shebao_202005;
    private String shebao_202006;
    private String shebao_202007;
    private String shebao_202008;
    private String shebao_202009;
    private String shebao_202010;
    private String shebao_202011;
    private String shebao_202012;
    private String yibao_201907;
    private String yibao_201908;
    private String yibao_201909;
    private String yibao_201910;
    private String yibao_201911;
    private String yibao_201912;
    private String yibao_202001;
    private String yibao_202002;
    private String yibao_202003;
    private String yibao_202004;
    private String yibao_202005;
    private String yibao_202006;
    private String yibao_202007;
    private String home_number;
    private String home_describe;
    private String gjj_sum;
    private String gjj_avg;
    private String gjj_nan;
    private String gjj_state;
    private String shebao_sum;
    private String shebao_avg;
    private String shebao_nan;
    private String shebao_state;
    private String yibao_sum;
    private String yibao_avg;
    private String yibao_nan;
    private String yibao_state;
    private String gjj_nan_score;
    private String gjj_state_score;
    private String shebao_nan_score;
    private String shebao_state_score;
    private String yibao_nan_score;
    private String yibao_state_score;
    private String gjj_sum_score;
    private String gjj_avg_score;
    private String shebao_sum_score;
    private String shebao_avg_score;
    private String yibao_sum_score;
    private String yibao_avg_score;
    private String home_number_score;
    private String desire_score;
    private String ability_score;
    private String score;
    private String target;
    private String defualt_rate;
    private String credit_score;
    private String credit_grade;
    private String credit_rate;
    private String max_value;
    @Alias("3year_profit")
    private String year_profit3;
    private String loan_amount;
    private String credit_loan_amount;
    private String credit_loan_amount_zhanbi;
    private String mortgage_price;
    private String mortgage_loan_amount;
    private String mortgage_loan_amount_zhanbi;
    private String credit_loan_rate_1;
    private String credit_loan_rate_2;
    private String credit_loan_rate_3;
    private String credit_loan_rate_4;
    private String credit_loan_rate_5;
    private String credit_loan_rate_6;
    private String credit_loan_rate_7;
    private String credit_loan_rate_8;
    private String credit_loan_rate_9;
    private String credit_loan_rate_10;
    private String credit_loan_rate_11;
    private String credit_loan_rate_12;
    private String credit_loan_rate_13;
    private String credit_loan_rate_14;
    private String credit_loan_rate_15;
    private String credit_loan_rate_16;
    private String credit_loan_rate_17;
    private String credit_loan_rate_18;
    private String credit_loan_rate_19;
    private String credit_loan_rate_20;
    private String credit_loan_rate_21;
    private String credit_loan_rate_22;
    private String credit_loan_rate_23;
    private String credit_loan_rate_24;
    private String credit_loan_rate_25;
    private String credit_loan_rate_26;
    private String credit_loan_rate_27;
    private String credit_loan_rate_28;
    private String credit_loan_rate_29;
    private String credit_loan_rate_30;
    private String mortgage_loan_rate_1;
    private String mortgage_loan_rate_2;
    private String mortgage_loan_rate_3;
    private String mortgage_loan_rate_4;
    private String mortgage_loan_rate_5;
    private String mortgage_loan_rate_6;
    private String mortgage_loan_rate_7;
    private String mortgage_loan_rate_8;
    private String mortgage_loan_rate_9;
    private String mortgage_loan_rate_10;
    private String mortgage_loan_rate_11;
    private String mortgage_loan_rate_12;
    private String mortgage_loan_rate_13;
    private String mortgage_loan_rate_14;
    private String mortgage_loan_rate_15;
    private String mortgage_loan_rate_16;
    private String mortgage_loan_rate_17;
    private String mortgage_loan_rate_18;
    private String mortgage_loan_rate_19;
    private String mortgage_loan_rate_20;
    private String mortgage_loan_rate_21;
    private String mortgage_loan_rate_22;
    private String mortgage_loan_rate_23;
    private String mortgage_loan_rate_24;
    private String mortgage_loan_rate_25;
    private String mortgage_loan_rate_26;
    private String mortgage_loan_rate_27;
    private String mortgage_loan_rate_28;
    private String mortgage_loan_rate_29;
    private String mortgage_loan_rate_30;

    public QiyeBean(int num) {
        String[] gjj = new String[]{gjj_202001, gjj_202002, gjj_202003, gjj_202004, gjj_202005, gjj_202006,
                gjj_202007, gjj_202008, gjj_202009, gjj_202010, gjj_202011, gjj_202012};
        String[] shebao = new String[]{shebao_202001, shebao_202002, shebao_202003, shebao_202004, shebao_202005, shebao_202006,
                shebao_202007, shebao_202008, shebao_202009, shebao_202010, shebao_202011, shebao_202012};
        String[] yibao = new String[]{yibao_201907, yibao_201908, yibao_201909, yibao_201910, yibao_201911,
                yibao_201912, yibao_202001, yibao_202002, yibao_202003, yibao_202004, yibao_202005, yibao_202006, yibao_202007};
        String[] credit_loan_rate = new String[]{credit_loan_rate_1, credit_loan_rate_2, credit_loan_rate_3, credit_loan_rate_4, credit_loan_rate_5, credit_loan_rate_6, credit_loan_rate_7, credit_loan_rate_8, credit_loan_rate_9, credit_loan_rate_10,
                credit_loan_rate_11, credit_loan_rate_12, credit_loan_rate_13, credit_loan_rate_14, credit_loan_rate_15, credit_loan_rate_16, credit_loan_rate_17, credit_loan_rate_18, credit_loan_rate_19, credit_loan_rate_20,
                credit_loan_rate_21, credit_loan_rate_22, credit_loan_rate_23, credit_loan_rate_24, credit_loan_rate_25, credit_loan_rate_26, credit_loan_rate_27, credit_loan_rate_28, credit_loan_rate_29, credit_loan_rate_30};
        String[] mortgage_loan_rate = new String[]{mortgage_loan_rate_1, mortgage_loan_rate_2, mortgage_loan_rate_3, mortgage_loan_rate_4, mortgage_loan_rate_5, mortgage_loan_rate_6, mortgage_loan_rate_7, mortgage_loan_rate_8, mortgage_loan_rate_9, mortgage_loan_rate_10,
                mortgage_loan_rate_11, mortgage_loan_rate_12, mortgage_loan_rate_13, mortgage_loan_rate_14, mortgage_loan_rate_15, mortgage_loan_rate_16, mortgage_loan_rate_17, mortgage_loan_rate_18, mortgage_loan_rate_19, mortgage_loan_rate_20,
                mortgage_loan_rate_21, mortgage_loan_rate_22, mortgage_loan_rate_23, mortgage_loan_rate_24, mortgage_loan_rate_25, mortgage_loan_rate_26, mortgage_loan_rate_27, mortgage_loan_rate_28, mortgage_loan_rate_29, mortgage_loan_rate_30};
    }
    public String[] getGJJ(){
        return  new String[]{gjj_202001, gjj_202002, gjj_202003, gjj_202004, gjj_202005, gjj_202006,
                gjj_202007, gjj_202008, gjj_202009, gjj_202010, gjj_202011, gjj_202012};

    }
    public String[] getSB(){
        return  new String[]{shebao_202001, shebao_202002, shebao_202003, shebao_202004, shebao_202005, shebao_202006,
                shebao_202007, shebao_202008, shebao_202009, shebao_202010, shebao_202011, shebao_202012};

    }
    public String[] getYB(){
        return  new String[]{yibao_201907, yibao_201908, yibao_201909, yibao_201910, yibao_201911,
                yibao_201912, yibao_202001, yibao_202002, yibao_202003, yibao_202004, yibao_202005, yibao_202006, yibao_202007};

    }
    public String[] getXD(){
        return new String[]{credit_loan_rate_1, credit_loan_rate_2, credit_loan_rate_3, credit_loan_rate_4, credit_loan_rate_5, credit_loan_rate_6, credit_loan_rate_7, credit_loan_rate_8, credit_loan_rate_9, credit_loan_rate_10,
                credit_loan_rate_11, credit_loan_rate_12, credit_loan_rate_13, credit_loan_rate_14, credit_loan_rate_15, credit_loan_rate_16, credit_loan_rate_17, credit_loan_rate_18, credit_loan_rate_19, credit_loan_rate_20,
                credit_loan_rate_21, credit_loan_rate_22, credit_loan_rate_23, credit_loan_rate_24, credit_loan_rate_25, credit_loan_rate_26, credit_loan_rate_27, credit_loan_rate_28, credit_loan_rate_29, credit_loan_rate_30};

    }
    public String[] getDYD(){
        return  new String[]{mortgage_loan_rate_1, mortgage_loan_rate_2, mortgage_loan_rate_3, mortgage_loan_rate_4, mortgage_loan_rate_5, mortgage_loan_rate_6, mortgage_loan_rate_7, mortgage_loan_rate_8, mortgage_loan_rate_9, mortgage_loan_rate_10,
                mortgage_loan_rate_11, mortgage_loan_rate_12, mortgage_loan_rate_13, mortgage_loan_rate_14, mortgage_loan_rate_15, mortgage_loan_rate_16, mortgage_loan_rate_17, mortgage_loan_rate_18, mortgage_loan_rate_19, mortgage_loan_rate_20,
                mortgage_loan_rate_21, mortgage_loan_rate_22, mortgage_loan_rate_23, mortgage_loan_rate_24, mortgage_loan_rate_25, mortgage_loan_rate_26, mortgage_loan_rate_27, mortgage_loan_rate_28, mortgage_loan_rate_29, mortgage_loan_rate_30};

    }

}
