package com.magicDigit.ecStore.wares.goodsSku;

import com.magicDigit.ecStore.common.dao.GenericDao;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;

/**
 * Date: 2018-10-19-下午12:40
 */
public interface GoodsSKUDao extends GenericDao<GoodsSKU, String> {

    @Modifying
    @Transactional
    @Query(value = " DELETE FROM bss_wares_goods_sku WHERE goods_id = ?1 ", nativeQuery = true)
    void removeByGoodsId(String goodsId);


}
