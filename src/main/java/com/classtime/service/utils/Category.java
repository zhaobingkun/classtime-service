package com.classtime.service.utils;

import java.util.*;

/**
 * Created by Administrator on 2015/9/9.
 */
public enum Category {

    ACTIVITY(2),HOTEL(4),PLAN(21),AREA(22);
    private long nCode;

     Category(long _nCode) {
         this.nCode = _nCode;
    }

    public long toValue() {
        return this.nCode;
    }
    //categroy 1：餐饮，2：景点：3：导游：4：酒店，5：包车：6：签证：17：行程单：18：线路 19：用车服务 20：产品包
    public static void main(String[] args) {
        //System.out.println(Category.ACTIVITY.toValue());
       // System.out.println(Category.ACTIVITY);

      /*  BigDecimal a = new BigDecimal(10);
        BigDecimal b =  new BigDecimal(3); ;
        BigDecimal c = a.divide(b,0,BigDecimal.ROUND_UP);

        System.out.println(c);*/

        String validateCode = "";

        //已存在的验证码  
        List<String> list = new ArrayList<String>();

        boolean continueFlag = true;
        String num = getRandom(6);
   /*     while (continueFlag) {
            //不存在num,返回validateCode,结束循环  
            if (!list.contains(num)) {
                validateCode = num;
                continueFlag = false;
            }else{
                num = getRandom(6);
            }
        }*/
        System.out.println(validateCode);
        int i=0;
        Map codeMap = new HashMap();
        while(i<10){
            //num = getRandom(6);
            validateCode = getRandom(6);
            System.out.println(validateCode);
            if("".equals(codeMap.get(validateCode)) || codeMap.get(validateCode)==null){
                codeMap.put(validateCode,validateCode);
                i++;
            }
        }

        Set set = codeMap.entrySet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String key = (String) entry.getKey();
            String value = (String) entry.getValue();
            System.out.println(key + "=" + value);
        }



    }

    private static String getRandom(int codeCount) {
        StringBuffer randomCodeRes = new StringBuffer();

       // char[] codeSequenceNumber = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};

        char[] codeSequenceChar = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J',
                'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W',
                'X', 'Y', 'Z','0', '1', '2', '3', '4', '5', '6', '7', '8', '9'
        };

        List<String> randomCode = new ArrayList<String>();

        // 创建一个随机数生成器类
        Random random = new Random();

        //随机产生，验证码由几个数字、几个字母组成
        int shuziNum = random.nextInt(5) + 1;
        //int charNum  = codeCount - shuziNum;
        int charNum  =6;
        // 随机产生codeCount数字的验证码。
  /*      for (int i = 0; i < shuziNum; i++) {
            // 得到随机产生的验证码数字。
            String numRand = String.valueOf(codeSequenceNumber[random.nextInt(codeSequenceNumber.length)]);
            // 将产生的六个随机数组合在一起。
            randomCode.add(numRand);
        }*/
        for (int i = 0; i < charNum; i++) {
            // 得到随机产生的验证码字母。
            String strRand = String.valueOf(codeSequenceChar[random.nextInt(codeSequenceChar.length)]);
            // 将产生的六个随机数组合在一起。
            //randomCode.add(strRand);
            randomCodeRes.append(strRand);
        }

       /* Collections.shuffle(randomCode);

        for (int i = 0; i < randomCode.size(); i++) {
            randomCodeRes.append(randomCode.get(i));
        }*/
        return randomCodeRes.toString();
    }


}
