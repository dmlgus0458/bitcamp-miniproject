package com.bit.auction.goods.repository;

import com.bit.auction.goods.entity.Auction;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface AuctionRepositoryCustom {
    Page<Auction> searchAll(Pageable pageable, List<Long> subCategoryIdList, String sortOption, List<String> targetList, List<Character> statusList);

    Page<Auction> searchMyAuctionList(Pageable pageable, String regUserId, List<Character> statusList);

    void saveOne(Auction auction);

}
