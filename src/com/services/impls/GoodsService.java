package com.services.impls;

import com.annotations.RmiService;
import com.beans.GoodsInfo;
import com.beans.Types;
import com.interfaces.GoodsServiceIf;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * Created by rcl on 2016/1/8.
 */
@Service
@RmiService(serverType = Types.SERVICE)
public class GoodsService implements GoodsServiceIf{

    @Autowired
    private DbHelper dbHelper;


    @Override
    public String qeuryGoods(String goodsId) {
        return dbHelper.querySingle(154,new Object[]{goodsId},GoodsInfo.class).getGoodsName();
    }
}
